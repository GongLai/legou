package com.hbb.legou.item.service;

import com.hbb.legou.core.service.ICrudService;
import com.hbb.legou.item.entity.Spu;

public interface ISpuService extends ICrudService<Spu> {

    /**
     * 保存spu数据
     * @param spu spu对象
     */
    void saveSpu(Spu spu);
}
