package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainContoroller {
    @RequestMapping("/sbb")
    @ResponseBody
    public String index(){
        return "https://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@github.com/ehdtndla123/JAVA_STUDY.git";
    }
    @RequestMapping("/")
    public String root(){
        return "redirect:question/list";
    }
}
