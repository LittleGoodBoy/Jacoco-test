package com.yanfuchang.controller;

import com.yanfuchang.bean.Jacoco;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/jacoco")
public class JacocoController {

    @ResponseBody
    @PostMapping(value = "/test", consumes = "application/json")
    public String jacoco(@RequestBody Jacoco jacoco) {
        if ("daling".equals(jacoco.getData())) {
            return "daling";
        } else if ("dalingjia".equals(jacoco.getData())) {
            return "dalingjia";
        } else {
            return "1111111";
        }
    }

    @ResponseBody
    @PostMapping(value = "/test2", consumes = "application/json")
    public String jacoco2(@RequestBody Jacoco jacoco) {
        if ("daling2".equals(jacoco.getData())) {
            return "daling2";
        } else if ("dalingjia2".equals(jacoco.getData())) {
            return "dalingjia2";
        } else {
            return "222222";
        }
    }
}
