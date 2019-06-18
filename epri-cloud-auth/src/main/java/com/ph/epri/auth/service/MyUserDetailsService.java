package com.ph.epri.auth.service;


import com.ph.epri.auth.entity.SysUser;
import com.ph.epri.auth.feign.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetailsService implements UserDetailsService {


    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private SysUserService sysUserService;

    /**
     * 自定义用户登录逻辑
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserService.getUserByName(username);
        if(sysUser != null){
            String password = passwordEncoder.encode(sysUser.getPassword());
            return new User(username,password,AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        }else{
            throw new UsernameNotFoundException("用户名或手机号不存在");
        }

    }
}
