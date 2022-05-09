# CSS



# 简介

- CSS 指层叠样式表 (Cascading Style Sheets)
- 样式定义如何显示 HTML 元素
- 样式通常存储在样式表中
- 把样式添加到 HTML 4.0 中，是为了解决内容与表现分离的问题
- 外部样式表可以极大提高工作效率
- 外部样式表通常存储在 CSS 文件中
- 多个样式定义可层叠为一个

![1](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/CSS1.png)

## 实例

```css
/*这是个注释*/
p
{
  text-align:center;
  /*这是另一个注释*/
  color:black;
  font-family:arial;
}
```

# Id 和 Class

## id 选择器

id 选择器可以为标有特定 id 的 HTML 元素指定特定的样式。
HTML 元素以 id 属性来设置 id 选择器, CSS 中 id 选择器以 "#" 来定义。

### id="para1":

```css
#para1
{
    text-align:center;
    color:red;
}
```

> [!tip]
> ID属性不要以数字开头，数字开头的ID在 Mozilla/Firefox 浏览器中不起作用。


## class 选择器

```css
/*所有拥有 center 类的 HTML 元素均为居中*/
.center {text-align:center;}

/*所有的 p 元素使用 class="center" 让该元素的文本居中:*/
p.center {text-align:center;}
```

> [!WARNING]
> 类名的第一个字符不能使用数字！它无法在 Mozilla 或 Firefox 中起作用。

# CSS创建

- 外部样式表(External style sheet)
- 内部样式表(Internal style sheet)
- 内联样式(Inline style)


> [!WARNING]
> 💡不要在属性值与单位之间留有空格（如："margin-left: 20 px" ），正确的写法是 "margin-left: 20px" 。


## 多重样式优先级

$（内联样式）Inline style > （内部样式）Internal style sheet >（外部样式）External style sheet > 浏览器默认样式$

```html
<!DOCTYPE html>
<html>
  <head>
    <!-- 外部样式 style.css -->
    <link rel="stylesheet" type="text/css" href="style.css"/>
    <!-- 设置：h3{color:blue;} -->
    <style type="text/css">
      /* 内部样式 */
      h3{color:green;}
    </style>
  </head>
  <body>
    <h3>测试！</h3>
  </body>
</html>
```


> [!ATTENTION]
> 如果外部样式放在内部样式的后面，则外部样式将覆盖内部样式。

## 选择器优先级规则

$内联样式 > id 选择器 > 类选择器 = 伪类选择器 = 属性选择器 > 标签选择器 = 伪元素选择器$

### HTML

```html
<div class="content-class" id="content-id"></div>
```

### CSS

```css
#content-id {
    color: red;
}
.content-class {
    color: blue;
}
div {
    color: grey;
}
```

> [!ATTENTION]
> div 最终的颜色显示为红色。


# CSS背景

## 背景颜色

- `background-color`


## 背景图像

- `background-image`


```css
body {background-image:url('paper.gif');}
```


### 水平或垂直平铺

- `background-repeat`


```css
body
{
  background-image:url('gradient2.png');
  background-repeat:repeat-x;/*图像只在水平方向平铺*/
}
```
### 设置定位与不平铺

- `background-position` 改变图像在背景中的位置


```css
body
{
  background-image:url('img_tree.png');
  background-repeat:no-repeat;/*不让图像平铺*/
  background-position:right top;
}
```

- `background-attachment` 背景图像是否固定或者随着页面的其余部分滚动。 


### 简写属性

```css
body {background:#ffffff url('img_tree.png') no-repeat right top;}
```

属性值的顺序为：

1. `background-color`
2. `background-image`
3. `background-repeat`
4. `background-attachment`
5. `background-position`


# CSS文本

