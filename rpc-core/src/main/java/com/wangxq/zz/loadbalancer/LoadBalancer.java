package com.wangxq.zz.loadbalancer;

import com.wangxq.zz.model.ServiceMetaInfo;

import java.util.Map;
import java.util.List;
/**
 * 负载均衡器（消费端使用）
 */
public interface LoadBalancer {
    /**
     * 选择服务调用
     * @param requestParams 请求参数
     * @param serviceMetaInfoList 可用服务列表
     */
    ServiceMetaInfo select(Map<String,Object> requestParams, List<ServiceMetaInfo> serviceMetaInfoList);

}
