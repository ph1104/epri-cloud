package com.ph.epri.auth.sms;

import cn.hutool.core.util.RandomUtil;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 * @date 2019/6/3 000316:43
 */
public class SmsCodeGenerator {

    public String generateCode(HttpServletRequest request) {
        String code = RandomUtil.randomNumbers(6);
        return code;

    }
}
