## do-while 循环

在 Java 中， `while` 循环是先判断循环条件，再执行循环。而另一种 `do while` 循环则是 ***先执行循环*** ，再判断条件，条件满足时继续循环，条件不满足时退出。它的用法是：

```java
    do {
        执行循环语句
    } while (条件表达式);
```

可见， ***do while 循环会至少循环一次*** 。

我们把对 1 到 100 的求和用 `do while` 循环改写一下：

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        do {
            sum = sum + n;
            n ++;
        } while (n <= 100);
        System.out.println(sum);
    }
}
```

使用 `do while` 循环时，同样要注意循环条件的判断。

## 练习

使用 `do while` 循环计算从 m 到 n 的和。

```java
import java.util.Scanner;

public class SumMNTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Start: ");
        int m = scan.nextInt();

        System.out.print("End: ");
        int n = scan.nextInt();

        int sum = 0;
        // 使用do while计算M+...+N:
        do {
            sum += m;
            m ++;
        }while(m <= n);

        System.out.printf("Sum: %d", sum);
    }
}
```

## 小结

- `do while` 循环先执行循环，再判断条件；
- `do while` 循环会至少执行一次。
