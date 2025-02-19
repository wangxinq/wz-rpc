package com.wangxq.zz.loadbalancer;
/**
 * 负载均衡器键名常量
 */
public interface LoadBalancerKeys {
    String ROUND_ROBIN = "roundRobin";
    String RANDOM = "random";
    String CONSISTENT_HASH = "consistentHash";
}
