package com.hbb.legou.item.controller;

import com.hbb.legou.core.controller.BaseController;
import com.hbb.legou.item.entity.Sku;
import com.hbb.legou.item.service.ISkuService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item/sku")
@CrossOrigin
public class SkuController extends BaseController<ISkuService, Sku> {

}
