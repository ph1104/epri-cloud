package com.ph.epri.auth.feign;

import com.ph.epri.auth.entity.SysUser;
import com.ph.epri.auth.feign.fallback.SysUserServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author penghui
 * @date 2019/6/14 0014 14:10
 */
@FeignClient(name = "epri-cloud-rabc",fallback = SysUserServiceFallBack.class)
public interface SysUserService {

    @GetMapping("/user/getUserByName")
    SysUser getUserByName(@RequestParam("username") String username);
}
