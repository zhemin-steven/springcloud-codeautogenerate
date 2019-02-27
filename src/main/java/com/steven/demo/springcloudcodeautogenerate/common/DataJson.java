package com.steven.demo.springcloudcodeautogenerate.common;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by user on 2018/9/15.
 */
@Getter
@Setter
public class DataJson<T> {

    private Long total;
    private Integer pageSize;
    private Integer pageNumber;
    private T data;
    private Boolean success;
    private String message;
    private String code = "1000";

    public DataJson(){
        super();
    }

    public DataJson(T data){
        super();
        this.data = data;
    }

    public static<T> DataJson ok(T data) {
        return new DataJson<>(data);
    }

}
