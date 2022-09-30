package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.UserFaqRepository;
import com.lti.entity.UserFaq;

@Service
public class UserFaqServiceImpl implements UserFaqService {

	@Autowired
	private UserFaqRepository faqRepo;
	
	@Override
	public void postQuestion(UserFaq faq) {
		this.faqRepo.save(faq);
	}

	@Override
	public void giveAnswer(UserFaq faq) {
		this.faqRepo.save(faq);
	}

	@Override
	public List<UserFaq> getAllFaqs(String username) {
		return this.faqRepo.findByUsername(username);
	}

	
	public List<UserFaq> getAllFaqs() {
		return this.faqRepo.findAll();
	}
}
