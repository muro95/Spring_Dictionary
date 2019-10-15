<%--
  Created by IntelliJ IDEA.
  User: alextr
  Date: 10/15/19
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <form action="/dictionary" method="post">
    <fieldset>
      <legend>Dictionary</legend>
      <label>English: </label>
      <input type="text" name="engWord" /><br/>
      <input type="submit" id="submit"/><br/>
      <label>Vietnamese: </label>
      <span>${result}</span>
    </fieldset>
  </form>
  </body>
</html>
