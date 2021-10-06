package com.hbb.legou.core.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 树状结构实体类父类
 */
@Data
@JsonIgnoreProperties(value = {"handler"}) //避免懒加载，json转换报错
public class BaseTreeEntity extends BaseEntity{

    @TableField("order_")
    private Integer order; //排序字段
    @TableField("parent_id")
    private Long parentId; //父节点id
    @TableField("title")
    private String title; //节点名称
    @TableField("expand")
    private Boolean expand = false; //是否展开节点

}
