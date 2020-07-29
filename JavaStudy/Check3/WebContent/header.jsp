<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="/Check3/CSS/style.css"> -->
</head>
<body>
  <div class="header">
    <label class="login"> login</label>

    <%@ page import="java.util.*,java.text.SimpleDateFormat"%>
      <div class="today">
        <% Date date = new Date();
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
          String formatDate = sdf.format(date);%>
        <%= formatDate %>
     </div>
  </div>
</body>
</html>