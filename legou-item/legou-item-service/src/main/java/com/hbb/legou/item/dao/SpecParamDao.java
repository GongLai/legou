package com.hbb.legou.item.dao;

import com.hbb.legou.core.dao.ICrudDao;
import com.hbb.legou.item.entity.SpecParam;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SpecParamDao extends ICrudDao<SpecParam> {

    @Select("SELECT * FROM spec_param WHERE group_id=#{groupId}")
    List<SpecParam> findByGroupId(Integer groupId);
}
