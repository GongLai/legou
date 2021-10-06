package com.hbb.legou.item.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hbb.legou.core.entity.BaseEntity;
import lombok.Data;

@Data
@TableName("brand")
public class Brand extends BaseEntity {
    @TableField("name")
    private String name;
    @TableField("image")
    private String image;
    @TableField("letter")
    private String letter;

    @TableField(exist = false)
    private Long[] categoryIds; //瞬时属性，品牌所属的分类[1,2,3]
}
