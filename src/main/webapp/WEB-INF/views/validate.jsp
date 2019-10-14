<%--
  Created by IntelliJ IDEA.
  User: 于锦江
  Date: 2019/6/25
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>validate</title>
</head>
<body>
<form action="/role/annotation.do">
    <table>
        <tr>
            <td>产品编号</td>
            <td><input name="productId" id="productId"/></td>
        </tr>
        <tr>
            <td>用户编号</td>
            <td><input name="userId" id="userId" /></td>
        </tr>
        <tr>
            <td>交易日期</td>
            <td><input name="date" id="date"/></td>
        </tr>
        <tr>
            <td>价格</td>
            <td><input name="price" id="price" /></td>
        </tr>
        <tr>
            <td>数量</td>
            <td><input name="quantity" id="quantity" /></td>
        </tr>
        <tr>
            <td>交易金额</td>
            <td><input name="amount" id="amount" /></td>
        </tr>
        <tr>
            <td>用户邮箱</td>
            <td><input name="email" id="email" /></td>
        </tr>
        <tr>
            <td>备注</td>
            <td><input name="note" id="note" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="提交"/></td>
        </tr>
    </table>
</form>
</body>
</html>
