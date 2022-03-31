package com.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@Component
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({
	"file:D:\\dev\\workspace\\SpringWork\\WebScore\\WebContent\\WEB-INF\\applicationContext.xml",
	"file:D:\\dev\\workspace\\SpringWork\\WebScore\\WebContent\\WEB-INF\\score-servlet.xml"
})
public class ScoreControllerTest {
	
//	1. Context가 제대로 설정되었는지 확인해보자
	@Autowired
	private WebApplicationContext ctx;
	
//	2. url 확인해보자.
	private MockMvc mockMvc; // 현재 웹페이지에서 url이 제대로 있는지, 동적페이지 등 url 체크
	
//	3. dataSource가 제대로 연결되었는지 확인해보자.
	@Autowired
	private DataSource dataSource;
	
	@Before
	public void setup() {
//		1번 실행 테스트
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void ListTest() {
//		2번 실행 테스트 (실제 url이 있나요)
		try {
			this.mockMvc.perform(MockMvcRequestBuilders.get("/score/list.do"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void InsertTest() {
//		2번 실행 테스트 (실제 url이 있나요)
		try {
			this.mockMvc.perform(MockMvcRequestBuilders.get("/score/insert.do"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void FindTest() {
//		2번 실행 테스트 (실제 url이 있나요)
		try {
			this.mockMvc.perform(MockMvcRequestBuilders.get("/score/find.do"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void UpdateTest() {
//		2번 실행 테스트 (실제 url이 있나요)
		try {
			this.mockMvc.perform(MockMvcRequestBuilders.get("/score/update.do"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void DeleteTest() {
//		2번 실행 테스트 (실제 url이 있나요)
		try {
			this.mockMvc.perform(MockMvcRequestBuilders.get("/score/delete.do"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void MyTest02() {
//		3번 실행 테스트
		assertNotNull(dataSource); // notnull인지 체크, null이면 콘솔에 찍힌다.
		
		try(Connection con = dataSource.getConnection()){
			assertNotNull(dataSource); // notnull인지 체크, null이면 콘솔에 찍힌다.
		}catch(Exception e) {
			fail(e.getMessage());
		}
		
	}
	
	
}
