package com.cognizant.hey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeyController {
@RequestMapping(value="hey" ,method=RequestMethod.GET)
public String sayeHey(){
	return "hey";
}

}
