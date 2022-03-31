package test05.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import test05.GoodsVo;

@Component("test")
public class GoodsDao {
	// 1. SqlSessionFactory -> 환경설정파일을 통해 config와 mapper 컴파일 및 빌드한다.
	private static SqlSessionFactory factory;
	static {
		try {
			String resource = "test05/mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 2. CRUD를 만들어서 mapper에서 선언된 id로 쿼리를 찬아와서 코드로 맵핑한다.

	public List<GoodsVo> listGoods() { // 전체출력
		List<GoodsVo> all = null;

		try (SqlSession session = factory.openSession()){
			GoodsMapper mapper = session.getMapper(GoodsMapper.class);
			all = mapper.listGoods();
		}
		return all;
	}

	public int insertGoods(GoodsVo vo) {
		int r = 0;
		try (SqlSession session = factory.openSession()) {
			GoodsMapper mapper = session.getMapper(GoodsMapper.class);
			r = mapper.insertGoods(vo);
			if (r > 0) {
				session.commit();
			} else {
				session.rollback();
			}
		}
		return r;
	}

	public int updateGoods(GoodsVo vo) {
		int r = 0;
		try (SqlSession session = factory.openSession()) {
			GoodsMapper mapper = session.getMapper(GoodsMapper.class);
			r = mapper.updateGoods(vo);
			if(r>0) {
				session.commit();
			}else {
				session.rollback();
			}
		}
		return r;
	}

	public int deleteGoods(String name) {
		int r = 0;
		try (SqlSession session = factory.openSession()) {
			GoodsMapper mapper = session.getMapper(GoodsMapper.class);
			r = mapper.deleteGoods(name);
			if(r>0) {
				session.commit();
			}else {
				session.rollback();
			}
		}
		return r;
	}

	public GoodsVo findGoods(String code) {
		GoodsVo vo = null;
		try (SqlSession session = factory.openSession()) {
			GoodsMapper mapper = session.getMapper(GoodsMapper.class);
			vo = mapper.findGoods(code);
		}
		return vo;
	}
}
