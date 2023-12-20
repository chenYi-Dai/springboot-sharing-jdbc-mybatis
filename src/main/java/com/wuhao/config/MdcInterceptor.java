package com.wuhao.config;

import com.fusionbank.ecif.common.utils.MdcUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Slf4j
public class MdcInterceptor implements HandlerInterceptor {
    private static final String TRACE_ID = "TraceId";
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String traceId = request.getHeader(TRACE_ID);
        if (traceId == null) {
            traceId = UUID.randomUUID().toString().replaceAll("-","");
        }
        log.info("MdcInterceptor preHandle traceId | {}",traceId);
        MDC.put(MdcUtil.TRACE_ID, traceId);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        MDC.remove(MdcUtil.TRACE_ID);
    }
}