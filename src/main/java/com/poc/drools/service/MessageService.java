package com.poc.drools.service;

import org.springframework.stereotype.Service;

import lombok.NonNull;

@Service
public class MessageService {
	public void outMsg(@NonNull String name) {
		System.out.println("MessageService: " + name);
	}
}
