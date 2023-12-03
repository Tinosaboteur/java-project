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

	public giaodich addGiaodich(giaodich gd) {
        String sql = "INSERT INTO giaodich (CustomerID, Amount, Description, TransactionDate) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, gd.getCustomerID(), gd.getAmount(), gd.getDescription(), gd.getTransactionDate());
        return gd;
    }

    public giaodich findGiaodich(int id) {
        String sql = "SELECT * FROM giaodich WHERE TransactionID = ?";
        List<giaodich> gds = jdbcTemplate.query(sql, new Mappergiaodich(), id);
        return gds.isEmpty() ? null : gds.get(0);
    }
}
