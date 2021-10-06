package com.hbb.legou.item.dao;

import com.hbb.legou.core.dao.ICrudDao;
import com.hbb.legou.item.entity.Brand;
import com.hbb.legou.item.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandDao extends ICrudDao<Brand> {

    /**
     * 删除商品和分类关联
     * @param id 商品id
     * @return 删除结果
     */
    int deleteCategoryByBrand(Long id);

    /**
     * 关联商品和分类
     * @param categoryId 分类id
     * @param brandId 商品id
     * @return 关联结果
     */
    int insertCategoryAndBrand(@Param("categoryId") Long categoryId, @Param("brandId") Long brandId);

    /**
     * 查询商品的分类
     * @param id 商品id
     * @return 查询结果
     */
    List<Category> selectCategoryByBrand(Long id);

}