package com.common.sms.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = AliyunSmsProperties.SMS_PREFIX)
public class AliyunSmsProperties {

    public static final String SMS_PREFIX = "sms";

    private boolean enable;

    private Aliyun aliyun;
}
