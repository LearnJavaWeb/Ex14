<%--
  Created by IntelliJ IDEA.
  User: Thinh
  Date: 1/27/2019
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang chu</title>
</head>
<body>
    <form method="get" action="/translate">
        <fieldset>
            <legend>Dictionary VietNamese</legend>
            <table>
                <tr>
                    <th>Tu Tieng Anh:</th>
                    <td>
                        <input type="text" name="word" size="30" placeholder="Tu Can Tra" />
                    </td>
                </tr>
                <tr>
                    <th></th>
                    <td>
                        <input type="submit" name="search" value="Search" />
                    </td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>
