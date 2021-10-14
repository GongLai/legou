package com.hbb.legou.item.controller;

import com.hbb.legou.core.controller.BaseController;
import com.hbb.legou.core.entity.ResponseBean;
import com.hbb.legou.item.entity.SpecGroup;
import com.hbb.legou.item.service.ISpecGroupService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item/group")
@CrossOrigin
public class SpecGroupController extends BaseController<ISpecGroupService, SpecGroup> {

    @ApiOperation(value = "保存规格参数", notes = "保持规格参数")
    @PostMapping("/save-group")
    public ResponseBean saveGroup(@RequestBody List<SpecGroup> specGroupList){
        ResponseBean responseBean = new ResponseBean();
        try {
            if (null != specGroupList && specGroupList.size() > 0){
                service.saveGroup(specGroupList.get(0).getCid(), specGroupList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            responseBean.setSuccess(false);
            responseBean.setMessage("保存失败");
        }
        return responseBean;
    }
}
