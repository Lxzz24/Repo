# ä¸»é¢

ð é¾æ¥ï¼https://unpkg.com/browse/docsify@4.12.2/

ç®åæä¾ä¸å¥ä¸»é¢å¯ä¾éæ©ï¼æ¨¡ä»¿ [Vue](//vuejs.org) å [buble](//buble.surge.sh) å®ç½è®¢å¶çä¸»é¢æ ·å¼ãè¿æ [@liril-net](https://github.com/liril-net) è´¡ç®çé»è²é£æ ¼çä¸»é¢ã

```html
<link rel="stylesheet" href="https://unpkg.com/browse/docsify@4.12.2/themes/vue.css">
<link rel="stylesheet" href="https://unpkg.com/browse/docsify@4.12.2/themes/buble.css">
<link rel="stylesheet" href="https://unpkg.com/browse/docsify@4.12.2/themes/dark.css">
<link rel="stylesheet" href="https://unpkg.com/browse/docsify@4.12.2/themes/pure.css">
<link rel="stylesheet" href="https://unpkg.com/browse/docsify@4.12.2/themes/dolphin.css">
```

!> CSS çåç¼©æä»¶ä½äº `/lib/themes/`

```html
<!-- compressed -->

<link rel="stylesheet" href="https://unpkg.com/browse/docsify@4.12.2/lib/themes/vue.css">
<link rel="stylesheet" href="https://unpkg.com/browse/docsify@4.12.2/lib/themes/buble.css">
<link rel="stylesheet" href="https://unpkg.com/browse/docsify@4.12.2/lib/themes/dark.css">
<link rel="stylesheet" href="https://unpkg.com/browse/docsify@4.12.2/lib/themes/pure.css">
<link rel="stylesheet" href="https://unpkg.com/browse/docsify@4.12.2/lib/themes/dolphin.css">
```

å¦æä½ æå¶ä»æ³æ³æèæ³å¼åå«çä¸»é¢ï¼æ¬¢è¿æ [PR](https://github.com/docsifyjs/docsify/pulls)ã

#### ç¹å»åæ¢ä¸»é¢


<div class="demo-theme-preview">
    <a data-theme="vue">vue.css</a>
    <a data-theme="buble">buble.css</a>
    <a data-theme="dark">dark.css</a>
    <a data-theme="pure">pure.css</a>
    <a data-theme="dolphin">dolphin.css</a>
</div>


<style>
    .demo-theme-preview a {
        padding-right: 10px;
    }

    .demo-theme-preview a:hover {
        cursor: pointer;
        text-decoration: underline;
    }
</style>

<script>
    var preview = Docsify.dom.find('.demo-theme-preview');
    var themes = Docsify.dom.findAll('[rel="stylesheet"]');

    preview.onclick = function (e) {
        var title = e.target.getAttribute('data-theme')

        themes.forEach(function (theme) {
        theme.disabled = theme.title !== title
        });
    };
</script>


## å¶ä»ä¸»é¢

- [docsify-themeable](https://jhildenbiddle.github.io/docsify-themeable/#/) ä¸ä¸ªç¨äºdocsifyçï¼ç®åå°ä»¤äººææ¦çä¸»é¢ç³»ç».


