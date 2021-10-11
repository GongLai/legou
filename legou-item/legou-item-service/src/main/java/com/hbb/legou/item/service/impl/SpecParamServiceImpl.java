package com.hbb.legou.item.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hbb.legou.core.service.impl.CrudServiceImpl;
import com.hbb.legou.item.entity.SpecParam;
import com.hbb.legou.item.service.ISpecParamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecParamServiceImpl extends CrudServiceImpl<SpecParam> implements ISpecParamService {

    @Override
    public List<SpecParam> list(SpecParam entity) {
        QueryWrapper<SpecParam> wrapper = Wrappers.<SpecParam>query();
        // 根据分类id查询规格参数
        if (null != entity.getCid()){
            wrapper.eq("cid", entity.getCid());
        }
        if (null != entity.getSearching()){
            wrapper.eq("searching", entity.getSearching());
        }
        return getBaseMapper().selectList(wrapper);
    }
}
