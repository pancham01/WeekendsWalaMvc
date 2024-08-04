package springmvc.io;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String welcome() {
		System.out.println("WelcomeController.welcome()");
		return "indexxx";
	}
	
	
	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		System.out.println("WelcomeController.welcome()");
		return "Login successfully done!!!!!!!!!!!!";
	}
}
