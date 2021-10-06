package com.hbb.legou.item.service.impl;

import com.hbb.legou.item.dao.BrandDao;
import com.hbb.legou.item.entity.Brand;
import com.hbb.legou.item.entity.Category;
import com.hbb.legou.item.service.IBrandService;
import com.hbb.legou.core.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BrandServiceImpl extends CrudServiceImpl<Brand> implements IBrandService {

    @Override
    @Transactional(readOnly = false)
    public boolean saveOrUpdate(Brand entity) {
        boolean result = super.saveOrUpdate(entity);

        // 删除商品和分类的关联
        ((BrandDao) getBaseMapper()).deleteCategoryByBrand(entity.getId());

        // 添加商品和分类的关联
        Long[] categoryIds = entity.getCategoryIds();
        if (null != categoryIds) {
            for (Long categoryId : categoryIds) {
                ((BrandDao) getBaseMapper()).insertCategoryAndBrand(categoryId, entity.getId());
            }
        }

        return result;
    }

    @Override
    public List<Category> selectCategoryByBrand(Long id) {
        return ((BrandDao) getBaseMapper()).selectCategoryByBrand(id);
    }
}
