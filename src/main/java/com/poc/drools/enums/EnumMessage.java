package com.poc.drools.enums;

public enum EnumMessage {
	HELLO(1, "hello drools"), BYE(2, "good bye drools");

	private int code;
	private String value;

	EnumMessage(int code, String value) {
		this.code = code;
		this.value = value;
	}

	public int getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}

}
