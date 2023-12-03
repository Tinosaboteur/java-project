<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Khách Hàng</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/cssfile/demo.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<link rel="shortcut icon"
	href="https://scontent.xx.fbcdn.net/v/t1.15752-9/346164529_247480751282136_649087972543876077_n.png?stp=dst-png_p403x403&_nc_cat=108&ccb=1-7&_nc_sid=aee45a&_nc_ohc=68B7JUNNoLQAX-lx2KA&_nc_ad=z-m&_nc_cid=0&_nc_ht=scontent.xx&oh=03_AdTHsOcpuf00BkpEXk81ZEN4cojUikII-I3pNUFWTp5BjA&oe=64896273"
	type="image/x-icon">
	 <style>
        body {
            font-family: Arial, sans-serif;
        }
        .customer-card {
            width: 300px;
            margin: 0 auto;
            border: 1px solid #ccc;
            border-radius: 5px;
            padding: 20px;
            margin-bottom: 20px;
        }
        label {
            font-weight: bold;
            display: block;
            margin-top: 20px;
        }
        select, input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        input[type="submit"] {
            display: block;
            width: 100%;
            padding: 10px;
            margin-top: 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body id="khachhang">
	<header class="header">
        <div class="address">
            
            <div class="contact">
                <a href="https://www.facebook.com/thongzoke" target="_blank"><i class="fa-brands fa-facebook"></i></a>
                <a href="https://www.instagram.com/phamthong16.7/" target="_blank"><i class="fa-brands fa-instagram"></i></a>
                <a href="https://www.tiktok.com/@phamducthongxoxo" target="_blank"><i class="fa-brands fa-tiktok"></i></a>
            </div>
            <p><i class="fa-solid fa-location-dot"></i>221/3 Quốc Lộ 1K, Linh Xuân, Thủ Đức   <a href="/demospringmvc/dangnhap"><i class='fa-solid fa-power-off fa-lg' style='color:#ffffff'></i></a></p>
        </div>
        <div class="logo">
            <a href="/demospringmvc/admin/trang-chu"><img src="https://th.bing.com/th/id/OIP.OdPrzfwvLlG43KMSdAAEYAHaEV?rs=1&pid=ImgDetMain" alt="logo trang web"></a>
           <form action="/demospringmvc/khachhang/find" method="get" class="search-form">
                <input type="search" placeholder="Search...." id="customerID" name="customerID">
                <button type="submit">
                    <i class="fa-solid fa-magnifying-glass"></i>
                </button>
            </form>
        </div>
    </header>
    <div class="navbar">
		<a href="/demospringmvc/admin/trang-chu">Trang Chủ</a> 
		<a href="/demospringmvc/chitietgoitap">Chi Tiết Gói Tập</a> 
		<a href="/demospringmvc/dangkyloptap">Đăng Ký Lớp Tập</a> 
		<a href="/demospringmvc/giaodich">Giao Dịch</a> 
		<a href="/demospringmvc/khachhang">Khách Hàng</a> 
		<a href="/demospringmvc/nhanvien">Nhân Viên</a> 
		<a href="/demospringmvc/admin/thietbi">Thiết bị</a>
	</div>
	<div class="back-home">
        <a class="home-link" href="/demospringmvc/admin/trang-chu">HOME</a>
        <a class="transaction-link" href="/demospringmvc/khachhang"><h1>Khách Hàng</h1></a>
    </div>
	
	
	<section class="customer-list">
    <c:forEach var="item" items="${khachhang}">
        <div class="customer-card">
            <h2 class="customer-name">Tên khách hàng: ${item.name}</h2>
            <p class="customer-info">Mã khách hàng: <span>${item.customerID}</span></p>
            
			<form action="/demospringmvc/khachhang/update" method="post">
                <input type="hidden" id="customerID" name="customerID" value="${item.customerID}">
                <label for="name">Tên:</label><br>
                <input type="text" id="name" name="name" value="${item.name}"><br>
                <label for="dateOfBirth">Ngày sinh:</label><br>
                <input type="date" id="dateOfBirth" name="dateOfBirth" value="${item.dateOfBirth}"><br>
                <label for="gender">Giới tính:</label><br>
                <input type="text" id="gender" name="gender" value="${item.gender}"><br>
                <label for="phoneNumber">SĐT:</label><br>
                <input type="text" id="phoneNumber" name="phoneNumber" value="${item.phoneNumber}"><br>
                <label for="address">Địa chỉ:</label><br>
                <input type="text" id="address" name="address" value="${item.address}"><br>
                <label for="email">Email:</label><br>
                <input type="text" id="email" name="email" value="${item.email}"><br>
                <input type="date" id="joinDate" name="joinDate" value="${item.joinDate}"><br>
                <input type="submit" value="Cập nhật">
            </form>
        </div>
    </c:forEach>
</section>

</body>
</html>