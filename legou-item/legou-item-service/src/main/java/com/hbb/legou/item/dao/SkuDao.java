package com.hbb.legou.item.dao;

import com.hbb.legou.core.dao.ICrudDao;
import com.hbb.legou.item.entity.Sku;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SkuDao extends ICrudDao<Sku> {

    @Select("SELECT * FROM `sku` WHERE spu_id=#{skuId}")
    List<Sku> findBySkuId(Integer skuId);
}
