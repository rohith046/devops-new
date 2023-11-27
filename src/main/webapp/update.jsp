<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <style>
        /* Define your CSS styles here */
        body {
            font-family: Arial, sans-serif;
        }
        form {
            margin: 20px;
            padding: 20px;
            border: 1px solid #ccc;
        }
        input[type="number"], input[type="text"] {
            width: 100%;
            padding: 5px;
            margin-bottom: 10px;
        }
        button {
            background-color: #0074D9;
            color: #fff;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <form action="jsp">
        Enter id: <input type="number" name="id" value="<%=request.getParameter("id")%>" readonly="readonly">
        Enter name: <input type="text" name="name" value="<%=request.getParameter("name") %>">
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </form>
</body>
</html>
