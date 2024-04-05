package main.ClassManger3.Controller;

import main.ClassManger3.Entity.CourceEntity;
import main.ClassManger3.Repo.CourceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class NavbarController {

    @Autowired
    private CourceRepo courceRepo;

    @GetMapping("/Dashboerd")
    public String Dashboerd(Model model) {
        // You can add any attributes you need to your model
        return "MediaDash/Dashboerd"; // This will return the "index.html" template
    }

    @GetMapping("/Assignment")
    public String Assignment(Model model) {
        // You can add any attributes you need to your model
        return "MediaDash/ActiveAssignment"; // This will return the "about.html" template
    }

    @GetMapping("/Cources")
    public String Cources(Model model) {
        List<CourceEntity> listCource = courceRepo.findAll();
        model.addAttribute("listCource", listCource);
        
        return "MediaDash/Cources";
    }

    @GetMapping("/Schedule")
    public String Schedule(Model model) {
        // You can add any attributes you need to your model
        return "MediaDash/MySch"; // This will return the "about.html" template
    }

    @GetMapping("/Grades")
    public String Grades(Model model) {
        // You can add any attributes you need to your model
        return "MediaDash/Grades"; // This will return the "contact.html" template
    }

    @GetMapping("/Account")
    public String Account(Model model) {
        // You can add any attributes you need to your model
        return "MediaDash/Account"; // This will return the "contact.html" template
    }

    @GetMapping("/LogOut")
    public String LogOut(Model model) {
        // You can add any attributes you need to your model
        return "MediaMain/LogOut"; // This will return the "contact.html" template
    }
}
