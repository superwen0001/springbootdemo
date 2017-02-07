package com.github.superwen0001.demo1.core.config;

import com.github.superwen0001.demo1.core.bean.Result;
import com.github.superwen0001.demo1.core.exception.BaseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * Created by wenshiliang on 2017/1/16.
 */
@ControllerAdvice
@ConfigurationProperties(prefix = "spring.profiles")
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    private String active;

    private boolean writeExceptionFlag;


    @ExceptionHandler//处理所有异常
    @ResponseBody //在返回自定义相应类的情况下必须有，这是@ControllerAdvice注解的规定
    public Result exceptionHandler(Exception e, HttpServletResponse response) {
        Result result = null;
        if(e instanceof BaseException){
            LOGGER.error("拦截自定义异常",e);
            result = ((BaseException) e) .getResult();
        }else{
            LOGGER.error("拦截异常", e);
            result = new Result(Result.ERROR,"error");
            if(writeExceptionFlag){
                result.setData(e.toString());
            }
        }
        response.setStatus(500);
        return result;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        LOGGER.info("\n********************************************************\n\nspring.profiles.active=" + active +
                "\n\n********************************************************");
        this.active = active;
        if (active != null) {
            if (Objects.equals(active, "localdev") || Objects.equals(active, "remotetest")) {
                writeExceptionFlag = true;
            }
        }
    }
}
