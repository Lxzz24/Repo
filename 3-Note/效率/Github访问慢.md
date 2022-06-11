## 解决 GitHub 访问慢/无法访问

[来源](https://guozh.net/accelerate-access-to-github/)

Github 有很多优质资源，甚至有些开源免费的资源，比付费的还好用。

我今天快速分享几个方法，希望能帮你解决这个问题。

第一种方法是修改 host 文件，

像 Github 这种国际性大公司，肯定全球各个国家都部署了服务，虽然全球不同国家的用户都是访问同一个域名 ，比如，日本和澳大利亚的网友都访问 github.com，但背后访问的服务器不是同一个，为了提高访问速度，肯定优先访问本地服务器的服务。日本访问日本节点的服务器，澳大利亚访问澳大利亚。

这里实现的方式就是利用 DNS 域名解析服务器，这个解析服务器相当一个中间件一样，记录这域名和 IP 的映射关系。

本来是很正常的，但国内因为一些原因，大家都懂得，Github 并没有中国的节点，所以，DNS 域名解析服务器会将域名解析到海外服务器去了。这就导致国内用户访问 Github 很慢。

但海外国家很多，我们可以挑选一些离我们近的国家，访问 Github 部署在他们国家的服务器，这样访问速度可能会快点。

这里我们需要做两步，第一，找出国内访问 Github 的哪个节点速度会比较块，第二，将找到的节点 IP 在 Host把文件修改，确定域名和 IP 的映射关系。这样，域名就能直接访问到 IP 对应的服务器。

## Github520

第一步不用我们做了，有网友维护了 Github 最新、最好的节点。当然，这个作者也将它们开源到 [Github](https://github.com/521xueweihan/GitHub520)。


复制如下内容：

```bash
# GitHub520 Host Start
140.82.112.25                 alive.github.com
140.82.112.25                 live.github.com
185.199.108.154               github.githubassets.com
140.82.114.21                 central.github.com
185.199.108.133               desktop.githubusercontent.com
185.199.108.153               assets-cdn.github.com
185.199.108.133               camo.githubusercontent.com
185.199.108.133               github.map.fastly.net
199.232.69.194                github.global.ssl.fastly.net
140.82.112.4                  gist.github.com
185.199.108.153               github.io
140.82.113.3                  github.com
192.0.66.2                    github.blog
140.82.114.5                  api.github.com
185.199.108.133               raw.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
140.82.114.9                  codeload.github.com
54.231.200.129                github-cloud.s3.amazonaws.com
52.217.33.196                 github-com.s3.amazonaws.com
52.216.93.147                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.93.147                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.207.33                 github-production-repository-file-5c1aeb.s3.amazonaws.com
185.199.108.153               githubstatus.com
64.71.144.211                 github.community
23.100.27.125                 github.dev
140.82.113.21                 collector.github.com
13.107.42.16                  pipelines.actions.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.108.133               objects.githubusercontent.com
# Update time: 2022-06-04T08:20:22+08:00
# Update url: https://raw.hellogithub.com/hosts
# Star me: https://github.com/521xueweihan/GitHub520
# GitHub520 Host End
```

找到电脑上 hosts 文件地址。

Windows：`C:\Windows\System32\drivers\etc\hosts`

Mac：`/etc/hosts`

接着以管理员身份用文本编辑器打开 hosts 文件，如果右键目录里没管理员身份运行选项，那就修改 hosts 文件权限。

***右键-属性-安全-编辑*** ，选择登录电脑的用户名，将权限修改成完全控制，也就是获取读写权限。

修改完成再用文本编辑器打开，将上面 Github 的映射 IP 都复制粘贴到最后面。

最后再刷新 DNS 缓存，使用 CMD 打开 DOSS 界面，输入命令

```
ipconfig /flushdns
```

Mac 用户使用如下命令

```
sudo killall -HUP mDNSResponder
```

OK，各位可以再打开 Github 看看，访问速度是否有提高。

刚才这是手动的方式，这种方式的弊端就是解析 IP 有更新，我们又得复制粘贴，修改 hosts 内容。作者也提供自动方式。

先下载管理 hosts 文件的软件，如果你的电脑上有这样的软件，可以跳过下载安装软件这一步。

如果没有，作者推荐使用 [SwitchHosts](https://github.com/oldj/SwitchHosts) 工具，这同样也是一个开源免费的软件。支持 Windows、Mac、Linux。

在[下载页面](https://github.com/oldj/SwitchHosts/releases)，找到符合你电脑操作系统的软件。

```
SwitchHosts_installer_4.1.1.6077.exe 普通 Windows64 位
SwitchHosts_mac_universal_4.1.1.6077.dmg Mac 通用版
SwitchHosts_mac_arm64_4.1.1.6077.dmg Mac ARM 芯片版本（猜测）
```

下载安装到电脑上，添加一个远程类型 hosts 解析规则。

这是 [URL](https://raw.hellogithub.com/hosts) : `https://raw.hellogithub.com/hosts`

这样，每次作者更新 IP 后，都会自动更新到这个地址，我们都能加载获取最新的 IP。


## FastGithub


第二种方案更加简单，只要下载软件就行了。这个项目叫 [Github 加速神器](https://github.com/dotnetcore/FastGithub)，解决 Github 打不开、用户头像无法加载、releases 无法上传下载、git-clone、git-pull、git-push 失败等问题。

在[下载页面](https://github.com/dotnetcore/FastGithub/releases)下载你需要的软件，同样支持 Mac、Windows、Linux。

下载解压到本地，双击打开。



打开 Doss 命令窗，软件作用就生效，能加速访问 Github，使用期间不要关闭窗口。





