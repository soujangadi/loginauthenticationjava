<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Authors</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/brands.min.css" integrity="sha512-G/T7HQJXSeNV7mKMXeJKlYNJ0jrs8RsWzYG7rVACye+qrcUhEAYKYzaa+VFy6eFzM2+/JT1Q+eqBbZFSHmJQew==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/fontawesome.min.css" integrity="sha512-giQeaPns4lQTBMRpOOHsYnGw1tGVzbAIHUyHRgn7+6FmiEgGGjaG0T2LZJmAPMzRCl+Cug0ItQ2xDZpTmEc+CQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/regular.min.css" integrity="sha512-k2UAKyvfA7Xd/6FrOv5SG4Qr9h4p2oaeshXF99WO3zIpCsgTJ3YZELDK0gHdlJE5ls+Mbd5HL50b458z3meB/Q==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/solid.min.css" integrity="sha512-6mc0R607di/biCutMUtU9K7NtNewiGQzrvWX4bWTeqmljZdJrwYvKJtnhgR+Ryvj+NRJ8+NnnCM/biGqMe/iRA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/svg-with-js.min.css" integrity="sha512-iyaXtrpKz7FIRsICgrvVtq1vkSJT/cfLeXA0sHSQaAs0y3LdqXWlQCXTxM246mTQ/M2qpyVX3A0aRfmTt0LOCQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/v4-font-face.min.css" integrity="sha512-ueEJBIkl0DBM2fA8eS/o12U3l+ZUFn32IUY4jIaTZnNtKR4ktQw3cE/tx/tFIYJuBm4EVT7WUMqIXP1TUN0boA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/v4-shims.min.css" integrity="sha512-SkKgNHAdwXn0lw1CzCwHFpNidxo0GTBZkWWuUHNahSjQZtmeoQYjMvmHe1WYuCT8HystwoBp8fYDfuWD6azryQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="icon" type="image/x-icon" href="images/others/favicon.ico">
  <link rel="stylesheet" href="css/style.css">
<title>E-Library | Add Authors</title>
</head>
<body>
    <div class="container">
        <div class="logo-container">
        <div class="LogoImg">
            <a href="index"><img src="images/others/books.png"/> </a>
        </div>
        
    </div>
    <div class="homepagemenu">
        <ul class="homepagemenuitems">
            <li><a href="#">About</a></li>
            <li><a href="#"><i class="fa fa-phone" aria-hidden="true"></i> Contact</a></li>
            <li><i class="fa fa-user" aria-hidden="true"></i> Admin</li>
            <li><a href="login">Logout <i class="fa fa-sign-out" aria-hidden="true"></i></a></li>
        </ul>
    </div>
    <div id="navbar">
        <a href="bookinventory">Book Inventory</a>
        <a class="active" href="Viewauthor">Authors</a>
        <a href="publicrecords">Publishers</a>
        <a href="userecords">Users</a>
        <a href="lendrequestlist">Request List</a>
        <a href="lentlist">Lent Books</a>
        <a href="lendhistory">Lend/Return History</a>
      </div>
      <div class="content">
        <a href="Viewauthor">Back to Authors List</a>
        <hr/>
        <span class="userfriendly">
            <div style="text-align: center;">
           <h3 style="color: #009999;">Create New Author</h3>
        </div>
        <br/>
           <label>Author Name</label>
           <br/>
           <input type="text" size="50%"/>
           <br/><br/>
           <button class="addauthorbutton" style="vertical-align:middle" onclick="showAlert()"><span>Add Author</span></button>
        </span>
        
    </div>
</div>
<div class="footer">
    Copyrights &copy; Rakuten
</div>
<script>
    function showAlert() {
      alert ("Author added successfully");
    }
    </script>
</body>
</html>

