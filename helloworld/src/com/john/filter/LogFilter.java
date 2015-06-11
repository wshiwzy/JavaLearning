package com.john.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LogFilter
 */

public class LogFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public LogFilter() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// 获取客户端ip地址
		String ipAddress = request.getRemoteAddr();
	PrintWriter out =	response.getWriter();
	out.println("IP " + ipAddress + ", Time "
			+ new Date().toString());
		// 输出ip地址及当前时间
		System.out.println("IP " + ipAddress + ", Time "
				+ new Date().toString() + new Date().after(new Date("2/15/2015")));

		// 传递请求道过滤器链
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// 获取初始化参数
		String testParam = fConfig.getInitParameter("test-param");

		// 打印初始化参数
		System.out.println("Test Param: " + testParam);
	}

}
