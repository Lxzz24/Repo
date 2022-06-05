?> 循环语句就是让计算机根据条件做循环计算，在条件满足时继续循环，条件不满足时退出循环。

例如，计算从 1 到 100 的和：

$1 + 2 + 3 + 4 + … + 100 = ?$

除了用数列公式外，完全可以让计算机做 100 次循环累加。因为计算机的特点是计算速度非常快，我们让计算机循环一亿次也用不到 1 秒，所以很多计算的任务，人去算是算不了的，但是计算机算，使用循环这种简单粗暴的方法就可以快速得到结果。

## while 循环

​![image.png](https://cdn.gxmnzl.xyz/img/SE0225.png)

我们先看 Java 提供的 while 条件循环。它的 ***基本用法*** 是：

```java
    while (条件表达式) {
        循环语句
    }
    // 继续执行后续代码
```

`while` 循环在每次循环开始前，首先判断条件是否成立。如果计算结果为 `true` ，就把循环体内的语句执行一遍，如果计算结果为 `false` ，那就直接跳到 `while` 循环的末尾，继续往下执行。

我们用 `while` 循环来累加 1 到 100 ，可以这么写：

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0; // 累加的和，初始化为0
        int n = 1;
        while (n <= 100) { // 循环条件是n <= 100
            sum = sum + n; // 把n累加到sum中
            n ++; // n自身加1
        }
        System.out.println(sum); // 5050
    }
}
```

注意到 `while` 循环是先判断循环条件，再循环，因此，有可能一次循环都不做。

对于循环条件判断，以及自增变量的处理，要特别注意边界条件。思考一下下面的代码为何没有获得正确结果：

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        while (n <= 100) {
            n ++; 
            sum = sum + n; 
        }
        System.out.println(sum);
    }
}
```

如果循环条件永远满足，那这个循环就变成了死循环。死循环将导致 100% 的 CPU 占用，用户会感觉电脑运行缓慢，所以 ***要避免编写死循环代码*** 。

如果循环条件的逻辑写得有问题，也会造成意料之外的结果：

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        while (n > 0) {
            sum = sum + n;
            n ++;
        }
        System.out.println(n); // -2147483648
        System.out.println(sum);
    }
}
```

表面上看，上面的 while 循环是一个死循环，但是，Java 的 `int` 类型有最大值，达到最大值后，再加 1 会变成负数，结果，意外退出了 `while` 循环。

## 练习

使用 while 计算从 m 到 n 的和：

```java
import java.util.Scanner;

public class SumMNTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Start: ");
        int m = scan.nextInt();

        System.out.print("End: ");
        int n = scan.nextInt();

        // 使用while计算M+...+N:
        int sum = 0;
        while (m <= n) {
            sum += m;
            m ++;
        }
        System.out.printf("Sum: %d", sum);
    }
}
```


## 小结

- while 循环先判断循环条件是否满足，再执行循环语句；
- while 循环可能一次都不执行；
- 编写循环时要注意循环条件，并避免死循环。
