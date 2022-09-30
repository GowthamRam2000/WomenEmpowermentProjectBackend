package com.lti.service;

import java.util.List;
import com.lti.entity.NgoFaq;

public interface NgoFaqService {
	public void postQuestion(NgoFaq faq);
	public void giveAnswer(NgoFaq faq);
	public List<NgoFaq> getAllFaqs(String username);
	public List<NgoFaq> getAllFaqs();
}
