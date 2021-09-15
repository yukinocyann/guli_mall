package com.yukino.product.feign;


import com.yukino.common.to.es.SkuEsModel;
import com.yukino.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author: yukino
 * @date: 2021/3/13 10:11
 */
@FeignClient("mall-search")
public interface SearchFeignService {

    @PostMapping(value = "/search/save/product")
    R productStatusUp(@RequestBody List<SkuEsModel> skuEsModels);

}
