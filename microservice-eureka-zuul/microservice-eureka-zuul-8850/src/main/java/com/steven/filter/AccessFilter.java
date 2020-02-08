package com.steven.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


/**
 * 
 * @Description 自定义访问过滤器
 * @author Steven
 * @date 2020年2月8日 下午4:05:04
 */
public class AccessFilter extends ZuulFilter{

	private Logger logger = Logger.getLogger(AccessFilter.class);
			
	/**
	 * 判断该过滤器是否要被执行
	 */
	public boolean shouldFilter() {
		return true;
	}

	/**
     * 过滤器的具体执行逻辑
     */
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String parameter = request.getParameter("accessToken");
        
        logger.info(request.getRequestURL().toString()+" 请求访问");
        if(parameter==null){
            logger.error("accessToken为空！");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("{\"result\":\"accessToken is empty!\"}");
            return null;
        }
        
        //  token判断逻辑
        logger.info(request.getRequestURL().toString()+" 请求成功");
        return null;
	}

	/**
     * 过滤器的类型 这里用pre，代表会再请求被路由之前执行
     */
	public String filterType() {
		return "pre";
	}

	/**
     * 过滤器的执行顺序
     */
	public int filterOrder() {
		return 0;
	}

}
