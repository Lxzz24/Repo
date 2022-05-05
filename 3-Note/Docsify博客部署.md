# 

# 1. Git 安装

## 包管理器安装

`yum install git`

这样安装的 Git 版本为 1.8.3.1

## 配置用户信息

`git config --global user.name "username"`

`# git config --global user.email "myname@mymail.com"`


# 2. NODE 环境安装

## 下载安装包 

我下的是 node-v16.14.2-linux-x64.tar.xz ，直接放在 root 目录下

## 创建目录并解压

1. 在 /user/local/ 下创建 node 文件夹并进入

```
cd /usr/local/
mkdir node
cd node
```

2. 解压

`tar -xJvf /root/node-v16.14.2-linux-x64.tar.xz -C ./`

## 配置 NODE 系统环境变量

`vim ~/.bash_profile`

编辑 ~/.bash_profile ⽂件，在⽂件末尾追加如下信息:

```
# Nodejs
export PATH=/usr/local/node/node-v12.16.3-linux-x64/bin:$PATH
```

刷新环境变量使之生效即可：

`source ~/.bash_profile`

## 检查安装结果

```
node -v
npm version
npx -v
```

均有版本信息输出即可

# 3. 从 GitHub 上克隆知识库

## ssh免密登录

`ssh-keygen -t rsa -C "myname@mymail.com"`

生成密钥的位置为 /root/.ssh/id_rsa（私钥） 和 /root/.ssh/id_rsa.pub（公钥）

复制公钥内容，打开 GitHub -> 点击右上角头像 -> Settings -> SSH and GPG keys -> New SSH key -> 粘贴

## 创建目录

1. 在 /user/local/ 下创建 www 文件夹并进入

```
cd /usr/local/
mkdir www
cd www
```

2. 克隆 GitHub 上的知识库

`git clone git@github.com:Lxzz24/Repo.git`

成功

![images](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Server001.png)

# 4. NGINX 安装部署

这里下载的是 nginx-1.20.2 版本

1. 在/usr/local/ 下创建 nginx ⽂件夹并进⼊

```
cd /usr/local/
mkdir nginx
cd nginx
```


2. 将 Nginx 安装包解压到 /usr/local/nginx 中即可

`tar zxvf /root/nginx-1.20.2.tar.gz -C ./`

解压完之后， /usr/local/nginx ⽬录中会出现⼀个 nginx-1.20.2 的⽬录

## 预先安装额外的依赖
`yum -y install pcre-devel`
`yum -y install openssl openssl-devel`

## 编译安装NGINX

```
cd nginx-1.20.2
./configure
make && make install
```

安装完成后，Nginx的可执⾏⽂件位置位于 /usr/local/nginx/sbin/nginx

## 启动 NGINX

- 直接执⾏如下命令即可：

`/usr/local/nginx/sbin/nginx`

- 如果想停⽌Nginx服务，可执⾏：

`/usr/local/nginx/sbin/nginx -s stop`

- 如果修改了配置⽂件后想重新加载Nginx，可执⾏：
`/usr/local/nginx/sbin/nginx -s reload`

- 注意其配置⽂件位于：
`/usr/local/nginx/conf/nginx.conf`

## 浏览器验证启动情况

![images](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Server002.png)

## 修改配置文件

`vim /usr/local/nginx/conf/nginx.conf`


![images](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Server003.png)


## 重载 NGINX 配置
`/usr/local/nginx/sbin/nginx -s reload`

# 5. 部署成功


