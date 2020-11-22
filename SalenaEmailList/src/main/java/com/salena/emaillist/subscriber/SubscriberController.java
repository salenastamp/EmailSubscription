package com.salena.emaillist.subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SubscriberController {
	
	 @Autowired
	  private SubscriberRepository subscriberRepository;
	 
	  @GetMapping
	    public String index(Subscriber subscriber) {
		return "subscriber/index";
	    }
	  
	  @GetMapping("/index")
		public String index() {
			return "index";
		}
	  
	  @GetMapping("/AboutMe")
	  	public String AboutMe() {
		  return "AboutMe";
	  }
	  
	  private Subscriber subscriber;
	  @PostMapping(value = "/")
	  public String addNewSubscriber(Subscriber subscriber, Model model) {
	  	subscriberRepository.save(new Subscriber(subscriber.getname(), 
	          subscriber.getemail(), subscriber.getSignedUp()));
	  	model.addAttribute("name", subscriber.getname());
	  	model.addAttribute("email", subscriber.getemail());
	  	return "subscriber/result";
}
}