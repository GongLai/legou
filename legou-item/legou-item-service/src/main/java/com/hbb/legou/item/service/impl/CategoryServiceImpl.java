package com.hbb.legou.item.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hbb.legou.core.service.impl.CrudServiceImpl;
import com.hbb.legou.item.service.ICategoryService;
import com.hbb.legou.item.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl extends CrudServiceImpl<Category> implements ICategoryService {

    @Override
    public List<Category> list(Category entity) {
        QueryWrapper<Category> queryWrapper = Wrappers.query();
        if (StringUtils.isNotBlank(entity.getTitle())){
           queryWrapper.like("title", entity.getTitle());
        }
        if (null != entity.getParentId()){
            queryWrapper.eq("parent_id", entity.getParentId());
        }
        if (null != entity.getIsRoot() && entity.getIsRoot().equals(1)){
            queryWrapper.isNull("parent_id");
        }
        return getBaseMapper().selectList(queryWrapper);
    }
}
