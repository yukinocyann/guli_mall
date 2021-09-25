package com.yukino.search.service;


import com.yukino.common.to.es.SkuEsModel;

import java.io.IOException;
import java.util.List;

/**
 * @author: yukino
 * @date: 2021/3/11 15:22
 */
public interface ProductSaveService {

    boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException;
}
