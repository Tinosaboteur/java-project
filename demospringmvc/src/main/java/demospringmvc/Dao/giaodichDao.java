package demospringmvc.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import demospringmvc.Entity.Mappergiaodich;
import demospringmvc.Entity.giaodich;

@Repository
public class giaodichDao {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public List<giaodich> GetDatagiaodich(){
		List<giaodich> list = new ArrayList<giaodich>();
		String sql = "SELECT * FROM giaodich";
		list = jdbcTemplate.query(sql, new Mappergiaodich());
		return list;
	}
}
