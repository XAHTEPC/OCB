<!doctype html>
<html lang="en">
<head>
  <title>HTML Document Template</title>
  <style>
    p {
      font-family: Arial;
    }
  </style>
</head>
<body>
  <div>
     <p align="center">Перехват пароля</p>
     <p align="right">Охотников Кирилл</p>
  </div>
<form action="/login" method="post">
   <div align="center">
<p>
<div>
    Логин <input name="login"/>
</div>
</p>
<p>
    <div>
    Пароль <input type="password" name="pass"/>
    </div>
</p>
<input type="submit" value="Войти"/>
</div>
</form>
</body>
</html>