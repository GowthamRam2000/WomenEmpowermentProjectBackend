package com.lti.service;

import java.util.List;

import com.lti.entity.UserFaq;

public interface UserFaqService {
	public void postQuestion(UserFaq faq);
	public void giveAnswer(UserFaq faq);
	public List<UserFaq> getAllFaqs(String username);
	public List<UserFaq> getAllFaqs();
}
