package test01;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mysql.cj.protocol.Resultset;

public class FirstJdbcDaoImple extends JdbcDaoSupport implements FirstJdbcDao {

	@Override
	public int insert(String code, String name, int price, String maker) {
		String insert_sql = "insert into goodsinfo(code, name, price, maker) values(?,?,?,?)";

		return getJdbcTemplate().update(insert_sql, new Object[] { code, name, price, maker });

	}

	@Override
	public int delete(String name) { // name으로 받아서 삭제
		String delete_sql = "delete from goodsinfo where goodsinfo.name = ?";

		return getJdbcTemplate().update(delete_sql, new Object[] { name });
	}

	@Override
	public void execute(String sql) {
		getJdbcTemplate().query(sql, new MyMapper<Object>());
	}

	class MyMapper<T> implements RowMapper<T> {

		@Override
		public T mapRow(ResultSet rs, int rowNum) throws SQLException {
			String code = rs.getString("code");
			String name = rs.getString("NAME");
			String maker = rs.getString("MAKER");
			int price = rs.getInt("PRICE");
			System.out.printf("%10s %10s %10d %10s \n", code, name, price, maker);

			return null;
		}

	}
}
