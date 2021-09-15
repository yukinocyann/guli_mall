package com.yukino.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yukino.common.utils.PageUtils;
import com.yukino.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author yukino
 * @email 594983498@qq.com
 * @date 2019-10-08 09:36:40
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

