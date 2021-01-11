package com.banday.vo;

import java.util.HashMap;
import java.util.Map;

public class R extends HashMap<String,Object>{
    public static final String STATUS = "status";
    public static final String MESSAGE = "message";
    public static final String DATA = "data";
    public static final String TOTAL = "total";

    public R(){}

    public R(ResultEnum resultEnum){
        super.put(STATUS,resultEnum.getStatus());
        super.put(MESSAGE,resultEnum.getMessage());
    }

    public static R ok(){
        return new R(ResultEnum.OK);
    }

    public static R ok(Object data){
        R ok = ok();
        ok.put(DATA,data);
        return ok;
    }

    public static R ok(Object data,Long total){
        R ok = ok();
        ok.put(DATA,data);
        ok.put(TOTAL,total);
        return ok;
    }

    public static R error(){
        return new R(ResultEnum.ERROR);
    }

    public static R error(ResultEnum resultEnum){
        return new R(resultEnum);
    }

}
