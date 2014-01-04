package com.aicai.core;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AFilter implements Filter {
    ActionExecutor ace;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ace = new ActionExecutor();
        ace.init();
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain arg2) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        // TODO prepare
        // TODO deal
        // ActionExecutor
        ace.execute(request, response);
        // TODO do some clean
    }

    @Override
    public void destroy() {

    }

}
