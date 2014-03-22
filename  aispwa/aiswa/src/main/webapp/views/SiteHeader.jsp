<head>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<meta charset="ISO-8859-1">
<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		
<style type="text/css">

	div.banner{
		background-image: url("/resources/images/aiswa-banner-green.jpg"); height: 175px;";
		background-repeat: repeat;  
	}
</style>
<style>
	body{
		font: 62.5% "Trebuchet MS", sans-serif;
		margin: 50px;
	}
	.demoHeaders {
		margin-top: 2em;
	}
	#dialog-link {
		padding: .4em 1em .4em 20px;
		text-decoration: none;
		position: relative;
	}
	#dialog-link span.ui-icon {
		margin: 0 5px 0 0;
		position: absolute;
		left: .2em;
		top: 50%;
		margin-top: -8px;
	}
	#icons {
		margin: 0;
		padding: 0;
	}
	#icons li {
		margin: 2px;
		position: relative;
		padding: 4px 0;
		cursor: pointer;
		float: left;
		list-style: none;
	}
	#icons span.ui-icon {
		float: left;
		margin: 0 4px;
	}
	.fakewindowcontain .ui-widget-overlay {
		position: absolute;
	}
	</style>

<LINK REL=StyleSheet HREF="/resources/css/border.css" TYPE="text/css">
<LINK REL=StyleSheet HREF="/resources/css/general.css" TYPE="text/css">


<link href="/resources/css/aiswa/jquery-ui-1.10.4.custom.css" rel="stylesheet">


<script src="/resources/js/jquery-1.10.2.js"></script>
<script src="/resources/js/jquery-ui-1.10.4.custom.js"></script>

<script>
	$(function() {		
		$( "#button" ).button();
		$( "#radioset" ).buttonset();
		$( "#tabs" ).tabs();
		$( "#menu" ).menu();
		
		
	});						
</script>



</head>


<body >


<div class="banner">
 <form action="login.do" method="post">
	<table width="100%">
						<tr>
							<td align="center" width="50%"><h1></h1></td>
							<td align="center" width="50%">
								<table border="0">
									<tr>
									<td >Sign in Account&nbsp;</td>
									
									<td id="radioset" colspan="2">
										
										<input type="radio" id="radio1" name="domain" value="google" required/><label for="radio1" ><img  src="/resources/images/googleW.png" /></label>
										<input type="radio" id="radio2" name="domain" value="yahoo"/><label for="radio2" ><img src="/resources/images/yahooW.png" /></label>
									</td>
									
									
									<!--  <td colspan="2" style="vertical-align: middle;"><img src="/resources/images/googleW.png" />&nbsp;<img src="/resources/images/yahooW.png" />&nbsp;<img src="/resources/images/blogger.png" /></td>-->
									</tr>
									<tr>
									
										<td align="right"><label>Email Id:</label><br>&nbsp;</td>
										<td><input type="email" name="userId" required /><br>&nbsp;</td>
										<td style="vertical-align: top;"><button name="button" id="button" >Login</button></td>
									</tr>

								</table>
							</td>
						</tr>
					</table>
</form>	
</div>




