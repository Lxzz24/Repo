## 前言

- [官方文档](https://docsify.js.org/#/zh-cn/)
- [Docsify 创建文档网站](https://blog.51cto.com/u_12877374/4935159#Docsify__4)
- [docsify 构建文档网站之定制功能](https://blog.51cto.com/u_12877374/2853837#463_Disqus__323)


- docsify是一款文档生成静态页面的轻量级软件,与gitbook相比轻量且更易扩展。
- 作为一款实时渲染文档为静态网页，其不需要编译静态网页，所以更专注与文档创作。
- 常见的组合拳 typora + docsify/gitbook + github.pages/gitee.pages 快速搭建私人云文档。
- 本文先介绍如何快速搭建/使用docsify


## mac 上安装 docsify


### Homebrew 安装

brew 镜像安装脚本（亲测最快速最有效)

```bash
/bin/bash -c "$(curl -fsSL https://gitee.com/ineo6/homebrew-install/raw/master/install.sh)"
```

该脚本用了中科大镜像加速访问，仅修改仓库地址部分，不会产生安全隐患。 关于中科大所提供的 Homebrew 镜像服务 https://lug.ustc.edu.cn/wiki/mirrors/help/brew.git

若卡在了Cloning into...
由这里的龟速可断定卡住了，立马用Control + C中断命令执行，然后执行以下命令：

```bash
cd "$(brew --repo)/Library/Taps/"
mkdir homebrew && cd homebrew
git clone git://mirrors.ustc.edu.cn/homebrew-core.git
```

#### 配置

前面已经提到，Homebrew通常用来下载软件的，但它在安装软件时非常慢。为了提升安装速度，需要更改 Homebrew 的安装源，将其替换成国内镜像。

这里用的是由中科大负责托管维护的 Homebrew 镜像。其中，前两个为必须配置的项目，后两个可按需配置。

###### 1. 必备设置

替换 brew.git：

```bash
git -C "$(brew --repo)" remote set-url origin https://mirrors.ustc.edu.cn/brew.git
```

替换 homebrew-core.git：

```bash
git -C "$(brew --repo homebrew/core)" remote set-url origin https://mirrors.ustc.edu.cn/homebrew-core.git
```


###### 2. 按需设置


替换 homebrew-cask.git：

```bash
git -C "$(brew --repo homebrew/cask)" remote set-url origin https://mirrors.ustc.edu.cn/homebrew-cask.git
```
 

替换homebrew-bottles：
首先要先区分你的mac用哪种终端工具，如果是 bash，则执行：

```bash
echo 'export HOMEBREW_BOTTLE_DOMAIN=https://mirrors.ustc.edu.cn/homebrew-bottles' >> ~/.bash_profile
source ~/.bash_profile
```

若是 zsh，则执行：

```bash
echo 'export HOMEBREW_BOTTLE_DOMAIN=https://mirrors.ustc.edu.cn/homebrew-bottles' >> ~/.zshrc
source ~/.zshrc
```


Homebrew 主要由四个部分组成: brew，homebrew-core ，homebrew-cask，homebrew-bottles
它们对应的功能如下：

![](https://cdn.gxmnzl.xyz//img/202206112234193.png)

Homebrew 基本用法有哪些

```bash
# 查询：
brew search 软件名

# 安装：
brew install 软件名

# 卸载：
brew uninstall 软件名

# 更新 Homebrew：
brew update 

# 查看 Homebrew 配置信息：
brew config 
```


### 安装 node

```bash
# 安装node环境
brew install node

# 查看node状态
node -v
```

```bash
# 配置源淘宝源加速（推荐
    # 永久
    npm config set registry https://registry.npm.taobao.org
    # 临时
    npm install -g cnpm --registry=https://registry.npm.taobao.org
# 安装淘宝cnpm（推荐）
    npm install -g cnpm --registry=https://registry.npm.taobao.org
```

### 安装 docsify


```bash
# 使用cnpm安装docsify-cli脚手架
cnpm install i docsify-cli -g
# 查看
docsify -v
```

# 部署到服务器
### 1. Git 安装

#### 包管理器安装

`yum install git`

这样安装的 Git 版本为 1.8.3.1

#### 配置用户信息

`git config --global user.name "username"`

`git config --global user.email "myname@mymail.com"`


### 2. NODE 环境安装

#### 下载安装包 

我下的是 node-v16.14.2-linux-x64.tar.xz ，直接放在 root 目录下

#### 创建目录并解压

1. 在 /user/local/ 下创建 node 文件夹并进入

```bash
cd /usr/local/
mkdir node
cd node
```

2. 解压

`tar -xJvf /root/node-v16.14.2-linux-x64.tar.xz -C ./`

#### 配置 NODE 系统环境变量

`vim ~/.bash_profile`

编辑 ~/.bash_profile ⽂件，在⽂件末尾追加如下信息:

```bash
### Nodejs
export PATH=/usr/local/node/node-v12.16.3-linux-x64/bin:$PATH
```

刷新环境变量使之生效即可：

`source ~/.bash_profile`

#### 检查安装结果

```bash
node -v
npm version
npx -v
```

均有版本信息输出即可

### 3. 从 GitHub 上克隆知识库

#### ssh免密登录

`ssh-keygen -t rsa -C "myname@mymail.com"`

生成密钥的位置为 /root/.ssh/id_rsa（私钥） 和 /root/.ssh/id_rsa.pub（公钥）

复制公钥内容，打开 GitHub -> 点击右上角头像 -> Settings -> SSH and GPG keys -> New SSH key -> 粘贴

#### 创建目录

1. 在 /user/local/ 下创建 www 文件夹并进入

```bash
cd /usr/local/
mkdir www
cd www
```

2. 克隆 GitHub 上的知识库

`git clone git@github.com:Lxzz24/Repo.git`

成功

![images](https://cdn.gxmnzl.xyz/img/Server001.png)

### 4. NGINX 安装部署

这里下载的是 nginx-1.20.2 版本

1. 在/usr/local/ 下创建 nginx ⽂件夹并进⼊

```bash
cd /usr/local/
mkdir nginx
cd nginx
```


2. 将 Nginx 安装包解压到 /usr/local/nginx 中即可

`tar zxvf /root/nginx-1.20.2.tar.gz -C ./`

解压完之后， /usr/local/nginx ⽬录中会出现⼀个 nginx-1.20.2 的⽬录

#### 预先安装额外的依赖

`yum -y install gcc pcre pcre-devel zlib zlib-devel openssl openssl-devel`

#### 编译安装NGINX

```bash
cd nginx-1.20.2
./configure
make && make install
```

安装完成后，Nginx的可执⾏⽂件位置位于 /usr/local/nginx/sbin/nginx

#### 启动 NGINX

- 直接执⾏如下命令即可：

`/usr/local/nginx/sbin/nginx`

- 如果想停⽌Nginx服务，可执⾏：

`/usr/local/nginx/sbin/nginx -s stop`

- 如果修改了配置⽂件后想重新加载Nginx，可执⾏：
`/usr/local/nginx/sbin/nginx -s reload`

- 注意其配置⽂件位于：
`/usr/local/nginx/conf/nginx.conf`

#### 浏览器验证启动情况

![images](https://cdn.gxmnzl.xyz/img/Server002.png)

#### 修改配置文件

`vim /usr/local/nginx/conf/nginx.conf`


![images](https://cdn.gxmnzl.xyz/img/Server003.png)


#### 重载 NGINX 配置
`/usr/local/nginx/sbin/nginx -s reload`

### 5. 部署成功


### 插件问题

#### Gitalk

[Gitalk评论插件使用教程](https://segmentfault.com/a/1190000018072952)
[自动初始化Gitalk评论](http://edisonxu.com/2018/10/31/gitalk-auto-init.html?hmsr=joyk.com&utm_source=joyk.com&utm_medium=referral)


## 使用 docsify

step0. 常用命令

```bash
# 初始化docsify的index.html主页
docsify init <path> [--local false] [--theme vue]
# path 默认是当前目录,可以指定相对目录和绝对目录,将目录下的文件作为文档文件
# --local 默认是false 即使用unpkg.com作为baseurl
# --theme 默认是vue 即使用vue风格 还有buble, dark 和 pure可选

# 启动docsify本地静态网页服务
docsify serve <path> [--open false] [--port 3000]
# path 默认是当前目录,可以指定相对目录和绝对目录,将目录下的文件作为文档文件
# --open 默认是false 即启动不打开网页
# --port 默认是3000 即端口默认3000

# 生成稳定的侧边栏目录（v4.4.3后才支持）
docsify generate <path> [--sidebar _sidebar.md]
# path 默认是当前目录,可以指定相对目录和绝对目录,将目录下的文件作为文档文件
# --sidebar 默认_sidebar.md 将目录下的文档结构生产侧边栏目录
```


step1. 快速开始

```bash
# 1.便携markdown文件到/Users/zyj/a/base

# 2.初始化静态网页到目录/Users/zyj/a
docsify init /Users/zyj/a
# zyj@yujingzhengdeMacBook-Pro  ~/a  ls
# README.md  index.html  base

# 3.生成_sidebar.md
docsify generate /Users/zyj/a
# zyj@yujingzhengdeMacBook-Pro  ~/a  ls
# README.md  index.html  base _sidebar.md

# 4.启动
docsify serve /Users/zyj/a --open
```


step2. 自定义组件

见 [GitHub知识库index.html文件](https://github.com/Lxzz24/Repo) 

