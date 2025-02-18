package com.wangxq.zz.consumer;

import com.wangxq.zz.config.RpcConfig;
import com.wangxq.zz.utils.ConfigUtils;

public class ConsumerExample {

    public static void main(String[] args) {
        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class, "rpc");
        System.out.println(rpc);
    }
}
