package com.wangxq.zz.retry;

import com.wangxq.zz.model.RpcResponse;

import java.util.concurrent.Callable;

/**
 * 重试策略
 */
public interface RetryStrategy {
    RpcResponse doRetry(Callable<RpcResponse> callable)throws Exception;
}
