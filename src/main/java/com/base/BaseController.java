package com.base;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {
    protected Log log = LogFactory.getLog(BaseController.class);

    /**
     * ��װ���쳣�������쳣�׳�ҳ��
     * @param exception
     * @param response
     * @param request
     * @throws IOException
     * @gbq
     */
    @ExceptionHandler(Exception.class)
    // ��Controller������Ӹ�ע�ⷽ������(ע�⣺��ӵ�ĳ��controller��ֻ��Ը�controller������)
    public void exceptionHandler(Exception exception,
            HttpServletResponse response, HttpServletRequest request)
            throws IOException {
        log.error(exception.getMessage(), exception);
        response.sendRedirect(request.getContextPath() + "/jsp/404.jsp");
    }
}