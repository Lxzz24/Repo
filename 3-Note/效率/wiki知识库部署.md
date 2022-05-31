##  安装

1. 下载最新版本的 Wiki.js ：

    ```bash
    wget https://github.com/Requarks/wiki/releases/latest/download/wiki-js.tar.gz
    ```
2. 创建目录并解压
   
    ```bash
    mkdir wiki
    tar xzf wiki-js.tar.gz -C ./wiki
    cd ./wiki
    ```
3. 将示例配置文件重命名
   
    ```bash
    mv config.sample.yml config.yml
    ```

## 安装数据库 

[下载地址](https://www.postgresql.org/download/)


1. 根据系统选择自己所需的安装包，这里我选择的是 Linux-CentOS-7 ，安装最新版本

![1](https://cdn.gxmnzl.xyz//img/202205311019169.png)

![2](https://cdn.gxmnzl.xyz//img/202205311021197.png)

2. 选择完成后，复制生成的安装命令进行安装：

```bash
# Install the repository RPM:
sudo yum install -y https://download.postgresql.org/pub/repos/yum/reporpms/EL-7-x86_64/pgdg-redhat-repo-latest.noarch.rpm

# Install PostgreSQL:
sudo yum install -y postgresql14-server

# Optionally initialize the database and enable automatic start:
sudo /usr/pgsql-14/bin/postgresql-14-setup initdb
sudo systemctl enable postgresql-14
sudo systemctl start postgresql-14
```

3. 安装完成后，使用 `systemctl` 命令查看数据库运行情况

```bash
systemctl status postgresql-14
```

![3](https://cdn.gxmnzl.xyz//img/202205311030724.png)

4. 安装成功！



## 安装 Node.js

[下载地址](https://nodejs.org/zh-cn/download/)

1. 下载安装压缩包

这里我选择的是 64 位版本

![4](https://cdn.gxmnzl.xyz//img/202205311032314.png)


将下载好的压缩包拖入服务器（/root 目录下），这里我使用的是 xFtp 工具

2. 解压

```bash
tar -xf node-v16.15.0-linux-x64.tar.xz

# 查看当前路径下的文件
ls

# 给node文件夹改个名，太长了
mv node-v16.15.0-linux-x64 node
```

3. 配置环境变量

```bash
node -v
```

先查看一下 node 版本，提示 `-bash: node: command not found`，因为还没有配置环境变量：

```bash
# 进入node/bin目录，需要的可执行文件都在bin目录下
cd node/bin

# 输出当前路径
pwd

# 建立软链接，可以理解为快捷方式
ln -s /root/node/bin/node /usr/local/bin/node
```

再次查看 node 版本，发现可以看到：

![5](https://cdn.gxmnzl.xyz//img/202205311102998.png)

现在就可以在任意位置使用 node 命令了。

4. 启动 node 服务器

```bash
# 进入Wiki目录
cd wiki/

# 启动node服务器，需要提前打开服务器3000端口
node server/
```

### 提示数据库连接错误（`error: Database Connection Error:`）

1. 修改 wiki/config.yml 文件

```bash
vim config.yml
```

```yml
db:
  type: postgres
  host: localhost
  port: 5432
  # 数据库默认的用户名密码
  user: postgres
  pass: postgres
  db: wiki
```

2. 修改数据库配置

```bash
vim /var/lib/pgsql/14/data/pg_hba.conf
```

![6](https://cdn.gxmnzl.xyz//img/202205311121384.png)

`peer` 改为 `trust`

3. 重启数据库

```bash
systemctl restart postgresql-14
```

4. 连接数据库（这里可以操作数据库）

```bash
psql -U postgres
```

5. 创建 wiki 数据库

```sql
create database wiki;
```

6. `\l` 查看数据库信息

```sql
postgres=# \l
                                  List of databases
   Name    |  Owner   | Encoding |   Collate   |    Ctype    |   Access privileges   
-----------+----------+----------+-------------+-------------+-----------------------
 postgres  | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
 template0 | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/postgres          +
           |          |          |             |             | postgres=CTc/postgres
 template1 | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/postgres          +
           |          |          |             |             | postgres=CTc/postgres
 wiki      | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
(4 rows)
```

7. 重置默认密码（以防万一）

```sql
alter user postgres with password 'postgres';
```

## 安装向导

![7](https://cdn.gxmnzl.xyz//img/202205311145607.png)

输入管理员邮箱、密码、域名（没有域名用服务器 ip 地址），取消勾选 Allow Telemetry

![8](https://cdn.gxmnzl.xyz//img/202205311147635.png)


登录，然后进入到主界面，先进入管理员面板

![9](https://cdn.gxmnzl.xyz//img/202205311148977.png)

选择 Locale ，下载中文语言包，在 setting 处选择中文并应用

![10](https://cdn.gxmnzl.xyz//img/202205311150360.png)


*知识库搭建完成*🎉🎉🎉


## 使用指南

![11](https://cdn.gxmnzl.xyz//img/202205311154609.png)

点击创建首页

![12](https://cdn.gxmnzl.xyz//img/202205311154904.png)

目前支持 markdown 、 code 编辑器，开始你的写作吧！

