package com.hbb.legou.item.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hbb.legou.core.entity.BaseEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@TableName("spu")
public class Spu extends BaseEntity {

    private String title;  // 标题
    private String subTitle;  // 子标题
    private Long cid1;  // 1级类目
    private Long cid2;  // 2级类目
    private Long cid3;  // 3级类目
    private Long brandId;  // 品牌id
    private Boolean saleable;  // 是否上架
    private Boolean valid;  // 是否有效，逻辑删除使用
    private Date createTime;  // 创建时间
    private Date lastUpdateTime;  // 最后修改时间

    @TableField(exist = false)
    private SpuDetail spuDetail;  // Spu详情对象。描述、规格参数、SKU参数等
    @TableField(exist = false)
    private List<Sku> skuList;  // spu对应的sku集合
    @TableField(exist = false)
    private String brandName;  // 品牌名称，查询显示
    @TableField(exist = false)
    private String categoryName;  // 分类名称，查询显示
}
