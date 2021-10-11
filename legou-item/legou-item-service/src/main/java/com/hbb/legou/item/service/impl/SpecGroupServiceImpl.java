package com.hbb.legou.item.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hbb.legou.core.service.impl.CrudServiceImpl;
import com.hbb.legou.item.dao.SpecGroupDao;
import com.hbb.legou.item.dao.SpecParamDao;
import com.hbb.legou.item.entity.SpecGroup;
import com.hbb.legou.item.entity.SpecParam;
import com.hbb.legou.item.service.ISpecGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpecGroupServiceImpl extends CrudServiceImpl<SpecGroup> implements ISpecGroupService {

    @Resource
    private SpecParamDao specParamDao;

    @Override
    public List<SpecGroup> list(SpecGroup entity) {
        return ((SpecGroupDao) getBaseMapper()).selectList(entity);
    }

    @Override
    public void saveGroup(Long cid, List<SpecGroup> groups) {
        // 根据参数cid删除所有规格参数的分组和规格参数
        getBaseMapper().delete(Wrappers.<SpecGroup>query().eq("cid", cid));
        specParamDao.delete(Wrappers.<SpecParam>query().eq("cid", cid));

        // 逐个添加规格参数分组和规格参数
        for (SpecGroup group : groups) {
            getBaseMapper().insert(group);
            for (SpecParam specParam : group.getParams()) {
                specParam.setGroupId(group.getId());
                specParamDao.insert(specParam);
            }
        }
    }
}
