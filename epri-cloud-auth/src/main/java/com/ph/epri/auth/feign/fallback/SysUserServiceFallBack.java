package com.ph.epri.auth.feign.fallback;

import com.ph.epri.auth.entity.SysUser;
import com.ph.epri.auth.feign.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author penghui
 * @date 2019/6/14 0014 14:12
 */
@Service
@Slf4j
public class SysUserServiceFallBack implements SysUserService {

    @Override
    public SysUser getUserByName(String username) {
        log.error("获取用户信息失败");
        return null;
    }
}
