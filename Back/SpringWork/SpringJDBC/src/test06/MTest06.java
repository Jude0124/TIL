package test06;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test06.dao.GoodsDao;

public class MTest06 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test06/applicationContext.xml");
		GoodsDao dao = factory.getBean("test", GoodsDao.class);

		// delete

//		dao.deleteGoods("node.js");
//		List<GoodsVo> allList = dao.listGoods();
//		
//		for (GoodsVo list : allList) {
//			System.out.println(list);
//		}
//		

		System.out.println("==========전체 목록================");
		List<GoodsVo> all = dao.listGoods();
		for (GoodsVo res : all) {
			System.out.println(res);

			System.out.println(res.getName() + "\t" + res.getMaker() + "\t" + res.getPrice() + "\t" + res.getCode());

		}

		System.out.println("==========vo01로 추가한 후 전체 목록================");
		dao.insertGoods(factory.getBean("vo01", GoodsVo.class));
		all = dao.listGoods();
		for (GoodsVo res : all) {
			System.out.println(res);
		}

		System.out.println("==========myname로 삭제한 후 전체 목록================");
		dao.deleteGoods(factory.getBean("myname", String.class));
		List<GoodsVo> allList = dao.listGoods();

		for (GoodsVo list : allList) {
			System.out.println(list);
		}

	}

}
