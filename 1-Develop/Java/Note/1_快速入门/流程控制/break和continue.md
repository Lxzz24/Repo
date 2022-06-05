无论是 `while` 循环还是 `for` 循环，有两个特别的语句可以使用，就是 `break` 语句和 `continue` 语句。

## break

在循环过程中，可以使用 `break` 语句 ***跳出当前循环*** 。我们来看一个例子：

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; ; i++) {
            sum = sum + i;
            if (i == 100) {
                break;
            }
        }
        System.out.println(sum);
    }
}
```

使用 `for` 循环计算从 1 到 100 时，我们并没有在 `for()` 中设置循环退出的检测条件。但是，在循环内部，我们用 `if` 判断，如果 `i==100` ，就通过 `break` 退出循环。

因此， `break` 语句通常都是配合 `if` 语句使用。要特别注意， ***`break` 语句总是跳出自己所在的那一层循环*** 。例如：

```java
public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println("i = " + i);
            for (int j=1; j<=10; j++) {
                System.out.println("j = " + j);
                if (j >= i) {
                    break;
                }
            }
            // break跳到这里
            System.out.println("breaked");
        }
    }
}
```

上面的代码是两个 `for` 循环嵌套。因为 `break` 语句位于内层的 `for` 循环，因此，它会跳出内层 `for` 循环，但不会跳出外层 `for` 循环。

## continue

`break` 会跳出当前循环，也就是整个循环都不会执行了。而 `continue` 则是提前结束本次循环，直接继续执行下次循环。我们看一个例子：

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=10; i++) {
            System.out.println("begin i = " + i);
            if (i % 2 == 0) {
                continue; // continue语句会结束本次循环
            }
            sum = sum + i;
            System.out.println("end i = " + i);
        }
        System.out.println(sum); // 25
    }
}
```

注意观察 `continue` 语句的效果。当 `i` 为奇数时，完整地执行了整个循环，因此，会打印 `begin i=1` 和 `end i=1` 。在 `i` 为偶数时， `continue` 语句会提前结束本次循环，因此，会打印 `begin i=2` 但不会打印 `end i = 2` 。

在多层嵌套的循环中， `continue` 语句同样是结束本次自己所在的循环。

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
> - `return`：并非专门用于结束循环的，它的功能是结束一个方法。  
> 当一个方法执行到一个 `return` 语句时，这个方法将被结束。
> - 与 `break` 和 `continue` 不同的是， `return` **直接结束整个方法**，不管这个 `return` 处于多少层循环之内


## 小结

- `break` 语句可以跳出当前循环；
- `break` 语句通常配合 `if` ，在满足条件时提前结束整个循环；
- `break` 语句总是跳出最近的一层循环；
- `continue` 语句可以提前结束本次循环；
- `continue` 语句通常配合 `if` ，在满足条件时提前结束本次循环。

