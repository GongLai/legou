package com.hbb.legou.core.service;

import com.github.pagehelper.PageInfo;
import com.hbb.legou.core.entity.BaseEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ICrudService <T extends BaseEntity> extends IService<T> {

    PageInfo<T> listPage(T entity, int pageNum, int pageSize);

    List<T> list(T entity);

}