
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/NewCss.css">
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/bootstrap.css" type="text/css">
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
</head>
<body>
<div class="container">
    <div class="panel-body" style="width: 700px; padding: 20px 20px; background: #cccccc">
        <div class="panel panel-primary"  >
            <form method="post" class="form-horizontal">
                <div class="form-group">
                    <label class="control-label">ProductName</label>
                    <input class="form-control" type="text" name="productName" value="${product.getProductName()}" placeholder="${product.getProductName()}">
                </div>
                <div class="form-group">
                    <label class="control-label">Price</label>
                    <input class="form-control" type="text" name="price" placeholder="${product.getPrice()}">

                <input type="submit" value="Save">
            </form>
        </div>
    </div>
</div>
</div>
</body>
</html>
