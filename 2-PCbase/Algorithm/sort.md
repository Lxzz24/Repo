#
# 1 （简单）选择排序

![(简单)选择排序.gif](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Sort/Sort1.gif "-gifcontrol-mode=click;")

# 2 （直接）插入排序

![(直接)插入排序.gif](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Sort/Sort2.gif "-gifcontrol-mode=click;")

# 3 堆排序

![堆排序.gif](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Sort/Sort3.gif "-gifcontrol-mode=click;")

# 4 归并排序

![归并排序.gif](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Sort/Sort4.gif "-gifcontrol-mode=click;")

# 5 基数排序

![基数排序.gif](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Sort/Sort5.gif "-gifcontrol-mode=click;")

# 6 计数排序

![计数排序.gif](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Sort/Sort6.gif "-gifcontrol-mode=click;")

# 7 快速排序

![快速排序.gif](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Sort/Sort7.gif "-gifcontrol-mode=click;")

## 介绍 

- 快速排序通常明显比同为 O<sub>(nlogn)</sub> 的其他算法更快，因此常被采用，而且快排采用了分治法的思想，
所以在很多笔试面试中能经常看到快排的影子。可见掌握快排的重要性。 
- 快速排序（Quick Sort）由图灵奖获得者 Tony Hoare 发明，被列为20世纪十大算法之一，
是迄今为止所有内排序算法中速度最快的一种。
- 冒泡排序的升级版，交换排序的一种。快速排序的时间复杂度为 O<sub>(nlog(n))</sub>。

## 排序思想
1. 从数列中挑出一个元素，称为"基准"(pivot)。
2. 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面(相同的数可以到任一边)。在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区(partition)操作。 
3. 递归地(recursive)把小于基准值元素的子数列和大于基准值元素的子数列排序。
4. 递归的最底部情形，是数列的大小是零或一，也就是永远都已经被排序好了。虽然一直递归下去，但是这个算法总会结束，因为在每次的迭代(iteration)中，它至少会把一个元素摆到它最后的位置去。

# 8 冒泡排序

![冒泡排序.gif](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Sort/Sort8.gif "-gifcontrol-mode=click;")

## 介绍
冒泡排序的原理非常简单，它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。 

## 排序思想
1. 比较相邻的元素。如果第一个比第二个大（升序），就交换他们两个。 
2. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。 
3. 针对所有的元素重复以上的步骤，除了最后一个。 
4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较为止。

# 9 桶排序

![桶排序.png](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Sort/Sort9.png)

# 10 希尔排序

![希尔排序.gif](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Sort/Sort10.gif "-gifcontrol-mode=click;")

# @各种内部排序方法性能比较

![image.png](https://cdn.jsdelivr.net/gh/Lxzz24/Repo/images/Sort/Sort11.png)

1. **从平均时间而言**：快速排序最佳。但在最坏情况下时间性能不如堆排序和归并排序。 
2. ​**从算法简单性看**：由于直接选择排序、直接插入排序和冒泡排序的算法比较简单，将其认为是简单算法。对于Shell排序、堆排序、快速排序和归并排序算法，其算法比较复杂，认为是复杂排序。 
3. ​**从稳定性看**：直接插入排序、冒泡排序和归并排序时稳定的；而直接选择排序、快速排序、 Shell排序和堆排序是不稳定排序。
4. **从待排序的记录数n的大小看**，n较小时，宜采用简单排序；而n较大时宜采用改进排序。

# @排序算法的选择 
1. 若 n 较小(如 n≤50 )，可采用**直接插入**或**直接选择排序**。当记录规模较小时，直接插入排序较好；否则因为直接选择移动的记录数少于直接插入，应选直接选择排序为宜。 
2. 若文件初始状态基本有序(指正序)，则应选用**直接插入**、**冒泡**或随机的**快速排序**为宜； 
3. 若 n 较大，则应采用时间复杂度为 O<sub>(nlgn)</sub> 的排序方法：**快速排序**、**堆排序**或**归并排序**。