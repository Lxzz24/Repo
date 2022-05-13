<!-- docsify :ignore-->
#
# [官方文档](https://docsify.js.org/#/zh-cn/plugins)



# docsify-example-panels

[docsify-example-panels](https://vagnerdomingues.github.io/docsify-example-panels/#/)



# docsify-tabs

[docsify-tabs](https://jhildenbiddle.github.io/docsify-tabs/#/)

## 安装

1. 在 `index.html` 文件中引用官方 js 

```html
<!-- docsify (latest v4.x.x)-->
<script src="https://cdn.jsdelivr.net/npm/docsify@4"></script>

<!-- docsify-tabs (latest v1.x.x) -->
<script src="https://cdn.jsdelivr.net/npm/docsify-tabs@1"></script>
```

2. 添加配置

```javascript
window.$docsify = {
  // ...
  tabs: {
    persist    : true,      // default 确定是否在页面刷新/重新访问后恢复选项卡选择。
    sync       : true,      // default 确定选项卡选择是否将在具有匹配标签的选项卡之间同步。
    theme      : 'classic', // default 'classic', 'material',false 设置选项卡主题。值false将指示不应应用任何主题。
    tabComments: true,      // default 确定是否可以使用选项卡注释定义选项卡集中的选项卡。见用法2
    tabHeadings: true       // default 确定是否可以使用标题 + 粗体标记定义选项卡集中的选项卡。见用法1
  }
};
```

3. 自定义主题属性

```html
<style>
  :root {
    --docsifytabs-border-color: #ededed;
    --docsifytabs-tab-highlight-color: #42b983;
  }
</style>
```

## 用法

### 1

1. 使用HTML 注释定义选项卡 `tabs:start` , `tabs:end`
2. 使用标题 + 粗体标记定义选项卡中的选项卡。


```markdown
<!-- tabs:start -->

#### **English**

Hello!

#### **French**

Bonjour!

#### **Italian**

Ciao!

<!-- tabs:end -->
```

效果如下

<!-- tabs:start -->

#### **English**

Hello!

#### **French**

Bonjour!

#### **Italian**

Ciao!

<!-- tabs:end -->

### 2 

使用 `tab:xxx` 标记定义选项卡中的选项卡，如下：

```markdown
<!-- tabs:start -->

<!-- tab:English -->

Hello!

<!-- tab:French -->

Bonjour!

<!-- tab:Italian -->

Ciao!

<!-- tabs:end -->
```


<!-- tabs:start -->

<!-- tab:English -->

Hello!

<!-- tab:French -->

Bonjour!

<!-- tab:Italian -->

Ciao!

<!-- tabs:end -->


## 定制

### 主题属性

主题属性允许您自定义选项卡样式，而无需编写复杂的 CSS。以下列表包含默认主题值。

```css
:root {
    /* Tab blocks */
    --docsifytabs-border-color          : #ededed;
    --docsifytabs-border-px             : 1px;
    --docsifytabs-border-radius-px      : ;
    --docsifytabs-margin                : 1.5em 0;

    /* Tabs */
    --docsifytabs-tab-background        : #f8f8f8;
    --docsifytabs-tab-background--active: var(--docsifytabs-content-background);
    --docsifytabs-tab-color             : #999;
    --docsifytabs-tab-color--active     : inherit;
    --docsifytabs-tab-highlight-px      : 3px;
    --docsifytabs-tab-highlight-color   : var(--theme-color, currentColor);
    --docsifytabs-tab-padding           : 0.6em 1em;

    /* Tab content */
    --docsifytabs-content-background    : inherit;
    --docsifytabs-content-padding       : 1.5rem;
}
```

### 自定义样式


<!-- tabs:start -->


#### **<b>粗体</b>**


```markdown
<!-- tabs:start -->

#### **<b>粗体</b>**

...

<!-- tabs:end -->
```


#### **<em>斜体</em>**

```markdown
<!-- tabs:start -->

#### **<em>斜体</em>**

...

<!-- tabs:end -->
```

#### **<span style='color: red;'>红色</span>**

```markdown
<!-- tabs:start -->

#### **<span style='color: red;'>Red</span>**

...

<!-- tabs:end -->
```


#### **😀**


```markdown
<!-- tabs:start -->

#### **😀**

...

<!-- tabs:end -->
```

#### **Badge <span class='tab-badge'>New!</span>**

```markdown
<!-- tabs:start -->

#### **Badge <span class='tab-badge'>New!</span>**

...

<!-- tabs:end -->
```

```css
.tab-badge {
    position: absolute;
    top: 0;
    right: 0;
    transform: translate(35%, -45%);
    padding: 0.25em 0.35em;
    border-radius: 3px;
    background: red;
    color: white;
    font-family: sans-serif;
    font-size: 11px;
    font-weight: bold;
}
```

<!-- tabs:end -->



### 高级样式



<button class="docsify-tabs__tab" data-tab="basic tab">Basic Tab</button>
<div class="docsify-tabs__content" data-tab-content="basic tab">

  ```HTML
  <button class="docsify-tabs__tab" data-tab="basic tab">Basic Tab</button>
  <div class="docsify-tabs__content" data-tab-content="basic tab">
    ...
  </div>
  ```

  ```HTML
  <button class="docsify-tabs__tab docsify-tabs__tab--active" data-tab="basic tab">Basic Tab</button>
  ```
</div>


<button class="docsify-tabs__tab docsify-tabs__tab--active" data-tab="active state">Active State</button>
<div class="docsify-tabs__content" data-tab-content="active state">

  ```HTML
  <button class="docsify-tabs__tab docsify-tabs__tab--active" data-tab="active state">Active State</button>
  <div class="docsify-tabs__content" data-tab-content="active state">
    ...
  </div>  
  ```

  ```CSS
  .docsify-tabs__tab--active[data-tab="active state"] {
    box-shadow: none;
    background: #13547a;
    color: white;
  }
  .docsify-tabs__content[data-tab-content="active state"] {
    background-image: linear-gradient(0deg, #80d0c7 0%, #13547a 100%);
  }
  .docsify-tabs__content[data-tab-content="active state"] p strong {
    color: white;
  }
  ```
</div>


<button class="docsify-tabs__tab docsify-tabs__tab--active" data-tab="codepen">CodePen</button>
<div class="docsify-tabs__content" data-tab-content="codepen">
  

  ```HTML
  <button class="docsify-tabs__tab docsify-tabs__tab--active" data-tab="codepen">CodePen</button>
  <div class="docsify-tabs__content" data-tab-content="codepen">
    ...
  </div>
  ```

  ```CSS
  [data-tab-content="codepen"] .cp_embed_wrapper {
    position: relative;
    top: calc(0px - var(--docsifytabs-content-padding));
    left: calc(0px - var(--docsifytabs-content-padding));
    width: calc(100% + calc(var(--docsifytabs-content-padding) * 2));
    margin-bottom: calc(0px - var(--docsifytabs-content-padding));
  }
  ```
</div>

<!-- tabs:start -->

#### **Badge**

```MARKDOWN
#### **Badge**
```

```CSS
[data-tab="badge"]:after {
  content: 'New!';
  position: absolute;
  top: 0;
  right: 0;
  transform: translate(35%, -45%);
  padding: 0.25em 0.35em;
  border-radius: 3px;
  background: red;
  color: white;
  font-family: sans-serif;
  font-size: 11px;
  font-weight: bold;
}
```

<!-- tabs:end -->




<style>
  .docsify-tabs__tab--active[data-tab="active state"] {
    box-shadow: none;
    background: #13547a;
    color: white;
  }

  .docsify-tabs__content[data-tab-content="active state"] {
    background-image: linear-gradient(0deg, #80d0c7 0%, #13547a 100%);
  }

  .docsify-tabs__content[data-tab-content="active state"] p strong {
    color: white;
  }

  [data-tab-content="codepen"] .cp_embed_wrapper {
    position: relative;
    top: calc(0px - var(--docsifytabs-content-padding));
    left: calc(0px - var(--docsifytabs-content-padding));
    width: calc(100% + calc(var(--docsifytabs-content-padding) * 2));
    margin-bottom: calc(0px - var(--docsifytabs-content-padding));
  }

  [data-tab="badge"]:after {
    content: 'New!';
    position: absolute;
    top: 0;
    right: 0;
    transform: translate(35%, -45%);
    padding: 0.25em 0.35em;
    border-radius: 3px;
    background: red;
    color: white;
    font-family: sans-serif;
    font-size: 11px;
    font-weight: bold;
  }
</style>