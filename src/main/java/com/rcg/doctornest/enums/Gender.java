package com.rcg.doctornest.enums;

public enum Gender {

	MALE("M", "Male", "Man"), FEMALE("F", "Female", "Women"), OTHER("O", "Other", "Other");

	private String shortForm;
	private String name;
	private String desc;

	Gender(String shortForm, String name, String desc) {
		this.shortForm = shortForm;
		this.name = name;
		this.desc = desc;
	}

}
