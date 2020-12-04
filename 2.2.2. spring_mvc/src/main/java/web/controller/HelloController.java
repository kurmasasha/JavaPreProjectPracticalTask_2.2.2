package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/hello")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.3.1 version by december'2020 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/bye")
	public String printBye(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Bye-bye!");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}