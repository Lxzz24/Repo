# 
# WEB 服务器 Nginx 安装部署

!> From [CodeSheep](https://space.bilibili.com/384068749)

## ⾸先安装包并解压

这⾥下载的是 nginx-1.20.2.tar.gz 安装包，并将其直接放在了 root ⽬录下

1、在 /usr/local/ 下创建 nginx ⽂件夹并进⼊

```
cd /usr/local/
mkdir nginx
cd nginx
```

2、将 Nginx 安装包解压到 /usr/local/nginx 中即可

```
[root@localhost nginx]# tar zxvf /root/nginx-1.20.2.tar.gz -C ./
```

解压完之后， /usr/local/nginx ⽬录中会出现⼀个 nginx-1.20.2 的⽬录


## 预先安装额外的依赖

```
yum -y install pcre-devel
yum -y install openssl openssl-devel
```

## 编译安装 Nginx

```
cd nginx-1.20.2
./configure
make && make install
```

安装完成后，Nginx 的可执⾏⽂件位置位于 `/usr/local/nginx/sbin/nginx`

## 启动 Nginx

直接执⾏如下命令即可：

```
[root@localhost sbin]# /usr/local/nginx/sbin/nginx
```

如果想停⽌ Nginx 服务，可执⾏：

```
/usr/local/nginx/sbin/nginx -s stop
```

如果修改了配置⽂件后想重新加载 Nginx，可执⾏：

```
/usr/local/nginx/sbin/nginx -s reload
```

注意其配置⽂件位于：`/usr/local/nginx/conf/nginx.conf`


## 浏览器验证启动情况

浏览器输入 `localhost:80` 验证，其中 `localhost` 为你的服务器公网 IP 地址






# HTTPS 访问（Nginx 绑定 SSL 证书）

!> From [阿里云](https://help.aliyun.com/document_detail/98728.html?spm=5176.b657008.help.19.3ea7799dDQKv29#step-g2p-wai-ral)

## 步骤1：下载证书到本地

以阿里云为例：

1. 登录 **SSL 证书控制台**。
2. 在左侧导航栏，单击 SSL 证书。
3. 到定位要下载的证书，手动操作列下的下载。
4. 在证书下载面板，定位到 Nginx 服务器，操作列下的下载。
   该操作将 Nginx 服务器证书压缩包下载到本地，并保存在浏览器的默认下载位置。
5. 打开浏览器的默认下载位置，解压已下载的 Nginx 证书压缩包文件。解压后您将获得以下文件：

![1](https://cdn.gxmnzl.xyz/img/Nginx1.png)


> [!ATTENTION]
> 注意 本文中出现证书文件名称的地方，统一使用 *cert-file-name* 为例进行描述。
> 例如，本文中用到的证书文件为 *cert-file-name.pem*，证书私钥文件为 *cert-file-name.key*。
> 在实际操作过程中，您必须使用真实的证书文件名称替换示例代码中的 *cert-file-name*。
> 获取证书文件名称的具体操作，请参见 [下载证书到本地](https://help.aliyun.com/document_detail/98728.html?spm=5176.b657008.help.19.3ea7799dDQKv29#step-g2p-wai-ral)。


- PEM 格式的证书文件。  
PEM格式的证书文件是采用Base64编码的文本文件，您可以根据需要将证书文件修改成其他格式。  
关于证书格式的更多信息，请参见 [主流数字证书都有哪些格式](https://help.aliyun.com/document_detail/42214.htm?spm=a2c4g.11186623.0.0.6f507cc9jMeFeH#concept-a4g-mbv-ydb)。

- KEY 格式的证书密钥文件。  

?> 如果您在申请证书时将 **CSR生成** 设置为**手动填写**，则下载的证书压缩包方式中不会包含密钥，您需要手动创建证书文件文件。


## 步骤2：在 Nginx 服务器上安装证书

在 Nginx 独立服务器、Nginx 虚拟主机上安装证书的具体操作不同，请根据您的实际环境，选择相应的安装步骤。

参考以下步骤，在 Nginx 独立服务器上安装证书：

1. 登录 Nginx 服务器。  
   例如，您可以使用远程登录工具（例如，PuTTY、Xshell）登录服务器。
2. 执行以下命令，在 Nginx 安装目录（默认为 /usr/local/nginx/conf）下创建一个用于存放证书的目录，将其命名为 cert。
   
   ```
   cd /usr/local/nginx/conf  #进入Nginx默认安装目录。如果您修改过默认安装目录，请根据实际配置进行调整。
   mkdir cert  #创建证书目录，命名为cert。
   ```
3. 使用远程登录工具（例如，PuTTY、Xshell）附带的本地文件上传功能，将本地证书文件和私钥文件上传到 Nginx 服务器的证书目录
   （示例中为 /usr/local/nginx/conf/cert）。
   
   ?> 如果您在申请证书时将 CSR 生成方式设置为手动填写，请将您手动创建的证书私钥文件上传至 /usr/local/nginx/conf/cert 目录。
4. 编辑 Nginx 配置文件（nginx.conf），修改与证书相关的配置内容。
   
   - 1. 执行以下命令，打开配置文件。  
    
    ?> 注意 nginx.conf 默认保存在 /usr/local/nginx/conf 目录下。如果您修改过 nginx.conf 的位置，
    请将 /usr/local/nginx/conf/nginx.conf 替换成修改后的位置。  

    ```
    vim /usr/local/nginx/conf/nginx.conf
    ```

   - 2. 进入 `I` 键编辑模式。
  
   - 3. 在修改配置文件中定位到HTTP协议代码片段（http{}），并在 HTTP 协议代码里面添加以下 server 配置
        （如果服务器配置内容已经存在，按照以下注释相应配置启用）。  
        使用示例代码前，请注意替换以下内容：
       
         - yourdomain：替换成证书绑定的域名。
            如果您购买的是单域名证书，需要修改为单域名（例如 www.aliyundoc.com）；
            如果您购买的是通配符域名证书，则需要修改为通配符域名（例如 *.aliyundoc.com）。
         - `cert-file-name.pem`：替换成您在步骤 3 上传的证书文件的名称。
         - `cert-file-name.key`：替换成您在步骤 3 上传的证书私钥文件的名称。

            ```conf
            #以下属性中，以故事情节的属性表示与证书配置有关。
            server {
                listen 443 ssl;
                #配置HTTPS的默认访问端口为443。
                #如果未在此处配置HTTPS的默认访问端口，可能会造成Nginx无法启动。
                #如果您使用Nginx 1.15.0及以上版本，请使用listen 443 ssl代替listen 443和ssl on。
                server_name yourdomain; #需要将yourdomain替换成证书绑定的域名。
                root html;
                index index.html index.htm;
                ssl_certificate cert/*cert-file-name*.pem;  #需要将*cert-file-name*.pem替换成已上传的证书文件的名称。
                ssl_certificate_key cert/*cert-file-name*.key; #需要将*cert-file-name*.key替换成已上传的证书私钥文件的名称。
                ssl_session_timeout 5m;
                ssl_ciphers ECDHE-RSA-AES128-GCM-SHA256:ECDHE:ECDH:AES:HIGH:!NULL:!aNULL:!MD5:!ADH:!RC4;
                #表示使用的加密套件的类型。
                ssl_protocols TLSv1.1 TLSv1.2 TLSv1.3; #表示使用的TLS协议的类型。
                ssl_prefer_server_ciphers on;
                location / {
                    root html;  #Web网站程序存放目录。
                    index index.html index.htm;
                }
            }
            ```
   - 4. 可选：设置 HTTP 请求自动跳转 HTTPS。  
        如果您希望所有的 HTTP 访问自动跳转到 HTTPS 页面，则可以在需要跳转的 HTTP 站点下添加以下 rewrite 语句。  

        ?> 以下代码片段需要放置在 nginx.conf 文件中 server {} 代码段后面，即设置 HTTP 请求自动跳转 HTTPS 后，
        nginx.conf 文件中会存在两个server {}代码段。

        ```conf
        server {
            listen 80;
            server_name yourdomain; #需要将yourdomain替换成证书绑定的域名。
            rewrite ^(.*)$ https://$host$1; #将所有HTTP请求通过rewrite指令重定向到HTTPS。
            location / {
                index index.html index.htm;
            }
        }
        ```

        > [!WARNING]
        > 警告 如果您使用的是阿里云 ECS 服务器，必须在 ECS 管理控制台的安全组页面，
        > 配置放行 `80` 端口和 `443` 端口，否则网站访问可能出现异常。关于如何配置安全组，
        > 请参见[添加安全组规则](https://help.aliyun.com/document_detail/25471.htm?spm=a2c4g.11186623.0.0.6f507cc9jMeFeH#concept-sm5-2wz-xdb)。
   - 5. 修改完成后，按 Esc 键、输入 `:wq!` 并按Enter键，保存修改后的配置文件并退出编辑模式。
5. 执行以下命令，重启 Nginx 服务。
    
    ```
    cd /usr/local/nginx/sbin  #进入Nginx服务的可执行目录。
    ./nginx -s reload  #重新载入配置文件。
    ```

    > [!TIP]
    > 如果重启 Nginx 服务时收到报错，您可以使用以下方法进行排查：
   - 收到 `the "ssl" parameter requires ngx_http_ssl_module` 报错：
        您需要重新编译 Nginx 并在编译安装的时候加上 `--with-http_ssl_module` 配置。
   - 收到如下报错：您需要去掉证书相对路径最前面的 /。
        ```
        "/cert/3970497_pic.certificatestests.com.pem":BIO_new_file() failed (SSL: error:02001002:system library:fopen:No such file or directory:fopen('/cert/3970497_pic.certificatestests.com.pem','r') error:2006D080:BIO routines:BIO_new_file:no such file)
        ```
        
        例如，您需要去掉 `/cert/*cert-file-name*.pem` 最前面的 /，
        使用正确的相对路径 `cert/*cert-file-name*.pem`。


## 步骤3：验证是否安装成功

证书安装完成后，您可通过访问证书的绑定域名验证该证书是否安装成功。  

```
https://yourdomain   #需要将yourdomain替换成证书绑定的域名。
```

如果网页地址栏出现小锁标志，表示证书已经安装成功。  



# 问题解决

在重启 Nginx 服务时收到 `the "ssl" parameter requires ngx_http_ssl_module` 报错，可参考以下方法解决：

!> From [关于给编译好的 nginx，添加 http_ssl_module 模块及配置 ssl 证书](https://zhuanlan.zhihu.com/p/47928700)

报错证明 nginx 在编译安装时候没有连同 http_ssl_module 模块一同编译；

现在的情况是 nginx 已经安装过了，需要重新编译，编译安装的时候带上 `--with-http_ssl_module` 配置。

?> 测试环境：centos 7.9  
工程版本：nginx-1.20.2  


**操作前必须先备份原有的 Nginx**

编译开始根据如下：

1. 示例：nginx 的安装目录是 /usr/local/nginx ，源码包在 /root/nginx-1.20.2 目录下。

> [!TIP]
> 博主是将 `/usr/local/nginx` 目录下的 `nginx-1.20.2` 文件夹（已编译安装过）复制到了 `/root` 目录下

2. 切换到源码包：

```
cd /root/nginx-1.20.2
```

3. 进行编译：

```
./configure --prefix=/usr/local/nginx --with-http_stub_status_module --with-http_ssl_module
```

4. 配置完成后，运行命令：

```
make
```

5. make 命令执行后，不要进行 make install，否则会覆盖安装。

6. 备份原有已安装好的 nginx ：

```
cp /usr/local/nginx/sbin/nginx /usr/local/nginx/sbin/nginx.bak
```

7. 停止 nginx 状态：

```
/usr/local/nginx/sbin/nginx -s stop
```

8. 将编译好的 nginx 覆盖掉原有的 nginx ：

```
cd /root/nginx-1.20.2/
cp ./objs/nginx /usr/local/nginx/sbin/
```

9. 提示是否覆盖，输入 yes 即可。

10.  然后启动 nginx：

```
/usr/local/nginx/sbin/nginx
```

11. 进入 nginx/sbin 目录下，通过命令查看模块是否已经加入成功：

```
cd /usr/local/nginx/sbin/
./nginx -V
```

> [!ATTENTION]
> **V** 是大写

12. 有以下提示，证明已经编译成功：

![2](https://cdn.gxmnzl.xyz/img/Nginx2.png)












