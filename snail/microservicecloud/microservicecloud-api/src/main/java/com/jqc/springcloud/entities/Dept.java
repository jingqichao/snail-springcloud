package com.jqc.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {//必须实现序列化

    private Long deptno; //主键
    private String dname;//部门名称
    private String db_source;//来自哪个个数据
}
