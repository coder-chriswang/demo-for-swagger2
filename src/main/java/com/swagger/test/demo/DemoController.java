package com.swagger.test.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 01482445(wangchao)
 * @version 1.0
 * @date 2019/5/31 13:10
 */
@RestController
@Api(tags = "demo测试", description = "demo测试")
@Slf4j
public class DemoController {

    @ApiOperation(value = "这是一个测试方法")
    @GetMapping("/demo")
    public void test() {
        log.info("hello world");
    }
}
