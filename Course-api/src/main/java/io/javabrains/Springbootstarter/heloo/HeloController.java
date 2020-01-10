package io.javabrains.Springbootstarter.heloo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloController {
	
	@RequestMapping("/helo")
	public String sayHi()	{
		
		return "Hi";
	}

}
