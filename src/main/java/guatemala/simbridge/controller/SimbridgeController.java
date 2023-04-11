package guatemala.simbridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimbridgeController 
{
    @RequestMapping("/sign-in")
    public String index()
    {
        return "sign-in";
    }
}
