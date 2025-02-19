package com.wangxq.zz.loadbalancer;

import com.wangxq.zz.model.ServiceMetaInfo;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomLoadBalancer implements LoadBalancer{
    private final Random random = new Random();
    @Override
    public ServiceMetaInfo select(Map<String, Object> requestParams, List<ServiceMetaInfo> serviceMetaInfoList) {
        int size = serviceMetaInfoList.size();
        if(size == 0){
            return null;
        }else if(size == 1){
            return serviceMetaInfoList.get(0);
        }
        return serviceMetaInfoList.get(random.nextInt());
    }
}
