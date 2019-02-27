package org.hsu.research.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author times
 * @file GlobalExceptionHandler.java
 * @time 2019/2/21
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String, Object> exceptionHandler(Exception e) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", false);
        map.put("msg", e.getMessage());
        return map;
    }
}
