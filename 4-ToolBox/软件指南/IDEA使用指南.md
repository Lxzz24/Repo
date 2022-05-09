# IDEA 使用指南

---

# 安装激活

!> 作者：Java老白  
链接：https://www.jianshu.com/p/586a61c58695  
来源：简书  
著作权归作者所有。

申明，本教程 Intellij IDEA 最新版破解、激活码均收集与网络，请勿商用，仅供个人学习使用，如有侵权，
请联系作者删除。如条件允许，建议大家购买正版。 

?> 本教程更新于：2021 年 10 月 26 号，后续如果存在不可用问题，博主会及时更新。  

以下是博主免费激活之后的 Licenses 信息，激活到 2099 年，支持 Windows 和 Macos。

![1](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA1.png)

> [!ATTENTION]
> 1. 本教程适用于 Intellij IDEA 2021.2.3 以下所有版本
> 2. 本教程适用于 JetBrains 全系列产品，包括 IDEA、Pycharm、WebStorm、PhpStorm、AppCode 等
> 3. 本教程适用于 Windows/Mac/Linux，本文以 Window 下的版本为例进行演示，
> 其他系统的操作方式完全相同。

## 安装 IntelliJ IDEA 2021.2.3 最新版本

### 下载 IntelliJ IDEA

点击[这个地址](https://www.jetbrains.com/idea/download/#section=windows)，
下载 IntelliJ IDEA 2021.2.3 最新版本


### 卸载老版本的 IDEA(如果已经安装了 IDEA)
?> 如果电脑上已经安装了老版本的 IDEA，需要先卸载赶紧，否则可能会出现问题

#### 保存配置文件

IntelliJ IDEA 有一个配置文件夹，保留了你使用 IntelliJ IDEA 的一些默认配置信息，
如果你已经修改过 IntelliJ IDEA 的配置，比如 JDK 环境、Maven 环境、以及其他配置项目。

如果你希望新安装的 IntelliJ IDEA，安装完成后能够保留这些配置，
则需要先备份 IntelliJ IDEA 的配置目录，该目录默认的路径配置如下。

这个文件是：IntelliJIDEA 安装目录下 `${IntelliJIDEA_HOME}\bin\idea.properties`

```
<pre class="md-fences md-end-block ty-contain-cm modeLoaded" spellcheck="false" lang="java" 
cid="n749" mdtype="fences" style="box-sizing: border-box; overflow: visible; 
font-family: var(--monospace); font-size: 0.9em; display: block; break-inside: avoid; 
text-align: left; white-space: normal; background-image: inherit; 
background-position: inherit; background-size: inherit; background-repeat: inherit; 
background-attachment: inherit; background-origin: inherit; background-clip: inherit; 
background-color: rgb(248, 248, 248); position: relative !important; 
border: 1px solid rgb(231, 234, 237); border-radius: 3px; padding: 8px 4px 6px; 
margin-bottom: 15px; margin-top: 15px; width: inherit; color: rgb(51, 51, 51); 
font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; 
font-weight: 400; letter-spacing: normal; orphans: 2; text-indent: 0px; 
text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; 
text-decoration-thickness: initial; text-decoration-style: initial; 
text-decoration-color: initial;">
```
---------------------------------------------------------------------

Uncomment this option if you want to customize path to IDE config folder. 
Make sure you're using forward slashes.

---------------------------------------------------------------------

idea.config.path=${user.home}/.IntelliJIdea/config

---------------------------------------------------------------------

Uncomment this option if you want to customize path to IDE system folder. 
Make sure you're using forward slashes.

---------------------------------------------------------------------

idea.system.path=${user.home}/.IntelliJIdea/system</pre>



config 和 system 是用来存储 IntelliJ IDEA 个性化配置的地方。
提前把.IntelliJIdea 这个文件件备份，后续新的版本安装完成后，可以直接导入这个配置项目


#### 开始卸载
没有安装 IntelliJ IDEA 的同学，可以省略这个步骤。

![2](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA2.png)


### 开始安装 IntelliJ IDEA 2021.2.3 版本
默认安装目录是 C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3，这里我选择安装到其他磁盘

![3](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA3.png)

勾选创建桌面快捷方式，Create Desktop Shortcut，方便后续打开。

![4](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA4.png)

点击 next->install，进行安装，安装完成后，Run IntelliJ IDEA 运行。

![5](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA5.png)

### 开始激活 Intellij IDEA

打开 IntelliJ IDEA 工具，首先会进入到 License Activation 激活页面，这个页面有两个选项

1. Activate IntelliJ IDEA， 通过密钥激活 IDEA
2. Start trial，免费体验 IDEA，不过在新版本中需要注册帐号登录才能体验。

![6](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA6.png)

?> 还有一个问题需要注意，有些同学点击 Log In to JetBrains Account... 这个按钮跳转到网页，
网页无法打开。我就遇到了这个问题。原因是，我们在 host 文件中增加了一些 
account.jetbrains.com 相关的映射，所以大家需要去 C:/Windows/System32/Driver/etcs/host 
文件中，把这些内容去掉就可以打开了

注册的流程这里就省略了，直接点击按钮后会弹出一个浏览器进入到 IntelliJ IDEA 官网，
注册一个帐号并登录即可

下图是对应登录成功后的界面，点击 Start Trial 开始免费试用。

![7](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA7.png)

开始试用后，会进入待如下页面，免费试用的时间是1个月

![8](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA8.png)

需要注意，有了登录帐号这个机制以后，对于这个帐号的试用期，是从注册登录的这一刻开始，
这篇文章我写在 10 月 26 号，但是第一次登录是在 10 月 23 号，所以提示有效期是到 11 月 23 号。

所以，如果遇到帐号已经过期的情况下，可能不会出现这个界面，所以大家可以执行破解补丁中 
reset_script 这个脚本来重置试用期时间。

![9](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA9.png)

```
<pre class="md-fences md-end-block ty-contain-cm modeLoaded" spellcheck="false" 
lang="java" cid="n783" mdtype="fences" style="box-sizing: border-box; 
overflow: visible; font-family: var(--monospace); font-size: 0.9em; display: block; 
break-inside: avoid; text-align: left; white-space: normal; 
background-image: inherit; background-position: inherit; background-size: inherit; 
background-repeat: inherit; background-attachment: inherit; 
background-origin: inherit; background-clip: inherit; 
background-color: rgb(248, 248, 248); position: relative !important; 
border: 1px solid rgb(231, 234, 237); border-radius: 3px; padding: 8px 4px 6px; 
margin-bottom: 15px; margin-top: 15px; width: inherit; color: rgb(51, 51, 51); 
font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; 
font-weight: 400; letter-spacing: normal; orphans: 2; text-indent: 0px; 
text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; 
text-decoration-thickness: initial; text-decoration-style: initial; 
text-decoration-color: initial;"> window系统：reset_jetbrains_eval_mac_linux.sh
Linux/Mac系统：reset_jetbrains_eval_windows.vbs</pre>
```

### 清空 IDEA 以往的激活方式

之前用过 IDEA 的同学，可能已经用了其他破解补丁破解过，一般的方式也是通过 Host 代理、
以及 Jar 文件替换的形式来实现，所以在使用这篇文章描述的方法来破解时，
需要把原本激活的配置还原，比如 Host 文件的映射要去掉。

#### 配置破解补丁

进入到 IDEA 项目开发界面(默认情况下，需要创建一个项目或者打开一个项目，才能进入到这个页面)

点击如图所示的菜单： Help - > Edit Custom VM Options...。 
修改 idea64.exe.vmoptions 文件。

![10](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA10.png)

点击按钮，会打开 idea64.exe.vmoptions 文件。

![11](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA11.png)

在这个文件中，我们需要把破解补丁中的 FineAgent.jar 文件，
配置到 idea64.exe.vmoptions 文件中。

![12](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA12.png)


1. 先把这个 jar 包拷贝到一个固定目录下，我这里把它拷贝到了 IDEA 安装目录下 
D:\software\IntelliJ IDEA 2021.2.3\FineAgent.jar，大家可以根据自己实际的情况随意放置。
2. 修改 idea64.exe.vmoptions 文件，增加如下配置

```
<pre class="md-fences md-end-block ty-contain-cm modeLoaded" spellcheck="false" 
lang="java" cid="n799" mdtype="fences" style="box-sizing: border-box; 
overflow: visible; font-family: var(--monospace); font-size: 0.9em; display: block; 
break-inside: avoid; text-align: left; white-space: normal; 
background-image: inherit; background-position: inherit; background-size: inherit; 
background-repeat: inherit; background-attachment: inherit; 
background-origin: inherit; background-clip: inherit; 
background-color: rgb(248, 248, 248); position: relative !important; 
border: 1px solid rgb(231, 234, 237); border-radius: 3px; padding: 8px 4px 6px; 
margin-bottom: 15px; margin-top: 15px; width: inherit; color: rgb(51, 51, 51); 
font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; 
font-weight: 400; letter-spacing: normal; orphans: 2; text-indent: 0px; 
text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; 
text-decoration-thickness: initial; text-decoration-style: initial; 
text-decoration-color: initial;">
-javaagent:D:\software\IntelliJ IDEA 2021.2.3\FineAgent.jar</pre>
```

![13](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA13.png)


### 重启 IntelliJ IDEA
修改完成后，重启 IntelliJ IDEA 工具。  

重启后，又会重新进入到激活页面，这个时候，我们选择 Activate IntelliJ IDEA。  

然后 License 选择 Activation Code。  

![14](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA14.png)

输入激活码，点击 Activate 按钮进行激活。
激活码一定要在补丁配置之后才能使用，否则是激活不了的。

![15](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA15.png)

![16](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA16.png)

点击 Activate 按钮后，就能看到下面这个界面， 过期时间到 2099 年， 
唉，终于可以在 IDEA 这个工具上实现终身编程的梦想。

![17](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA17.png)


### 激活补丁下载

![18](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/IDEA18.png)

[链接](https://pan.baidu.com/s/1zk1xFqABdQcuKfq9M9Rblw) 提取码: ec9n













# IDEA maven 配置

> maven 如今是 idea 当中必不可少的工具了，这里主要说明一下如何进行maven 配置。虽然 idea 有一些默认的 maven 配置，但是如果想要好用，最好还是自己配置一个 maven。

idea maven配置的方法和步骤如下：

* （1）官方下载一个 maven：

下载地址：http://maven.apache.org/download.html

找到 Binary zip archive => apache-maven-3.6.3-bin.zip，然后点击 apache-maven-3.6.3-bin.zip 进行下载，也可以直接点击下面的地址进行下载：

[apache-maven-3.6.3-bin.zip](https://mirror.bit.edu.cn/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip)

* （2）将下载的文件解压到自己的安装目录，比如：

D:\developer_tools\maven\apache-maven-3.6.3

![image-20200319112720427](../images/image-20200319112720427.png)

* （3）配置maven：

用编辑器打开文件 D:\developer_tools\maven\apache-maven-3.6.3\conf\settings.xml，并对文件里面的内容进行修改：

在 settings 的节点下增加镜像配置：

```xml
<mirrors>
    <mirror>
      <id>alimaven</id>
      <name>aliyun maven</name>      
      <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
      <mirrorOf>central</mirrorOf>
    </mirror>
    <mirror>
       <id>repo2</id>
       <name>repo2 maven</name>      
       <url>http://repo2.maven.org/maven2</url>
       <mirrorOf>central</mirrorOf>
     </mirror>
  </mirrors>
```

* （4）修改 idea 自带maven：

打开 idea 界面的 setting 配置，配置路径如下：

File --> Settings --> Build, Execution, Deployment --> Build Tools --> Maven

将 Maven home directory 修改为 D:\developer_tools\maven\apache-maven-3.6.3，User settings file 修改为 D:\developer_tools\maven\apache-maven-3.6.3\conf\settings.xml，并将 User settings file 后面的Override进行勾选（否则不生效），然后点击Apply或OK，保存一下。

> 注：local repository 想改就改哈，就是镜像存的位置，如果要改 local repository，记得回 setting.xml 里添加：

```xml
<!--配置本地仓库路径-->
<localRepository>D:\developer_tools\maven\my_maven_local_repository</localRepository>
```

![image-20200319113540704](../images/image-20200319113540704.png)

到这里 maven 配置成功

## IDEA 注释模板设置

### 设置类注释

file --> settings --> Editor --> File and Code Templates --> Includes

![image-20200319155303619](../images/image-20200319155303619.png)

```
/**
  * @ProjectName: ${PROJECT_NAME}
  * @ClassName: ${NAME}
  * @Description: TODO(一句话描述该类的功能)
  * @Author: ${USER}
  * @Date: ${DATE} ${TIME}
  * @version v1.0
  */
```

### 设置方法注释

file --> settings --> Editor --> Live Templates

![](../images/b9054bdf67dc0c8f873390d40c03ff5a598.jpg)

```
/**
 * @Title: $enclosing_method$
 * @Description: TODO(这里用一句话描述这个方法的作用)
 * @param @param $tags$
 * @return @return $return_type$
 * @author $user$
 * @throws
 * @date $date$ $time$
 */
```

## IDEA 插件推荐安装

### **Stackoverflow** 

> 这个插件其实是最实用的插件，程序猿遇到的问题，基本都能找到回答，但是它使用的是 google 搜索引擎，需要使用 vpn 来进行操作

选中需要搜索的问题，然后，右键点击


### TranslationPlugin

> 对于不经常使用英语的同学来说，对类，变量，方法想取一个合适的名字，此时发现自己的词汇早已还给老师 ，怎么办，这个插件能帮到你~

直接选中你想要翻译的词，然后右键选择




### Mybatis-Log-plugin

> 开发的项目一般都少不了日志系统，而我们在书写 mysql 语句的时候，参数的对应，往往有时候会忽略，mybatis 自己控制的参数编译对应，个人感觉有点反人类，我们可以使用这个插件变成自己比较直观的对应~

选中需要转换的 mybatis log 日志，然后点击右键，选择 Restore sql from slection


### GsonFormat

> 在与组外或者不同部门对接接口时候发现，有时候对方返回的是 JSON 对象，自己想要用一个对象去接受，以便于处理后续，此时，需要自己一个个手动去输入属性么，肯定很抓狂，不过咱们可以使用这个插件来解决这个尴尬问题，当然也可以使用外部网址解决，比如 bejson 这个网站~ 

### IdeaJad

> 以前查看 class 文件形式的时候或者 jar，都会使用一个外部反编译工具，这样操作明显不方便，使用此插件可以一直在 idea 中查看文件~ ps：其实 Inteli Idea这个编译器已经自带了反编译功能，老夫~~~~~~

选择 class 文件，右键 Decompile, 完成反编译


### Free-idea-mybatis

> mybatis xml 和对应的 mapper 之间来回切换的时候，有时候不同人开发，放置的位置又不同，使用此插件后，来回切换的时候异常方便，和所放置的位置无关~

### CodeGlance

> 再也不用疯狂拖拽到底去找一遍啦，多不方便呀，使用此插件可以查看缩略图一样，快速切换到自己需要去的地方~


### Alibaba Java Coding Guidelines

> 一款阿里巴巴公司试行的开发设计规范~ 


### Lombok

> Lombok 能以简单的注解形式来简化 java 代码，提高开发人员的开发效率。例如开发中经常需要写的 javabean，都需要花时间去添加相应的 getter/setter，也许还要去写构造器、equals 等方法，而且需要维护，当属性多时会出现大量的 getter/setter 方法，这些显得很冗长也没有太多技术含量，一旦修改属性，就容易出现忘记修改对应方法的失误。Lombok 能通过注解的方式，在编译时自动为属性生成构造器、getter/setter、equals、hashcode、toString 方法。

### JRebel

> 热部署插件，在修改完代码后，不用再重新启动，很实用！但是，不是免费的

热部署只是针对 class 文件,源文件这些。对于属性文件 .xml 或 .properties，只要修改了，都需要重启服务器，因为属性文件是在服务器启动的时候加载的，不可能被热部署识别到。

安装好，检查几个必要的设置看是否已配置，否则热部署可能没效果：

1）设置项目自动编译


2）设置 compiler.automake.allow.when.app.running 

快捷键 ctrl+shift+A 或者 菜单 help->find action… 打开搜索框搜索 “registry”，像图中勾选


3）需要热部署的项目在此处是否勾选


4）可能很多人想要知道破解方法，在此参考了[这篇博客](https://blog.csdn.net/qierkang/article/details/95095954)，方法如下：




### Key promoter X

> 快捷键提示工具：`Key Promoter X` 是一个提示插件，当你在 `IDEA` 里面使用鼠标的时候，
> 如果这个鼠标操作是能够用快捷键替代的，那么 `Key Promoter X` 会弹出一个提示框，
> 告知你这个鼠标操作可以用什么快捷键替代。对于想完全使用快捷键在 `IDEA` 的，
> 这个插件就很有用。

