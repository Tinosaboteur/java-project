package demospringmvc.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import demospringmvc.Entity.Mapperchitietgoitap;
import demospringmvc.Entity.chitietgoitap;

@Repository
public class chitietgoitapDao {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public List<chitietgoitap> GetDatachitietgoitap(){
		List<chitietgoitap> list = new ArrayList<chitietgoitap>();
		String sql = "SELECT * FROM chitietgoitap";
		list = jdbcTemplate.query(sql, new Mapperchitietgoitap());
		return list;
	}
}
