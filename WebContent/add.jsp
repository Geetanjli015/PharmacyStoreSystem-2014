<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#datepicker1" ).datepicker({dateFormat:'yy-mm-dd'});
  });
 
  </script>

<title>Insert title here</title>
</head>
<body>
<form action="admin2.html" method="get">

<fieldset> Adding Data </fieldset>

<fieldset>
<legend> Medicine ID
<input type="text" name="medicineID" value=""></legend>
<legend> Medicine Name
<input type="text" name="medicinename" value="">
</legend>
<legend> Company
<input type="text" name="company" value="">
</legend>
<legend> Price
<input type="text" name="price" >
</legend>
<legend> Quantity Available
<input type="text" name="quantity" >
</legend>
<legend> Expiry Date
<input type="text" name="expiryDate" id="datepicker1">
</legend>
</fieldset>
<input type="submit" value="Submit">
<input type="reset" value="Cancel">


</form>

</body>
</html>