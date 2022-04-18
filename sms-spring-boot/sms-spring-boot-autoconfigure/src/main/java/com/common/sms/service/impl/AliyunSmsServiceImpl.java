package com.common.sms.service.impl;

import com.common.sms.configuration.AliyunSmsProperties;
import com.common.sms.service.AliyunSmsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class AliyunSmsServiceImpl implements AliyunSmsService {

    private final AliyunSmsProperties aliyunSmsProperties;

    @Override
    public boolean sendSms(String phoneNumber, String signName, String templateNum, String templateParam) {
        return false;
    }

    @Override
    public String getRandomCode(int digits) {
        return null;
    }

    @Override
    public String getString() {
        return this.aliyunSmsProperties.getAliyun().getDomain();
    }
}
