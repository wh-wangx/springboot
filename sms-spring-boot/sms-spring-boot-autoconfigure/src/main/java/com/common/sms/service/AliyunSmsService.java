package com.common.sms.service;

import org.springframework.lang.NonNull;

public interface AliyunSmsService {

    /**
     * 发送短信（阿里云）
     * @param phoneNumber   手机号
     * @param signName  阿里云短信签名
     * @param templateNum   阿里云短信模板code
     * @param templateParam json模板参数字符串
     * @return
     */
    boolean sendSms(@NonNull String phoneNumber,
                    @NonNull String signName,
                    @NonNull String templateNum,
                    @NonNull String templateParam);

    /**
     * 获取短信验证码
     * @param digits 几位验证码
     * @return
     */
    String getRandomCode(int digits);

    String getString();
}
