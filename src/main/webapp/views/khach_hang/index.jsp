<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>hien thi</title>
    <%@page pageEncoding="UTF-8" language="java" %>
</head>
<body>
<sf:form action="/khach-hang/add" modelAttribute="kh" method="post">
    <p>ma khach hang
        <sf:input path="maKh" disabled="true"/>
    </p>
    <p>ma hang
        <sf:select path="hangKhachHang.maHang">
            <sf:options items="${dsHangKH}" itemValue="maHang"/>
        </sf:select>
    </p>
    <p>ten khach hang
        <sf:input path="tenKh"/>
    </p>
    <p>so dien thoai
        <sf:input path="sdt"/>
    </p>
    <p>gioi tinh
        <sf:radiobuttons path="gioiTinh" items="${gioiTinh}"/>
    </p>
    <button type="submit">add</button>
</sf:form>
<table>
    <thead>
    <tr>
        <th>Tên</th>
        <th>sdt</th>
        <th>gioi tinh</th>
        <th>ten hang</th>
        <th>action</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${listKh}" var="k">
        <tr>
            <td>${k.tenKh}</td>
            <td>${k.sdt}</td>
            <td><c:if test="${gioiTinh == 0}">Nam</c:if>
                <c:if test="${gioiTinh == 1}">Nữ</c:if>
            </td>
            <td>${k.hangKhachHang.tenHang}</td>
            <td>
                <a href="/khach-hang/delete/${k.maKh}">xóa</a>
                <a href="/khach-hang/detail/${k.maKh}">sửa</a>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>