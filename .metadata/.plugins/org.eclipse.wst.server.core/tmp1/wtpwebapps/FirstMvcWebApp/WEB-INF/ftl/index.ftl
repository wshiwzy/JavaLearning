<html>
<head><title>FreeMarker Spring MVC Hello World</title>
<body>
	<div id="header">
	<H2>
	    FreeMarker Spring MVC Hello World
	</H2>
	</div>
	<ul>
	 	<#list employees as employee>
	 		<#if employee.name == "zywu">
	 			<li><b>name:${employee.name}</b></li>
	 			<#else>
	 			<li>name:${employee.name?upper_case}</li>
	 		</#if>
	 		<li>age:${employee.age}</li>
	 		<li>enable:${employee.enable?string("enable","disable")}</li>
	 		<li>address:${employee.address}</li>
	 		<li>tel:${employee.tel}</li>
	 		<p></P> 				
	 	</#list>
 	</ul>
</html>
	