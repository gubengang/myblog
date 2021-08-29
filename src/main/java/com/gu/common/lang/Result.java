package com.gu.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @author gubengang
 * @create 2021-08-21 8:46
 */
@Data
public class Result implements Serializable {
    private String code;
    private String msg;
    private Object data;

    public static Result success(Object data) {
        Result res = new Result();
        res.setCode("0");
        res.setData(data);
        res.setMsg("操作成功");
        return res;
    }

    public static Result success(String msg, Object data) {
        Result res = new Result();
        res.setCode("0");
        res.setData(data);
        res.setMsg(msg);
        return res;
    }

    public static Result failure(String msg) {
        Result res = new Result();
        res.setCode("-1");
        res.setData(null);
        res.setMsg(msg);
        return res;
    }

    public static Result failure(String msg, Object data) {
        Result res = new Result();
        res.setCode("-1");
        res.setData(data);
        res.setMsg(msg);
        return res;
    }

    public static Result failure(long code,String msg,Object data){
        Result res = new Result();
        res.setCode(String.valueOf(code));
        res.setMsg(msg);
        res.setData(data);
        return res;
    }
}
