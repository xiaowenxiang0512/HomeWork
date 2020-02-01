<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
   <%@  taglib  prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--日期插件--><script type="text/javascript" src="/resource/My97DatePicker/WdatePicker.js"></script>
<!--bootstrap的css,js -->
<link rel="stylesheet" href="/resource/bootstrap-4.3.1/css/bootstrap.css"/> 
<script type="text/javascript" src="/resource/bootstrap-4.3.1/js/bootstrap.js"></script> 
<script type="text/javascript" src="/resource/js/jquery-1.8.3.js"></script>
</head>
<body>
	
<form action="list" method="post">

	项目名:<input type="text" name="mhname" value="${mhname}">
	<input type="submit" value="搜索">
	
<div class="table-responsive-xl">
  <table class="table">
  	<tr>
  		<td>
  			<input type="button" value="全选" onclick="qx()">
  			<input type="button" value="全不选" onclick="qbx()">
  		</td>
  		<td>id</td>
  		<td>项目名称</td>
  		<td>投资金融</td>
  		<td>分管领导</td>
  		<td>部门</td>
  		<td>操作
  			<input type="button" value="添加" onclick="add()">
  			<input type="button" value="批删" onclick="delAll(${f.pid})">
  		</td>
  	</tr>
  	<c:forEach items="${list}" var="f">
  	<tr>
  		<td>
  			  	<input type="checkbox" name="cks" value="${f.pid}">
  		</td>
  		<td>${f.pid}</td>
  		<td>${f.pname}</td>
  		<td>${f.amount}</td>
  		<td>${f.manager}</td>
  		<td>${f.dname}</td>
  		<td>
  			<input type="button" value="详情" onclick="xq(${f.pid})">
  			<input type="button" value="更新" onclick="xg(${f.pid})">
  			<input type="button" value="删除" onclick="del(${f.pid})">
  		</td>
  	</tr>
  	</c:forEach>
  	<tr>
  		<td colspan="10">
  			<center>
  			当前是${info.pageNum}/${info.pages}页,共${info.total}条数据
  			<a href="list?pageNum=1&mhname=${mhname}">首页</a>
  			<a href="list?pageNum=${info.prePage}&mhname=${mhname}">上一页</a>
  			<a href="list?pageNum=${info.nextPage}&mhname=${mhname}">下一页</a>
  			<a href="list?pageNum=${info.pages}&mhname=${mhname}">尾页</a>
  			</center>
  		</td>
  	</tr>
  </table>
</div>
</form>
</body>
<script type="text/javascript">

	function xq(pid){
		alert(pid)
		location="xq?pid="+pid;
	}

	function xg(pid){
		alert(pid)
		location="xg?pid="+pid;
	}
	
	function add(){
		location="toadd";
	}
	
	function qx(){
		$("[name='cks']").attr("checked",true);
	}
	
	function qbx(){
		$("[name='cks']").attr("checked",false);
	}
	
	function del(pid){
		if (confirm("确定要删除嘛?"+pid)) {
			location="del?pid="+pid;
		}
	}
	
	
	function delAll(pid){
		var pid = $("[name='cks']:checked").map(function(){
			return this.value;
		}).get().join();
		location="del?pid="+pid;
	}
	
</script>
</html>