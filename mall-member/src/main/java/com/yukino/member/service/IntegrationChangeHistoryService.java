package com.yukino.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yukino.common.utils.PageUtils;
import com.yukino.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author yukino
 * @email 594983498@qq.com
 * @date 2019-10-08 09:47:05
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

