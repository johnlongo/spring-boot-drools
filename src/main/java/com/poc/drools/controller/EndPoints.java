package com.poc.drools.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poc.drools.domain.Message;
import com.poc.drools.enums.EnumMessage;

@Controller
@RequestMapping("/")
public class EndPoints {

	@Autowired
	private KieSession kSession;

	@RequestMapping("/index")
	@ResponseBody
	String index() {
		return "index Page!";
	}

	@RequestMapping(value = "/droolsTest", method = RequestMethod.GET)
	@ResponseBody
	public String droolsTest() {
		try {
			Message message = new Message();
			message.setMessage("hello drools");
			message.setStatus(EnumMessage.HELLO.getCode());
			kSession.insert(message);
			kSession.fireAllRules();
			System.out.println("end of execution rule");
			return message.getMessage();
		} catch (Throwable t) {
			t.printStackTrace();
			return "error";
		}
	}

}
