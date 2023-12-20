package demospringmvc.Dao;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import demospringmvc.Entity.Mapperkhachhang;
import demospringmvc.Entity.khachhang;

@Repository
public class khachhangDao {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public List<khachhang> GetDatakhachhang(){
		List<khachhang> list = new ArrayList<khachhang>();
		String sql = "SELECT * FROM khachhang";
		list = jdbcTemplate.query(sql, new Mapperkhachhang());
		return list;
	}

	public khachhang addKhachhang(khachhang kh) {
        String sql = "INSERT INTO khachhang (Name, Address, PhoneNumber, Email, DateOfBirth, Gender, JoinDate) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, kh.getName(), kh.getAddress(), kh.getPhoneNumber(), kh.getEmail(), kh.getDateOfBirth(), kh.getGender(), kh.getJoinDate());
        return kh;
    }
    public khachhang updateKhachhang(khachhang kh) {
        String sql = "UPDATE khachhang SET Name = ?, Address = ?, PhoneNumber = ?, Email = ?, DateOfBirth = ?,Gender = ?,JoinDate = ?  WHERE CustomerID = ?";
        jdbcTemplate.update(sql, kh.getName(), kh.getAddress(), kh.getPhoneNumber(), kh.getEmail(), kh.getDateOfBirth(), kh.getGender(), kh.getJoinDate(), kh.getCustomerID());
        return kh;
    }

    public List<khachhang> findKhachhang(String name) {
        String sql = "SELECT * FROM khachhang WHERE name = ?";
        List<khachhang> tbs = jdbcTemplate.query(sql, new Mapperkhachhang(), name);
        return tbs;
    }

}
