除了 if 语句外，还有一种条件判断，是根据某个表达式的结果，分别去执行不同的分支。

例如，在游戏中，让用户选择选项：

1. 单人模式
2. 多人模式
3. 退出游戏

## switch-case

`switch` 语句根据 `switch(表达式)` 计算的结果，跳转到匹配的 `case` 结果，然后继续执行后续语句，直到遇到 `break` 结束执行。

```java
  switch(表达式){
    case 常量1:
      语句1;
      // break;
    case 常量2:
      语句2;
      // break; 
    ... ...
    case 常量N:
      语句N;
      // break;
    default:
      语句;
      // break;
  }
```

![image.png](https://cdn.gxmnzl.xyz/img/SE0224.png)


我们看一个例子：

```java
public class Main {
    public static void main(String[] args) {
        int option = 1;
        switch (option) {
        case 1:
            System.out.println("Selected 1");
            break;
        case 2:
            System.out.println("Selected 2");
            break;
        case 3:
            System.out.println("Selected 3");
            break;
        }
    }
}
```

修改 `option` 的值分别为 1、2、3 ，观察执行结果。

如果 `option` 的值没有匹配到任何 `case` ，例如 `option = 99` ，那么， `switch` 语句不会执行任何语句。这时，可以给 `switch` 语句加一个 `default` ，当没有匹配到任何 `case` 时，执行 `default` ：


```java
public class Main {
    public static void main(String[] args) {
        int option = 99;
        switch (option) {
        case 1:
            System.out.println("Selected 1");
            break;
        case 2:
            System.out.println("Selected 2");
            break;
        case 3:
            System.out.println("Selected 3");
            break;
        default:
            System.out.println("Not selected");
            break;
        }
    }
}
```

如果把 `switch` 语句翻译成 `if` 语句，那么上述的代码相当于：


```java
    if (option == 1) {
        System.out.println("Selected 1");
    } else if (option == 2) {
        System.out.println("Selected 2");
    } else if (option == 3) {
        System.out.println("Selected 3");
    } else {
        System.out.println("Not selected");
    }
```

对于多个 `==` 判断的情况，使用 `switch` 结构更加清晰。

同时注意，上述“翻译”只有在 `switch` 语句中对每个 `case` 正确编写了 `break` 语句才能对应得上。

使用 `switch` 时，注意 `case` 语句并没有花括号 `{}` ，而且， `case` 语句具有“**穿透性**”，漏写 `break` 将导致意想不到的结果：

```java
public class Main {
    public static void main(String[] args) {
        int option = 2;
        switch (option) {
        case 1:
            System.out.println("Selected 1");
        case 2:
            System.out.println("Selected 2");
        case 3:
            System.out.println("Selected 3");
        default:
            System.out.println("Not selected");
        }
    }
}
```

当 `option = 2` 时，将依次输出 `"Selected 2"` 、 `"Selected 3"` 、 `"Not selected"` ，原因是从匹配到 `case 2` 开始，后续语句将全部执行，直到遇到 `break` 语句。因此，任何时候都不要忘记写 `break` 。

如果有几个 `case` 语句执行的是同一组语句块，可以这么写：

```java
public class Main {
    public static void main(String[] args) {
        int option = 2;
        switch (option) {
        case 1:
            System.out.println("Selected 1");
            break;
        case 2:
        case 3:
            System.out.println("Selected 2, 3");
            break;
        default:
            System.out.println("Not selected");
            break;
        }
    }
}
```

使用 `switch` 语句时，只要保证有 `break` ， `case` 的顺序不影响程序逻辑：


```java
    switch (option) {
    case 3:
        ...
        break;
    case 2:
        ...
        break;
    case 1:
        ...
        break;
    }
```

但是仍然建议按照自然顺序排列，便于阅读。

`switch` 语句还可以匹配字符串。字符串匹配时，是比较“内容相等”。例如：


```java
public class Main {
    public static void main(String[] args) {
        String fruit = "apple";
        switch (fruit) {
        case "apple":
            System.out.println("Selected apple");
            break;
        case "pear":
            System.out.println("Selected pear");
            break;
        case "mango":
            System.out.println("Selected mango");
            break;
        default:
            System.out.println("No fruit selected");
            break;
        }
    }
}
```

`switch` 语句还可以使用枚举类型，枚举类型我们在后面学习。

## 编译检查

使用 IDE 时，可以自动检查是否漏写了 `break` 语句和 `default` 语句，方法是打开 IDE 的编译检查。

在Eclipse中，选择 `Preferences - Java - Compiler - Errors/Warnings - Potential programming problems` ，将以下检查标记为 Warning：

- 'switch' is missing 'default' case
- 'switch' case fall-through

在 Idea 中，选择 `Preferences - Editor - Inspections - Java - Control flow issues` ，将以下检查标记为 Warning：

- Fallthrough in 'switch' statement
- 'switch' statement without 'default' branch

当 switch 语句存在问题时，即可在 IDE 中获得警告提示。

> [!WARNING]
> **不要忘记 break！**  
> **不要忘记 default！**


## switch 表达式

使用 `switch` 时，如果遗漏了 `break` ，就会造成严重的逻辑错误，而且不易在源代码中发现错误。从 Java 12 开始， `switch` 语句升级为更简洁的表达式语法，使用类似模式匹配（ Pattern Matching ）的方法，保证只有一种路径会被执行，并且不需要 `break` 语句：


```java
public class Main {
    public static void main(String[] args) {
        String fruit = "apple";
        switch (fruit) {
        case "apple" -> System.out.println("Selected apple");
        case "pear" -> System.out.println("Selected pear");
        case "mango" -> {
            System.out.println("Selected mango");
            System.out.println("Good choice!");
        }
        default -> System.out.println("No fruit selected");
        }
    }
}
```

注意新语法使用 `->` ，如果有多条语句，需要用 `{}` 括起来。不要写 `break` 语句，因为新语法只会执行匹配的语句，没有穿透效应。

很多时候，我们还可能用 `switch` 语句给某个变量赋值。例如：

```java
    int opt;
    switch (fruit) {
    case "apple":
        opt = 1;
        break;
    case "pear":
    case "mango":
        opt = 2;
        break;
    default:
        opt = 0;
        break;
    }
```

使用新的 `switch` 语法，不但不需要 `break` ，还可以直接返回值。把上面的代码改写如下：

```java
public class Main {
    public static void main(String[] args) {
        String fruit = "apple";
        int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> 0;
        }; // 注意赋值语句要以;结束
        System.out.println("opt = " + opt);
    }
}
```

这样可以获得更简洁的代码。


## yield

大多数时候，在 `switch` 表达式内部，我们会返回简单的值。

但是，如果需要复杂的语句，我们也可以写很多语句，放到 `{...}` 里，然后，用 `yield` 返回一个值作为 `switch` 语句的返回值：


```java
public class Main {
    public static void main(String[] args) {
        String fruit = "orange";
        int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> {
                int code = fruit.hashCode();
                yield code; // switch语句返回值
            }
        };
        System.out.println("opt = " + opt);
    }
}
```

## 练习

使用 `switch` 实现一个简单的石头、剪子、布游戏。

```java
import java.util.Scanner;

public class MoraTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please choice:");
        System.out.println(" 1: Rock");
        System.out.println(" 2: Scissors");
        System.out.println(" 3: Paper");

        // 用户输入:
        int choice = scan.nextInt();

        // 计算机随机数 1, 2, 3:
        int random = 1 + (int) (Math.random() * 3);
        System.out.println("Bot:" + random);

        switch (choice) {
            // TODO:
            case 1 :
                System.out.println(random == 1 ? "draw" : (random == 2 ? "win" : "lose"));
                break;
            case 2 :
                System.out.println(random == 2 ? "draw" : (random == 3 ? "win" : "lose"));
                break;
            case 3 :
                System.out.println(random == 3 ? "draw" : (random == 1 ? "win" : "lose"));
                break;
            default:
                System.out.println("Please input correct option!");
                break;
        }
    }
}
```


## 小结：

1. 根据 `switch` 表达式中的值，依次匹配各个 `case` 中的常量。  
   一旦匹配成功，则进入相应 `case` 结构中，调用其执行语句。  
   当调用完执行语句以后，则仍然继续向下执行其他 `case` 结构中的执行语句，  
   直到遇到 `break` 关键字或此 `switch-case` 结构末尾结束为止。  
2.  `break` ，可以使用在 `switch-case` 结构中，表示一旦执行到此关键字，就跳出 `switch-case` 结构。
3.  `switch` 结构中的表达式只能是如下的 6 种数据类型之一：*byte*、*short*、*char*、*int*、*枚举类型* (JDK5.0)、*String* (JDK7.0)。
4.  `case` 之后只能声明常量，不能声明范围。
5.  `break` 关键字是可选的。
6.  `default` ：相当于 `if-else` 结构中的 `else` 。 `default` 结构是可选的。

> [!TIP]
> - 如果 `switch-case` 结构中的多个 `case` 的执行语句相同，则可以考虑进行合并。
> - `break` 在 `switch-case` 中是可选的


?> 从 Java 14 开始， `switch` 语句正式升级为表达式，不再需要 `break` ，并且允许使用 `yield` 返回值。
