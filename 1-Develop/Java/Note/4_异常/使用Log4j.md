## 使用 Log4j

前面介绍了 Commons Logging，可以作为 “日志接口” 来使用。而真正的 “日志实现” 可以使用 Log4j。

Log4j 是一种非常流行的日志框架，最新版本是 2.x 。

Log4j 是一个组件化设计的日志系统，它的架构大致如下：

![20220624160513](https://cdn.gxmnzl.xyz//img/20220624160513.png)

当我们使用 Log4j 输出一条日志时，Log4j 自动通过不同的 Appender 把同一条日志输出到不同的目的地。例如：

- console ：输出到屏幕；
- file ：输出到文件；
- socket ：通过网络输出到远程计算机；
- jdbc ：输出到数据库


在输出日志的过程中，通过 Filter 来过滤哪些 log 需要被输出，哪些 log 不需要被输出。例如，仅输出 `ERROR` 级别的日志。

最后，通过 Layout 来格式化日志信息，例如，自动添加日期、时间、方法名称等信息。

上述结构虽然复杂，但我们在实际使用的时候，并不需要关心 Log4j 的 API ，而是通过配置文件来配置它。

以 XML 配置为例，使用 Log4j 的时候，我们把一个 `log4j2.xml` 的文件放到 `classpath` 下就可以让 Log4j 读取配置文件并按照我们的配置来输出日志。下面是一个配置文件的例子：


```
<?xml version="1.0" encoding="UTF-8"?>
<Configuration>
	<Properties>
        <!-- 定义日志格式 -->
		<Property name="log.pattern">%d{MM-dd HH:mm:ss.SSS} [%t] %-5level %logger{36}%n%msg%n%n</Property>
        <!-- 定义文件名变量 -->
		<Property name="file.err.filename">log/err.log</Property>
		<Property name="file.err.pattern">log/err.%i.log.gz</Property>
	</Properties>
    <!-- 定义 Appender，即目的地 -->
	<Appenders>
        <!-- 定义输出到屏幕 -->
		<Console name="console" target="SYSTEM_OUT">
            <!-- 日志格式引用上面定义的 log.pattern -->
			<PatternLayout pattern="${log.pattern}" />
		</Console>
        <!-- 定义输出到文件, 文件名引用上面定义的 file.err.filename -->
		<RollingFile name="err" bufferedIO="true" fileName="${file.err.filename}" filePattern="${file.err.pattern}">
			<PatternLayout pattern="${log.pattern}" />
			<Policies>
                <!-- 根据文件大小自动切割日志 -->
				<SizeBasedTriggeringPolicy size="1 MB" />
			</Policies>
            <!-- 保留最近 10 份 -->
			<DefaultRolloverStrategy max="10" />
		</RollingFile>
	</Appenders>
	<Loggers>
		<Root level="info">
            <!-- 对 info 级别的日志，输出到 console -->
			<AppenderRef ref="console" level="info" />
            <!-- 对 error 级别的日志，输出到 err，即上面定义的 RollingFile -->
			<AppenderRef ref="err" level="error" />
		</Root>
	</Loggers>
</Configuration>
```


虽然配置 Log4j 比较繁琐，但一旦配置完成，使用起来就非常方便。对上面的配置文件，凡是 INFO 级别的日志，会自动输出到屏幕，而 `ERROR` 级别的日志，不但会输出到屏幕，还会同时输出到文件。并且，一旦日志文件达到指定大小（1MB），Log4j 就会自动切割新的日志文件，并最多保留 10 份。

有了配置文件还不够，因为 Log4j 也是一个第三方库，我们需要从[这里](https://logging.apache.org/log4j/2.x/download.html)下载 Log4j，解压后，把以下 3 个 jar 包放到 classpath 中：

- log4j-api-2.x.jar
- log4j-core-2.x.jar
- log4j-jcl-2.x.jar

因为 Commons Logging 会自动发现并使用 Log4j ，所以，把上一节下载的 `commons-logging-1.2.jar` 也放到 `classpath` 中。

要打印日志，只需要按 Commons Logging 的写法写，不需要改动任何代码，就可以得到 Log4j 的日志输出，类似：

```
03-03 12:09:45.880 [main] INFO  com.itranswarp.learnjava.Main
Start process...
```


## 最佳实践

在开发阶段，始终使用 Commons Logging 接口来写入日志，并且开发阶段无需引入 Log4j 。如果需要把日志写入文件， 只需要把正确的配置文件和 Log4j 相关的 jar 包放入 `classpath` ，就可以自动把日志切换成使用 Log4j 写入，无需修改任何代码。


## 练习


根据配置文件，观察 Log4j 写入的日志文件。

```java
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.UnsupportedEncodingException;

public class Log4jTest {
    static final Log log = LogFactory.getLog(Log4jTest.class);

    public static void main(String[] args) {
        log.info("Start process...");
        try {
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            log.error("Invalid encoding.", e);
        }
        log.info("Process end.");
    }
}
```

```
06-24 16:22:21.306 [main] INFO  javase.test.d.work.Log4jTest
Start process...

06-24 16:22:21.311 [main] ERROR javase.test.d.work.Log4jTest
Invalid encoding.

java.io.UnsupportedEncodingException: invalidCharsetName
	at java.lang.String.lookupCharset(String.java:819) ~[?:?]
	at java.lang.String.getBytes(String.java:1763) ~[?:?]
	at javase.test.d.work.Log4jTest.main(Log4jTest.java:14) ~[testCode/:?]
06-24 16:22:21.320 [main] INFO  javase.test.d.work.Log4jTest
Process end.
```


## 小结

- 通过 Commons Logging 实现日志，不需要修改代码即可使用 Log4j；
- 使用 Log4j 只需要把 log4j2.xml 和相关 jar 放入 classpath；
- 如果要更换 Log4j，只需要移除 log4j2.xml 和相关 jar；
- 只有扩展 Log4j 时，才需要引用 Log4j 的接口（例如，将日志加密写入数据库的功能，需要自己开发）。


## code

- [***GitHub***](https://github.com/Lxzz24/Repo/tree/main/testCode/src/javase/test/d/work/Log4jTest.java)
- [***国内访问***](https://gitee.com/lxzz24/Repo/tree/main/testCode/src/javase/test/d/work/Log4jTest.java)
- ***#/testCode/src/javase/test/d/work/Log4jTest.java*** 

