# 1 （简单）选择排序
![(简单)选择排序.gif](https://cdn.nlark.com/yuque/0/2021/gif/2822416/1637052702112-e7bfe62d-a4db-4de1-a365-38e23440c88b.gif#clientId=u834b847e-f714-4&from=drop&id=u7bc43919&margin=%5Bobject%20Object%5D&name=%28%E7%AE%80%E5%8D%95%29%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F.gif&originHeight=248&originWidth=811&originalType=binary&ratio=1&size=628926&status=done&style=none&taskId=u779c5955-e655-4908-8d8b-3711181c348)
# 2 （直接）插入排序
![(直接)插入排序.gif](https://cdn.nlark.com/yuque/0/2021/gif/2822416/1637052793915-fab3b356-2f80-46cc-9d01-18d900856e94.gif#clientId=u834b847e-f714-4&from=drop&id=u57323013&margin=%5Bobject%20Object%5D&name=%28%E7%9B%B4%E6%8E%A5%29%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F.gif&originHeight=505&originWidth=811&originalType=binary&ratio=1&size=404492&status=done&style=none&taskId=u4b92f877-9c5c-452b-8b03-1c19421ab12)
# 3 堆排序
![堆排序.gif](https://cdn.nlark.com/yuque/0/2021/gif/2822416/1637308092724-8464e9d3-a243-4938-8fc2-726cba1a0a2f.gif#clientId=ubd16e4e3-63fe-4&from=ui&id=u719cd8bd&margin=%5Bobject%20Object%5D&name=%E5%A0%86%E6%8E%92%E5%BA%8F.gif&originHeight=364&originWidth=547&originalType=binary&ratio=1&size=1997590&status=done&style=none&taskId=u4b785665-9eb7-4c8a-8113-2cce72bee86)
# 4 归并排序
![归并排序.gif](https://cdn.nlark.com/yuque/0/2021/gif/2822416/1637052878218-a7d87093-df98-4282-9fc2-b78ccb77ba61.gif#clientId=u834b847e-f714-4&from=drop&id=ud8e9702a&margin=%5Bobject%20Object%5D&name=%E5%BD%92%E5%B9%B6%E6%8E%92%E5%BA%8F.gif&originHeight=505&originWidth=811&originalType=binary&ratio=1&size=376572&status=done&style=none&taskId=udd365aff-b5cc-447a-a462-04f5bf4bd9b)
# 5 基数排序
![基数排序.gif](https://cdn.nlark.com/yuque/0/2021/gif/2822416/1637052885105-899376f9-e22e-4457-95a7-41cc7ba4c3b6.gif#clientId=u834b847e-f714-4&from=drop&id=u3a08eaf5&margin=%5Bobject%20Object%5D&name=%E5%9F%BA%E6%95%B0%E6%8E%92%E5%BA%8F.gif&originHeight=574&originWidth=1012&originalType=binary&ratio=1&size=199096&status=done&style=none&taskId=u9343993b-38e1-4abb-a1ed-ea657177e38)
# 6 计数排序
![计数排序.gif](https://cdn.nlark.com/yuque/0/2021/gif/2822416/1637052891770-975246e7-b660-4857-abad-17f07bdd4429.gif#clientId=u834b847e-f714-4&from=drop&id=ud3abdb3a&margin=%5Bobject%20Object%5D&name=%E8%AE%A1%E6%95%B0%E6%8E%92%E5%BA%8F.gif&originHeight=557&originWidth=1012&originalType=binary&ratio=1&size=270753&status=done&style=none&taskId=u549510b0-c8d3-44a0-80c0-be9cf9ad8e7)
# 7 快速排序
![快速排序.gif](https://cdn.nlark.com/yuque/0/2021/gif/2822416/1637052897603-acd9255c-dac4-49c2-ad4f-3f89baf4ed4b.gif#clientId=u834b847e-f714-4&from=drop&id=u77af4f79&margin=%5Bobject%20Object%5D&name=%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F.gif&originHeight=252&originWidth=811&originalType=binary&ratio=1&size=335061&status=done&style=none&taskId=u0db02509-82cb-4fa6-a294-715a628e2e3)
> **介绍：** 
> 快速排序通常明显比同为O(nlogn)的其他算法更快，因此常被采用，而且快排采用了分治法的思想，所以在很多笔试面试中能经常看到快排的影子。可见掌握快排的重要性。 
> 快速排序（Quick Sort）由图灵奖获得者Tony Hoare发明，被列为20世纪十大算法之一，是迄今为止所有内排序算法中速度最快的一种。冒泡排序的升级版，交换排序的一种。快速排序的时间复杂度为O(nlog(n))。
> **排序思想：** 
> 1. 从数列中挑出一个元素，称为"基准"(pivot)。
> 1. 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面(相同的数可以到任一边)。在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区(partition)操作。 
> 1. 递归地(recursive)把小于基准值元素的子数列和大于基准值元素的子数列排序。
> 1. 递归的最底部情形，是数列的大小是零或一，也就是永远都已经被排序好了。虽然一直递归下去，但是这个算法总会结束，因为在每次的迭代(iteration)中，它至少会把一个元素摆到它最后的位置去。



# 8 冒泡排序
![冒泡排序.gif](https://cdn.nlark.com/yuque/0/2021/gif/2822416/1637052902139-cc84cb05-0c40-4fce-be6f-5f6d65c8bd76.gif#clientId=u834b847e-f714-4&from=drop&id=ud91e55e7&margin=%5Bobject%20Object%5D&name=%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F.gif&originHeight=257&originWidth=826&originalType=binary&ratio=1&size=466890&status=done&style=none&taskId=uf7753ec9-3860-4819-a8b9-c00a4df3603)
> **介绍： **
> 冒泡排序的原理非常简单，它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。 
> **排序思想：** 
> 1. 比较相邻的元素。如果第一个比第二个大（升序），就交换他们两个。 
> 1. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。 
> 1. 针对所有的元素重复以上的步骤，除了最后一个。 
> 1. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较为止。

# 9 桶排序
![桶排序.png](https://cdn.nlark.com/yuque/0/2021/png/2822416/1637052911795-34da769a-2ea5-432d-8666-560e564efdf2.png#clientId=u834b847e-f714-4&from=drop&id=u36f065db&margin=%5Bobject%20Object%5D&name=%E6%A1%B6%E6%8E%92%E5%BA%8F.png&originHeight=298&originWidth=435&originalType=binary&ratio=1&size=38943&status=done&style=none&taskId=u81c6bcbb-622b-4ebd-a21f-7750dc75fbc)
# 10 希尔排序
![希尔排序.gif](https://cdn.nlark.com/yuque/0/2021/gif/2822416/1637052924914-0172dcb5-d609-437a-acc5-4b831ad6dd90.gif#clientId=u834b847e-f714-4&from=drop&id=u63fd2f72&margin=%5Bobject%20Object%5D&name=%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F.gif&originHeight=290&originWidth=665&originalType=binary&ratio=1&size=1102998&status=done&style=none&taskId=u9de68315-1cc7-4430-a592-3a5375c38e9)
# @各种内部排序方法性能比较
![image.png](https://cdn.nlark.com/yuque/0/2021/png/2822416/1637307992230-4f4fa64f-7973-4455-b3de-fdc937d09d6b.png#clientId=ue75a0be1-d20c-4&from=paste&height=450&id=u02ef5800&margin=%5Bobject%20Object%5D&name=image.png&originHeight=450&originWidth=660&originalType=binary&ratio=1&size=91217&status=done&style=none&taskId=ud69319ac-abb6-40a4-903b-bd2b7e8b87c&width=660)
> 1. **从平均时间而言**：快速排序最佳。但在最坏情况下时间性能不如堆排序和归并排序。 
> 1. ​**从算法简单性看**：由于直接选择排序、直接插入排序和冒泡排序的算法比较简单，将其认为是简单算法。对于Shell排序、堆排序、快速排序和归并排序算法，其算法比较复杂，认为是复杂排序。 
> 1. ​**从稳定性看**：直接插入排序、冒泡排序和归并排序时稳定的；而直接选择排序、快速排序、 Shell排序和堆排序是不稳定排序。
> 1. **从待排序的记录数n的大小看**，n较小时，宜采用简单排序；而n较大时宜采用改进排序。

# @排序算法的选择 
> 1. 若n较小(如n≤50)，可采用**直接插入**或**直接选择排序**。当记录规模较小时，直接插入排序较好；否则因为直接选择移动的记录数少于直接插入，应选直接选择排序为宜。 
> 1. 若文件初始状态基本有序(指正序)，则应选用**直接插入**、**冒泡**或随机的**快速排序**为宜； 
> 1. 若n较大，则应采用时间复杂度为O(nlgn)的排序方法：**快速排序**、**堆排序**或**归并排序**。

