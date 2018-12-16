package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "city")
public class City implements Serializable {
    @JSONField(serialize = false)
    private Integer id;
    private String code;
    private String name;
    private String provincecode;
}
