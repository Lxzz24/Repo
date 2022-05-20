# 小白级别的Aria2+motrix设置教程

因为 FDM 无法添加 tracker ，bt下载速度太慢了，所以想找一款像 FDM 一样自动接管浏览器下载
有 bt 下载功能的下载器，搜索了一番后找到了 motrix。尽管 motrix 相比其他 aria2 下载器已经够简单了，
但也不算开箱即用，官方帮助文档里给的扩展两年没更新了还是不太好用，
折腾了一会儿决定写个教程顺便记录一下自己的设置过程。



# 第一步

下载安装 motrix 和 Chrome 扩展 Aria2 for Chrome （edge 的叫 Aria2 for Edge）

[motrix官网](https://motrix.app/)  
[Aria2 for chrome](https://chrome.google.com/webstore/detail/mpkodccbngfoacfalldjimigbofkhgjn)（需要特殊的上网姿势）    
Aria2 for edge： **Aria2 for Edge** - Microsoft Edge Addons  

[其他chromium内核浏览器安装](https://chrome.zzzmh.cn/info?token=mpkodccbngfoacfalldjimigbofkhgjn)
（360、搜狗、QQ等大部分国产浏览器），具体安装方法详见 [这里](https://chrome.zzzmh.cn/help?token=setup) ，chrome无法使用特殊网络连接也可以用这个）  


# 第二步

右键点击 Aria2 for chrome 的图标，选择“选项”（edge 的叫“扩展选项”），进入扩展配置页面。

![Aria2](https://cdn.gxmnzl.xyz/img/MacMotrix1.png)

按下图所示勾选配置， Aria2-RPC-Server 中间填 `http://localhost:16800/jsonrpc` ，
默认设置是 `http://localhost:6800/jsonrpc` ，给 6800 前面加个 1 就行了，填完点击 save。

![具体配置](https://cdn.gxmnzl.xyz/img/MacMotrix2.png)


如果不需要自动替代浏览器自带下载的话，就不用勾选下载拦截选项的第一个，
不需要磁力下载只是当普通多线程下载器来用的话，就不用勾选最后一个。

# 第三步

打开 motrix，再点击 Aria2 for Chrome 图标，正常情况如下图，左边的“ Aria2 状态”会显示已连接

![正常情况](https://cdn.gxmnzl.xyz/img/MacMotrix3.png)

注意：如果这里没显示已连接可能是因为 motrix 设置了 rpc 授权密码（我就是因为这个在这里卡了很久），
需要在 motrix 的左下角点击设置，再点击进阶设置，把授权密码那里填写的东西删掉。

![motrix设置](https://cdn.gxmnzl.xyz/img/MacMotrix4.png)

# 第四步

设置 motrix 的 bt 下载，点击左下角的设置再点击进阶设置，选择 tracker 服务器并勾选
每天自动更新 tracker服务器列表（可以显著加快bt下载速度），下载协议部分如果不用
其他bt下载软件的话就选择开启。

![进阶设置](https://cdn.gxmnzl.xyz/img/MacMotrix5.png)

注意bt下载没速度的解决方法（以下引用自官方帮助文档）： 

使用 Motrix 下载 BT/Magnet 任务之前，建议找个热门种子（不是磁力链接Magnet！），下载一波，
挂着做种，过几个小时后退出，用于生成 dht.dat 缓存数据。这样之后下载 BT/Magnet 任务时速度会比较正常。
BT 下载速度受多重因素影响，比如没人做种，部分网络运营商禁封了 BT 的连接端口，
还有不可抗力的网络原因无法连接国外的 tracker 服务器等（请自备酸酸乳等饮品），请务必有点耐心！

我按照官方的步骤设置之后，特意对比了一下 motrix 和比特彗星的下载速度，两者的平均速度基本相同。
如果同一个种子两个都没速度那就是因为种子太小众了，这种情况只能用 115 和迅雷网盘的离线下载功能了。


# 第五步

找个不限速的网站试试，比如 uc 网盘、蓝奏云之类的，点击下载链接后不会有弹窗，
但是打开 motrix 就会发现正在下载中了，正常情况下是可以跑满宽带的。