package com.hbb.legou.item.controller;

import com.hbb.legou.item.entity.Brand;
import com.hbb.legou.item.entity.Category;
import com.hbb.legou.item.service.IBrandService;
import com.hbb.legou.core.controller.BaseController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item/brand")
@CrossOrigin
public class BrandController extends BaseController<IBrandService, Brand> {

    @Override
    public void afterEdit(Brand entity) {
        //得到品牌的所属分类
        List<Category> categories = service.selectCategoryByBrand(entity.getId());
        Long[] ids = new Long[categories.size()];
        for (int i=0; i < categories.size(); i++) {
            ids[i] = categories.get(i).getId();
        }
        entity.setCategoryIds(ids);
    }
}

