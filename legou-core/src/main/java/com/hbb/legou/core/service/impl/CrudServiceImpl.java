package com.hbb.legou.core.service.impl;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.hbb.legou.core.dao.ICrudDao;
import com.hbb.legou.core.entity.BaseEntity;
import com.hbb.legou.core.service.ICrudService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

public class CrudServiceImpl<T extends BaseEntity> extends ServiceImpl<ICrudDao<T>, T> implements ICrudService<T> {

    @Override
    public PageInfo<T> listPage(T entity, int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> {
            baseMapper.selectByPage(entity);
        });
    }

    @Override
    public List<T> list(T entity) {
        return getBaseMapper().selectList(Wrappers.emptyWrapper());
    }
}