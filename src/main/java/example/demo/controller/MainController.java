package example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {
    @GetMapping(value = "/")
    public String home(Model request)
    {
        request.addAttribute("msg","Hello");
        return "index";
    }
}
