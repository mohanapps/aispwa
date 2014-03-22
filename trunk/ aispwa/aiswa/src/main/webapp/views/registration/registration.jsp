
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreService" %>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreServiceFactory" %>

<%
BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();
%>
<script>
	$(function() {		
		$( "#submitDeal1" ).button();
		$( "#uploadButton1" ).button();
		$( "#dob").datepicker();
									
	})						
</script>

<style type="text/css">
input[type='text'],select{
	width: 400px;
	height: 20px;
	font-size: 15px;
	background: #EFF2F6;
}

input.newdeal_email{
	width: 400px;
	height: 20px;
	font-size: 15px;
	background: #EFF2F6;
}

textarea.newdeal{	
	width: 400px;
	height: 150px;
	font-size: 15px;
	background: #EFF2F6;
}

div.textareadiv  {
	height: 200px;			
}

div.newdeal  {
	
	height: 0.81in;			
}
div.rightdiv {	
	float: right;
	width: 55%;
	
		
}

div.leftdiv {
	float: left;
	width: 45%;

		
}
</style>

<form:form enctype="multipart/form-data" action='<%= blobstoreService.createUploadUrl("/newDeal.do") %>' commandName="newDealCommand">
<div>
	
	
	<div class="leftdiv" >
	
	
	<div class="newdeal">
	<label for="sportList">Sport: <span>*</span>:</label>
	<br>
	<br>
		<select id="sportList">
		<option>FootBall</option>
		<option>Batminton</option>
		</select>
	</div>
	<div class="newdeal">
	<label for="firstName">First Name <span>*</span>:</label>
	<br>
	<br>
	<input  id="firstName" name="First Name" type="text" required/>
	</div>
	
	<div class="newdeal">
	<label for="lastName">Last Name <span>*</span>:</label>
	<br>
	<br>
	<input  id="lastName" name="lastName" type="text" required/>
	</div>
	
	<div class="newdeal">
	<label for="dob">Date of Birth <span>*</span>:</label>
	<br>
	<br>
	<input  id="dob" name="dob" type="text" required/>
	</div>
	
	<div class="newdeal">
	<label for="occupation">Occupation <span>*</span>:</label>
	<br>
	<br>
	<input  id="occupation" name="occupation" type="text" required/>
	</div>
	
	
	
	<div class="newdeal">
	<label for="contactNumber">Contact Number <span>*</span>:</label>
	<br>
	<br>
	<input  id="contactNumber" name="contactNumber" type="text" required/>
	</div>
	
	<div class="newdeal">
	<label for="emailId">Email Id <span>*</span>:</label>
	<br>
	<br>
	<input class="newdeal_email"  id="emailId" name="emailId" type="email" required value="${newDealCommand.emailId}"/>
	</div>
	
	<div class="textareadiv">
		<label for="achievements">Achievements: <span>*</span>:</label>
		<br>
		<br>
		<textarea class="newdeal" id="achievements" name="achievements"></textarea>
		</div>
	
	
	</div>
	
	
	<div class="rightdiv">
		
	
	<div class="newdeal">
		<label for="uploadButton">Image :</label>
		<br>
		<br>
		
		
		<c:choose >
			<c:when test='${newDealCommand.photoImgSrc == null}'>
				<img alt="" src="${pageContext.request.contextPath}/resources/images/image_upload_pic.jpg">	
			</c:when>
			<c:otherwise>
				<img alt="" src="${newDealCommand.photoImgSrc}">
			</c:otherwise>
		</c:choose>
		<br>
		  <form:form  enctype="multipart/form-data"  action='<%= blobstoreService.createUploadUrl("/newDeal.do") %>'>  
			<input id="browseButton" name="multipartFile" type="file" height="30px" />				
			<button id="uploadButton1" name="imgUploadButton" type="submit" >Upload</button>
		 </form:form> 
		</div>
		<br>
		<br>
		<br>
	<div class="newdeal">
	<label for="address1">Address Line1 <span>*</span>:</label>
	<br>
	<br>
	<input   id="address1" name="address1" type="text" required />
	</div>
	
	<div class="newdeal">
	<label for="address2">Address Line2 <span>*</span>:</label>
	<br>
	<br>
	<input   id="address2" name="address2" type="text" required />
	</div>
	
	<div class="newdeal">
	<label for="address3">Address Line3 <span>*</span>:</label>
	<br>
	<br>
	<input   id="address3" name="address3" type="text" required />
	</div>
	
	
	<div class="newdeal">
	<label for="city">City <span>*</span>:</label>
	<br>
	<br>
	<input   id="city" name="city" type="text" required />
	</div>
	
	
	<div class="newdeal">
	<label for="district">District <span>*</span>:</label>
	<br>
	<br>
	<input   id="district" name="district" type="text" required />
	</div>
	
	
	<div class="newdeal">
	<label for="state">State <span>*</span>:</label>
	<br>
	<br>
	<input   id="state" name="city" type="text" required />
	</div>
	
	<div class="newdeal">
	<label for="country">Country <span>*</span>:</label>
	<br>
	<br>
	<input   id="country" name="city" type="text" required />
	</div>
		
		

				
	</div>
	<br style="clear: both;">
	
	

	
</div>
	<div class="newdeal" align="center">
	<button id="submitDeal1">Submit Deal</button>
	</div>
	
	
	







</form:form>




