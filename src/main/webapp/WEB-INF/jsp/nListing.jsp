<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/home.css">
<title>Create New Listing</title>
</head>
<body>

			<form:form modelAttribute="listings" action="newListing" method="post">
				<div class="form-group col-md-6">
					<label for="inputName">City</label>
					<form:input path="city" type="text" class="form-control" id="intputMake" />
				</div>
				<div class="form-group col-md-6">
					<label for="inputName">State</label>
					<form:input path="state" type="text" class="form-control" id="intputMake" />
				</div>
				<div class="form-group col-md-6">
					<label for="inputName">Price</label>
					<form:input path="price" type="text" class="form-control" id="intputMake" />
				</div>
				<div class="form-group col-md-6">
					<label for="inputName">Todays date</label>
					<form:input path="date" type="text" class="form-control" id="intputMake" />
				</div>
				<div class="form-group col-md-6">
					<label for="inputName">Square feet</label>
					<form:input path="squareFeet" type="text" class="form-control" id="intputMake" />
				</div>
				<form:button type="submit" class="btn btn-primary">Submit</form:button>
			</form:form>

</body>
</html>