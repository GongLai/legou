package com.hbb.legou.item.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hbb.legou.core.entity.BaseEntity;
import lombok.Data;

@Data
@TableName("spec_param")
public class SpecParam extends BaseEntity {

    private Long cid;
    private Long groupId;
    private String name;
    private Boolean numeric;
    private String unit;
    private Boolean generic;
    private Boolean searching;
    private String segments;
}
