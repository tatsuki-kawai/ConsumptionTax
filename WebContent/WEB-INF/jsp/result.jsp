<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Value" %>
<%
Value value = (Value) request.getAttribute("Value");
String valueString = String.valueOf(value.getValue());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果画面</title>
</head>
<body>
<p><%= valueString %>円(税込み)</p>
<a href="/ConsumptionTax/">戻る</a>
</body>
</html>