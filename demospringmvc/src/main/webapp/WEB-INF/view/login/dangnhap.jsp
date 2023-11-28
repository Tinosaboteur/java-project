
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng Nhập</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/cssfile/login.css" />
</head>
<body class="background">
    <div class="login-page">
        <div class="form">
            <form class="register-form" href="/demospringmvc/trang-chu">
            <a href="/demospringmvc/dangnhap"><img
				src="https://th.bing.com/th/id/OIP.OdPrzfwvLlG43KMSdAAEYAHaEV?rs=1&pid=ImgDetMain"
				alt="logo trang web" width=auto height="120px"></a>
                <input type="text" placeholder="Tên"/>
                <input type="password" placeholder="Mật khẩu"/>
                <button>Đăng Nhập</button>
                <p class="message">Chưa đăng ký? <a href="/demospringmvc/dangky">Đăng Ký</a></p>
            </form>
        </div>
    </div>
</body>
</html>
