package com.hbb.legou.item.controller;

import com.hbb.legou.core.controller.BaseController;
import com.hbb.legou.core.entity.ResponseBean;
import com.hbb.legou.item.entity.Spu;
import com.hbb.legou.item.service.ISpuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item/spu")
@CrossOrigin
public class SpuController extends BaseController<ISpuService, Spu> {

    @ApiOperation(value = "保存商品信息", notes = "保持商品")
    @PostMapping("/save-spu")
    public ResponseBean saveSpu(@RequestBody Spu spu) throws Exception {
        ResponseBean bean = new ResponseBean();
        try {
            service.saveSpu(spu);
        } catch (Exception e) {
            e.printStackTrace();
            bean.setSuccess(false);
            bean.setMessage("保存失败！");
        }
        return bean;
    }
}
