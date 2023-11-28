package demospringmvc.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import demospringmvc.Entity.Mapperthietbi;
import demospringmvc.Entity.thietbi;

@Repository
public class thietbiDao {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public List<thietbi> GetDatathietbi(){
		List<thietbi> list = new ArrayList<thietbi>();
		String sql = "SELECT * FROM thietbi";
		list = jdbcTemplate.query(sql, new Mapperthietbi());
		return list;
	}
}
