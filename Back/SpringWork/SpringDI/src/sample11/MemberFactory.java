package sample11;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
public class MemberFactory {
	/*
	 * <bean id="ds"
	 * class="org.springframework.jdbc.datasource.SimpleDriverDataSource"
	 * p:driverClass="com.mysql.cj.jdbc.Driver" p:url=
	 * "jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8&amp;serverTimezone=UTC"
	 * p:username="root" p:password="mcys1309" />
	 */
	@Bean
	public DataSource getDataSource() {
		SimpleDriverDataSource datasource = new SimpleDriverDataSource();
		datasource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
		datasource.setUrl("jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC");
		datasource.setPassword("mcys1309");
		datasource.setUsername("root");
		return datasource;
	}
	
	@Bean
	public MemberDAO getMemberDAO() {
		MemberDAO dao = new MemberDAO();
		dao.setDataSource(getDataSource());
		return dao;
	}
}
