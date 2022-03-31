package test02;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

//선조인 JdbcDaoSupport의 setDatasource()로 연결
// <property name="dataSource" ref="dataSource" />
public class FirstJdbcDaoImple extends JdbcDaoSupport implements FirstJdbcDao {

	@Override
	public List<GoodsVo> listGoods() {
		return getJdbcTemplate().query("SELECT * FROM GOODSINFO", new MyMapper());
	}

	@Override
	public GoodsVo findGoods(String code) {
		String sql = "SELECT * FROM GOODSINFO WHERE CODE=?";
		return getJdbcTemplate().queryForObject(sql, new MyMapper<GoodsVo>(), new Object[] { code });
	}

	@Override
	public int updateGoods(GoodsVo vo) {
		String update_sql = "UPDATE GOODSINFO SET NAME=?, PRICE=?, MAKER=? WHERE CODE=?";
		return getJdbcTemplate().update(update_sql,
				new Object[] { vo.getName(), vo.getPrice(), vo.getMaker(), vo.getCode()});
	}
	
	class MyMapper<T> implements RowMapper<GoodsVo>{

		@Override
		public GoodsVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			GoodsVo entity = new GoodsVo();
			entity.setCode(rs.getString("CODE"));
			entity.setName(rs.getString("NAME"));
			entity.setPrice(rs.getInt("PRICE"));
			entity.setMaker(rs.getString("MAKER"));
			return entity;
		}
		
	}
}
