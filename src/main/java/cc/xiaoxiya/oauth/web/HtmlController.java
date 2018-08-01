package cc.xiaoxiya.oauth.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zhangxibin on 2018/8/1.
 */
@Controller
public class HtmlController {
    @GetMapping("/tologin")
    public String tologin() {
        return "login";
    }
}
