package azvasa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import azvasa.model.User;

@Controller
public class NavigationController {

    @RequestMapping("/signup")
    public String fetchSignUpPage(){
        return "signup";
    }
    @RequestMapping("/")
    public String mainPage() {
    	return "index";
    }
    @RequestMapping("/about")
    public String aboutPage() {
    	return "about";
    }
    @RequestMapping("/login")
    public String loginPage() {
    	return "login";
    }
    @RequestMapping(value ="/dashboard", method=RequestMethod.POST)
	public String checkLoggedInUser(@ModelAttribute User user, Model model, HttpServletRequest req) {
    	System.out.println(user.getUserName());
    	System.out.println(user.getPassword());
    	if(user.getUserName().equals("admin") && user.getPassword().equals("password")) {
    		return "dashboard";
    	}
    	else return "error";
    }
}
