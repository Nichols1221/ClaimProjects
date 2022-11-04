<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/home.css">
<title>Sign In</title>
</head>
<body>

 <div class="flex-display flex-col auto-margin topbar  center-topbar">
        <div class="flex-row flex-display threeq-width center-topbar">
            <div class="third-width flex-display">
                <div class=" half-width flex-display center-topbar">
                    <a href="">Buy</a>
                </div>
                
                
            </div>
            <h1 class="third-width center-text ">
                <a href="/"> Sallys Realty </a>
            </h1>
            <div class="third-width flex-display ">
                <div class="half-width flex-display center-topbar">
                    <a href="">Find an Agent</a>
                </div>
               
               

            </div>
       </div>
    </div>

	<form:form modelAttribute="agent" action="sign-in" method="post">
				<div class="form-group col-md-6">
					<label for="inputName">Username</label>
					<form:input path="username" type="text" class="form-control" id="intputMake" />
				</div>
				<div class="form-group col-md-6">
					<label for="inputName">Password</label>
					<form:input path="password" type="password" class="form-control" id="intputMake" />
				</div>
				<form:button type="submit" class="btn btn-primary">Submit</form:button>
			</form:form>

</body>
</html>