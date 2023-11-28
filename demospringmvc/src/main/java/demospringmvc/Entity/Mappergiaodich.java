package demospringmvc.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Mappergiaodich implements RowMapper<giaodich>{
	public giaodich mapRow(ResultSet rs, int rowNum) throws SQLException{
		giaodich giaodich = new giaodich();
		giaodich.setTransactionID(rs.getInt("TransactionID"));
		giaodich.setCustomerID(rs.getInt("CustomerID"));
		giaodich.setAmount(rs.getInt("Amount"));
		giaodich.setDescription(rs.getString("Description"));
		giaodich.setTransactionDate(rs.getDate("TransactionDate"));

		return giaodich;
	}
}
