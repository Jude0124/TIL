package test06.dao;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import test06.GoodsVo;

//매퍼를 클래스로 만들어 연동 @
public interface GoodsMapper {

	@SelectProvider(type=GoodsProvider.class, method ="listGoods")
	public List<GoodsVo> listGoods();

	@InsertProvider(type=GoodsProvider.class, method ="insertGoods")
	public Integer insertGoods(GoodsVo vo); //실제 리턴하는 타입 
	
	@UpdateProvider(type=GoodsProvider.class, method ="updateGoods")
	public Integer updateGoods(GoodsVo vo);
	
	@DeleteProvider(type=GoodsProvider.class, method ="deleteGoods")
	public Integer deleteGoods(String name);
	
	@SelectProvider(type=GoodsProvider.class, method ="findGoods")
	public GoodsVo findGoods(String code);

}
