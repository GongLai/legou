package com.hbb.legou.item.controller;

import com.hbb.legou.core.controller.BaseController;
import com.hbb.legou.item.entity.SpecParam;
import com.hbb.legou.item.service.ISpecParamService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item/param")
@CrossOrigin
public class SpecParamController extends BaseController<ISpecParamService, SpecParam> {

    @ApiOperation(value = "查询", notes = "根据实体条件查询参数")
    @PostMapping(value = "/select-param-by-entity")
    public List<SpecParam> selectSpecParam(@RequestBody SpecParam specParam){
        return service.list(specParam);
    }
}
