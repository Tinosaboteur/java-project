package demospringmvc.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import demospringmvc.Entity.Mapperdangkiloptap;
import demospringmvc.Entity.dangkiloptap;

@Repository
public class dangkiloptapDao {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public List<dangkiloptap> GetDatadangkiloptap(){
		List<dangkiloptap> list = new ArrayList<dangkiloptap>();
		String sql = "SELECT * FROM dangkiloptap";
		list = jdbcTemplate.query(sql, new Mapperdangkiloptap());
		return list;
	}
}
