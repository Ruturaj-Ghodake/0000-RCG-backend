package com.rcg.doctornest.enums;

public enum Title {

	Mr("Mr", "Mister"), Mrs("Mrs", "Missus"), Miss("Miss", "Miss");

	private String name;
	private String desc;

	Title(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

}
