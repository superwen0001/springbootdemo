package com.github.superwen0001.demo1.core.bean;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

/**
 * Created by wenshiliang on 2017/1/16.
 */
public class Result<T> implements Serializable {
    public static final String SUCCESS = "1";
    public static final String ERROR_404 = "404";
    public static final String ERROR = "500";
    public static final String Error_405 = "405";

    private String code;
    private String desc;
    private T data;

    public T getData() {
        return data;
    }

    public Result(String code, String desc, T data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result() {
    }

    public Result(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String toJsonString(){
        return JSONObject.toJSONString(this, SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteDateUseDateFormat);
    }

}
