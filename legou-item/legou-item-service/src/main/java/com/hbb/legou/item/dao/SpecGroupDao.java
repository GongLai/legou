package com.hbb.legou.item.dao;

import com.hbb.legou.core.dao.ICrudDao;
import com.hbb.legou.item.entity.SpecGroup;

import java.util.List;

public interface SpecGroupDao extends ICrudDao<SpecGroup> {

    /**
     * 根据实体条件动态查询规格分组
     * @param specGroup 实体类
     * @return 查询结果
     */
    List<SpecGroup> selectList(SpecGroup specGroup);
}
