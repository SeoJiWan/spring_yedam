<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="/css/home.css">
	<style type="text/css">
		/* Include the padding and border in an element's total width and height */
		* {
		  box-sizing: border-box;
		}
		
		/* Remove margins and padding from the list */
		ul {
		  margin: 0;
		  padding: 0;
		}
		
		/* Style the list items */
		ul li {
		  cursor: pointer;
		  position: relative;
		  padding: 12px 8px 12px 40px;
		  background: #eee;
		  font-size: 18px;
		  transition: 0.2s;
		
		  /* make the list items unselectable */
		  -webkit-user-select: none;
		  -moz-user-select: none;
		  -ms-user-select: none;
		  user-select: none;
		}
		
		/* Set all odd list items to a different color (zebra-stripes) */
		ul li:nth-child(odd) {
		  background: #f9f9f9;
		}
		
		/* Darker background-color on hover */
		ul li:hover {
		  background: #ddd;
		}
		
		/* When clicked on, add a background color and strike out text */
		ul li.checked {
		  background: #888;
		  color: #fff;
		  text-decoration: line-through;
		}
		
		/* Add a "checked" mark when clicked on */
		ul li.checked::before {
		  content: '';
		  position: absolute;
		  border-color: #fff;
		  border-style: solid;
		  border-width: 0 2px 2px 0;
		  top: 10px;
		  left: 16px;
		  transform: rotate(45deg);
		  height: 15px;
		  width: 7px;
		}
		
		/* Style the close button */
		.close {
		  position: absolute;
		  right: 0;
		  top: 0;
		  padding: 12px 16px 12px 16px;
		}
		
		.close:hover {
		  background-color: #f44336;
		  color: white;
		}
		
		/* Style the header */
		.header {
		  background-color: #f44336;
		  padding: 30px 40px;
		  color: white;
		  text-align: center;
		}
		
		/* Clear floats after the header */
		.header:after {
		  content: "";
		  display: table;
		  clear: both;
		}
		
		/* Style the input */
		input {
		  margin: 0;
		  border: none;
		  border-radius: 0;
		  width: 75%;
		  padding: 10px;
		  float: left;
		  font-size: 16px;
		}
		
		/* Style the "Add" button */
		.addBtn {
		  padding: 10px;
		  width: 25%;
		  background: #d9d9d9;
		  color: #555;
		  float: left;
		  text-align: center;
		  font-size: 16px;
		  cursor: pointer;
		  transition: 0.3s;
		  border-radius: 0;
		}
		
		.addBtn:hover {
		  background-color: #bbb;
		}
		
		button {
			border: none;
			background-color: transparent;
		}
	</style>
	
	<!-- jquery -->
  	<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
    crossorigin="anonymous"></script>
	
</head>
<body>
	<div id="myDIV" class="header">
	  <h2>My To Do List</h2>
	  <form action="insert" method="post">
		  <input type="text" id="myInput" name="contents" placeholder="Title...">
		  <button type="submit" class="addBtn">Add</button>
	  </form>
	</div>
	
	<ul id="myUL">
	<c:forEach items="${list }"  var="item">
		<c:if test="${item.todoyn eq '1'}">
		<li class="checked" onclick="update(${item.no}, ${item.todoyn})">
		${item.contents}
			<form action="delete" method="get">
				<input type="hidden" value="${item.no}" name="no">
				<button type="submit" class="close">X</button>
			</form>
		</li>
		</c:if>
		<c:if test="${item.todoyn ne '1'}">
		<li onclick="update(${item.no}, ${item.todoyn})">
		${item.contents}
			<form action="delete" method="get">
				<input type="hidden" value="${item.no}" name="no">
				<button type="submit" class="close">X</button>
			</form>
		</li>
		</c:if>
			
		
	</c:forEach>
	  
	</ul>
	
	<script type="text/javascript">
	function update(no, todoyn) {
		console.log(no)
		$.ajax({
			type: "get",
			url: "update",
			data: {
				no: no,
				todoyn: todoyn
			},
			success: function(data) {
				//console.log("aaa");
				location.reload(); // 컨트롤러에서 리턴은 안먹는건지?
			}
		
		})
	}
	</script>

</body>
</html>
