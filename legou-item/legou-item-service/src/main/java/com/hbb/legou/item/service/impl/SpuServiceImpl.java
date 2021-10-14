package com.hbb.legou.item.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hbb.legou.core.service.impl.CrudServiceImpl;
import com.hbb.legou.item.entity.Sku;
import com.hbb.legou.item.entity.Spu;
import com.hbb.legou.item.service.ISkuService;
import com.hbb.legou.item.service.ISpuDetailService;
import com.hbb.legou.item.service.ISpuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SpuServiceImpl extends CrudServiceImpl<Spu> implements ISpuService {

    @Resource
    private ISpuDetailService detailService;
    @Resource
    private ISkuService skuService;

    /**
     * 保存spu数据
     *
     * @param spu spu对象
     */
    @Override
    public void saveSpu(Spu spu) {

        // 保存spu -> spu持久化产生主键属性
        this.saveOrUpdate(spu);
        // 保存spuDetail
        if (null == spu.getSpuDetail().getId()) {  // 主键为空，新增
            spu.getSpuDetail().setId(spu.getId());
            detailService.save(spu.getSpuDetail());
        } else {  // 主键不为空，修改
            detailService.updateById(spu.getSpuDetail());
        }
        // 保存sku
        // 删除当前spu所属的所有sku属性
        skuService.remove(Wrappers.<Sku>query().eq("spu_id", spu.getId()));
        // 依次添加需要保持的sku属性
        for (Sku sku : spu.getSkuList()) {
            sku.setSpuId(spu.getId());
            skuService.save(sku);
        }
    }
}
