package com.myprogram.test.jvm;

/**
 * Created by Administrator on 2017/7/26.
 */
public class XMLModel {
    public static int a = 10;
    public static int b = 10;
    public static String xml="\n" +
            "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"zh-CN\" dir=\"ltr\">\n" +
            "  <head>\n" +
            "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n" +
            "    <title>查看java对象在内存中的布局 - 田麦 - ITeye博客</title>\n" +
            "    <meta name=\"description\" content=\"          接着上篇《一个对象占用多少字节？》中遇到的问题：          UseCompressOops开启和关闭，对对象头大小是有影响的，开启压缩，对象头是4+8=12byte；关闭压缩，对象头是8+8=16bytes。这个如何观察验证呢？       基于上述事实，通过new A()和new B()占用字节推断，基本类型int在开启、关闭压缩情况下都是占用4个bytes的，这个没有 ...\" />\n" +
            "    <meta name=\"keywords\" content=\"UseCompressOops, 压缩对象引用指针, 字段偏移量, _klass 查看java对象在内存中的布局\" />\n" +
            "    <link rel=\"shortcut icon\" href=\"/images/favicon.ico\" type=\"image/x-icon\" />\n" +
            "    <link rel=\"search\" type=\"application/opensearchdescription+xml\" href=\"/open_search.xml\" title=\"ITeye\" />\n" +
            "    <link href=\"/rss\" rel=\"alternate\" title=\"田麦\" type=\"application/rss+xml\" />\n" +
            "    <link href=\"http://www.iteye.com/stylesheets/blog.css?1499670872\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n" +
            "<link href=\"http://www.iteye.com/stylesheets/themes/blog/blue.css?1448702469\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n" +
            "    <script src=\"http://www.iteye.com/javascripts/application.js?1448702469\" type=\"text/javascript\"></script>    \n" +
            "    <script>\n" +
            "    var _hmt = _hmt || [];\n" +
            "    (function() {\n" +
            "        var hm = document.createElement(\"script\");\n" +
            "        hm.src = \"//hm.baidu.com/hm.js?e19a8b00cf63f716d774540875007664\";\n" +
            "        var s = document.getElementsByTagName(\"script\")[0];\n" +
            "        s.parentNode.insertBefore(hm, s);\n" +
            "    })();\n" +
            "</script>\n" +
            "\n" +
            "\n" +
            "      <link href=\"http://www.iteye.com/javascripts/syntaxhighlighter/SyntaxHighlighter.css?1448702469\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n" +
            "  <script src=\"http://www.iteye.com/javascripts/syntaxhighlighter/shCoreCommon.js?1448702469\" type=\"text/javascript\"></script>\n" +
            "<script src=\"http://www.iteye.com/javascripts/hotkey.js?1448702469\" type=\"text/javascript\"></script>\n" +
            "  <script src=\"http://www.iteye.com/javascripts/code_favorites.js?1448702469\" type=\"text/javascript\"></script>\n" +
            "<script src=\"http://www.iteye.com/javascripts/weiboshare.js?1448702469\" type=\"text/javascript\"></script>\n" +
            "\n" +
            "    \n" +
            "  </head>\n" +
            "  <body>\n" +
            "    <div id=\"header\">\n" +
            "\t      <div id=\"blog_site_nav\">\n" +
            "  <a href=\"http://www.iteye.com/\" class=\"homepage\">首页</a>\n" +
            "  <a href=\"http://www.iteye.com/news\">资讯</a>\n" +
            "  <a href=\"http://www.iteye.com/magazines\">精华</a>\n" +
            "  <a href=\"http://www.iteye.com/forums\">论坛</a>\n" +
            "  <a href=\"http://www.iteye.com/ask\">问答</a>\n" +
            "  <a href=\"http://www.iteye.com/blogs\">博客</a>\n" +
            "  <a href=\"http://www.iteye.com/blogs/subjects\">专栏</a>\n" +
            "  <a href=\"http://www.iteye.com/groups\">群组</a>\n" +
            "  <a href=\"#\" onclick=\"return false;\" id=\"msna\"><u>更多</u> <small>▼</small></a>\n" +
            "  <div class=\"quick_menu\" style=\"display:none;\">\n" +
            "    <a target=\"_blank\" href=\"http://job.iteye.com/iteye\">知识库</a>\n" +
            "    <a href=\"http://www.iteye.com/search\">搜索</a>\n" +
            "  </div>\n" +
            "</div>\n" +
            "\n" +
            "\t      <div id=\"user_nav\">\n" +
            "  <span style=\"color:red;\">因系统升级，暂停注册。稍后将全面支持使用CSDN帐号进行注册及登录</span>\n" +
            "  \n" +
            "      <a href=\"/login\" class=\"welcome\" title=\"登录\">您还未登录 !</a>\n" +
            "    <a href=\"/login\">登录</a>\n" +
            "  </div>\n" +
            "\n" +
            "\t    \n" +
            "    </div>\n" +
            "\n" +
            "    <div id=\"page\">\n" +
            "        <div id=\"branding\" class=\"clearfix\" style=\"overflow: hidden;background: none;padding:0 0 2px;\">\n" +
            "          <script type=\"text/javascript\">\n" +
            "            /*Iteye博客内页顶部通栏-960*90，创建于 2016-08-01*/\n" +
            "            var cpro_id = \"u2720131\";\n" +
            "          </script>\n" +
            "          <script type=\"text/javascript\" src=\"http://cpro.baidustatic.com/cpro/ui/c.js\"></script>\n" +
            "        </div>\n" +
            "      <div id=\"branding\" class=\"clearfix\">\n" +
            "        <div id=\"blog_name\">\n" +
            "          <h1><a href=\"/\">田麦</a></h1>\n" +
            "        </div>\n" +
            "        <div id='fd'></div>\n" +
            "        <div id=\"blog_navbar\">\n" +
            "          <ul>\n" +
            "            <li class='blog_navbar_for'><a href=\"http://yueyemaitian.iteye.com\"><strong>博客</strong></a></li>\n" +
            "            <li ><a href=\"/weibo\">微博</a></li>\n" +
            "            <li ><a href=\"/album\">相册</a></li>\n" +
            "            <li ><a href=\"/link\">收藏</a></li>\n" +
            "            <li ><a href=\"/blog/guest_book\">留言</a></li>\n" +
            "            <li ><a href=\"/blog/profile\">关于我</a></li>\n" +
            "          </ul>\n" +
            "    \n" +
            "          <div class=\"search\">\n" +
            "            <form action=\"/blog/search\" method=\"get\">\n" +
            "              <input class=\"search_text\" id=\"query\" name=\"query\" style=\"margin-left: 10px;width: 110px;\" type=\"text\" value=\"\" />\n" +
            "              <input class=\"submit_search\" type=\"submit\" value=\"\" />\n" +
            "            </form>\n" +
            "          </div> \n" +
            "          <div id=\"fd\"></div>         \n" +
            "        </div>\n" +
            "      </div>\n" +
            "      \n" +
            "      <div id=\"content\" class=\"clearfix\">\n" +
            "        <div id=\"main\">\n" +
            "          \n" +
            "\n" +
            "\n" +
            "\n" +
            "          \n" +
            "\n" +
            "\n" +
            "<div class=\"h-entry\" style='display:none'>\n" +
            "  <a href=\"http://yueyemaitian.iteye.com\" class=\"p-author\" target=\"_blank\">yueyemaitian</a>\n" +
            "</div>\n" +
            "\n" +
            "\n" +
            "<div class=\"blog_main\">\n" +
            "  <div class=\"blog_title\">\n" +
            "    <h3>\n" +
            "      <a href=\"/blog/2034305\">查看java对象在内存中的布局</a>\n" +
            "      <em class=\"actions\">      </em>\n" +
            "    </h3>\n" +
            "    <ul class='blog_categories'><strong>博客分类：</strong> <li><a href=\"/category/180818\">jvm</a></li><li><a href=\"/category/80014\">java</a></li> </ul>\n" +
            "        <div class='news_tag'><a href=\"http://www.iteye.com/blogs/tag/UseCompressOops\">UseCompressOops</a><a href=\"http://www.iteye.com/blogs/tag/%E5%8E%8B%E7%BC%A9%E5%AF%B9%E8%B1%A1%E5%BC%95%E7%94%A8%E6%8C%87%E9%92%88\">压缩对象引用指针</a><a href=\"http://www.iteye.com/blogs/tag/%E5%AD%97%E6%AE%B5%E5%81%8F%E7%A7%BB%E9%87%8F\">字段偏移量</a><a href=\"http://www.iteye.com/blogs/tag/_klass\">_klass</a>&nbsp;</div>\n" +
            "    \t  \n" +
            "    \t\n" +
            "    \t\n" +
            "  \t\t\n" +
            "      </div>\n" +
            "\n" +
            "  <div id=\"blog_content\" class=\"blog_content\">\n" +
            "    <div class=\"iteye-blog-content-contain\" style=\"font-size: 14px;\">\n" +
            "<p>        接着上篇<a href=\"/blog/2033046\" target=\"_blank\">《一个对象占用多少字节？》</a>中遇到的问题：</p>\n" +
            "<div class=\"quote_div\">        UseCompressOops开启和关闭，对对象头大小是有影响的，开启压缩，对象头是4+8=12byte；关闭压缩，对象头是8+8=16bytes。这个如何观察验证呢？<br>       基于上述事实，通过new A()和new B()占用字节推断，基本类型int在开启、关闭压缩情况下都是占用4个bytes的，这个没有影响。而通过B和B2在开启、关闭指针压缩情况下的对比看，Integer类型分别占了4 bytes和8 bytes，实际上引用类型都是这样。如何验证？<br>        new Integer[0]在压缩前后分别占用16、24个字节，这是又是为什么呢？</div>\n" +
            "<p>         其实要想验证这些信息，需要知道对象在内存中的布局，并且可以把他们输出出来，很巧看到了撒加（RednaxelaFX）大神的<a href=\"http://rednaxelafx.iteye.com/blog/730461\" target=\"_blank\">《借助HotSpot SA来一窥PermGen上的对象》</a>，可以一窥java对象在内存中的布局。不过我没搞那么复杂，没用oom的方式输出内存对象信息——主要是由于在我的mac os x上Intellij IDEA权限的原因那样做不成功——而是通过启动两个进程的方式，一个监控程序和一个被监控程序。</p>\n" +
            "<p>        先写了个程序，也用unsafe的方法获取到字段偏移量，来跟通过SA的方式做对比。首先说明，我的os是Mac OSX 10.9.2，64bit机器，jdk是jdk1.7.0_11，64位。</p>\n" +
            "<pre class=\"java\" name=\"code\">import sun.misc.Unsafe;\n" +
            "\n" +
            "import java.lang.reflect.Field;\n" +
            "\n" +
            "/**\n" +
            " * -Xmx1024m\n" +
            " * @author tianmai.fh\n" +
            " * @date 2014-03-18 19:10\n" +
            " */\n" +
            "public class FieldOffsetTest {\n" +
            "    static Unsafe unsafe;\n" +
            "\n" +
            "    static {\n" +
            "        Field field = null;\n" +
            "        try {\n" +
            "            field = Unsafe.class.getDeclaredField(\"theUnsafe\");\n" +
            "            field.setAccessible(true);\n" +
            "            unsafe = (Unsafe) field.get(null);\n" +
            "        } catch (NoSuchFieldException e) {\n" +
            "            e.printStackTrace();\n" +
            "        } catch (IllegalAccessException e) {\n" +
            "            e.printStackTrace();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    static class MyClass {\n" +
            "        Object a = new Object();\n" +
            "        Integer b = new Integer(3);\n" +
            "        int c = 4;\n" +
            "        long d = 5L;\n" +
            "        Long[] e = new Long[2];\n" +
            "        Object[] f = new String[0];\n" +
            "    }\n" +
            "    static class B2 {\n" +
            "        int a;\n" +
            "        Integer b;\n" +
            "        int c;\n" +
            "    }\n" +
            "\n" +
            "    static long objectFieldOffset(Field field) {\n" +
            "        return unsafe.objectFieldOffset(field);\n" +
            "    }\n" +
            "\n" +
            "    static String objectFieldOffset(Class&lt;?&gt; clazz) {\n" +
            "        Field[] fields = clazz.getDeclaredFields();\n" +
            "        StringBuilder sb = new StringBuilder(fields.length * 50);\n" +
            "        sb.append(clazz.getName()).append(\" Field offset:\\n\");\n" +
            "        for (Field field : fields) {\n" +
            "            sb.append(\"\\t\").append(field.getType().getSimpleName());\n" +
            "            sb.append(\"\\t\").append(field.getName()).append(\": \");\n" +
            "            sb.append(objectFieldOffset(field)).append(\"\\n\");\n" +
            "        }\n" +
            "        return sb.toString();\n" +
            "    }\n" +
            "\n" +
            "    public static void main(String[] args) throws InterruptedException, NoSuchFieldException {\n" +
            "        MyClass mc = new MyClass();\n" +
            "        int[] big = new int[30 * 1024 * 1024];\n" +
            "        big = null;\n" +
            "        System.gc();\n" +
            "        System.out.println(objectFieldOffset((MyClass.class)));\n" +
            "        System.out.println(objectFieldOffset((B2.class)));\n" +
            "        Object a = new Long[1];\n" +
            "        System.out.println(Long[].class.getName());\n" +
            "        Thread.sleep(1000000);\n" +
            "    }\n" +
            "}\n" +
            "</pre>\n" +
            "<p>         在启用指针压缩的情况下输出为：</p>\n" +
            "<pre class=\"java\" name=\"code\">com.tmall.buy.structure.FieldOffsetTest$MyClass Field offset:\n" +
            "\tObject\ta: 24\n" +
            "\tInteger\tb: 28\n" +
            "\tint\tc: 12\n" +
            "\tlong\td: 16\n" +
            "\tLong[]\te: 32\n" +
            "\tObject[]f: 36\n" +
            "\n" +
            "com.tmall.buy.structure.FieldOffsetTest$B2 Field offset:\n" +
            "\tint\ta: 12\n" +
            "\tInteger\tb: 20\n" +
            "\tint\tc: 16</pre>\n" +
            "<p>        第一个实例变量的偏移量都是12，也就是说对象头占用了12个字节；基本类型int占用4个字节；对象引用占用了4个字节，如MyClass#a；对象数组占用也是4个字节；这里看不出数组这个对象占用了多少个字节。</p>\n" +
            "<p>        在不启用对象指针压缩的时候（vm参数添加-XX:-UseCompressedOops）：</p>\n" +
            "<pre class=\"java\" name=\"code\">com.tmall.buy.structure.FieldOffsetTest$MyClass Field offset:\n" +
            "\tObject\ta: 32\n" +
            "\tInteger\tb: 40\n" +
            "\tint\tc: 24\n" +
            "\tlong\td: 16\n" +
            "\tLong[]\te: 48\n" +
            "\tObject[]\tf: 56\n" +
            "\n" +
            "com.tmall.buy.structure.FieldOffsetTest$B2 Field offset:\n" +
            "\tint\ta: 16\n" +
            "\tInteger\tb: 24\n" +
            "\tint\tc: 20</pre>\n" +
            "<p>       第一个实例变量的偏移量都是16，也就是说对象头占用了16个字节；基本类型int占用4个字节；对象引用占用了8个字节，如MyClass#a；对象数组占用也是8个字节；这里看不出数组这个对象占用了多少个字节。</p>\n" +
            "<p>       那接下来通过对象的内存布局进一步验证：</p>\n" +
            "<pre class=\"java\" name=\"code\">import sun.jvm.hotspot.oops.*;\n" +
            "import sun.jvm.hotspot.runtime.VM;\n" +
            "import sun.jvm.hotspot.tools.Tool;\n" +
            "import sun.jvm.hotspot.utilities.SystemDictionaryHelper;\n" +
            "\n" +
            "/**\n" +
            " * 打印对象的内存布局\n" +
            " */\n" +
            "public class PrintObjectTest extends Tool {\n" +
            "    public static void main(String[] args) throws InterruptedException {\n" +
            "        PrintObjectTest test = new PrintObjectTest();\n" +
            "        test.start(args);\n" +
            "        test.stop();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void run() {\n" +
            "        VM vm = VM.getVM();\n" +
            "        ObjectHeap objHeap = vm.getObjectHeap();\n" +
            "        HeapVisitor heapVisitor = new HeapPrinter(System.out);\n" +
            "        //观察特定对象\n" +
            "        Klass klass = SystemDictionaryHelper.findInstanceKlass(\"xxx.yyy.zzz.FieldOffsetTest$MyClass\");\n" +
            "        objHeap.iterateObjectsOfKlass(heapVisitor, klass, false);\n" +
            "\n" +
            "        //观察数组对象\n" +
            "        objHeap.iterate(heapVisitor,new ObjectHeap.ObjectFilter() {\n" +
            "            @Override\n" +
            "            public boolean canInclude(Oop oop) {\n" +
            "                return oop.isObjArray();\n" +
            "            }\n" +
            "        });\n" +
            "        objHeap.iterate(heapVisitor);\n" +
            "    }\n" +
            "}</pre>\n" +
            "<p>        这个程序在运行前，需要传入要监控的java进程id，也就是上边那个程序的进程id，可以通过jps拿到。但是在我的IDEA上，是跑不起来的，是由于权限问题：</p>\n" +
            "<pre class=\"java\" name=\"code\">Attaching to process ID 1923, please wait...\n" +
            "attach: task_for_pid(1923) failed (5)\n" +
            "Error attaching to process: sun.jvm.hotspot.debugger.DebuggerException: Can't attach to the process\n" +
            "</pre>\n" +
            "<p>        用命令行，sudo就可以了：</p>\n" +
            "<pre class=\"java\" name=\"code\">sudo java -cp $JAVA_HOME/lib/sa-jdi.jar:. xxx.yyy.zzz.PrintObjectTest 进程id &gt; heap_OOps.txt\n" +
            "</pre>\n" +
            "<p>        如果你被监控的jvm实例是1.7.x启动的，而命令行监控实例通过1.8的jdk启动，会抛出如下错误：</p>\n" +
            "<pre class=\"java\" name=\"code\">Attaching to process ID 3024, please wait...\n" +
            "Exception in thread \"main\" java.lang.NoSuchMethodError: getJavaThreadsInfo\n" +
            "\tat sun.jvm.hotspot.debugger.bsd.BsdDebuggerLocal.init0(Native Method)\n" +
            "\tat sun.jvm.hotspot.debugger.bsd.BsdDebuggerLocal.&lt;clinit&gt;(BsdDebuggerLocal.java:595)\n" +
            "\tat sun.jvm.hotspot.bugspot.BugSpotAgent.setupDebuggerBsd(BugSpotAgent.java:775)\n" +
            "\tat sun.jvm.hotspot.bugspot.BugSpotAgent.setupDebugger(BugSpotAgent.java:519)\n" +
            "\tat sun.jvm.hotspot.bugspot.BugSpotAgent.go(BugSpotAgent.java:492)\n" +
            "\tat sun.jvm.hotspot.bugspot.BugSpotAgent.attach(BugSpotAgent.java:331)\n" +
            "\tat sun.jvm.hotspot.tools.Tool.start(Tool.java:163)\n" +
            "\tat com.tmall.buy.structure.PrintObjectTest.main(PrintObjectTest.java:14)</pre>\n" +
            "<p>         直接全路径用1.7的jdk带的java启动就好了。</p>\n" +
            "<p>         接下来我们看输出，这个是启用指针压缩的，由于输出比较长，我们就只关心我们想看的几个：</p>\n" +
            "<pre class=\"java\" name=\"code\">Oop for com/tmall/buy/structure/FieldOffsetTest$MyClass @ 0x000000011bfce258 (object size = 40)\n" +
            " - _mark:\t {0} :1\n" +
            " - _metadata._compressed_klass:\t {8} :InstanceKlass for com/tmall/buy/structure/FieldOffsetTest$MyClass @ 0x0000000146d2a160\n" +
            " - a:\t {24} :Oop for java/lang/Object @ 0x000000011bf9bb90\n" +
            " - b:\t {28} :Oop for java/lang/Integer @ 0x000000011bf9bba8\n" +
            " - c:\t {12} :4\n" +
            " - d:\t {16} :5\n" +
            " - e:\t {32} :ObjArray @ 0x000000011bf9bbc0\n" +
            " - f:\t {36} :ObjArray @ 0x000000011bf9bbd8\n" +
            "\n" +
            "...\n" +
            "\n" +
            "ObjArray @ 0x000000011bf9bbc0 (object size = 24)\n" +
            " - _mark:\t {0} :1\n" +
            " - _metadata._compressed_klass:\t {8} :ObjArrayKlass for InstanceKlass for java/lang/Long @ 0x0000000146d2b910\n" +
            " - 0:\t {16} :null\n" +
            " - 1:\t {20} :null\n" +
            "\n" +
            "...\n" +
            "\n" +
            "ObjArray @ 0x000000011bf9bbd8 (object size = 16)\n" +
            " - _mark:\t {0} :1\n" +
            " - _metadata._compressed_klass:\t {8} :ObjArrayKlass for InstanceKlass for java/lang/String @ 0x0000000146b229c0\n" +
            "\n" +
            "...</pre>\n" +
            "<p>         可以看到，MyClass这个类的大小是40个字节，不包括它引用的对象的大小，其中大括号是对象实例字段的偏移量，单位是字节。验证了对象头是12 bytes，其中_mark占8个字节_metadata._compressed_klass占用4个字节；剩下的就跟第一个例子中启用了压缩指针的结论一致。这里我们也可以看到数据对象占用的内存空间了，数组对象的头部占用了16个字节，_mark占8个，_metadata._compressed_klass占8个；另外也验证了，对象是8字节对齐的。</p>\n" +
            "<p>    在看不启用对象指针压缩的情况：</p>\n" +
            "<pre class=\"java\" name=\"code\">Oop for com/tmall/buy/structure/FieldOffsetTest$MyClass @ 0x000000011ad491e8 (object size = 64)\n" +
            " - _mark:\t {0} :1\n" +
            " - _metadata._klass:\t {8} :InstanceKlass for com/tmall/buy/structure/FieldOffsetTest$MyClass @ 0x0000000145a873d8\n" +
            " - a:\t {32} :Oop for java/lang/Object @ 0x000000011ad1e1a8\n" +
            " - b:\t {40} :Oop for java/lang/Integer @ 0x000000011ad211b8\n" +
            " - c:\t {24} :4\n" +
            " - d:\t {16} :5\n" +
            " - e:\t {48} :ObjArray @ 0x000000011ad201c8\n" +
            " - f:\t {56} :ObjArray @ 0x000000011ad211d0\n" +
            "\n" +
            "...\n" +
            "\n" +
            "ObjArray @ 0x000000011ad201c8 (object size = 40)\n" +
            " - _mark:\t {0} :1\n" +
            " - _metadata._klass:\t {8} :ObjArrayKlass for InstanceKlass for java/lang/Long @ 0x0000000145a88120\n" +
            " - 0:\t {24} :null\n" +
            " - 1:\t {32} :null\n" +
            "\n" +
            "...\n" +
            "\n" +
            "ObjArray @ 0x000000011ad211d0 (object size = 24)\n" +
            " - _mark:\t {0} :1\n" +
            " - _metadata._klass:\t {8} :ObjArrayKlass for InstanceKlass for java/lang/String @ 0x0000000145876ef0\n" +
            "\n" +
            "...</pre>\n" +
            "<p>        MyClass这个类的大小是64个字节，不包括它引用的对象的大小，其中大括号是对象实例字段的偏移量，单位是字节。验证了对象头是16 bytes，其中_mark占8个字节_metadata._klass占用8个字节；剩下的就跟第一个例子中不启用了压缩指针的结论一致。数组对象的头部占用了24个字节，_mark占8个，_metadata._compressed_klass占16个；另外也验证了，对象是8字节对齐的。</p>\n" +
            "<p>        tips：在查找MyClass对象中数组类型实例字段的内存布局时，可以直接用后边的内存地址搜索@ 0x000000011ad201c8。</p>\n" +
            "<p>        关于对象更多描述信息，请移步到开篇引用的RednaxelaFX那篇文章中学习。enjoy it！</p>\n" +
            "</div>\n" +
            "  </div>\n" +
            "\n" +
            "  \n" +
            "\n" +
            "  \n" +
            "      <script type=\"text/javascript\"><!--\n" +
            "      google_ad_client = \"ca-pub-8990951720398508\";\n" +
            "      /* iteye博客内页Banner-728*90 */\n" +
            "      google_ad_slot = \"8267689356/1918544322\";\n" +
            "      google_ad_width = 728;\n" +
            "      google_ad_height = 90;\n" +
            "      //-->\n" +
            "      </script>\n" +
            "      <script type=\"text/javascript\"\n" +
            "              src=\"//pagead2.googlesyndication.com/pagead/show_ads.js\">\n" +
            "      </script>\n" +
            "  \n" +
            "\n" +
            "  <div id=\"bottoms\" class=\"clearfix\">\n" +
            "    <div id=\"digg_bottom\" class=\"clearfix\"><div class='digged'><strong>2</strong> <br/>顶</div><div class='digged'><strong>2</strong> <br/>踩</div></div>\n" +
            "    <div id=\"share_weibo\">分享到：\n" +
            "      <a data-type='sina' href=\"javascript:;\" title=\"分享到新浪微博\"><img src=\"/images/sina.jpg\"></a>\n" +
            "      <a data-type='qq' href=\"javascript:;\" title=\"分享到腾讯微博\"><img src=\"/images/tec.jpg\"></a>\n" +
            "    </div>\n" +
            "  </div>\n" +
            "\n" +
            "  <div class=\"blog_nav\">\n" +
            "    <div class=\"pre_next\">\n" +
            "      <a href=\"/blog/2038304\" class=\"next\" title=\"Mac OSX 10.9 上build openjdk8和openjdk7\">Mac OSX 10.9 上build openjdk8和openjdk7</a>\n" +
            "      |\n" +
            "      <a href=\"/blog/2033046\" class=\"pre\" title=\"一个对象占用多少字节？\">一个对象占用多少字节？</a>\n" +
            "    </div>\n" +
            "  </div>\n" +
            "  <div class=\"blog_bottom\">\n" +
            "    <ul>\n" +
            "      <li>2014-03-20 22:39</li>\n" +
            "      <li>浏览 7612</li>\n" +
            "      <li><a href=\"#comments\">评论(0)</a></li>\n" +
            "      \n" +
            "      \n" +
            "      <li>分类:<a href=\"http://www.iteye.com/blogs/category/language\">编程语言</a></li>      \n" +
            "      <li class='last'><a href=\"http://www.iteye.com/wiki/blog/2034305\" target=\"_blank\" class=\"more\">相关推荐</a></li>\n" +
            "    </ul>    \n" +
            "  </div>\n" +
            "  \n" +
            "\t\t    \n" +
            "\t\t\n" +
            "<div class=\"boutique-curr-box blog_comment\">\n" +
            "\t  <div class=\"boutique-curr clearfix\">\n" +
            "\t    <h5 class=\"h3titles\">参考知识库</h5>\n" +
            "\t    \n" +
            "\t    <dl class=\"dlnewlist\">\n" +
            "\t    \n" +
            "          <dd><a target=\"_blank\" href=\"http://lib.csdn.net/base/android\"><img src=\"http://img.knowledge.csdn.net/upload/base/1455589744328_328.jpg\" width=\"58\" height=\"58\" alt=\"\"></a></dd>\n" +
            "          <dt>\n" +
            "              <a target=\"_blank\" href=\"http://lib.csdn.net/base/android\" classs=\"title\">Android知识库</a>\n" +
            "              <span>\n" +
            "                 <em>36072</em>&nbsp;&nbsp;关注 <i>|</i> <em>3137</em>&nbsp;&nbsp;收录                  \n" +
            "              </span>\n" +
            "          </dt>\n" +
            "      \n" +
            "\t    </dl>\n" +
            "\t    \n" +
            "\t    <dl class=\"dlnewlist\">\n" +
            "\t    \n" +
            "          <dd><a target=\"_blank\" href=\"http://lib.csdn.net/base/react\"><img src=\"http://img.knowledge.csdn.net/upload/base/1465887837340_340.jpg\" width=\"58\" height=\"58\" alt=\"\"></a></dd>\n" +
            "          <dt>\n" +
            "              <a target=\"_blank\" href=\"http://lib.csdn.net/base/react\" classs=\"title\">React知识库</a>\n" +
            "              <span>\n" +
            "                 <em>3054</em>&nbsp;&nbsp;关注 <i>|</i> <em>393</em>&nbsp;&nbsp;收录                  \n" +
            "              </span>\n" +
            "          </dt>\n" +
            "      \n" +
            "\t    </dl>\n" +
            "\t    \n" +
            "\t    <dl class=\"dlnewlist\">\n" +
            "\t    \n" +
            "          <dd><a target=\"_blank\" href=\"http://lib.csdn.net/base/ai\"><img src=\"http://img.knowledge.csdn.net/upload/base/1479972981201_201.jpg\" width=\"58\" height=\"58\" alt=\"\"></a></dd>\n" +
            "          <dt>\n" +
            "              <a target=\"_blank\" href=\"http://lib.csdn.net/base/ai\" classs=\"title\">人工智能基础知识库</a>\n" +
            "              <span>\n" +
            "                 <em>14935</em>&nbsp;&nbsp;关注 <i>|</i> <em>208</em>&nbsp;&nbsp;收录                  \n" +
            "              </span>\n" +
            "          </dt>\n" +
            "      \n" +
            "\t    </dl>\n" +
            "\t    \n" +
            "\t    <dl class=\"dlnewlist\">\n" +
            "\t    \n" +
            "          <dd><a target=\"_blank\" href=\"http://lib.csdn.net/base/java\"><img src=\"http://img.knowledge.csdn.net/upload/base/1453701371636_636.jpg\" width=\"58\" height=\"58\" alt=\"\"></a></dd>\n" +
            "          <dt>\n" +
            "              <a target=\"_blank\" href=\"http://lib.csdn.net/base/java\" classs=\"title\">Java 知识库</a>\n" +
            "              <span>\n" +
            "                 <em>30842</em>&nbsp;&nbsp;关注 <i>|</i> <em>3747</em>&nbsp;&nbsp;收录                  \n" +
            "              </span>\n" +
            "          </dt>\n" +
            "      \n" +
            "\t    </dl>\n" +
            "\t    \n" +
            "\t  </div>\n" +
            "</div>\n" +
            " \t\t\n" +
            "      \n" +
            "  <div class=\"blog_comment\">\n" +
            "    <h5>评论</h5>\n" +
            "    <a id=\"comments\" name=\"comments\"></a>\n" +
            "    \n" +
            "    \n" +
            "    \n" +
            "  </div>\n" +
            "\n" +
            "  <div class=\"blog_comment\">\n" +
            "    <h5>发表评论</h5>\n" +
            "            <p style=\"text-align:center; margin-top:30px;margin-bottom:0px;\"><a href=\"/login\" style=\"background-color:white;\"> <img src=\"/images/login_icon.png\" style=\"vertical-align:middle; margin-right: 10px;\" /></a><a href=\"/login\">  您还没有登录,请您登录后再发表评论 </a></p>\n" +
            "      </div>\n" +
            "</div>\n" +
            "\n" +
            "\n" +
            "<script type=\"text/javascript\">\n" +
            "  dp.SyntaxHighlighter.HighlightAll('code', true, true);\n" +
            "\n" +
            "  $$('#main .blog_content pre[name=code]').each(function(pre, index){ // blog content\n" +
            "    var post_id = 2034305;\n" +
            "    var location = window.location;\n" +
            "    source_url = location.protocol + \"//\" + location.host + location.pathname + location.search;\n" +
            "    pre.writeAttribute('codeable_id', post_id);\n" +
            "    pre.writeAttribute('codeable_type', \"Blog\");\n" +
            "    pre.writeAttribute('source_url', source_url);\n" +
            "    pre.writeAttribute('pre_index', index);\n" +
            "    pre.writeAttribute('title', '查看java对象在内存中的布局');\n" +
            "  });\n" +
            "\n" +
            "  fix_image_size($$('div.blog_content img'), 700);\n" +
            "\n" +
            "  function processComment() {\n" +
            "    $$('#main .blog_comment > div').each(function(comment){// comment\n" +
            "      var post_id = comment.id.substr(2);\n" +
            "      $$(\"#\"+comment.id+\" pre[name=code]\").each(function(pre, index){\n" +
            "        var location = window.location;\n" +
            "        source_url = location.protocol + \"//\" + location.host + location.pathname + location.search;\n" +
            "        source_url += \"#\" + comment.id;\n" +
            "        pre.writeAttribute('codeable_id', post_id);\n" +
            "        pre.writeAttribute('codeable_type', \"BlogComment\");\n" +
            "        pre.writeAttribute('source_url', source_url);\n" +
            "        pre.writeAttribute('pre_index', index);\n" +
            "        pre.writeAttribute('title', '查看java对象在内存中的布局');\n" +
            "      });\n" +
            "    });\n" +
            "  }\n" +
            "\n" +
            "  function quote_comment(id) {\n" +
            "    new Ajax.Request('/editor/quote', {\n" +
            "      parameters: {'id':id, 'type':'BlogComment'},\n" +
            "      onSuccess:function(response){editor.bbcode_editor.textarea.insertAfterSelection(response.responseText);\n" +
            "        Element.scrollTo(editor.bbcode_editor.textarea.element);}\n" +
            "    });\n" +
            "  }\n" +
            "\n" +
            "  code_favorites_init();\n" +
            "  processComment();\n" +
            "  new WeiboShare({share_buttons: $('share_weibo'), img_scope: $('blog_content')});\n" +
            "</script>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "        </div>\n" +
            "\n" +
            "        <div id=\"local\">\n" +
            "          <div class=\"local_top\"></div>\n" +
            "          <div id=\"blog_owner\">\n" +
            "  <div id=\"blog_owner_logo\"><a href='http://yueyemaitian.iteye.com'><img alt=\"yueyemaitian的博客\" class=\"logo\" src=\"http://www.iteye.com/upload/logo/user/987007/91b7ba9b-b000-37f8-bd1a-24085b031fb5.jpg?1404270292\" title=\"yueyemaitian的博客: 田麦\" width=\"\" /></a></div>\n" +
            "  <div id=\"blog_owner_name\">yueyemaitian</div>\n" +
            "</div>\n" +
            "\n" +
            "          <div id=\"blog_actions\">\n" +
            "            <ul>\n" +
            "              <li>浏览: 203374 次</li>\n" +
            "              <li>性别: <img alt=\"Icon_minigender_1\" src=\"http://www.iteye.com/images/icon_minigender_1.gif?1448702469\" title=\"男\" /></li>\n" +
            "              <li>来自: 杭州</li>\n" +
            "              <li><img src='/images/status/offline.gif'/></li>\n" +
            "              \n" +
            "            </ul>\n" +
            "          </div>\n" +
            "          <div id=\"user_visits\" class=\"clearfix\">\n" +
            "            <h5>最近访客 <span style='font-weight:normal;font-size:12px;padding-left:30px;'><a href=\"/blog/user_visits\">更多访客&gt;&gt;</a></span></h5>\n" +
            "            \n" +
            "              <div class=\"user_visit\">\n" +
            "                <div class=\"logo\"><a href='http://fourwenwen.iteye.com' target='_blank'><img alt=\"FourWenWen的博客\" class=\"logo\" src=\"http://www.iteye.com/images/user-logo-thumb.gif?1448702469\" title=\"FourWenWen的博客: \" width=\"48px\" /></a></div>\n" +
            "                <div class=\"left\"><a href='http://fourwenwen.iteye.com' target='_blank' title='FourWenWen'>FourWenWen</a></div>\n" +
            "              </div>\n" +
            "            \n" +
            "              <div class=\"user_visit\">\n" +
            "                <div class=\"logo\"><a href='http://zuo-qin-bo.iteye.com' target='_blank'><img alt=\"zuo_qin_bo的博客\" class=\"logo\" src=\"http://www.iteye.com/images/user-logo-thumb.gif?1448702469\" title=\"zuo_qin_bo的博客: \" width=\"48px\" /></a></div>\n" +
            "                <div class=\"left\"><a href='http://zuo-qin-bo.iteye.com' target='_blank' title='zuo_qin_bo'>zuo_qin_bo</a></div>\n" +
            "              </div>\n" +
            "            \n" +
            "              <div class=\"user_visit\">\n" +
            "                <div class=\"logo\"><a href='http://j-sun.iteye.com' target='_blank'><img alt=\"J_sun的博客\" class=\"logo\" src=\"http://www.iteye.com/upload/logo/user/1235845/90b062da-7550-3015-b145-f9ac4e62756e-thumb.png?1489040198\" title=\"J_sun的博客: 最笨_人\" width=\"48px\" /></a></div>\n" +
            "                <div class=\"left\"><a href='http://j-sun.iteye.com' target='_blank' title='J_sun'>J_sun</a></div>\n" +
            "              </div>\n" +
            "            \n" +
            "              <div class=\"user_visit\">\n" +
            "                <div class=\"logo\"><a href='http://yunjiechao-163-com.iteye.com' target='_blank'><img alt=\"冰糖葫芦的博客\" class=\"logo\" src=\"http://www.iteye.com/upload/logo/user/1017033/1ecf46b0-143d-39a4-b8c5-8a7a9fbf5392-thumb.jpg?1412400422\" title=\"冰糖葫芦的博客: 冰糖葫芦\" width=\"48px\" /></a></div>\n" +
            "                <div class=\"left\"><a href='http://yunjiechao-163-com.iteye.com' target='_blank' title='冰糖葫芦'>冰糖葫芦</a></div>\n" +
            "              </div>\n" +
            "            \n" +
            "          </div>\n" +
            "\n" +
            "          \n" +
            "\n" +
            "                      <div id=\"blog_menu\">\n" +
            "              <h5>文章分类</h5>\n" +
            "              <ul>\n" +
            "                <li><a href=\"/\">全部博客 (102)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/80014\">java (43)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/80016\">erlang (0)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/85440\">database (8)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/92422\">osgi (1)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/114402\">python (3)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/114403\">perl (2)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/125728\">JavaScript (9)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/179434\">算法 (7)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/180818\">jvm (29)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/184761\">Oracle (7)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/198797\">c (1)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/202802\">面试经历 (5)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/206950\">构建部署 (2)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/220342\">安全 (1)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/264032\">性能优化 (0)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/269558\">协程 (5)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/269604\">asm (4)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/271267\">kilim (4)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/287892\">assembly (2)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/290849\">web服务器 (1)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/291638\">linux (3)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/356761\">比特与原子 (1)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/361776\">docker (3)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/362082\">运维 (2)</a></li>\n" +
            "                \n" +
            "                  <li><a href=\"/category/374459\">golang (0)</a></li>\n" +
            "                \n" +
            "              </ul>\n" +
            "            </div>\n" +
            "            <div id='month_blogs'>\n" +
            "              <h5>社区版块</h5>\n" +
            "              <ul>\n" +
            "                <li><a href=\"/blog/news\">我的资讯</a> (0)</li>\n" +
            "                <li>\n" +
            "                  <a href=\"/blog/post\">我的论坛</a> (44)\n" +
            "                </li>\n" +
            "                <li><a href=\"/blog/answered_problems\">我的问答</a> (0)</li>\n" +
            "              </ul>\n" +
            "            </div>\n" +
            "            <div id=\"month_blogs\">\n" +
            "              <h5>存档分类</h5>\n" +
            "              <ul>\n" +
            "                \n" +
            "                  <li><a href=\"/blog/monthblog/2017-07\">2017-07</a> (1)</li>\n" +
            "                \n" +
            "                  <li><a href=\"/blog/monthblog/2016-12\">2016-12</a> (1)</li>\n" +
            "                \n" +
            "                  <li><a href=\"/blog/monthblog/2016-11\">2016-11</a> (1)</li>\n" +
            "                \n" +
            "                <li><a href=\"/blog/monthblog_more\">更多存档...</a></li>\n" +
            "              </ul>\n" +
            "            </div>\n" +
            "            \n" +
            "            \n" +
            "\n" +
            "            <div id=\"guest_books\">\n" +
            "              <h5>最新评论</h5>\n" +
            "              <ul>\n" +
            "                \n" +
            "                <li>\n" +
            "                  <a href='http://ysyzww.iteye.com' target='_blank' title='ysyzww'>ysyzww</a>： \n" +
            "                  你这么牛逼，你父母知道吗<br />\n" +
            "                  <a href=\"/blog/2032856#bc2390041\">maven使用技巧</a>\n" +
            "                </li>\n" +
            "                \n" +
            "                <li>\n" +
            "                  <a href='http://877867559.iteye.com' target='_blank' title='妖人不要跑'>妖人不要跑</a>： \n" +
            "                     <br />\n" +
            "                  <a href=\"/blog/2078090#bc2384405\">JDK中反序列化对象的过程(ObjectInputStream#readObject)</a>\n" +
            "                </li>\n" +
            "                \n" +
            "                <li>\n" +
            "                  <a href='http://lanhz.iteye.com' target='_blank' title='lanhz'>lanhz</a>： \n" +
            "                  谢楼主，构建成功了<br />\n" +
            "                  <a href=\"/blog/2038304#bc2380865\">Mac OSX 10.9 上build openjdk8和openjdk7</a>\n" +
            "                </li>\n" +
            "                \n" +
            "                <li>\n" +
            "                  <a href='http://skyfar666.iteye.com' target='_blank' title='zqb666kkk'>zqb666kkk</a>： \n" +
            "                  通过了吗  ？？？？？<br />\n" +
            "                  <a href=\"/blog/1387918#bc2375988\">淘宝北京专场java面试题（2011-12-31）</a>\n" +
            "                </li>\n" +
            "                \n" +
            "                <li>\n" +
            "                  <a href='http://yueyemaitian.iteye.com' target='_blank' title='yueyemaitian'>yueyemaitian</a>： \n" +
            "                  walle1027 写道学习了，正式想要的<br />\n" +
            "                  <a href=\"/blog/2033046#bc2368916\">一个对象占用多少字节？</a>\n" +
            "                </li>\n" +
            "                \n" +
            "              </ul>\n" +
            "            </div>\n" +
            "\n" +
            "            <div class=\"local_bottom\"></div>\n" +
            "          \n" +
            "        </div>\n" +
            "        <div style=\"margin-top: 10px;float: left;clear: left;\">\n" +
            "          <script type=\"text/javascript\">\n" +
            "            /*iteye博客内页左侧Button-200*200，创建于2016-08-01*/\n" +
            "            var cpro_id = \"u2720202\";\n" +
            "          </script>\n" +
            "          <script type=\"text/javascript\" src=\"http://cpro.baidustatic.com/cpro/ui/c.js\"></script>\n" +
            "\t\t\t\t</div>\n" +
            "      </div>    \n" +
            "\n" +
            "      <div id=\"footer\" class=\"clearfix\">\n" +
            "        <div id=\"copyright\">\n" +
            "          <hr/>\n" +
            "          声明：ITeye文章版权属于作者，受法律保护。没有作者书面许可不得转载。若作者同意转载，必须以超链接形式标明文章原始出处和作者。<br />\n" +
            "          &copy; 2003-2017 ITeye.com.   All rights reserved.  [ 京ICP证110151号  京公网安备110105010620 ]\n" +
            "        </div>\n" +
            "        <div style=\"position: fixed;bottom:0px;right:0px;line-height:0px;z-index:1000;\">\n" +
            "          <script type=\"text/javascript\"><!--\n" +
            "          google_ad_client = \"ca-pub-8990951720398508\";\n" +
            "          /* iteye博客内页弹窗-300*250 */\n" +
            "          google_ad_slot = \"8267689356/5752063962\";\n" +
            "          google_ad_width = 300;\n" +
            "          google_ad_height = 250;\n" +
            "          //-->\n" +
            "          </script>\n" +
            "          <script type=\"text/javascript\"\n" +
            "                  src=\"//pagead2.googlesyndication.com/pagead/show_ads.js\">\n" +
            "          </script>\n" +
            "        </div>\n" +
            "      </div>\n" +
            "    </div>\n" +
            "    <script type=\"text/javascript\">\n" +
            "  document.write(\"<img src='http://stat.iteye.com/?url=\"+ encodeURIComponent(document.location.href) + \"&referrer=\" + encodeURIComponent(document.referrer) + \"&user_id=' width='0' height='0' />\");\n" +
            "</script>\n" +
            "\n" +
            "<script src=\"http://csdnimg.cn/pubfooter/js/tracking.js?version=20130923164150\" type=\"text/javascript\"></script>\n" +
            "\n" +
            "    \n" +
            "    \n" +
            "    <script language=\"javascript\" type=\"text/javascript\" src=\"http://ads.csdn.net/js/async_new.js\"></script>\n" +
            "<script src=\"http://c.csdnimg.cn/public/common/libs/jquery/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n" +
            "<script type=\"text/javascript\">var $csdn_iteye_jq = jQuery.noConflict();// 解决jq与prototype.js命名空间冲突的问题</script>\n" +
            "<script src=\"http://ads.csdn.net/js/tracking.js\" type=\"text/javascript\"></script>\n" +
            "    \n" +
            "\t    \n" +
            "\t    <script src=\"http://www.iteye.com/javascripts/web-storage-cache.min.js?1461122670\" type=\"text/javascript\"></script>\n" +
            "\t    <script src=\"http://www.iteye.com/javascripts/replace.min.js?1464163307\" type=\"text/javascript\"></script>\n" +
            "    \n" +
            "    \n" +
            "  </body>\n" +
            "</html>\n";
}
