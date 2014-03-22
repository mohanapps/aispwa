<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<style>
div.rightdiv {	
	float: right;
	width: 80%;
	overflow: 
	
		
}

div.leftdiv {
	float: left;
	width: 20%;

		
}
</style>
<div id="wrapper">

<div>
<tiles:insertAttribute name="header" />
</div>

<div>
	<div class="leftdiv">
	<tiles:insertAttribute name="menu" />
	</div>
	<div class="rightdiv">
	<tiles:insertAttribute name="body" />
	</div>
</div>

<div>
<tiles:insertAttribute name="footer" />
</div>
</div>