
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<form method="post">
<table class="table table-bordered table-striped">
    <div class="card-body">
        <thead>
        <tr>
            <th>ProductId</th>
            <th>ProductName</th>
            <th>Price</th>
            <th>Action</th>
        </tr>
        <tr>
            <td>${product.getProductId()}</td>
            <td>${product.getProductName()}</td>
            <td>${product.getPrice()}</td>
            <td>
                <button class="btn btn-primary">Delete</button>
            </td>
        </tr>

        </thead>
    </div>
</table>
</form>
</body>
</html>
