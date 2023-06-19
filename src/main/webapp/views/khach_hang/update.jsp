<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<sf:form action="/khach-hang/update/${maKh}" modelAttribute="kh" method="post">
    <p>ma khach hang
        <sf:input path="maKh" disabled="true"/>
    </p>
    <p>ma hang
        <sf:select path="hangKhachHang.maHang">
            <sf:options items="${dsHangKH}" itemValue="maHang"/>
        </sf:select>
    </p>
    <p>ten khach hang
        <sf:input  path="tenKh"/>
    </p>
    <p>so dien thoai
        <sf:input path="sdt"/>
    </p>
    <p>gioi tinh
        <sf:radiobuttons path="gioiTinh" items="${gioiTinh}"/>
    </p>
    <button type="submit">uodate</button>
</sf:form>
