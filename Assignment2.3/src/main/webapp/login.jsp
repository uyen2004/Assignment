<!DOCTYPE html>
<html lang="en">
<%@ page import="classes.servlet.controller.LoginPage" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<div class="container">
  <div class="row mt-5">
    <div class="col-md-5 m-auto mt-5">
      <h3 class="text-center">Login Page</h3>
      <div class="p-4 border mt-4">
        <form action="http://localhost:8080/login" method="post">
            <div class="form-group">
              <label>Username</label>
              <input type="text" class="form-control" name="username">
            </div>
            <div class="form-group">
              <label>Password</label>
              <input type="password" class="form-control" name="password">
                <p>${message}</p>
            </div>
            <button type="submit" class="btn btn-primary">login</button>
          </form>
      </div>
      </div>
  </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
