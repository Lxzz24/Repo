# 
# 🎨 设计模式

!> by [程序员鱼皮](https://space.bilibili.com/12890453)


设计模式是软件开发人员在软件开发过程中面临的一般问题的 **通用** 解决方案。
这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。


通俗地说就是前辈们在写代码时摸索出了一些不错的方法，可以用于解决一类问题、更好地开发和维护项目。
于是其他软件开发者纷纷效仿，久而久之，就得出了一套优秀的软件开发方法总结。


目前最为经典的设计模式有 23 种，学习之后，不仅能帮助我们开拓思路、写出更优质的代码、
提高项目的开发和维护效率；还能够帮助我们更好地阅读和理解源码，
甚至可以根据文件名称直接推断出源码的架构设计（有点行话的感觉）！
因此，在准备阅读框架源码前，强烈建议先学习设计模式。


此外，设计模式也是软件开发相关岗位面试的重点（尤其是大厂、后端开发岗位），建议大家有时间的话都要学习。


# 大纲


![大纲](https://cdn.gxmnzl.xyz/img/DP0001.png)


# 知识


- 软件开发原则
  - 单一职责原则（SRP）
  - 开闭原则（OCP）
  - 里氏替换原则（LSP）
  - 依赖倒置原则（DIP）
  - 接口隔离原则（ISP）
  - 迪米特法则（最少知道原则）
  - 合成 / 聚合复用原则（CARP）
- 设计模式分类
  - 根据作用范围：类 / 对象模式
  - 根据目的分类：创建型 / 结构型 / 行为型模式
- 创建型模式：如何创建对象
  - 单例模式（懒汉式、饿汉式、双检锁、线程唯一单例）
  - 工厂方法模式（类）
  - 抽象工厂模式
  - 建造者模式
  - 原型模式
- 结构型模式：如何将类或对象结合在一起形成一个更强大的结构
  - 适配器模式（类 / 对象）
  - 组合模式
  - 装饰器模式
  - 代理模式
  - 享元模式
  - 外观模式
  - 桥接模式
- 行为型模式：类或对象间如何交互、如何划分职责，从而更好地完成任务
  - 迭代器模式
  - 模板方法模式（类）
  - 策略模式
  - 命令模式
  - 状态模式
  - 责任链模式
  - 备忘录模式
  - 观察者模式
  - 访问者模式
  - 中介者模式
  - 解释器模式（类）



除了这 23 种主流设计模式外，还有一些其他设计模式，比如 Immutable 不可变模式等，了解即可。


# 学习建议

1. 对设计模式的学习和其他知识一样，先了解每种设计模式是什么？作用是什么？能够解决什么问题？
   适用于什么场景？有什么特点？类和对象的关系是什么（建议结合 UML 类图来理解）？
   再去考虑编码实现和进一步在项目中应用。
2. 一定要多写代码实践，最好每个设计模式都实现一遍，不要去背代码，用的多了自然就能写出代码了。
3. 每个设计模式都可以 独立学习 ，互相之间联系不大，因此可以根据自己的时间来选择性学习
   （比如先学重点的单例模式）。
4. 在学会基础的设计模式后，可以分析之前学过的框架源码（比如 Spring、MyBatis 等），
   参考别人是如何应用设计模式的。
5. 不要过度依赖设计模式！！！！！！ 它并不是银弹，过分使用设计模式可能只会增加系统的复杂度。


# 学习路线


主流的设计模式共有 23 种，建议大家按照以下四个阶段来学习：


1. 基础学习
2. 编码实现
3. 项目实战
4. 备战面试


其中第一个阶段和第二个阶段 可以同时进行 ，即对于每个设计模式的学习都是：先了解、再编码实现。


## 一、基础学习



本阶段的目标：依次了解每一种设计模式的应用场景、特点、UML 类图，能够对设计模式有个基础的印象。



### 学习顺序



根据使用频率、难易度、面试考察率等综合排序，仅供参考，并不绝对！



#### 优先：


1. 单例模式
2. 工厂方法模式
3. 迭代器模式
4. 策略模式
5. 建造者模式
6. 模板方法模式
7. 代理模式
8. 责任链模式
9. 抽象工厂模式
10. 适配器模式
11. 观察者模式
12. 外观模式


#### 一般：



1. 桥接模式
2. 组合模式
3. 装饰器模式
4. 状态模式
5. 访问者模式
6. 中介者模式
7. 命令模式
8. 备忘录模式


#### 低优先：



1. 原型模式
2. 享元模式
3. 解释器模式


### 推荐资源


以下资源看 1 - 2 个就足够入门了


**书籍**

- [《图解设计模式》](https://www.aliyundrive.com/s/jcQugLGNs1V) 提取码: 5i9c（强烈推荐，用 Java 语言实现，图多、有示例代码、有习题和答案，很不错）
- [《大话设计模式》](https://www.aliyundrive.com/s/73jZWnfAtaA)  提取码: 9gc7（比较有趣）
- [《Head First 设计模式》](https://www.aliyundrive.com/s/GnuQcruh7Us)  提取码: 9gc7
- [《设计模式：可复用面向对象软件的基础》](https://www.aliyundrive.com/s/T9ECaPtxzg4)  提取码: 9gc7（大黑书，难度较大，有能力和时间才去读）
- [《JavaScript 设计模式与开发实践》](https://www.aliyundrive.com/s/tzcZCU8bqnR)  提取码: 9gc7（适合前端同学阅读）
- [《Python 设计模式》](https://www.aliyundrive.com/s/3RNoX31XqUy)  提取码: 9gc7

**视频**

- [尚硅谷图解 Java 设计模式](https://www.bilibili.com/video/BV1G4411c7N4) （讲的很棒也很全面，也和一些主流框架相结合，系统学习 Java 的同学可以看）
- [五分钟学设计模式](https://www.bilibili.com/video/BV1af4y1y7sS) （小短快科普，比较轻松）
- [黑马程序员Java设计模式详解](https://www.bilibili.com/video/BV1Np4y1z7BU) （很完整，最后讲解了 Spring 框架的部分设计）
- [用一个项目讲解 23 种设计模式](https://www.bilibili.com/video/BV19g411N7yx) （和项目结合，思路不错，但其中有一些直播翻车，可部分跳过）

**文档**

- [菜鸟教程](https://www.runoob.com/design-pattern/design-pattern-tutorial.html) （还是比较推荐的，学过设计模式后如果忘记了，可以查看这个文档快速补回来）
- [C++ 图说设计模式](https://design-patterns.readthedocs.io/zh_CN/latest/) 
- [Go 语言设计模式系列博客](https://lailin.xyz/post/singleton.html) 


## 二、编码实现



本阶段的目标：依次编码实现每个设计模式，用任何支持面向对象的编程语言都可以，最好能够独立（不借助任何资料）从 0 写出每个设计模式的代码。



### 资源



一些源码示例，仅供参考，更多的内容可以直接在 GitHub 搜索关键词 Design Pattern 或 设计模式 ：



- [各语言设计模式示例代码](https://github.com/wx-chevalier/design-pattern-examples)
- [Java 23 种设计模式全归纳](https://github.com/youlookwhat/DesignPattern)（教程 + 源码）
- [C++ 设计模式源码](https://github.com/liu-jianhao/Cpp-Design-Patterns)（设计模式介绍 + 源码）
- JavaScript 示例代码：
  - [1](https://github.com/wchaowu/javascript)
  - [2](https://github.com/zy445566/design-pattern-in-javascript)
- [Python 示例代码](https://github.com/wklken/py-patterns)
- [Go 示例代码](https://github.com/mohuishou/go-design-pattern)


## 三、项目实战



本阶段的目标：通过做项目或阅读项目源码来进一步强化每个设计模式的实际应用。做到能根据某个场景主动选出合适的设计模式来优化代码、灵活运用，并且能够通过文件命名、项目目录结构等途径来快速判断出某个框架是否使用了设计模式。



可以先通过一个视频了解设计模式的实际应用：



实际工作中，如何运用 [Java 设计模式](https://www.bilibili.com/video/BV1tK4y1s7Uo)


### 列举一些设计模式在框架源码中的应用：



> 部分内容源于网络


- Spring
  - 工厂模式：通过 BeanFactory 和 ApplicationContext 来创建对象
  - 单例模式：Spring Bean 默认为单例模式
  - 策略模式：例如 Resource 的实现类，针对不同的资源文件，实现了不同方式的资源获取策略
  - 代理模式：Spring 的 AOP 功能用到了 JDK 的动态代理和 CGLIB 字节码生成技术
  - 模板方法：可以将相同部分的代码放在父类中，而将不同的代码放入不同的子类中，用来解决代码重复的问题。比如RestTemplate、JmsTemplate、JpaTemplate
  - 适配器模式：Spring AOP 的增强或通知（Advice）使用到了适配器模式
  - 观察者模式：Spring 事件驱动模型
  - 桥接模式：可以根据客户的需求能够动态切换不同的数据源。比如我们的项目需要连接多个数据库，客户在每次访问中根据需要会去访问不同的数据库
- Spring MVC
  - 组合模式：WebMvcConfigurerComposite，树枝和树叶都实现了相同的抽象类或接口 WebMvcConfigurer
  - 责任链模式：DispatcherServlet 依次拦截和处理请求
  - 适配器模式：HandlerAdapter 处理器适配
- MyBatis[(参考)](https://blog.csdn.net/aha_jasper/article/details/108701785)
  - Builder + Factory 模式：创建 SqlSession 工厂和 SqlSession
  - 模板方法模式：BaseExecutor 定义执行器基本流程
  - 解释器模式：SqlNode 动态解析 SQL
  - 单例模式：ErrorContext 线程唯一
  - 装饰器模式：Cache 的实现用组合而非继承实现更灵活地缓存方式结合
  - 迭代器模式：PropertyTokenizer 利用迭代器模式实现属性解析器
  - 适配器模式：Log 适配不同的日志框架
- Google Guava[(参考)](https://blog.csdn.net/aha_jasper/article/details/108695561)
  - Builder 模式：更方便地构建内存缓存
  - Wrapper 模式（代理模式、装饰器、适配器模式）：轻松实现对类的扩展
  - Immutable 模式：不可变集合实现，如 ImmutableList、ImmutableSet、ImmutableMap 等
- 更多可以自行学习：
  - Netty
  - SpringBoot
  - Tomcat
  - Dubbo
  - Spring Cloud


### 资源



- [《设计模式之美》专栏](https://blog.csdn.net/aha_jasper/article/details/105695163)
  - [原作者 Google 王争设计模式之美](https://time.geekbang.org/column/intro/250)，是极客时间的付费课，里面的内容，尤其是开源实战和项目实战的部分讲的很好！有收获的朋友还是请支持正版哦）
- [Spring 相关框架源码分析视频](https://www.bilibili.com/video/BV1kF411e7WR)（结合设计模式，包括 Spring、SpringMVC、SpringBoot、Tomcat 等）



## 四、备战面试



### 面试时对设计模式的考察主要有 4 种形式：


1. 直接问你某个设计模式的作用和大致的原理，考察你对设计模式的了解程度
2. 让你手写某个设计模式的代码，考察你对设计模式的熟悉程度和编码能力
3. 给你一个实际的业务场景，让你去设计系统，考察你对设计模式的理解应用能力和逻辑思维
4. 问你某个框架（轮子）的核心设计和源码细节，考察你对设计模式的理解应用能力


### 经典面试题



1. 理论：简单介绍一下软件开发原则？
2. 理论：设计模式如何分类？
3. 你用过哪些设计模式？举例说明设计模式在你的项目或是某个框架源码中的应用。
4. 说出某个设计模式的优缺点？什么时候使用它？
5. 单例模式有哪些实现方式？分别有哪些优缺点？请手写其中一种
6. 原型模式和单例模式的区别是什么？
7. 简单工厂、工厂方法和抽象工厂三者有什么区别？
8. 介绍一下代理模式，说一下静态代理和动态代理（比如 Spring AOP 就用到了）的区别？


### 资源


- [设计模式面试题汇总](https://pan.baidu.com/s/1tjIGc7pnHjgiFPo0fhcKXw) 提取码: wuan（朋友 JavaGuide 整理，很全面 👍🏻）
- [面试官最爱问的13道"设计模式"题（视频）](https://www.bilibili.com/video/BV1fR4y1N74H)


加油小伙伴们！




