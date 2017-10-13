<html>
<body>
<h2>Hello World!</h2>

 <a href="/MavenWebAppToReadParams/MainServlet">Visit MainServlet</a> 
<p>
<br>
<br>
This application was created by following these steps:<br>
<br>
1. In Eclipse: File - New - Maven Project, specify:  maven-archetype-webapp<br>
If you see error "The superclass 'javax.servlet.http.HttpServlet' was not found on the Java Build Path":<br>
then add below maven dependency (in your pom.xml):<br>

<p>&lt;dependency&gt;<br />&nbsp;&nbsp;&nbsp; &lt;groupId&gt;javax.servlet&lt;/groupId&gt;<br />&nbsp;&nbsp;&nbsp; &lt;artifactId&gt;javax.servlet-api&lt;/artifactId&gt;<br />&nbsp;&nbsp;&nbsp; &lt;version&gt;3.1.0&lt;/version&gt;<br />&lt;/dependency&gt;</p>

<br>
If that doesn't help, you can add the servlet-api.jar from your Tomcat's lib directory to your Build Path.<br>
<br>
2. Right-click on your Java Resources / src/main/java folder and select: New - Servlet<br>
<br>In case of errors:<br>
- re-build your project<br>
- add the annotation: @WebServlet   before your class declaration<br>
<br>
3. Override the doGet method<br>
<br>
4. After modifying the servlet, you should do a Project / Clean Project before running it<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>



</body>
</html>
