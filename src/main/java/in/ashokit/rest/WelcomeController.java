package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
	@GetMapping(value="WelcomeUser/{userName}")
	public String WelcomeMsg(@PathVariable String userName)
	{
		String msg=userName+" >> Good morning";
		
		return msg;
	}
	
	
	@GetMapping(value="ByeUser/{userName}")
	public String byeMsg(@PathVariable String userName)
	{
		String msg=userName+" >> Bye";

		return msg;
	}

}
