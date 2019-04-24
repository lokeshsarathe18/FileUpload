<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Photo</title>
</head>
<body>
	<form method="POST" enctype="multipart/form-data" action="Upload">
		<label>File to upload: </label> <input type="file" name="file"
			multiple="multiple"><br />
		<input type="submit" value="Submit">
	</form>
</body>
</html>