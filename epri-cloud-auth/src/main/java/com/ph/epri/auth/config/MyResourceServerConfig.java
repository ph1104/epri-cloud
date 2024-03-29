package com.ph.epri.auth.config;


import com.ph.epri.auth.handler.MyAuthenticationFailureHandler;
import com.ph.epri.auth.handler.MyAuthenticationSuccessHandler;
import com.ph.epri.auth.image.ImageCodeFilter;
import com.ph.epri.auth.sms.SmsAuthenticationSecurityConfig;
import com.ph.epri.auth.sms.SmsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 *
 * 资源服务器
 * @author penghui
 * @date 2019/6/4 0004   16:13
 *
 */
@Configuration
@EnableResourceServer
public class MyResourceServerConfig extends ResourceServerConfigurerAdapter {

    /**
     * 用来处理密码的加密解密
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


    @Autowired
    private ImageCodeFilter imageCodeFilter;
    @Autowired
    private SmsFilter smsFilter;

    @Autowired
    private MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;
    @Autowired
    private MyAuthenticationFailureHandler myAuthenticationFailureHandler;
    @Autowired
    private SmsAuthenticationSecurityConfig smsAuthenticationSecurityConfig;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.addFilterBefore(smsFilter,UsernamePasswordAuthenticationFilter.class)
                //.addFilterBefore(imageCodeFilter,UsernamePasswordAuthenticationFilter.class)  //将图片验证码过滤器加入到UsernamePassword过滤器之前
                .formLogin()     //表单登录的方式
//              .httpBasic()   //httpBasic的登录方式
                .loginPage("/index.html")      //自定义的登录页面
                .successHandler(myAuthenticationSuccessHandler)
                .failureHandler(myAuthenticationFailureHandler)
                .loginProcessingUrl("/authentication/form")  //表单登录时处理的请求

                .and()
                .authorizeRequests()  //对请求做授权
                .antMatchers("/index.html",
                        "/createImageCode",
                        "/createSmsCode",
                        "/authentication/mobile").permitAll()
                .anyRequest()          //任何请求
                .authenticated()      //都需要权限认证
                .and()
                .csrf().disable()   //跨站请求防护功能关闭
                .apply(smsAuthenticationSecurityConfig);
    }
}
