<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
 
 <head>
 <style>
ul{
background-color:#000;
height:35px;

}
li{
margin-left:15px;
color:#fff;
}

li a:visited{
color:#009999;
}
li hover:{
color:#000f;
}



</style>
</head>

 <body>
 <form action="home">
 <label>
 <input type ="text" placeholder="username" name="user"/><br>
 </labe>
 <label>
  password
  </label>
 <input type="password" palceholder="password" name="pwd"/>
 <input type="submit" value="login"/>
 </form>
<h2>Hello World!</h2>

<ul style="list-style:none; display:flex;">
<li><a href ="#"> Homepage </a></li>
<li><a href ="Aboutus"> Aboutus</a></li>
<li><a href ="welcome"> Welcome </a></li>
<li><a href ="dashboard"> Dashboard </a></li>
</ul>

</body>
</html>

