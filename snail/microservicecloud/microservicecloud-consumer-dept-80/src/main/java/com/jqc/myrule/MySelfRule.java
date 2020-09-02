package com.jqc.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//自定义的负载均衡Ribbon算法
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();//随机算法代替轮询
    }
}
