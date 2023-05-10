<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/partials/head.jsp">
  <jsp:param name="title" value="Create blog posts" />
</jsp:include>
<body>
<jsp:include page="/partials/navbar.jsp"/>

<div class="container">
  <h1>Create a Blog Post</h1>
  <form action="createPost" method="post">
    <label for="title">Title: </label>
    <input type="text" name="title" id="title"><br>
    <label for="post">Your post</label><br>
    <textarea name="post" id="post" cols="30" rows="10"></textarea>
    <fieldset>
      <legend>Topic:</legend>
      <label for="programming">Programming:</label>
      <input type="checkbox" name="topic" value="programming" id="programming"><br>
      <label for="AI">AI</label>
      <input type="checkbox" name="topic" value="AI" id="AI"><br>
      <label for="Security">Security</label>
      <input type="checkbox" name="topic" value="Security" id="Security"><br>
    </fieldset>
    <input type="submit" value="submit">
  </form>
  <c:if test="${post != null}">
    <h2>Your blog post: </h2>
    <h2>${post.title}</h2>
    <p>${post.post}</p>
    <p>${post.topics}</p>
    <ul>
      <c:forEach var="topic" items="${post.topics}">
        <li>${topic}</li>
      </c:forEach>
    </ul>
  </c:if>
</div>

</body>
</html>
