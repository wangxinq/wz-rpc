package com.wangxq.zz.registry;
import com.wangxq.zz.config.RegistryConfig;
import com.wangxq.zz.model.ServiceMetaInfo;

import java.util.List;

public interface Registry {
    /**
     * 初始化
     */
    void init(RegistryConfig registryConfig);
    /**
     * 注册服务
     */
    void register(ServiceMetaInfo serviceMetaInfo) throws Exception;
    /**
     * 注销服务
     */
    void unRegister(ServiceMetaInfo serviceMetaInfo);
    /**
     * 服务发现（获取某服务的所有节点，消费端）
     * @param serviceKey 服务键名
     * @return
     */
    List<ServiceMetaInfo> serviceDiscovery(String serviceKey);
    /**
     * 服务销毁
     */
    void destroy();
    /**
     * 心跳检测（服务端）
     */
    void heartBeat();
}
