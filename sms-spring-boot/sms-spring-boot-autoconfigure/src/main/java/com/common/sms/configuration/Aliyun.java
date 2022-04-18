package com.common.sms.configuration;

import lombok.Data;

@Data
public class Aliyun {

    private String signName;

    private String accessKey;

    private String accessSecret;

    private String product;

    private String regionId;

    private String domain;
}
