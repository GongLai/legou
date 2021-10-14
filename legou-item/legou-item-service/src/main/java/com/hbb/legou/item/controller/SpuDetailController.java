package com.hbb.legou.item.controller;

import com.hbb.legou.core.controller.BaseController;
import com.hbb.legou.item.entity.SpuDetail;
import com.hbb.legou.item.service.ISpuDetailService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item/spu-detail")
@CrossOrigin
public class SpuDetailController extends BaseController<ISpuDetailService, SpuDetail> {

}
