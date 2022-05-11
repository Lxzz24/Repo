# 
# **速查**

## 空白

1. 多个连续的空白字符等同为一个空白字符
2. 每行开始的空白字符将被忽略
3. 使用空行来结束段落，两行文本中的空行标志上一段落的结束和新段落的开始

## 空格

使用 `\quad` 和 `\qquad` 来表示空格

## 特殊字符

前面需要添加 \ 来表示特殊字符:  
`$` `%` `&` `_` `{` `}` `#` `^` `~` 

语法对应
`\$` `\%` `\&` `\_` `\{` `\}` `\#`   
`\~{}`  `\^{}`(测试有问题)

## 指数上下标

- 指数可以用 `x^a` 或者 `x^{a}` 格式来表示, x 代表底数，a 是指数 

$$x^{a}$$

- 下标可以用 `x_{a}` 格式来表示, x 代表底数, a 代表下指数

$$x_{a}$$

## 下标

a1 (a 的下标标为 1)   表达式：`a_{1}`

$$a_{1}$$

## 指数(上标)

x2 (x 的指数为 2)   表达式：`x^2`

$$x^2$$

## 上下标

b3ij (b 的上标为 3 下标为 ij)  表达式：`b^{3}_{ij}`

$$b^{3}_{ij}$$

## 多次上标

ex2 (e 的上标为 x 的平方)  表达式：`{e^x}^2`

$${e^x}^2$$

## 平方根

平方根命令为：`\sqrt`，n 次方根相应地为: `\sqrt[n]`

- x 开根号  表达式：`\sqrt{x}` 
$$\sqrt{x}$$

- x 开三次方根  表达式：`\sqrt[3]{x}` 
$$\sqrt[3]{x}$$

- 对 x 平方 + 根号 y 再开平方：表达式 `\sqrt{x^{2} + \sqrt{y}}`
$$\sqrt{x^{2} + \sqrt{y}}$$

## 分数

分数使用 `\frac{a}{b}` 排版, a 是分子, b 是分母  
例子如下：
- `\frac{x^2}{k+1}`  
$$\frac{x^2}{k+1}$$
- `x^{\frac{2}{k+1}}`
$$x^{\frac{2}{k+1}}$$
- `x^{1/2}`
$$x^{1/2}$$


## 向量

向量由 `\vec` 得到。以下两个命令定义从 A 到 B 的向量:

- `\overrightarrow` 
$$\overrightarrow{AB}$$
- `\overleftarrow` 
$$\overleftarrow{AB}$$

## 求和运算符

求和运算符由 `\sum` 生成

- `\sum_{i=1}^{n}`
$$\sum_{i=1}^{n}$$

## 数学运算符

大于：`>`    小于：`<`    小于等于：`\le`    大于等于：`\ge`    不等于：`\ne`    
双波浪线：`\approx`    单波浪线：`\sim`    子集：`\subseteq`    
属于：`\in`    不属于：`\notin`    
乘号：`\times`    除号：`\div`    加减号：`\pm`    
右双箭头：`\Rightarrow`    右单箭头：`\rightarrow`     
无穷大：`\infty`     角度斜度：`\angle`    

## 常用小写希腊字母

`\alpha` `\beta` `\gamma` `\sigma` `\omega` `\delta` `\pi` `\rho` `\epsilon` 
`\eta` `\lambda` `\mu` `\xi` `\tau` `\kappa` `\zeta` `\phi` `\chi`

$$\alpha\quad\beta\quad\gamma\quad\sigma\quad\omega\quad\delta\quad\pi\quad\rho\quad\epsilon$$ 
$$\eta\quad\lambda\quad\mu\quad\xi\quad\tau\quad\kappa\quad\zeta\quad\phi\quad\chi$$

##  小括号

空格式：`\left (  \right )`
$$\left (  \right )$$

有数据的括号格式：`\left ( 123,45 \right )`
$$\left ( 123,45 \right )$$

##  中括号

空格式：`\left [  \right ]`
$$\left [  \right ]$$

有数据的括号格式：`\left [ 3,5,9 \right ]`
$$\left [ 3,5,9 \right ]$$

##  尖括号

空数据格式：`\left \langle  \right \rangle`
$$\left \langle  \right \rangle$$

有数据格式：`\left \langle 3,4 \right \rangle`
$$\left \langle 3,4 \right \rangle$$

##  水平线

使用 `\overline` 和 `\underline` 在表达式的上、下方画出水平线  

`\overline{lindexi.oschina.io}+\underline{lindexi.github.io}`

$$\overline{lindexi.oschina.io}+\underline{lindexi.github.io}$$

##  上大括号

使用 `\overbrace` 和 `\underbrace` 可以在表达式上方、下方添加花括号

`\overbrace{blog.csdn.net/lindexi_gd}^{lindexi} + \underbrace{lindexi.github.io}_{doubi}`

$$\overbrace{blog.csdn.net/lindexi_gd}^{lindexi} + \underbrace{lindexi.github.io}_{doubi}$$

##  三角函数

- `\sin\theta` 
$$\sin\theta$$

- `\cos\theta` 
$$\cos\theta$$

- `\tan\theta` 
$$\tan\theta$$

- `\cot\theta`
$$\cot\theta$$





# **其他**
$$
\left[
\begin{matrix}
 1      & 2      & \cdots & 4      \\
 7      & 6      & \cdots & 5      \\
 \vdots & \vdots & \ddots & \vdots \\
 8      & 9      & \cdots & 0      \\
\end{matrix}
\right]
$$


## "em" in LaTeX

`*...*` in LaTeX code should not be italic:

$$
*f(x)* = 5
\tag{1}
$$

`_..._` in LaTeX code should not be italic:

$$
_f(x)_ = 5
\tag{2}
$$

Another example form [docsify#646](https://github.com/docsifyjs/docsify/issues/646):

$\{x_n\}$，$\lim\limits_{n \rightarrow \infty} x_n = a$

## "strong" in LaTeX

`**...**` in LaTeX code should not be bold:

$$
E = **mc^2**
\tag{3}
$$

`__...__` in LaTeX code should not be bold:
$$
E = __mc^2__
\tag{4}
$$

## `\\` support

$$
a = b \\
c = d
$$

So this: $
\def\arraystretch{1.5}
   \begin{array}{c:c:c}
   a & b & c \\ \hline
   d & e & f \\
   \hdashline
   g & h & i
\end{array}
$

## HTML

This URL: 

$
\href{https://katex.org/}{\KaTeX}
$

## Table

| |
|:-------------------------------------------------------|
|$\displaystyle\sum_{i=1}^n$ `\displaystyle\sum_{i=1}^n`
|$\textstyle\sum_{i=1}^n$ `\textstyle\sum_{i=1}^n`
|$\scriptstyle x$ `\scriptstyle x` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(The size of a first sub/superscript)
|$\scriptscriptstyle x$ `\scriptscriptstyle x` (The size of subsequent sub/superscripts)
|$\lim\limits_x$ `\lim\limits_x`
|$\lim\nolimits_x$ `\lim\nolimits_x`
|$\verb!x^2!$ `\verb!x^2!`

## Comments and begin with KaTeX

<!--
bla
bla
bla
-->

$$
a = b
$$

## Special cases

The second argument of `\raisebox` can contain math if it is nested within `$…$` delimiters, as in `\raisebox{0.25em}{$\frac a b$}`

$\left(\LARGE{AB}\right)$ `\left(\LARGE{AB}\right)`

$`$ <code>`</code>

||||
|-|-|-|
|\\_|$\_$||
|\\\`|$\text{\`{a}}$|<code>\text{\\'{a}}</code>|