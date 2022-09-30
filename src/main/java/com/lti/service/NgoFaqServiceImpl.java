package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.NgoFaqRepository;
import com.lti.entity.NgoFaq;

@Service
public class NgoFaqServiceImpl implements NgoFaqService {
	@Autowired
	private NgoFaqRepository faqRepo;
	
	public List<NgoFaq> getAllFaqs(String username) {
		return this.faqRepo.findByUsername(username);
	}

	@Override
	@Transactional
	public void postQuestion(NgoFaq faq) {
		this.faqRepo.save(faq);
	}

	@Override
	public void giveAnswer(NgoFaq faq) {
		this.faqRepo.save(faq);
	}

	@Override
	public List<NgoFaq> getAllFaqs() {
		return this.faqRepo.findAll();
	}
}
