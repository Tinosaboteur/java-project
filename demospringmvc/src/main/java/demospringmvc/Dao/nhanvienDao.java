package demospringmvc.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import demospringmvc.Entity.Mappernhanvien;
import demospringmvc.Entity.nhanvien;

@Repository
public class nhanvienDao {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public List<nhanvien> GetDatanhanvien(){
		List<nhanvien> list = new ArrayList<nhanvien>();
		String sql = "SELECT * FROM nhanvien";
		list = jdbcTemplate.query(sql, new Mappernhanvien());
		return list;
	}
}

