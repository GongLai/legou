package com.hbb.legou.item.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hbb.legou.core.entity.BaseTreeEntity;
import lombok.Data;

/**
 * 商品分类
 */
@Data
@TableName("category")
public class Category extends BaseTreeEntity {

    private Boolean isParent = false; //是否为父节点

    @TableField(exist = false)
    private Integer isRoot = 0; //值=1：查询根节点条件

    public String getLabel() { // treeSelect 需要的属性
        return this.getTitle();
    }
}
