package com.rcg.doctornest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.rcg.doctornest.enums.Gender;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@RequiredArgsConstructor
@Getter
@Setter

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String mobileNo;
	private Gender gender;
	private int hospitalId;
	private String address1;
	private String address2;
	private String address3;
	private String state;
	private String district;
	private String city;
	private String specialist;
	private String registrationNo;
	private String stateCouncil;

}
