# ☕️ Java

<!-- tabs:start -->

## **Java快速入门**

  - 简介
    - 安装 JDK
    - 第一个 Java 程序
    - 使用 IDE
  - Java 程序基础
    - Java 程序基本结构
    - 变量和数据类型
    - 进制
    - 运算符
  - 流程控制
    - 分支结构
    - 循环结构
    - break 和 continue
  - 数组操作
    - 概述
    - 一维数组
    - 多维数组
    - 数组常见算法
    - Arrays 工具类
    - 数组常见异常

## **面向对象编程基础**

  - 面向过程与面向对象
  - Java 基本元素：类和对象
    - 对象的创建和使用
    - 类的成员
      - 属性
      - 方法
        - 重载
        - 重写
      - 构造器
      - 代码块
      - 内部类
  - 面向对象三大特征
    - 封装性
    - 继承性
    - 多态性
  - 关键字：this
  - 关键字：package、import
  - 作用域
  - 关键字：super
  - 抽象类与抽象方法
  - 关键字：static
  - 关键字：final
  - 接口
## **Java 核心类**

  - 字符串相关的类
    - String 类及常用方法
    - StringBuffer\StringBuilder
    - StringJoiner
  - 包装类型
  - JavaBean
  - 枚举类
  - 记录类
  - Java 比较器
    - Comparable
    - Comparator
  - System 类
  - Math 类
  - BigInteger 与 BigDecimal

## **异常处理**

  - 异常概述与异常体系结构
  - 常见异常
  - 异常处理机制
    - try-catch-finally
    - throws
  - 手动抛出异常：throw
  - 用户自定义异常类
## **多线程**

  - 多线程基础
  - 线程的创建和使用
  - 线程的生命周期
  - 线程的同步
  - 线程的通信
  - 死锁
  - 使用wait和notify
  - 使用ReentrantLock
  - 使用Condition
  - 使用ReadWriteLock
  - 使用StampedLock
  - 使用Concurrent集合
  - 使用Atomic
  - 使用线程池
  - 使用Future
  - 使用CompletableFuture
  - 使用ForkJoin
  - 使用ThreadLocal
## **集合**

  - Java 集合框架概述
  - Collection 
  - List
  - Set
  - Map 
  - Iterator
  - Collections 工具类

## **注解**

  - 使用注解
  - 定义注解
  - 处理注解

## **泛型**

  - 什么是泛型
  - 使用泛型
  - 自定义泛型
  - 泛型在继承上的体现
  - 通配符的使用
  - 泛型应用举例

## **IO**

  - File 类的使用
  - IO 流原理及流的分类
  - 节点流（文件流）
  - 缓冲流
  - 转换流
  - 标准输入、输出流
  - 打印流
  - 数据流
  - 对象流
  - 随机存取文件流
  - NIO.2 中 Path、Paths、Files 类的使用

## **日期与时间**

  - 基本概念
  - Date 和 Calendar
  - LocalDateTime
  - ZonedDateTime
  - DateTimeFormatter
  - Instant
  - 最佳实践

## **网络编程**

  - 概述
  - 通信要素
    - IP 和端口号
    - 网络协议
  - TCP 网络编程
  - UDP 网络编程
  - URL 编程
  - HTTP 编程
## **反射**

  - Java 反射机制概述
  - Class类
  - 类的加载与 ClassLoader 的理解
  - 创建运行时类的对象
  - 获取运行时类的完整结构
  - 调用运行时类的指定结构
  - 动态代理

## **单元测试**

  - 编写JUnit测试
  - 使用Fixture
  - 异常测试
  - 条件测试
  - 参数化测试

## **正则表达式**

  - 简介
  - 匹配规则
  - 复杂匹配规则
  - 分组匹配
  - 非贪婪匹配
  - 搜索和替换

## **加密与安全**

  - 编码算法
  - 哈希算法
  - BouncyCastle
  - Hmac算法
  - 对称加密算法
  - 口令加密算法
  - 密钥交换算法
  - 非对称加密算法
  - 签名算法
  - 数字证书

## **Maven 基础**

  - Maven介绍
  - 依赖管理
  - 构建流程
  - 使用插件
  - 模块管理
  - 使用mvnw
  - 发布Artifact

## **XML 与 JSON**

  - XML简介
  - 使用DOM
  - 使用SAX
  - 使用Jackson
  - 使用JSON

## **JDBC 编程**

  - JDBC简介
  - JDBC查询
  - JDBC更新
  - JDBC事务
  - JDBC Batch
  - JDBC连接池
  
## **函数式编程**

  - Lambda基础
  - 方法引用
  - 使用Stream
  - 创建Stream
  - 使用map
  - 使用filter
  - 使用reduce
  - 输出集合
  - 其他操作

## **设计模式**

  - 创建型模式
    - 工厂方法
    - 抽象工厂
    - 生成器
    - 原型
    - 单例
  - 结构型模式
    - 适配器
    - 桥接
    - 组合
    - 装饰器
    - 外观
    - 享元
    - 代理
  - 行为型模式
    - 责任链
    - 命令
    - 解释器
    - 迭代器
    - 中介
    - 备忘录
    - 观察者
    - 状态
    - 策略
    - 模板方法
    - 访问者

## **Web 开发**

  - Web基础
  - Servlet入门
  - Servlet开发
  - Servlet进阶
    - 重定向与转发
    - 使用Session和Cookie
  - JSP开发
  - MVC开发
  - MVC高级开发
  - 使用Filter
    - 修改请求
    - 修改响应
  - 使用Listener
  - 部署

## **Spring 开发**

  - IoC容器
    - IoC原理
    - 装配Bean
    - 使用Annotation配置
    - 定制Bean
    - 使用Resource
    - 注入配置
    - 使用条件装配
  - 使用AOP
    - 装配AOP
    - 使用注解装配AOP
    - AOP避坑指南
  - 访问数据库
    - 使用JDBC
    - 使用声明式事务
    - 使用DAO
    - 集成Hibernate
    - 集成JPA
    - 集成MyBatis
    - 设计ORM
  - 开发Web应用
    - 使用Spring MVC
    - 使用REST
    - 集成Filter
    - 使用Interceptor
    - 处理CORS
    - 国际化
    - 异步处理
    - 使用WebSocket
  - 集成第三方组件
    - 集成JavaMail
    - 集成JMS
    - 使用Scheduler
    - 集成JMX
  - Spring Boot开发
    - 第一个Spring Boot应用
    - 使用开发者工具
    - 打包Spring Boot应用
    - 瘦身Spring Boot应用
    - 使用Actuator
    - 使用Profiles
    - 使用Conditional
    - 加载配置文件
    - 禁用自动配置
    - 添加Filter
  - 集成第三方组件
    - 集成Open API
    - 访问Redis
    - 集成Artemis
    - 集成RabbitMQ
    - 集成Kafka


<!-- tabs:end -->
