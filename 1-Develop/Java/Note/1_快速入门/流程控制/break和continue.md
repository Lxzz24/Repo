## break 和 continue 关键字的使用

<table style="text-align:center">
    <tr>
        <th>关键字</th> 
        <th>使用范围</th> 
        <th>循环中使用的作用(不同点)</th> 
        <th>相同点</th> 
    </tr>
    <tr>
        <th rowspan="2">break</th>    
        <td>switch-case</td>
        <td rowspan="2">结束当前循环</td>  
        <td rowspan="3">关键字后面不能声明执行语句</td>      
    </tr>
    <tr>
        <td>循环结构中</td> 
    </tr>
    <tr>
        <th>continue</th>    
        <td >循环结构中</td> 
        <td>结束当次循环</td>  
    </tr>
</table>


可以通过标签指明要跳过的是哪一层循环

> [!NOTE]
> - return：并非专门用于结束循环的，它的功能是结束一个方法。  
> 当一个方法执行到一个 return 语句时，这个方法将被结束。
> - 与 break 和 continue 不同的是，return **直接结束整个方法**，不管这个 return 处于多少层循环之内
