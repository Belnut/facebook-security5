package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sample.api.facebook.Facebook;
import sample.api.intra42.Intra42;

@Controller
public class HomeController {

    private Facebook facebook;
    private Intra42 intra42;

    @Autowired
    public HomeController(Facebook facebook, Intra42 intra42) {
        this.facebook = facebook;
        this.intra42 = intra42;
    }

    @GetMapping("/facebook")
    public String facebookInfo(Model model) {
        model.addAttribute("profile", facebook.getProfile());
        model.addAttribute("feed", facebook.getFeed());
        return "facebook_info";
    }

    @GetMapping("/intra42")
    public String intra42Info(Model model) {
        model.addAttribute("profile", intra42.getProfile());
        model.addAttribute("feed", null);
        return "intra42_info";
    }

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

}
