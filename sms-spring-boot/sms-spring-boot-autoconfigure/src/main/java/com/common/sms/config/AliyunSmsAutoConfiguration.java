package com.common.sms.config;

import com.common.sms.configuration.AliyunSmsProperties;
import com.common.sms.service.AliyunSmsService;
import com.common.sms.service.impl.AliyunSmsServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = AliyunSmsProperties.class)
@ConditionalOnProperty(prefix = AliyunSmsProperties.SMS_PREFIX, name = "enable", havingValue = "true")
public class AliyunSmsAutoConfiguration {

    @Bean
    public AliyunSmsService getAliyunSmsServiceBean(AliyunSmsProperties aliyunSmsProperties) {
        return new AliyunSmsServiceImpl(aliyunSmsProperties);
    }

}
