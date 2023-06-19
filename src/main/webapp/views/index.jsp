<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<%@page pageEncoding="UTF-8" language="java" %>
<head>
    <title>Hiển Thị</title>
</head>
<body>
<sf:form action="/phieu-giam-gia/update" modelAttribute="pg" method="post">
    <div>
        <label>Mã</label>
        <sf:input path="maPhieu"/>
    </div>
    <div>
        <label>Tên Phiếu</label>
        <sf:input path="tenPhieu"/>
    </div>
    <div>
        <label>Ngày bắt Đầu</label>
        <sf:input type="date" path="ngayBatDau"/>
    </div>
    <div>
        <label>Ngày kết thúc</label>
        <sf:input type="date" path="ngayKetThuc"/>
    </div>
    <div>
        <label>Giá Trị Giảm</label>
        <sf:input path="giaTriGiam"/>
    </div>
    <div>
        <label>Khách Hàng</label>
        <sf:select path="khachHang">
            <c:forEach items="${listKH}" var="kh">
                <sf:option value="${kh.tenKH}" >${kh.tenKH}</sf:option>
            </c:forEach>
        </sf:select>
    </div>
</sf:form>
<table>
    <thead>
    <tr>
        <th>Mã</th>
        <th>Tên</th>
        <th>Ngày Bắt Đầu</th>
        <th>Ngày Kết Thúc</th>
        <th>Giá Trị Giảm</th>
        <th>Trạng thái</th>
        <th>Tên Khách Hàng</th>
        <th>Chức Năng</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items= "${listPhieu}" var="p">
        <tr>
            <td>${p.maPhieu}</td>
            <td>${p.tenPhieu}</td>
            <td>${p.ngayBatDau}</td>
            <td>${p.ngayKetThuc}</td>
            <td>${p.giaTriGiam}</td>
            <td>${p.giaTriGiamToiDa}</td>
            <td>${p.trangThai == 1 ?"Còn Hạn":"Hết Hạn"}</td>
            <td>${p.khachHang.tenKH}</td>
            <td>
                <a href="/phieu-giam-gia/delete/${p.maPhieu}">Xóa</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>