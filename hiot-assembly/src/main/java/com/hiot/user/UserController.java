package com.hiot.user;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return new UserService().hello();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(UserController.class, args);
	}
}
