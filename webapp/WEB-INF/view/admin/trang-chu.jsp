<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Chủ</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/cssfile/demo.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<link rel="shortcut icon"
	href="https://scontent.xx.fbcdn.net/v/t1.15752-9/346164529_247480751282136_649087972543876077_n.png?stp=dst-png_p403x403&_nc_cat=108&ccb=1-7&_nc_sid=aee45a&_nc_ohc=68B7JUNNoLQAX-lx2KA&_nc_ad=z-m&_nc_cid=0&_nc_ht=scontent.xx&oh=03_AdTHsOcpuf00BkpEXk81ZEN4cojUikII-I3pNUFWTp5BjA&oe=64896273"
	type="image/x-icon">
<style>
body {
  background-color: #262b2b;
  text-align: center;
  color: white;
  font-family: Arial, sans-serif;
}

.grid-container {
	color: black;
  display: grid;
  grid-template-columns: auto auto auto;
  padding: 10px;
  background-color: gray;
  gap: 15px;
}

.grid-item {
  background-color: rgba(255, 255, 255, 0.8);
  border: 1px solid rgba(0, 0, 0, 0.8);
  padding: 20px;
  font-size: 30px;
  text-align: center;
  cursor: pointer;
  border-radius: 10px;
  transition: transform .2s;
}

.grid-item:hover {
  background-color: #4e4e4e;
  color: white;
  transform: scale(1.1);
}
</style>
</head>
<body id="trang-chu">
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
           <form action="#" class="search-form">
  <input id="search-input" type="search" placeholder="Search....">
  <button type="submit">
    <i class="fa-solid fa-magnifying-glass"></i>
  </button>
</form>
        </div>
    </header>	
	
<div class="grid-container">
  <div class="grid-item" onclick="window.location.href='/demospringmvc/admin/trang-chu'">Trang Chủ</div>
  <div class="grid-item" onclick="window.location.href='/demospringmvc/chitietgoitap'">Chi Tiết Gói Tập</div>
  <div class="grid-item" onclick="window.location.href='/demospringmvc/dangkyloptap'">Đăng Ký Lớp Tập</div>  
  <div class="grid-item" onclick="window.location.href='/demospringmvc/giaodich'">Giao Dịch</div>
  <div class="grid-item" onclick="window.location.href='/demospringmvc/khachhang'">Khách Hàng</div>
  <div class="grid-item" onclick="window.location.href='/demospringmvc/nhanvien'">Nhân Viên</div>
  <div class="grid-item" onclick="window.location.href='/demospringmvc/admin/thietbi'">Thiết bị</div>
</div>

<script>
document.querySelector('.search-form').addEventListener('submit', function(e) {
  e.preventDefault();
  var searchValue = document.getElementById('search-input').value.trim().toLowerCase();

  switch(searchValue) {
    case 'thiết bị':
      window.location.href = '/demospringmvc/admin/thietbi';
      break;
    case 'nhân viên':
      window.location.href = '/demospringmvc/nhanvien';
      break;
    case 'khách hàng':
      window.location.href = '/demospringmvc/khachhang';
      break;
    case 'chi tiết gói tập':
        window.location.href = '/demospringmvc/chitietgoitap';
        break;
    case 'đăng ký lớp tập':
        window.location.href = '/demospringmvc/dangkyloptap';
        break;
    case 'giao dịch':
        window.location.href = '/demospringmvc/giaodich';
        break;
    case 'thiết bị':
        window.location.href = '/demospringmvc/admin/thietbi';
        break;
    default:
      alert('Không tìm thấy trang web tương ứng');
  }
});
</script>
</body>
</html>