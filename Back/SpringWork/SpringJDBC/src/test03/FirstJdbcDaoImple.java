package test03;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("test")
@Repository
public class FirstJdbcDaoImple implements FirstJdbcDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<GoodsVo> listGoods() {

		return jdbcTemplate.query("SELECT * FROM GOODSINFO", myMapper);
	}

	@Override
	public GoodsVo findGoods(String code) {
		String sql = "SELECT * FROM GOODSINFO WHERE CODE=?";
		return jdbcTemplate.queryForObject(sql, myMapper, new Object[] { code });
	}

	@Override
	public int updateGoods(GoodsVo vo) {
		String update_sql = "UPDATE GOODSINFO SET NAME=?, PRICE=?, MAKER=? WHERE CODE=?";
		return jdbcTemplate.update(update_sql,
				new Object[] { vo.getName(), vo.getPrice(), vo.getMaker(), vo.getCode() });
	}

	private final RowMapper<GoodsVo> myMapper = (rs, rowNum) -> {
		GoodsVo entity = new GoodsVo();
		entity.setCode(rs.getString("CODE"));
		entity.setName(rs.getString("NAME"));
		entity.setPrice(rs.getInt("PRICE"));
		entity.setMaker(rs.getString("MAKER"));
		return entity;
	};
}
