package com.dubbo.example.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import com.dubbo.example.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoServiceImpl implements DemoService {
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public String sayHello(String name) {
        logger.info("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public String sayHello2(String name) {
        logger.info("Say Hello2 " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Say Hello2 " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
