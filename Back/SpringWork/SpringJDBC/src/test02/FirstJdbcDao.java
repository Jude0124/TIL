package test02;

import java.util.List;

public interface FirstJdbcDao {
	List<GoodsVo> listGoods();
	GoodsVo findGoods(String code);
	int updateGoods (GoodsVo vo);
	
}
