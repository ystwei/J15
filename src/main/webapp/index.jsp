<html>
<body>
<h2>Hello World!</h2>
<a href="/mvc/hello">HelloWorld</a>
<a href="/mvc2/hello">HelloWorld</a>
<br/>
<a href="/mvc/add/username/weikun/pwd/999">PathVariable传值ֵ</a>
<h2>表单传值</h2>
<form id="form1" name="form1" method="get" action="/mvc/del">
    用户名：<input name="username" id="username1"/>
        <input type="submit" value="提交">
</form>

<br/>
<a href="/mvc/go1/price/100-200">请点击这里</a>
<br/>
<form id="form2" name="form1" method="get" action="/mvc/plan">
    用户名：<input name="username" id="username2"/>
    <input type="submit" value="提交">
</form>

<a href="/mvc/black?sex=m&&id=100">Param</a>
<a href="/mvc/red?sex=m&&sex=f">Param1</a>

<a href="/mvc/green1">Param1</a>



<form name="form1" id="form3" commandName="user3"
      method="post" action="/mvc/blue">
    <input type="text" name="username">

    <input type="submit" value="提交"/>

</form>
<a href="/mvc/orange">Param2</a>

<a href="/mvc/yellow">Param3</a>

<a href="/mvc/pink">Param4</a>

<a href="/mvc/white">Param5</a>
</body>
</html>
