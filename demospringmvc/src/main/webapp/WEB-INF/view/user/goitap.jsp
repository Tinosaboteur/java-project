<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gói Tập</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/cssfile/demo.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<link rel="shortcut icon"
	href="https://scontent.xx.fbcdn.net/v/t1.15752-9/346164529_247480751282136_649087972543876077_n.png?stp=dst-png_p403x403&_nc_cat=108&ccb=1-7&_nc_sid=aee45a&_nc_ohc=68B7JUNNoLQAX-lx2KA&_nc_ad=z-m&_nc_cid=0&_nc_ht=scontent.xx&oh=03_AdTHsOcpuf00BkpEXk81ZEN4cojUikII-I3pNUFWTp5BjA&oe=64896273"
	type="image/x-icon">
</head>
<body id="goitap">
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
		<a href="/demospringmvc/user/trang-chu">Trang Chủ</a> 
		<a href="/demospringmvc/goitap">Gói tập</a> 
		<a href="/demospringmvc/lichtap">Lịch tập</a> 
		<a href="/demospringmvc/user/thietbi">Thiết bị</a>
	</div>
	<div class="back-home">
        <a class="home-link" href="/demospringmvc/user/trang-chu">HOME</a>
        <a class="transaction-link" href="/demospringmvc/goitap"><h1>Gói Tập</h1></a>
    </div>
	

	<section class="package-list">
    <c:forEach var="item" items="${goitap}">
        <div class="package-card">
            <h2 class="package-name">${item.name}</h2>
            <img class="package-img" src="${item.img}" alt="${item.name}">
            <p class="package-description">${item.description}</p>
            <p class="package-price">Giá: <span>${item.price} VNĐ</span></p>
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
				<li><a class="trang-chu" 	href="/demospringmvc/user/trang-chu">Trang Chủ</a>             
				<li><a class="goitap" 		href="/demospringmvc/goitap">Gói tập</a>                  
				<li><a class="lichtap" 		href="/demospringmvc/lichtap">Lịch tập</a>                
				<li><a class="thietbi" href="/demospringmvc/user/thietbi">Thiết bị</a>                							
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