| **属性** | **描述** |
| --- | --- |
| [color](https://www.runoob.com/cssref/pr-text-color.html) | 设置文本颜色 |
| [direction](https://www.runoob.com/cssref/pr-text-direction.html) | 设置文本方向。 |
| [letter-spacing](https://www.runoob.com/cssref/pr-text-letter-spacing.html) | 设置字符间距 |
| [line-height](https://www.runoob.com/cssref/pr-dim-line-height.html) | 设置行高 |
| [text-align](https://www.runoob.com/cssref/pr-text-text-align.html) | 对齐元素中的文本 |
| [text-decoration](https://www.runoob.com/cssref/pr-text-text-decoration.html) | 向文本添加修饰 |
| [text-indent](https://www.runoob.com/cssref/pr-text-text-indent.html) | 缩进元素中文本的首行 |
| [text-shadow](https://www.runoob.com/cssref/css3-pr-text-shadow.html) | 设置文本阴影 |
| [text-transform](https://www.runoob.com/cssref/pr-text-text-transform.html) | 控制元素中的字母 |
| [unicode-bidi](https://www.runoob.com/cssref/pr-text-unicode-bidi.html) | 设置或返回文本是否被重写  |
| [vertical-align](https://www.runoob.com/cssref/pr-pos-vertical-align.html) | 设置元素的垂直对齐 |
| [white-space](https://www.runoob.com/cssref/pr-text-white-space.html) | 设置元素中空白的处理方式 |
| [word-spacing](https://www.runoob.com/cssref/pr-text-word-spacing.html) | 设置字间距 |

## 颜色
```css
body {color:red;}
h1 {color:#00ff00;}
h2 {color:rgb(255,0,0);}
```
> [!tip]
> 对于W3C标准的CSS：如果你定义了颜色属性，你还必须定义背景色属性。
:::
## 对齐方式
```css
h1 {text-align:center;}
p.date {text-align:right;}
p.main {text-align:justify;}/*每一行被展开为宽度相等，左，右外边距是对齐*/
```
## 文本修饰
```css
/*从设计的角度看 text-decoration属性主要是用来删除链接的下划线：*/
a {text-decoration:none;}

h1 {text-decoration:overline;}
h2 {text-decoration:line-through;}
h3 {text-decoration:underline;}
```
## 文本转换
文本转换属性是用来指定在一个文本中的大写和小写字母。
可用于所有字句变成大写或小写字母，或每个单词的首字母大写。
```css
p.uppercase {text-transform:uppercase;}
p.lowercase {text-transform:lowercase;}
p.capitalize {text-transform:capitalize;}
```
## 文本缩进
文本缩进属性是用来指定文本的第一行的缩进。
```css
p {text-indent:50px;}
```
# CSS字体
## 字体系列
font-family 属性设置文本的字体系列。
font-family 属性应该设置几个字体名称作为一种"后备"机制，如果浏览器不支持第一种字体，他将尝试下一种字体。
> 注意: 如果字体系列的名称超过一个字，它必须用引号，如Font Family："宋体"。

多个字体系列是用一个逗号分隔指明：
```css
p{font-family:"Times New Roman", Times, serif;}
```
## 字体样式
主要是用于指定斜体文字的字体样式属性。
这个属性有三个值：

- 正常 - 正常显示文本
- 斜体 - 以斜体字显示的文字
- 倾斜的文字 - 文字向一边倾斜（和斜体非常类似，但不太支持）
```css
p.normal {font-style:normal;}
p.italic {font-style:italic;}
p.oblique {font-style:oblique;}
```
## 字体大小
font-size 属性设置文本的大小。
能否管理文字的大小，在网页设计中是非常重要的。但是，你不能通过调整字体大小使段落看上去像标题，或者使标题看上去像段落。
请务必使用正确的HTML标签，就<h1> - <h6>表示标题和<p>表示段落：
字体大小的值可以是绝对或相对的大小。
绝对大小：

- 设置一个指定大小的文本
- 不允许用户在所有浏览器中改变文本大小
- 确定了输出的物理尺寸时绝对大小很有用

相对大小：

- 相对于周围的元素来设置大小
- 允许用户在浏览器中改变文字大小

💡 如果你不指定一个字体的大小，默认大小和普通文本段落一样，是16像素（16px=1em）。
```css
h1 {font-size:40px;}
h2 {font-size:30px;}
p {font-size:14px;}
```
### 用em来设置字体大小
1em和当前字体大小相等。在浏览器中默认的文字大小是16px。
因此，1em的默认大小是16px。可以通过下面这个公式将像素转换为em：
$px/16=em$
```css
h1 {font-size:2.5em;} /* 40px/16=2.5em */
h2 {font-size:1.875em;} /* 30px/16=1.875em */
p {font-size:0.875em;} /* 14px/16=0.875em */
```
### 使用百分比和EM组合
```css
body {font-size:100%;}
h1 {font-size:2.5em;}
h2 {font-size:1.875em;}
p {font-size:0.875em;}
```
# CSS链接
## 链接样式

- `a:link` - 正常，未访问过的链接
- `a:visited` - 用户已访问过的链接
- `a:hover` - 当用户鼠标放在链接上时
- `a:active` - 链接被点击的那一刻
```css
a:link {color:#000000;}      /* 未访问链接*/
a:visited {color:#00FF00;}  /* 已访问链接 */
a:hover {color:#FF00FF;}  /* 鼠标移动到链接上 */
a:active {color:#0000FF;}  /* 鼠标点击时 */
```
当设置为若干链路状态的样式，也有一些顺序规则：

- `a:hover` 必须跟在 `a:link` 和 `a:visited`后面
- `a:active `必须跟在 `a:hover`后面
## 常见的链接样式
### 文本修饰
`text-decoration` 属性主要用于删除链接中的下划线：
```css
a:link {text-decoration:none;}
a:visited {text-decoration:none;}
a:hover {text-decoration:underline;}
a:active {text-decoration:underline;}
```
### 背景颜色
背景颜色属性指定链接背景色：
```css
a:link {background-color:#B2FF99;}
a:visited {background-color:#FFFF85;}
a:hover {background-color:#FF704D;}
a:active {background-color:#FF704D;}
```
# CSS列表

- 设置不同的列表项标记为有序列表
- 设置不同的列表项标记为无序列表
- 设置列表项标记为图像
## 不同的列表项标记
```css
ul.a {list-style-type: circle;}
ul.b {list-style-type: square;}
 
ol.c {list-style-type: upper-roman;}
ol.d {list-style-type: lower-alpha;}
```
## 作为列表项标记的图像
```css
ul
{
    list-style-image: url('sqpurple.gif');
}
```
## 简写属性
在单个属性中可以指定所有的列表属性。
```css
ul
{
    list-style: square url("sqpurple.gif");
}
```
## 移除默认设置
```css
ul {
  list-style-type: none;/*移除小标记*/
  margin: 0;
  padding: 0;/*使用 margin:0 和 padding:0 来移除内边距和外边距*/
}
```
# CSS表格
## 表格边框
```css
table, th, td
{
    border: 1px solid black;
}
```
## 折叠边框
`border-collapse` 属性设置表格的边框是否被折叠成一个单一的边框或隔开：
```css
table
{
    border-collapse:collapse;
}
table,th, td
{
    border: 1px solid black;
}
```
## 表格宽度和高度
`width`和`height`属性定义表格的宽度和高度。
```css
table 
{
    width:100%;
}
th
{
    height:50px;
}
```
## 表格文字对齐
`text-align`属性设置水平对齐方式，向左，右，或中心：
```css
td
{
    text-align:right;
}
```
垂直对齐属性设置垂直对齐，比如顶部，底部或中间：
```css
td
{
    height:50px;
    vertical-align:bottom;
}
```
## 表格填充
如需控制边框和表格内容之间的间距，应使用td和th元素的填充属性：
```css
td
{
    padding:15px;
}
```
## 表格颜色
指定边框的颜色，和th元素的文本和背景颜色：
```css
table, td, th
{
    border:1px solid green;
}
th
{
    background-color:green;
    color:white;
}
```
# CSS盒子模型(Box Model)

![2](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/CSS2.png)

- `Margin`(外边距) - 清除边框外的区域，外边距是透明的。
- `Border`(边框) - 围绕在内边距和内容外的边框。
- `Padding`(内边距) - 清除内容周围的区域，内边距是透明的。
- `Content`(内容) - 盒子的内容，显示文本和图像。
> [!tip]
> *💡**重要: 当您指定一个 CSS 元素的宽度和高度属性时，你只是设置内容区域的宽度和高度。要知道，完整大小的元素，你还必须添加内边距，边框和外边距。
:::
最终元素的总宽度计算公式是这样的：
总元素的宽度=宽度+左填充+右填充+左边框+右边框+左边距+右边距
元素的总高度最终计算公式是这样的：
总元素的高度=高度+顶部填充+底部填充+上边框+下边框+上边距+下边距
# CSS边框
简写：

- `border-width`
- `border-style`(required)
- `border-color`
```css
border:5px solid red;
```
# CSS margin外边距+padding填充

![3](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/CSS3.png)

# CSS分组和嵌套
## 分组选择器
```css
h1 {
    color:green;
}
h2 {
    color:green;
}
p {
    color:green;
}
```
分组后：
```css
h1,h2,p
{
    color:green;
}
```
## 嵌套选择器
它可能适用于选择器内部的选择器的样式。
在下面的例子设置了四个样式：

- `p{ }`: 为所有 p 元素指定一个样式。
- `.marked{ }`: 为所有 class="marked" 的元素指定一个样式。
- `.marked p{ }`: 为所有 class="marked" 元素内的 p 元素指定一个样式。
- `p.marked{ }`: 为所有 class="marked" 的 p 元素指定一个样式。
```css
p
{
    color:blue;
    text-align:center;
}
.marked
{
    background-color:red;
}
.marked p
{
    color:white;
}
p.marked{
    text-decoration:underline;
}
```
# CSS Position(定位)、
position 属性的五个值：

- static
   - HTML 元素的默认值，即没有定位，遵循正常的文档流对象。静态定位的元素不会受到 top, bottom, left, right影响。
- relative
   - 相对定位元素的定位是相对其正常位置。
- fixed
   - 元素的位置相对于浏览器窗口是固定位置。即使窗口是滚动的它也不会移动
- absolute
   - 绝对定位的元素的位置相对于最近的已定位父元素，如果元素没有已定位的父元素，那么它的位置相对于<html>:
- sticky
   - 粘性定位，基于用户的滚动位置来定位，在 `position:relative` 与 `position:fixed` 定位之间切换。
# CSS导航栏
```css
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>菜鸟教程(runoob.com)</title>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    border: 1px solid #e7e7e7;
    background-color: #f3f3f3;
}

li {
    float: left;
}

li a {
    display: block;
    color: #666;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #ddd;
}

li a.active {
    color: white;
    background-color: #4CAF50;
}
</style>
</head>
<body>

<ul>
  <li><a class="active" href="#home">主页</a></li>
  <li><a href="#news">新闻</a></li>
  <li><a href="#contact">联系</a></li>
  <li><a href="#about">关于</a></li>
</ul>

</body>
</html>
```
# CSS 下拉菜单
```css
<!DOCTYPE html>
<html>
<head>
<title>下拉菜单实例|菜鸟教程(runoob.com)</title>
<meta charset="utf-8">
<style>
.dropbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}

.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}

.dropdown:hover .dropbtn {
    background-color: #3e8e41;
}
</style>
</head>
<body>

<h2>下拉菜单</h2>
<p>鼠标移动到按钮上打开下拉菜单。</p>

<div class="dropdown">
  <button class="dropbtn">下拉菜单</button>
  <div class="dropdown-content">
    <a href="http://www.runoob.com">菜鸟教程 1</a>
    <a href="http://www.runoob.com">菜鸟教程 2</a>
    <a href="http://www.runoob.com">菜鸟教程 3</a>
  </div>
</div>

</body>
</html>
```
# CSS 提示框
```css
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>菜鸟教程(runoob.com)</title>
</head>
<style>
.tooltip {
    position: relative;
    display: inline-block;
    border-bottom: 1px dotted black;
}

.tooltip .tooltiptext {
    visibility: hidden;
    width: 120px;
    background-color: black;
    color: #fff;
    text-align: center;
    border-radius: 6px;
    padding: 5px 0;
    position: absolute;
    z-index: 1;
    bottom: 150%;
    left: 50%;
    margin-left: -60px;
}

.tooltip .tooltiptext::after {
    content: "";
    position: absolute;
    top: 100%;
    left: 50%;
    margin-left: -5px;
    border-width: 5px;
    border-style: solid;
    border-color: black transparent transparent transparent;
}

.tooltip:hover .tooltiptext {
    visibility: visible;
}
</style>
<body style="text-align:center;">

<h2>顶部提示框/底部箭头</h2>

<div class="tooltip">鼠标移动到我这
  <span class="tooltiptext">提示文本</span>
</div>

</body>
</html>
```
# CSS图片廊
```css
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"> 
<title>菜鸟教程(runoob.com)</title>  
<style>
div.img {
    margin: 5px;
    border: 1px solid #ccc;
    float: left;
    width: 180px;
}

div.img:hover {
    border: 1px solid #777;
}

div.img img {
    width: 100%;
    height: auto;
}

div.desc {
    padding: 15px;
    text-align: center;
}
</style>
</head>
<body>

<div class="responsive">
  <div class="img">
    <a target="_blank" href="http://static.runoob.com/images/demo/demo1.jpg">
      <img src="http://static.runoob.com/images/demo/demo1.jpg" alt="图片文本描述" width="300" height="200">
    </a>
    <div class="desc">这里添加图片文本描述</div>
  </div>
</div>
 
<div class="responsive">
  <div class="img">
    <a target="_blank" href="http://static.runoob.com/images/demo/demo2.jpg">
      <img src="http://static.runoob.com/images/demo/demo2.jpg" alt="图片文本描述" width="300" height="200">
    </a>
    <div class="desc">这里添加图片文本描述</div>
  </div>
</div>
 
<div class="responsive">
  <div class="img">
    <a target="_blank" href="http://static.runoob.com/images/demo/demo3.jpg">
      <img src="http://static.runoob.com/images/demo/demo3.jpg" alt="图片文本描述" width="300" height="200">
    </a>
    <div class="desc">这里添加图片文本描述</div>
  </div>
</div>
 
<div class="responsive">
  <div class="img">
    <a target="_blank" href="http://static.runoob.com/images/demo/demo4.jpg">
      <img src="http://static.runoob.com/images/demo/demo4.jpg" alt="图片文本描述" width="300" height="200">
    </a>
    <div class="desc">这里添加图片文本描述</div>
  </div>
</div>

</body>
</html>
```
# CSS 图像拼合
创建一个导航列表
```css
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"> 
<title>菜鸟教程(runoob.com)</title>  
<style>
#navlist{position:relative;}
#navlist li{margin:0;padding:0;list-style:none;position:absolute;top:0;}
#navlist li, #navlist a{height:44px;display:block;}

#home{left:0px;width:46px;}
#home{background:url('img_navsprites_hover.gif') 0 0;}
#home a:hover{background: url('img_navsprites_hover.gif') 0 -45px;}

#prev{left:63px;width:43px;}
#prev{background:url('img_navsprites_hover.gif') -47px 0;}
#prev a:hover{background: url('img_navsprites_hover.gif') -47px -45px;}

#next{left:129px;width:43px;}
#next{background:url('img_navsprites_hover.gif') -91px 0;}
#next a:hover{background: url('img_navsprites_hover.gif') -91px -45px;}
</style>
</head>

<body>
<ul id="navlist">
  <li id="home"><a href="/"></a></li>
  <li id="prev"><a href="/css/"></a></li>
  <li id="next"><a href="/css/"></a></li>
</ul>
</body>
</html>
```

- `#navlist{position:relative;}`- 位置设置相对定位，让里面的绝对定位
- `#navlist li{margin:0;padding:0;list-style:none;position:absolute;top:0;}` - margin和padding设置为0，列表样式被删除，所有列表项是绝对定位
- `#navlist li, #navlist a{height:44px;display:block;}` - 所有图像的高度是44px

现在开始每个具体部分的定位和样式：

- `#home{left:0px;width:46px;}` - 定位到最左边的方式，以及图像的宽度是46px
- `#home{background:url(img_navsprites.gif) 0 0;}`- 定义背景图像和它的位置（左0px，顶部0px）
- `#prev{left:63px;width:43px;}` - 右侧定位63px（＃home宽46px+项目之间的一些多余的空间），宽度为43px。
- `#prev{background:url('img_navsprites.gif') -47px 0;}` - 定义背景图像右侧47px（＃home宽46px+分隔线的1px）
- `#next{left:129px;width:43px;}`- 右边定位129px(#prev 63px + #prev宽是43px + 剩余的空间), 宽度是43px.
- `#next{background:url('img_navsprites.gif') no-repeat -91px 0;}` - 定义背景图像右边91px（＃home 46px+1px的分割线+＃prev宽43px+1px的分隔线）
- `#home a:hover{background: transparent url(img_navsprites_hover.gif) 0 -45px;} `- 对于所有三个悬停图像，我们指定相同的背景位置，只是每个再向下45px
# CSS 属性选择器
下面的例子是把包含标题（title）的所有元素变为蓝色：
```css
[title]
{
    color:blue;
}
```
下面的实例改变了标题title='runoob'元素的边框样式:
```css
[title=runoob]
{
    border:5px solid green;
}
```
## 属性和值的选择器 - 多值
使用（~）/（|）分隔属性和值:
```css
[title~=hello] { color:blue; }

[lang|=en] { color:blue; }
```
## 表单样式
```css
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"> 
<title>菜鸟教程(runoob.com)</title>  
<style>
input[type="text"]
{
	width:150px;
	display:block;
	margin-bottom:10px;
	background-color:yellow;
}
input[type="button"]
{
	width:120px;
	margin-left:35px;
	display:block;
}
</style>
</head>
<body>

<form name="input" action="demo-form.php" method="get">
Firstname:<input type="text" name="fname" value="Peter" size="20">
Lastname:<input type="text" name="lname" value="Griffin" size="20">
<input type="button" value="Example Button">

</form>
</body>
```
# CSS 表单
```css
<!DOCTYPE html>
<html>
<head>
<style>
* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* 清除浮动 */
.row:after {
  content: "";
  display: table;
  clear: both;
}
 
/* 响应式布局 layout - 在屏幕宽度小于 600px 时， 设置为上下堆叠元素 */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>
</head>
<body>

<h2>响应式表单</h2>
<p>响应式表带可以根据浏览器窗口的大小重新布局各个元素，我们可以通过重置浏览器窗口大小来查看效果：</p>

<div class="container">
  <form action="/action_page.php">
  <div class="row">
    <div class="col-25">
      <label for="fname">First Name</label>
    </div>
    <div class="col-75">
      <input type="text" id="fname" name="firstname" placeholder="Your name..">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="lname">Last Name</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="lastname" placeholder="Your last name..">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="country">Country</label>
    </div>
    <div class="col-75">
      <select id="country" name="country">
        <option value="australia">Australia</option>
        <option value="canada">Canada</option>
        <option value="usa">USA</option>
      </select>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="subject">Subject</label>
    </div>
    <div class="col-75">
      <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>
    </div>
  </div>
  <div class="row">
    <input type="submit" value="Submit">
  </div>
  </form>
</div>

</body>
</html>
```
# CSS 计数器
```css
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>菜鸟教程(runoob.com)</title>
<style>
body {
  counter-reset: section;
}

h1 {
  counter-reset: subsection;
}

h1::before {
  counter-increment: section;
  content: "Section " counter(section) ". ";
}

h2::before {
  counter-increment: subsection;
  content: counter(section) "." counter(subsection) " ";
}
</style>
</head>
<body>


<h1>HTML 教程:</h1>
<h2>HTML 教程</h2>
<h2>CSS 教程</h2>

<h1>Scripting 教程:</h1>
<h2>JavaScript</h2>
<h2>VBScript</h2>

<h1>XML 教程:</h1>
<h2>XML</h2>
<h2>XSL</h2>

<p><b>注意:</b> IE8 需要指定 !DOCTYPE 才可以支持该属性。</p>

</body>
</html>
```
## 计数器也可用于列表中，列表的子元素会自动创建
```css
ol {
  counter-reset: section;
  list-style-type: none;
}

li::before {
  counter-increment: section;
  content: counters(section,".") " ";
}
```
# CSS 网页布局

![4](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/CSS4.png)

## 响应式布局
```css
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>菜鸟教程(runoob.com)</title>
<style>
* {
  box-sizing: border-box;
}
 
body {
  font-family: Arial;
  padding: 10px;
  background: #f1f1f1;
}
 
/* 头部标题 */
.header {
  padding: 30px;
  text-align: center;
  background: white;
}
 
.header h1 {
  font-size: 50px;
}
 
/* 导航条 */
.topnav {
  overflow: hidden;
  background-color: #333;
}
 
/* 导航条链接 */
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}
 
/* 链接颜色修改 */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}
 
/* 创建两列 */
/* Left column */
.leftcolumn {   
  float: left;
  width: 75%;
}
 
/* 右侧栏 */
.rightcolumn {
  float: left;
  width: 25%;
  background-color: #f1f1f1;
  padding-left: 20px;
}
 
/* 图像部分 */
.fakeimg {
  background-color: #aaa;
  width: 100%;
  padding: 20px;
}
 
/* 文章卡片效果 */
.card {
  background-color: white;
  padding: 20px;
  margin-top: 20px;
}
 
/* 列后面清除浮动 */
.row:after {
  content: "";
  display: table;
  clear: both;
}
 
/* 底部 */
.footer {
  padding: 20px;
  text-align: center;
  background: #ddd;
  margin-top: 20px;
}
 
/* 响应式布局 - 屏幕尺寸小于 800px 时，两列布局改为上下布局 */
@media screen and (max-width: 800px) {
  .leftcolumn, .rightcolumn {   
    width: 100%;
    padding: 0;
  }
}
 
/* 响应式布局 -屏幕尺寸小于 400px 时，导航等布局改为上下布局 */
@media screen and (max-width: 400px) {
  .topnav a {
    float: none;
    width: 100%;
  }
}
</style>
</head>
<body>

<div class="header">
  <h1>我的网页</h1>
  <p>重置浏览器大小查看效果。</p>
</div>

<div class="topnav">
  <a href="#">链接</a>
  <a href="#">链接</a>
  <a href="#">链接</a>
  <a href="#" style="float:right">链接</a>
</div>

<div class="row">
  <div class="leftcolumn">
    <div class="card">
      <h2>文章标题</h2>
      <h5>2019 年 4 月 17日</h5>
      <div class="fakeimg" style="height:200px;">图片</div>
      <p>一些文本...</p>
      <p>菜鸟教程 - 学的不仅是技术，更是梦想！菜鸟教程 - 学的不仅是技术，更是梦想！菜鸟教程 - 学的不仅是技术，更是梦想！菜鸟教程 - 学的不仅是技术，更是梦想！</p>
    </div>
    <div class="card">
      <h2>文章标题</h2>
      <h5>2019 年 4 月 17日</h5>
      <div class="fakeimg" style="height:200px;">图片</div>
      <p>一些文本...</p>
      <p>菜鸟教程 - 学的不仅是技术，更是梦想！菜鸟教程 - 学的不仅是技术，更是梦想！菜鸟教程 - 学的不仅是技术，更是梦想！菜鸟教程 - 学的不仅是技术，更是梦想！</p>
    </div>
  </div>
  <div class="rightcolumn">
    <div class="card">
      <h2>关于我</h2>
      <div class="fakeimg" style="height:100px;">图片</div>
      <p>关于我的一些信息..</p>
    </div>
    <div class="card">
      <h3>热门文章</h3>
      <div class="fakeimg"><p>图片</p></div>
      <div class="fakeimg"><p>图片</p></div>
      <div class="fakeimg"><p>图片</p></div>
    </div>
    <div class="card">
      <h3>关注我</h3>
      <p>一些文本...</p>
    </div>
  </div>
</div>

<div class="footer">
  <h2>底部区域</h2>
</div>

</body>
</html>
```
# CSS ！important规则
CSS 中的 `!important` 规则用于增加样式的权重。
`!important` 与优先级无关，但它与最终的结果直接相关，使用一个 `!important` 规则时，此声明将覆盖任何其他声明。
```css
#myid {
  background-color: blue;
}
 
.myclass {
  background-color: gray;
}
 
p {
  background-color: red !important;
}
```
以上实例中，尽管 ID 选择器和类选择器具有更高的优先级，但三个段落背景颜色都显示为红色，因为 `!important` 规则会覆盖 `background-color`属性。
> 使用建议：
> - 一定要优先考虑使用样式规则的优先级来解决问题而不是 `!important`
> - 只有在需要覆盖全站或外部 CSS 的特定页面中使用 `!important`
> - 永远不要在你的插件中使用 `!important`
> - 永远不要在全站范围的 CSS 代码中使用 `!important`

## 何时使用 !important
如果要在你的网站上设定一个全站样式的 CSS 样式可以使用 !important。
比如我们要让网站上所有按钮的样式都一样：
```css
.button {
  background-color: #8c8c8c !important;
  color: white !important;
  padding: 5px !important;
  border: 1px solid black !important;
}
 
#myDiv a {
  color: red;
  background-color: yellow;
}
```



