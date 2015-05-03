package azvasa.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import azvasa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import azvasa.model.User;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Controller
public class NavigationController {

    @Autowired
    UserService userService;

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

    @RequestMapping("/alarms")
    public String showAlarms(Model model,HttpServletRequest request) {

        final Cookie[] cookies = request.getCookies();
        if(cookies!=null)
            for(Cookie cookie:cookies) {
                if (cookie.getName().equals("username")) {
                    if (!model.containsAttribute("username")) {
                        model.addAttribute("username", cookie.getValue());
                    }
                }
            }
        return "alarms";
    }
    @RequestMapping("/signout")
    public void logout(HttpServletRequest req,HttpServletResponse response) throws IOException {
        final List<Cookie> cookies = Arrays.asList(req.getCookies());
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("username")){
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                break;
            }
        }
        response.sendRedirect("/login");
    }
    @RequestMapping(value ="/auth", method=RequestMethod.POST)
	public String checkLoggedInUser(@ModelAttribute User creds, Model model, HttpServletRequest req,HttpServletResponse response) {
    	User user = userService.find(creds.getUserName(),creds.getPassword());
        if(user!=null){
            response.addCookie(new Cookie("username",user.getUserName()));
            model.addAttribute("username",user.getUserName());
            return getDashBoard(model,req,response);
        }
        model.addAttribute("error","No Profile found with given credentials");
        return "login";
    }

    @RequestMapping(value="/dashboard")
    public String getDashBoard(Model model, HttpServletRequest request,HttpServletResponse response){
        final Cookie[] cookies = request.getCookies();
        if(cookies!=null)
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("username")){
                if(!model.containsAttribute("username")){
                    model.addAttribute("username",cookie.getValue());
                }
                return "dashboard";
            }
        }
        return "login";
    }
}
