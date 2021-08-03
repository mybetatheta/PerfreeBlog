(window.webpackJsonp=window.webpackJsonp||[]).push([[10],{741:function(s,a,e){"use strict";e.r(a);var t=e(103),r=Object(t.a)({},(function(){var s=this,a=s.$createElement,e=s._self._c||a;return e("ContentSlotsDistributor",{attrs:{"slot-key":s.$parent.slotKey}},[e("h2",{attrs:{id:"下载"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#下载"}},[s._v("#")]),s._v(" 下载")]),s._v(" "),e("blockquote",[e("p",[s._v("本教程以 CentOS 7.x 为例，其他 Linux 发行版基本一致。")])]),s._v(" "),e("p",[s._v("首先将PerfreeBlog下载至本地备用,以便后续步骤,Linux推荐下载tar.gz安装包,Windows推荐下载zip安装包")]),s._v(" "),e("ul",[e("li",[s._v("下载地址一: github "),e("a",{attrs:{href:"https://github.com/perfree/PerfreeBlog/releases",target:"_blank",rel:"noopener noreferrer"}},[s._v("https://github.com/perfree/PerfreeBlog/releases"),e("OutboundLink")],1)]),s._v(" "),e("li",[s._v("下载地址二: gitee "),e("a",{attrs:{href:"https://gitee.com/perfree/PerfreeBlog/releases",target:"_blank",rel:"noopener noreferrer"}},[s._v("https://gitee.com/perfree/PerfreeBlog/releases"),e("OutboundLink")],1)])]),s._v(" "),e("h2",{attrs:{id:"环境配置"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#环境配置"}},[s._v("#")]),s._v(" 环境配置")]),s._v(" "),e("p",[s._v("请确保服务器的软件包为最新")]),s._v(" "),e("div",{staticClass:"language-bash line-numbers-mode"},[e("pre",{pre:!0,attrs:{class:"language-bash"}},[e("code",[e("span",{pre:!0,attrs:{class:"token function"}},[s._v("sudo")]),s._v(" yum update -y\n")])]),s._v(" "),e("div",{staticClass:"line-numbers-wrapper"},[e("span",{staticClass:"line-number"},[s._v("1")]),e("br")])]),e("p",[s._v("安装java运行环境(已安装的请忽略)")]),s._v(" "),e("div",{staticClass:"language-bash line-numbers-mode"},[e("pre",{pre:!0,attrs:{class:"language-bash"}},[e("code",[e("span",{pre:!0,attrs:{class:"token comment"}},[s._v("# 安装 OpenJRE")]),s._v("\n"),e("span",{pre:!0,attrs:{class:"token function"}},[s._v("sudo")]),s._v(" yum "),e("span",{pre:!0,attrs:{class:"token function"}},[s._v("install")]),s._v(" java-1.8.0-openjdk -y\n\n"),e("span",{pre:!0,attrs:{class:"token comment"}},[s._v("# 检测是否安装成功")]),s._v("\njava -version\n")])]),s._v(" "),e("div",{staticClass:"line-numbers-wrapper"},[e("span",{staticClass:"line-number"},[s._v("1")]),e("br"),e("span",{staticClass:"line-number"},[s._v("2")]),e("br"),e("span",{staticClass:"line-number"},[s._v("3")]),e("br"),e("span",{staticClass:"line-number"},[s._v("4")]),e("br"),e("span",{staticClass:"line-number"},[s._v("5")]),e("br")])]),e("blockquote",[e("p",[s._v("PerfreeBlog支持mysql和sqlite数据库,推荐数据库为mysql数据库,可参考"),e("a",{attrs:{href:"https://www.runoob.com/mysql/mysql-install.html",target:"_blank",rel:"noopener noreferrer"}},[s._v("MySQL 安装"),e("OutboundLink")],1),s._v(",当然也可以选择使用sqlite数据库,无需安装")])]),s._v(" "),e("h2",{attrs:{id:"安装perfreeblog"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#安装perfreeblog"}},[s._v("#")]),s._v(" 安装PerfreeBlog")]),s._v(" "),e("p",[s._v("将下载的Perfree安装包上传至服务器,解压压缩包")]),s._v(" "),e("div",{staticClass:"language-bash line-numbers-mode"},[e("pre",{pre:!0,attrs:{class:"language-bash"}},[e("code",[s._v(" "),e("span",{pre:!0,attrs:{class:"token function"}},[s._v("tar")]),s._v(" zxvf perfree-web-xxx.tar.gz\n")])]),s._v(" "),e("div",{staticClass:"line-numbers-wrapper"},[e("span",{staticClass:"line-number"},[s._v("1")]),e("br")])]),e("p",[s._v("进入解压后的目录")]),s._v(" "),e("div",{staticClass:"language-bash line-numbers-mode"},[e("pre",{pre:!0,attrs:{class:"language-bash"}},[e("code",[e("span",{pre:!0,attrs:{class:"token builtin class-name"}},[s._v("cd")]),s._v(" perfree-web\n"),e("span",{pre:!0,attrs:{class:"token function"}},[s._v("ls")]),s._v("\n")])]),s._v(" "),e("div",{staticClass:"line-numbers-wrapper"},[e("span",{staticClass:"line-number"},[s._v("1")]),e("br"),e("span",{staticClass:"line-number"},[s._v("2")]),e("br")])]),e("p",[s._v("将会看到目录内有如下文件")]),s._v(" "),e("p",[e("a",{attrs:{"data-fancybox":"",title:"目录",href:"/assets/doc/7.png"}},[e("img",{attrs:{src:"/assets/doc/7.png",alt:"目录"}})])]),s._v(" "),e("h2",{attrs:{id:"启动"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#启动"}},[s._v("#")]),s._v(" 启动")]),s._v(" "),e("div",{staticClass:"language-bash line-numbers-mode"},[e("pre",{pre:!0,attrs:{class:"language-bash"}},[e("code",[s._v("./start.sh start\n")])]),s._v(" "),e("div",{staticClass:"line-numbers-wrapper"},[e("span",{staticClass:"line-number"},[s._v("1")]),e("br")])]),e("p",[s._v("如遇到"),e("code",[s._v("-bash: ./start.sh: /bin/bash^M: 坏的解释器: 没有那个文件或目录")]),s._v("错误,则执行以下命令")]),s._v(" "),e("div",{staticClass:"language-bash line-numbers-mode"},[e("pre",{pre:!0,attrs:{class:"language-bash"}},[e("code",[e("span",{pre:!0,attrs:{class:"token function"}},[s._v("sed")]),s._v(" -i "),e("span",{pre:!0,attrs:{class:"token string"}},[s._v("'s/"),e("span",{pre:!0,attrs:{class:"token entity",title:"\\r"}},[s._v("\\r")]),s._v("//'")]),s._v(" ./start.sh\n./start.sh start\n")])]),s._v(" "),e("div",{staticClass:"line-numbers-wrapper"},[e("span",{staticClass:"line-number"},[s._v("1")]),e("br"),e("span",{staticClass:"line-number"},[s._v("2")]),e("br")])]),e("p",[s._v("执行完毕会在终端显示如下信息")]),s._v(" "),e("p",[e("a",{attrs:{"data-fancybox":"",title:"安装成功",href:"/assets/doc/8.png"}},[e("img",{attrs:{src:"/assets/doc/8.png",alt:"安装成功"}})])]),s._v(" "),e("p",[s._v("常用命令")]),s._v(" "),e("div",{staticClass:"language-bash line-numbers-mode"},[e("pre",{pre:!0,attrs:{class:"language-bash"}},[e("code",[e("span",{pre:!0,attrs:{class:"token comment"}},[s._v("# 运行")]),s._v("\n./start.sh start\n\n"),e("span",{pre:!0,attrs:{class:"token comment"}},[s._v("# 查看运行状态")]),s._v("\n./start.sh status\n\n"),e("span",{pre:!0,attrs:{class:"token comment"}},[s._v("# 重新启动")]),s._v("\n./start.sh restart\n\n"),e("span",{pre:!0,attrs:{class:"token comment"}},[s._v("# 停止")]),s._v("\n./start.sh stop\n")])]),s._v(" "),e("div",{staticClass:"line-numbers-wrapper"},[e("span",{staticClass:"line-number"},[s._v("1")]),e("br"),e("span",{staticClass:"line-number"},[s._v("2")]),e("br"),e("span",{staticClass:"line-number"},[s._v("3")]),e("br"),e("span",{staticClass:"line-number"},[s._v("4")]),e("br"),e("span",{staticClass:"line-number"},[s._v("5")]),e("br"),e("span",{staticClass:"line-number"},[s._v("6")]),e("br"),e("span",{staticClass:"line-number"},[s._v("7")]),e("br"),e("span",{staticClass:"line-number"},[s._v("8")]),e("br"),e("span",{staticClass:"line-number"},[s._v("9")]),e("br"),e("span",{staticClass:"line-number"},[s._v("10")]),e("br"),e("span",{staticClass:"line-number"},[s._v("11")]),e("br")])]),e("h2",{attrs:{id:"访问"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#访问"}},[s._v("#")]),s._v(" 访问")]),s._v(" "),e("blockquote",[e("p",[s._v("默认端口8080,如访问不到请查看服务器防火墙是否开启8080端口的访问权限,如需更改默认端口请查看"),e("a",{attrs:{href:""}},[s._v("更换端口")])])]),s._v(" "),e("p",[s._v("启动完成后,访问http://服务器ip:8080进入安装页,按照提示进行配置即可\n"),e("a",{attrs:{"data-fancybox":"",title:"安装页",href:"/assets/doc/9.png"}},[e("img",{attrs:{src:"/assets/doc/9.png",alt:"安装页"}})])])])}),[],!1,null,null,null);a.default=r.exports}}]);