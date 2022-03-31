package test02;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest02 {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("test02/applicationContext.xml");

		FirstJdbcDao dao = factory.getBean("test", FirstJdbcDao.class);
		List<GoodsVo> list = dao.listGoods();

		for (GoodsVo vo : list) {
			System.out.printf("%10s %10s %10d  %10s \n", vo.getCode(), vo.getName(), vo.getPrice(), vo.getMaker());
		}

		System.out.println("===============================");

		GoodsVo res = dao.findGoods("p0003");
		res.setMaker("111");
		res.setName("Ajax");
		res.setPrice(50000);
		int r = dao.updateGoods(res);
		if (r > 0) {
			List<GoodsVo> update_all= dao.listGoods();
			for (GoodsVo vo : update_all) {
				System.out.printf("%10s %10s %10d  %10s \n", vo.getCode(), vo.getName(), vo.getPrice(), vo.getMaker());
			}
		}

		((ClassPathXmlApplicationContext) factory).close();

	}

}



