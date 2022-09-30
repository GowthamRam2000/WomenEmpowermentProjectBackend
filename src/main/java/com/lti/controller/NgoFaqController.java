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
import com.lti.service.NgoFaqService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class NgoFaqController {

	@Autowired
	private NgoFaqService faqService;
	
	@PostMapping("/ngo-faq")
	public void post(@RequestBody() NgoFaq faq) {
		this.faqService.postQuestion(faq);
	}
	
	@PostMapping("/ngo-faq-answer")
	public void postAnswer(@RequestBody() NgoFaq faq) {
		this.faqService.postQuestion(faq);
	}
	
	@GetMapping("/ngo-faqs/{username}")
	public List<NgoFaq> get(@PathVariable("username") String username){
		return this.faqService.getAllFaqs(username);
	}
	
	@GetMapping("/ngo-faqs")
	public List<NgoFaq> getAll(){
		return this.faqService.getAllFaqs();
	}
	
	@PutMapping("/ngo-faq")
	public void update(@RequestBody() NgoFaq faq) {
		this.faqService.postQuestion(faq);
	}
}
