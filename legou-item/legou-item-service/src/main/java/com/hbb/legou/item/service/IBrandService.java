package com.hbb.legou.item.service;

import com.hbb.legou.core.service.ICrudService;
import com.hbb.legou.item.entity.Brand;
import com.hbb.legou.item.entity.Category;

import java.util.List;

public interface IBrandService extends ICrudService<Brand> {

    /**
     * 根据商品id查询分类
     * @param id 商品id
     * @return 查询结果
     */
    List<Category> selectCategoryByBrand(Long id);
}
