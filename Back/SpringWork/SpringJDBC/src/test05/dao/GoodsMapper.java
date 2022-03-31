package test05.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import test05.GoodsVo;

//매퍼를 클래스로 만들어 연동 @
public interface GoodsMapper {
	// 리턴 객체를 생성해 주어야 한다.
	@Results({ @Result(property = "code", column = "code"), 
			   @Result(property = "name", column = "name"),
			   @Result(property = "price", column = "price"), 
			   @Result(property = "maker", column = "maker") 
	})

	@Select("select * from goodsinfo")
	public List<GoodsVo> listGoods();

	@Insert("insert into goodsinfo(code,name,price,maker)" + " values(#{code},#{name},#{price},#{maker})")
	public int insertGoods(GoodsVo vo);

	@Update("update goodsinfo " + " set name=#{name}, price=#{price}, maker=#{maker}" + " where code=#{code}")
	public int updateGoods(GoodsVo vo);

	@Delete("delete from goodsinfo where name=#{name}")
	public int deleteGoods(String name);

	@Select("select * from goodsinfo where code=#{code}")
	public GoodsVo findGoods(String code);

}
