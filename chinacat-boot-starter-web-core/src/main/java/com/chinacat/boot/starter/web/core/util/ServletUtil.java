package com.chinacat.boot.starter.web.core.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Slf4j
public class ServletUtil {

    /**
     * 获取当前请求对象
     */
    public static HttpServletRequest getRequest() {
        try {
            return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                    .getRequest();
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.debug("获取当前请求对象错误", e);
            }
        }
        return null;
    }

    /**
     * 获取当前响应对象
     */
    public static HttpServletResponse getResponse() {
        try {
            return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                    .getResponse();
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.debug("获取当前请求对象错误", e);
            }
        }
        return null;
    }

}
