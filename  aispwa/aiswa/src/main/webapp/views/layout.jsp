<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
<table  cellpadding="2" cellspacing="2" align="center" width="80%">
    <tr>
        <td height="90%" width="100%" colspan="2"><tiles:insertAttribute name="header" />
        </td>
    </tr>
    <tr height="100%">
        <td width="10%" ><tiles:insertAttribute name="menu" /></td>
        <td width="80%"><tiles:insertAttribute name="body" /></td>
    </tr>
    <tr>
        <td height="10%" colspan="2"><tiles:insertAttribute name="footer" />
        </td>
    </tr>
</table>
</body>
</html>