package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.NgoFaq;
import com.lti.entity.UserFaq;
import com.lti.service.UserFaqService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserFaqController {
	
	@Autowired
	private UserFaqService faqService;
	
	@PostMapping("/user-faq")
	public void post(@RequestBody() UserFaq faq) {
		this.faqService.postQuestion(faq);
	}
	
	@PostMapping("/user-faq-answer")
	public void postAnswer(@RequestBody() UserFaq faq) {
		this.faqService.postQuestion(faq);
	}
	
	@GetMapping("/user-faqs/{username}")
	public List<UserFaq> get(@PathVariable("username") String username){
		return this.faqService.getAllFaqs(username);
	}
	
	@GetMapping("/user-faqs")
	public List<UserFaq> getAll(){
		return this.faqService.getAllFaqs();
	}
	
	@PutMapping("/user-faq")
	public void update(@RequestBody() UserFaq faq) {
		this.faqService.postQuestion(faq);
	}
}
