#  


!> HTML 不是一种编程语言，而是一种标记语言


![IMG](https://cdn.gxmnzl.xyz/img/HTML1.png)


# HTML基础

## 标题

HTML 标题（Heading）是通过 `<h1>` - `<h6>` 标签来定义的。

```html
<h1>这是一个标题</h1>
<h2>这是一个标题</h2>
<h3>这是一个标题</h3>
<!-- 这是一个注释 -->
<!-- 这是一条水平线-->
<hr>
```


搜索引擎使用标题为您的网页的结构和内容编制索引，用户也可以通过标题来快速浏览您的网页，所以用标题来呈现文档结构是很重要的。


> [!TIP]
> 1到6号标题与1到6号字体逆序对应，比如1号字体对应6号标题，2号字体对应5号标题。


### 标题与字体的对应关系

```html
<h1>这是1号标题</h1>
<font size="6">这是6号字体文本</font>

<h2>这是2号标题</h2>
<font size="5">这是5号字体文本</font>

<h3>这是3号标题</h3>
<font size="4">这是4号字体文本</font>

<h4>这是4号标题</h4>
<font size="3">这是3号字体文本</font>

<h5>这是5号标题</h5>
<font size="2">这是2号字体文本</font>

<h6>这是6号标题</h6>
<font size="1">这是1号字体文本</font>
```

## 段落

HTML 段落是通过标签 `<p>` 来定义的。

```html
<p>这是一个段落。</p>
<p>这是另外一个段落。</p>
```

对于 HTML，无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。

## 链接

HTML 链接是通过标签 `<a>` 来定义的。

```html
<a href="https://www.runoob.com">这是一个链接</a>
```

超链接可以是一个字，一个词，或者一组词，也可以是一幅图像，
您可以点击这些内容来跳转到新的文档或者当前文档中的某个部分。

> [!ATTENTION]
> 注意：如果为这些超链接设置了 CSS 样式，展示样式会根据 CSS 的设定而显示。


### target 属性

使用 target 属性，你可以定义被链接的文档在何处显示

```html
<a href="https://www.runoob.com/" target="_blank" rel="noopener noreferrer">访问菜鸟教程!</a>
```
### id 属性

id 属性可用于创建一个 HTML 文档书签

```html
<a id="tips">有用的提示部分</a>
<a href="#tips">访问有用的提示部分</a>
```

## 图像

HTML 图像是通过标签 `<img>` 来定义的

```html
<img src="/images/logo.png" width="258" height="39" />
```

- `<img>` 是空标签，意思是说，它只包含属性，并且没有闭合标签。
- 源属性（src），src 指 "source"。源属性的值是图像的 URL 地址。

### Alt 属性

` alt `属性用来为图像定义一串预备的可替换的文本。  
替换文本属性的值是用户定义的。

```html
<img src="boat.gif" alt="Big Boat">
```

?> 在浏览器无法载入图像时，替换文本属性告诉读者她们失去的信息。

### 设置图像的高度与宽度

height（高度） 与 width（宽度）属性用于设置图像的高度与宽度。属性值默认单位为像素:

```html
<img src="pulpit.jpg" alt="Pulpit rock" width="304" height="228">
```

> [!ATTENTION]
> - 假如某个 HTML 文件包含十个图像，那么为了正确显示这个页面，需要加载 11 个文件。
> 加载图片是需要时间的，所以我们的建议是：慎用图片。
> - 加载页面时，要注意插入页面图像的路径，如果不能正确设置图像的位置，浏览器无法加载图片，
> 图像标签就会显示一个破碎的图片。


---

# HTML元素

| 开始标签 | 元素内容 | 结束标签 |
| :--: | :--: | :--: |
| `<p>` | 这是一个段落 | `</p>` |
| `<a href="default.htm">` | 这是一个链接 | `</a>` |
| `<br>` | 换行 | 无 |

## 文档实例

```html
<!DOCTYPE html>
<html>
  
<body>
    <p>这是第一个段落。</p>
</body>

</html>
```

## 实例解析

### `<p>`元素

`<p>` 元素定义了 HTML 文档中的一个段落

### `<body>`元素

`<body>` 元素定义了 HTML 文档的主体。

### `<html>`元素

`<html>` 元素定义了整个 HTML 文档。

> [!WARNING]
> 不要忘记结束标签!

## 空元素

没有内容的 HTML 元素被称为空元素。空元素是在开始标签中关闭的。
`<br>`就是没有关闭标签的空元素（`<br>` 标签定义换行）

> [!ATTENTION]
> 在开始标签中添加斜杠，比如 闭空元素的正确方法


---

# HTML 属性

下面列出了适用于大多数 HTML 元素的属性：

| 属性 | 描述 |
| :--: | :--: |
| class | 为html元素定义一个或多个类名（classname）(类名从样式文件引入) |
| id    | 定义元素的唯一id                     |
| style | 规定元素的行内样式（inline style）    |
| title | 描述了元素的额外信息 (作为工具条使用)  |

详见[HTML标签参考手册（功能排序）](https://www.runoob.com/tags/ref-byfunc.html)

> [!TIP]
> 在某些个别的情况下，比如属性值本身就含有双引号，那么您必须使用单引号，  
> 例如：`name='John "ShotGun" Nelson'`

# HTML 文本格式化

## 文本格式化标签

| 标签 | 描述 |
| :--: | :--: |
| `<b>`         | 定义粗体文本 |
| `<em>`        | 定义着重文字 |
| `<i>`         | 定义斜体字   |
| `<small>`     | 定义小号字   |
| `<strong>`    | 定义加重语气 |
| `<sub>`       | 定义下标字   |
| `<sup>`       | 定义上标字   |
| `<ins>`       | 定义插入字   |
| `<del>`       | 定义删除字   |


> [!TIP]
> 通常标签 `<strong>` 替换加粗标签 `<b>` 来使用， `<em>` 替换 `<i>` 标签使用。  
> 然而，这些标签的含义是不同的：
> - `<b>` 与 `<i>` 定义粗体或斜体文本；
> - `<strong>` 或者 `<em>` 意味着你要呈现的文本是重要的，所以要突出显示。



## 计算机输出标签

| 标签 | 描述  |
| :--: | :--: |
| `<code>` | 定义计算机代码 |
| `<kbd>`  | 定义键盘码     |
| `<samp>` | 定义计算机代码样本 |
| `<var>`  | 定义变量    |
| `<pre>`  | 定义预格式文本     |


## 引文，引用，及标签定义

| 标签   | 描述 |
| :--: | :--: |
| `<abbr>`   | 定义缩写    |
| `<address>`  | 定义地址   |
| `<bdo>`   | 定义文字方向   |
| `<blockquote>` | 定义长的引用   |
| `<q>`   | 定义短的引用语     |
| `<cite>`   | 定义引用、引证     |
| `<dfn>`    | 定义一个定义项目。 |

# HTML 头部

## `<head>` 元素


- `<head>` 元素包含了所有的头部标签元素。在 `<head>` 元素中你可以插入脚本（scripts）, 
  样式文件（CSS），及各种 meta 信息。
- 可以添加在头部区域的元素标签为：`<title>`, `<style>`, `<meta>`, `<link>`, 
  `<script>`, `<noscript>` 和 `<base>`。


| 标签   | 描述  |
| :--: | :--: |
| `<head>`     | 定义了文档的信息                   |
| `<title>`   | 定义了文档的标题                   |
| `<base>`     | 定义了页面链接标签的默认链接地址   |
| `<link>`     | 定义了一个文档和外部资源之间的关系 |
| `<meta>`     | 定义了HTML文档中的元数据           |
| `<script>` | 定义了客户端的脚本文件             |
| `<style>`  | 定义了HTML文档的样式文件           |


## `<title>`元素

- 定义了浏览器工具栏的标题
- 当网页添加到收藏夹时，显示在收藏夹中的标题
- 显示在搜索引擎结果页面的标题


## `<base>` 元素

`<base>` 标签描述了基本的链接地址/链接目标

```html
<head>
  <base href="http://www.runoob.com/images/" target="_blank">
</head>
```


## `<link>` 元素

<link> 标签通常用于链接到样式表:


```html
<head>
  <link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
```


## `<style>` 元素

`<style>` 标签定义了 HTML 文档的样式文件引用地址

```html
<head>
  <style type="text/css">
    body {background-color:yellow}
    p {color:blue}
  </style>
</head>
```

在 `<style>` 元素中你也可以直接添加样式来渲染 HTML 文档:


## `<meta>` 元素

- `<meta>` 标签描述了一些基本的元数据。
- `<meta>` 标签提供了元数据.元数据也不显示在页面上，但会被浏览器解析。
- META 元素通常用于指定网页的描述，关键词，文件的最后修改时间，作者，和其他元数据。
- 元数据可以使用于浏览器（如何显示内容或重新加载页面），搜索引擎（关键词），或其他 Web 服务。
- `<meta>` 一般放置于 `<head>` 区域


### 使用实例

```html
  <!--为搜索引擎定义关键词:-->
  <meta name="keywords" content="HTML, CSS, XML, XHTML, JavaScript">

  <!--为网页定义描述内容:-->
  <meta name="description" content="免费 Web & 编程 教程">

  <!--定义网页作者:-->
  <meta name="author" content="Runoob">

  <!--每30秒钟刷新当前页面:-->
  <meta http-equiv="refresh" content="30">
```


## `<script>` 元素

`<script>`标签用于加载脚本文件，如： JavaScript。

# HTML CSS

CSS 可以通过以下方式添加到 HTML 中:

- 内联样式——在 HTML 元素中使用 `<style>` 属性
- 内部样式表——在 HTML 文档头部 `<head>` 区域使用 `<style>` 元素 来包含 CSS
- 外部引用——使用外部 CSS 文件（最好的方式）


## 内联样式

### 改变段落的颜色和左外边距

```html
<p style="color:blue;margin-left:20px;">这是一个段落。</p>
```

### 改变背景颜色

```html
<body style="background-color:yellow;">
  <h2 style="background-color:red;">这是一个标题</h2>
  <p style="background-color:green;">这是一个段落。</p>
</body>
```

### 字体, 字体颜色 ，字体大小

```html
<h1 style="font-family:verdana;">一个标题</h1>
<p style="font-family:arial;color:red;font-size:20px;">一个段落。</p>
```

现在通常使用 font-family（字体），color（颜色），和 font-size（字体大小）属性
来定义文本样式，而不是使用 `<font>` 标签。

### 文本对齐方式

```html
<h1 style="text-align:center;">居中对齐的标题</h1>
<p>这是一个段落。</p>
```

文本对齐属性 `text-align` 取代了旧标签 `<center>` 。

## 内部样式表

当单个文件需要特别样式时，就可以使用内部样式表。

```html
<head>
  <style type="text/css">
    body {background-color:yellow;}
    p {color:blue;}
  </style>
</head>
```

## 外部样式表

当样式需要被应用到很多页面的时候，外部样式表将是理想的选择。

```html
<head>
  <link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
```

# HTML表格

- 表格由 `<table>` 标签来定义。
- 每个表格均有若干行（由 `<tr>` 标签定义），每行被分割为若干单元格（由 `<td>` 标签定义）。
- 字母 `td` 指表格数据（table data），即数据单元格的内容。
- 数据单元格可以包含文本、图片、列表、段落、表单、水平线、表格等等。


```html
<table border="1">
    <tr>
        <td>row 1, cell 1</td>
        <td>row 1, cell 2</td>
    </tr>
    <tr>
        <td>row 2, cell 1</td>
        <td>row 2, cell 2</td>
    </tr>
</table>
```

效果如图所示：

![IMG](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/HTML2.png)


## 表格和边框属性

```html
<table border="1">
    <tr>
        <td>Row 1, cell 1</td>
        <td>Row 1, cell 2</td>
    </tr>
</table>
```

## 表格表头

```html
<table border="1">
    <tr>
        <th>Header 1</th>
        <th>Header 2</th>
    </tr>
    <tr>
        <td>row 1, cell 1</td>
        <td>row 1, cell 2</td>
    </tr>
    <tr>
        <td>row 2, cell 1</td>
        <td>row 2, cell 2</td>
    </tr>
</table>
```


效果如图所示：

![3](https://cdn.jsdelivr.net/gh/Lxzz24/IMG/repo/HTML3.png)

# HTML列表

## 无序列表

```html
<ul>
  <li>Coffee</li>
  <li>Milk</li>
</ul>
```

## 有序列表

```html
<ol>
  <li>Coffee</li>
  <li>Milk</li>
</ol>
```


## 自定义列表

```html
<dl>
  <dt>Coffee</dt>
    <dd>- black hot drink</dd>
  <dt>Milk</dt>
    <dd>- white cold drink</dd>
</dl>
```


# HTML区块

## `<div>`元素

定义了文档的区域，块级 (block-level)

## `<span>`元素

用来组合文档中的行内元素， 内联元素(inline)

# HTML布局

## 使用`<div>`元素布局

```html
    <div id="container" style="width:500px">
 
    <div id="header" style="background-color:#FFA500;">
        <h1 style="margin-bottom:0;">主要的网页标题</h1>
    </div>
         
    <div id="menu" style="background-color:#FFD700;height:200px;width:100px;float:left;">
        <b>菜单</b><br>
        HTML<br>
        CSS<br>
        JavaScript
    </div>
         
    <div id="content" style="background-color:#EEEEEE;height:200px;width:400px;float:left;">
        内容在这里
    </div>
         
    <div id="footer" style="background-color:#FFA500;clear:both;text-align:center;">
        版权 © runoob.com
    </div>
```


## 使用表格布局

```html
    <table width="500" border="0">
        <tr>
            <td colspan="2" style="background-color:#FFA500;">
                <h1>主要的网页标题</h1>
            </td>
        </tr>
         
        <tr>
            <td style="background-color:#FFD700;width:100px;">
                <b>菜单</b><br>
                HTML<br>
                CSS<br>
                JavaScript
            </td>
            <td style="background-color:#eeeeee;height:200px;width:400px;">
                内容在这里
            </td>
        </tr>
         
        <tr>
            <td colspan="2" style="background-color:#FFA500;text-align:center;">
            版权 © runoob.com
            </td>
        </tr>
    </table>
```


> [!TIP]
> 使用 CSS 最大的好处是，如果把 CSS 代码存放到外部样式表中，那么站点会更易于维护。
> 通过编辑单一的文件，就可以改变所有页面的布局。
> 由于创建高级的布局非常耗时，使用模板是一个快速的选项。通过搜索引擎可以找到很多免费
> 的网站模板（您可以使用这些预先构建好的网站布局，并优化它们）。


# HTML表单

- 表单是一个包含表单元素的区域。
- 表单元素是允许用户在表单中输入内容,比如：文本域(textarea)、下拉列表、
  单选框(radio-buttons)、复选框(checkboxes)等等。
- 表单使用表单标签 `<form>` 来设置:
  

## 表单 - 输入元素

```html
    <!--文本域（Text Fields）-->
    <!--注意:表单本身并不可见。同时，在大多数浏览器中，文本域的默认宽度是 20 个字符。-->
    <form>
        First name: <input type="text" name="firstname"><br>
        Last name: <input type="text" name="lastname">
    </form>
   
    <!--密码字段-->
    <!--注意:密码字段字符不会明文显示，而是以星号或圆点替代。-->
    <form>
        Password: <input type="password" name="pwd">
    </form>

    <!--单选按钮（Radio Buttons）-->
    <form>
        <input type="radio" name="sex" value="male">Male<br>
        <input type="radio" name="sex" value="female">Female
    </form>

    <!--复选框（Checkboxes）-->
    <form>
        <input type="checkbox" name="vehicle" value="Bike">I have a bike<br>
        <input type="checkbox" name="vehicle" value="Car">I have a car
    </form>

    <!--提交按钮(Submit Button)-->
    <!--当用户单击确认按钮时，表单的内容会被传送到另一个文件。
        表单的动作属性定义了目的文件的文件名。
        由动作属性定义的这个文件通常会对接收到的输入数据进行相关的处理。-->
    <form name="input" action="html_form_action.php" method="get">
        Username: <input type="text" name="user">
        <input type="submit" value="Submit">
    </form>
```


# HTML框架

通过使用框架，可以在同一个浏览器窗口中显示不止一个页面。


## iframe 语法

```html
    <iframe src="URL"></iframe>
    <!--该URL指向不同的网页。-->

    <!--设置高度与宽度-->
    <iframe loading="lazy" src="#" width="200" height="200"></iframe>
    
    <!--移除边框-->
    <iframe src="#" frameborder="0"></iframe>
    
    <!--使用 iframe 来显示目标链接页面-->
    <iframe src="demo_iframe.htm" name="iframe_a"></iframe>
    <p><a href="http://www.runoob.com" target="iframe_a" rel="noopener">RUNOOB.COM</a></p>
```


# HTML颜色

## 实现设置颜色、透明度

```html
    <p style="background-color:rgb(255,255,0)">
        通过 rbg 值设置背景颜色
    </p>
    <p style="background-color:rgba(255,255,0,0.25)">
        通过 rbg 值设置背景颜色
    </p>
    <p style="background-color:rgba(255,255,0,0.5)">
        通过 rbg 值设置背景颜色
    </p>
    <p style="background-color:rgba(255,255,0,0.75)">
        通过 rbg 值设置背景颜色
    </p>
```



?> RGBA 的意思是（Red-Green-Blue-Alpha）它是在 RGB 上扩展包括了 “alpha” 通道，
运行对颜色值设置透明度，范围 0~1，0 表示全透明。

# HTML字符实体

```html
<p>
    &nbsp;空格 &lt;小于 &gt;大于 &amp;和 &quot;引号 &yen;人民币 &sect;小节<br/>
    &copy;版权 &reg;注册商标 &trade;商标 &times;乘号 &divide;除号
</p>
```


<p>
    &nbsp;空格 &lt;小于 &gt;大于 &amp;和 &quot;引号 &yen;人民币 &sect;小节<br/>
    &copy;版权 &reg;注册商标 &trade;商标 &times;乘号 &divide;除号
</p>


# [html_code](/1-Develop/Front-end/code/html.html)
