package com.yukino.search.service;

import com.yukino.search.vo.SearchParam;
import com.yukino.search.vo.SearchResult;

/**
 * @author: yukino
 * @date: 2021/3/11 15:22
 */
public interface MallSearchService {

    /**
     * 搜索
     *
     * @param param 检索的所有参数
     * @return 返回检索的结果，里面包含页面需要的所有信息
     */
    SearchResult search(SearchParam param);
}
