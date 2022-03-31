package test06.dao;

import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

import test06.GoodsVo;

@Component
public class GoodsProvider {
	// 실행 되는 프로바이더의 쿼리문을 리턴하기 때문에 문장열로 리턴한다.
	public String listGoods(){
		return new SQL() {
			{
				SELECT ("CODE, NAME, PRICE, MAKER");
				FROM("GOODSINFO");
			}
			
		}.toString();
	}

	// 형식은 다르지만 위와 같은 기능
	/*
	 * public String listGoods2() { return new
	 * SQL().SELECT("CODE, NAME, PRICE, MAKER").FROM("GOODSINFO").toString(); }
	 */
	public String insertGoods(GoodsVo vo){
		return new SQL() {
			{
				INSERT_INTO("GOODSINFO");
				VALUES("CODE, NAME, PRICE, MAKER","#{code},#{name},#{price},#{maker}");
				
			}
		}.toString();		
	}

	public String updateGoods(GoodsVo vo){
		return new SQL() {
			{
			UPDATE("GOODSINFO");
			SET("NAME=#{name}","PRICE=#{price}", "MAKER=#{maker}");
			WHERE("CODE=#{code}");
			}
		}.toString();
	}
	
	public String deleteGoods(String name){
		return new SQL() {
			{
				DELETE_FROM("GOODSINFO");
				WHERE("NAME=#{name}");
			}
		}.toString();		
	}

	public String findGoods(String code){
		return new SQL() {
			{
				SELECT("*");
				FROM("GOODSINFO");
				WHERE("CODE=#{code}");
			}
		}.toString();		
	}
}
