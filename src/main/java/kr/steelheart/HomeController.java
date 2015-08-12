package kr.steelheart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
