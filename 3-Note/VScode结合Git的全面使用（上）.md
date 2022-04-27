#
# Git 介绍
> 这里需要阐明一个概念，说到 git 很多人会想到 github
> 其实 github 只是 git 的远程服务器端而已，github 并不等于 git ，实际上 git 是一个代码管理软件。
> 不用 github 也可以用 gitlab 或者 国内的 码云 和 coding
> 如果不需要图形化界面的话，甚至不需要把代码放到 github 上，完全可以在自己搭建的服务器上进行代码同步管理。

> 说到 git 也很容易联想到一个老牌的代码管理工具 SVN
> 其实两者在使用上的区别不是很大，重点是 git 是去中心的分布式管理， SVN 则刚好相反。
> 不过我自己也没有深入使用 SVN ，因此我也是在网上看的文章得到的片面之词，只是阐述自己目前的理解。

> SVN 就好比银行，我们所有的交易都要以它为中心进行解算，因此银行之下的我们是不知道所有的数据的，我们只需要管理好手中的数据就可以了。
> git 的话就是每个人都是银行，所有的交易都会同步到每个人的身上。
> SVN 管理的好处就是简单清晰，管理好自己负责的代码即可。
> git 的好处就是代码安全，如果中心服务器挂了，每个人都可以成为中心来重新建立彼此的同步。
> 当然现在大行其道的是 git 代码管理。
> 至于更多 SVN 和 git 区别可以参考 [菜鸟教程](https://www.runoob.com/git/git-tutorial.html)


# Git 使用
git 本质上是一个命令行工具，可以去到 git 的官网安装其客户端。 [链接](https://git-scm.com/)
安装成功之后就可以在命令行上输入 git 获取到 git 的操作指令了。
![image.png](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Note/VSGit01.png)

下面关于 git 的命令行使用就详细说明了，可以参考菜鸟学院里面的教程 [链接](https://www.runoob.com/git/git-tutorial.html)
下面是一些常用的命令

```BASH
git init  // 初始化本地仓库
git config --global user.name "myname"  // 配置用户名
git config --global user.email "myname@mymail.com"  //配置邮箱
git remote add origin code@github.git  //绑定本地和远程仓库 
git pull   // 拉取远程仓库的变化来同步本地的状态
git add  // 确认本地仓库的变化到本地缓存区
git commit  // 确认本地缓存区的内容，可以准备push
git push   // 提交本地仓库到远程仓库
git status   // 确定本地缓存区的状态
```

补充一下配置了 user 之后就可以在 git 上看到上传代码的用户，这个未必和 github 用户一样的。
另外如果上传到 github 的话需要 github 账号的验证，每次都需要输入账号密码很麻烦。
可以利用 ssh 进行 github 免密登录 [链接](https://blog.csdn.net/u013778905/article/details/83501204)

# GitHub SSH 免密登录

ssh 是通过 口令的机制 实现免密登录的。
目前后端的服务器登录很常用的免密登录技术，由于口令非常复杂且无序，比输入人为的密码要安全很多

# VScode 内置 Git 使用方法
## 认识界面
## 文件更新示例
## commit 代码
## push 代码
## GitHub 查看代码
## pull 代码
## 分支切换
# 总结

