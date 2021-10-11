package com.hbb.legou.item.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hbb.legou.core.entity.BaseEntity;
import lombok.Data;

import java.util.List;

@Data
@TableName("spec_group")
@JsonIgnoreProperties(value = {"handler"})
public class SpecGroup extends BaseEntity {

    private Long cid;
    private String name;

    @TableField(exist = false)
    private List<SpecParam> params;  // 该组下的所有规格参数集合
}
