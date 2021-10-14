package com.hbb.legou.item.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hbb.legou.core.entity.BaseEntity;
import lombok.Data;

@Data
@TableName("spu_detail")
public class SpuDetail extends BaseEntity {

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    private String description;  // 商品描述
    private String genericSpec;  // 商品特殊规格的名称及可选值模板
    private String specialSpec;  // 商品的全局规格属性
    private String packingList;  // 包装清单
    private String afterService;  // 售后服务
}
