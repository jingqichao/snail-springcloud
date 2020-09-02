package com.jqc.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //客户端负载均衡工具Ribbon，默认算法轮询
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //Ribbon，7种算法使用
    @Bean
    public IRule myRule(){
        return new RandomRule();//随机算法代替轮询
//        return new RetryRule();//服务宕机后选择其他服务，一直宕机会优先选择其他服务
    }
}
