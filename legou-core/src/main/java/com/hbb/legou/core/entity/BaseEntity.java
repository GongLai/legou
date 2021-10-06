package com.hbb.legou.core.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(value = {"handler"})  // 避免懒加载产生的handler代理属性，在进行json序列化时的异常
public abstract class BaseEntity implements Serializable {

    /**
     * 实体编号（唯一标识）
     */
    @TableId(value = "id", type = IdType.AUTO)
    protected Long id;
}
