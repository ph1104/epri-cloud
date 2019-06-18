package com.ph.epri.auth.image;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.ph.epri.auth.common.CommonConstant.IMAGE_REDIS_KEY;


/**
 * 图形验证码请求controller
 * @author penghui
 * @date 2019/6/3 0003   16:20
 *
 */
@Slf4j
@RestController
public class ImageCodeController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    private ImageCodeGenerator imageCodeGenerator = new ImageCodeGenerator();


    /**
     * 图形验证码生成步骤：
     *
     *   1、根据随机数生成图片
     *
     *   2、将随机数存入到缓存中
     *
     *   3、将生成的图片写入到响应
     */

    @GetMapping("/createImageCode")
    public void createImageCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ImageCode imageCode = imageCodeGenerator.generateCode(request);
        log.info("生成图形验证码：{}",imageCode.getCode());
        //将短信验证码存入redis
        stringRedisTemplate.opsForValue().set(IMAGE_REDIS_KEY + imageCode.getCode(),imageCode.getCode(),3,TimeUnit.MINUTES);
        ImageIO.write(imageCode.getImage(),"JPEG",response.getOutputStream());
    }
}
