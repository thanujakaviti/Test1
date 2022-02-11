package in.jt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class WelcomeController {

	@GetMapping("/welcome")
	public String displayWelcomeMsg() {
		System.out.println("*****************");
		return "welcome to java techie......!!!!!!";
	}
}
