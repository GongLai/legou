package com.hbb.legou.core.dao;

import com.hbb.legou.core.entity.BaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface ICrudDao<T extends BaseEntity> extends BaseMapper<T> {

    /**
     * 一般要是用动态sql语句查询
     *
     * @param entity 实体类
     * @return 查询结果
     */
    List<T> selectByPage(T entity);

}
