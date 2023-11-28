<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giao Dịch</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/cssfile/demo.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<link rel="shortcut icon"
	href="https://scontent.xx.fbcdn.net/v/t1.15752-9/346164529_247480751282136_649087972543876077_n.png?stp=dst-png_p403x403&_nc_cat=108&ccb=1-7&_nc_sid=aee45a&_nc_ohc=68B7JUNNoLQAX-lx2KA&_nc_ad=z-m&_nc_cid=0&_nc_ht=scontent.xx&oh=03_AdTHsOcpuf00BkpEXk81ZEN4cojUikII-I3pNUFWTp5BjA&oe=64896273"
	type="image/x-icon">
</head>
<body id="giaodich">
	<header class="header">
        <div class="address">
            
            <div class="contact">
                <a href="https://www.facebook.com/thongzoke" target="_blank"><i class="fa-brands fa-facebook"></i></a>
                <a href="https://www.instagram.com/phamthong16.7/" target="_blank"><i class="fa-brands fa-instagram"></i></a>
                <a href="https://www.tiktok.com/@phamducthongxoxo" target="_blank"><i class="fa-brands fa-tiktok"></i></a>
            </div>
            <p><i class="fa-solid fa-location-dot"></i>221/3 Quốc Lộ 1K, Linh Xuân, Thủ Đức</p>
        </div>
        <div class="logo">
            <a href="/demospringmvc/user/trang-chu"><img src="https://th.bing.com/th/id/OIP.OdPrzfwvLlG43KMSdAAEYAHaEV?rs=1&pid=ImgDetMain" alt="logo trang web"></a>
            <form action="#" class="search-form">
                <input type="search" placeholder="Search....">
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
        <a class="transaction-link" href="/demospringmvc/giaodich"><h1>Giao Dịch</h1></a>
    </div>
	
		<section class="transaction-list">
    <c:forEach var="item" items="${giaodich}">
        <div class="transaction-card">
            <c:forEach var="itemkh" items="${khachhang}">
                <c:if test="${item.customerID == itemkh.customerID}">
                    <p class="transaction-info">Mã khách hàng: <span>${itemkh.customerID}</span></p>
                    <h2 class="customer-name">Tên khách hàng: ${itemkh.name}</h2>
                </c:if>
            </c:forEach>
            
            <p class="transaction-info">Tổng giao dịch: <span>${item.amount}VNĐ</span></p>
            <p class="transaction-info">Chi tiết: <span>${item.description}</span></p>
            <p class="transaction-info">Ngày thực hiện giao dịch: <span>${item.transactionDate}</span></p>
        </div>
    </c:forEach>
</section>

	
	<footer>

		<div class="ttlh">
			<p>Thông Tin Liên Hệ</p>
			<ul>
				<i class="fa-brands fa-facebook" style="color: white;"></i>
				<li><a href="https://www.facebook.com/thongzoke">facebook</a></li>
				<i class="fa-brands fa-instagram"
					style="color: white; margin-left: 5px;"></i>
				<li><a href="https://www.instagram.com/phamthong16.7/">instagram</a></li>
				<i class="fa-brands fa-tiktok"
					style="color: white; margin-left: 5px; margin-right: 10px"></i>
				<li><a href="https://www.tiktok.com/@phamducthongxoxo">tiktok</a></li>
			</ul>
		</div>
		<div class="lk">
			<p>Liên Kết</p>
			<ul>
				<li><a class="trang-chu"  href="/demospringmvc/admin/trang-chu">Trang Chủ</a>            
				<li><a class="chitietgoitap"href="/demospringmvc/chitietgoitap">Chi Tiết gói Tập</a>  
				<li><a class="dangkyloptap" href="/demospringmvc/dangkyloptap">Đăng Ký lớp Tập</a>    
				<li><a class="giaodich" 		href="/demospringmvc/giaodich">Giao Dịch</a> 
				<li><a class="khachhang" 		href="/demospringmvc/khachhang">Khách Hàng</a>  
				<li><a class="nhanvien" 		href="/demospringmvc/nhanvien">Nhân Viên</a>                   
				<li><a class="thietbi" 		href="/demospringmvc/admin/thietbi">Thiết Bị</a>                
			</ul>
		</div>
		<div class="ht">
			<p>Hỗ Trợ</p>
			<ul>
				<li><a href="#">Hướng dẫn mua hàng</a></li>
				<li><a href="#">Hướng dẫn thanh toán</a></li>
				<li><a href="#">Chính sách bảo hành</a></li>
				<li><a href="#">Chính sách đổi trả</a></li>
				<li><a href="#">Tư vấn khách hàng</a></li>
			</ul>
		</div>
		<div class="tudt">
			<p>Tải Ứng Dụng Trên</p>
			<ul>
				<li><a href="#"><i
						class="fa-brands fa-app-store-ios fa-2xl" style="color: #ffffff;"></i></a></li>
				<li><a href="#"><i class="fa-brands fa-google-play fa-2xl"
						style="color: #ffffff;"></i></a></li>
			</ul>
		</div>
	</footer>


</body>
</html>