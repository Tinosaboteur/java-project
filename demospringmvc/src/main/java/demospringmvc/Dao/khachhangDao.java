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
}
