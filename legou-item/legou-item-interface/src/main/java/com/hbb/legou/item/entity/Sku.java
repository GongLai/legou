package com.hbb.legou.item.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hbb.legou.core.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
@TableName("sku")
public class Sku extends BaseEntity {

    private Long spuId;  // 所属的spuId外键
    private String title;  // 标题
    private String images;  // 图片
    private Long price;  // 价格
    private String indexes;  // 商品特殊规格的下标
    private String ownSpec;  // 商品特殊规格的键值对
    private Boolean enable;  // 是否有效，逻辑删除用
    private Date createTime;  // 创建时间
    private Date lastUpdateTime;  // 最后修改时间
    private String stock;  // 库存
}
