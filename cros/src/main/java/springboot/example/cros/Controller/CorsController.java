package springboot.example.cros.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class CorsController {

    @RequestMapping("/cors")
//    @CrossOrigin
    @ResponseBody
    public String src() {

        return "success";
    }

}
