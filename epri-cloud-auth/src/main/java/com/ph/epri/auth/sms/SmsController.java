package com.ph.epri.auth.sms;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.ph.epri.auth.common.CommonConstant.SMS_REDIS_KEY;


/**
 * 短信验证码生成请求controller
 * @author penghui
 * @date 2019/6/3 0003   16:33
 *
 */
@Slf4j
@RestController
public class SmsController {


    private SmsCodeGenerator smsCodeGenerator = new SmsCodeGenerator();

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    /**
     * 短信验证码生成
     *
     *
     *   1、根据规则生成验证码
     *
     *   2、将验证码存入到session中
     *
     *   3、将验证码发送给用户
     */

    @GetMapping("/createSmsCode")
    public void createSmsCode(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletRequestBindingException {

        String smsCode = smsCodeGenerator.generateCode(request);
        String mobile = ServletRequestUtils.getStringParameter(request,"mobile");
        //将短信验证码存入redis
        stringRedisTemplate.opsForValue().set(SMS_REDIS_KEY+mobile,smsCode,3,TimeUnit.MINUTES);

        log.info("调用短信服务商发送短信：手机号{}，验证码{}",mobile,smsCode);
    }
}
