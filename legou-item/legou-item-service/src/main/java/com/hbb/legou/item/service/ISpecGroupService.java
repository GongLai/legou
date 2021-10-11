package com.hbb.legou.item.service;

import com.hbb.legou.core.service.ICrudService;
import com.hbb.legou.item.entity.SpecGroup;

import java.util.List;

public interface ISpecGroupService extends ICrudService<SpecGroup> {

    /**
     * 根据前端传递的规格参数列表，保存规格参数
     *
     * @param cid    商品分类id
     * @param groups 规格参数列表
     */
    void saveGroup(Long cid, List<SpecGroup> groups);
}
