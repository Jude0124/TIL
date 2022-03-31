package com.test02;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpFilter;


@WebFilter(urlPatterns ="*.jsp", 
    initParams= @WebInitParam(name = "encoding",value = "euc-kr"))
public class FirstFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public FirstFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// 서비스가 종료되기 전에 호출되어 수행된 필터를 소멸하는 기능  
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, 
			            FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		//  요청과 응답객체에 접근할 수 있고 필터 체인 객체에 접근하며 실제 
		// 필터링을 수행하는 메소드 
		if(request.getCharacterEncoding() ==null) {
			 request.setCharacterEncoding(encode);
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	private String encode;
	public void init(FilterConfig fConfig) throws ServletException {
		// 필터가 수행되기 전에 한번 호출되어 지정된 필터 값으로 초기화 
		this.encode  =  fConfig.getInitParameter("encoding");
	}
}

