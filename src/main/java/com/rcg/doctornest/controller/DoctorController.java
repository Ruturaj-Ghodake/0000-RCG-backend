package com.rcg.doctornest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcg.doctornest.entity.Doctor;
import com.rcg.doctornest.service.DoctorService;




@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@PostMapping("/")
	private ResponseEntity<Doctor> saveDoctorDetails(@RequestBody Doctor d) {
		Doctor doctor = doctorService.SaveDetails(d);
		return new ResponseEntity<Doctor>(doctor, HttpStatus.CREATED);
	}

	
	@GetMapping("/{id}")
	private ResponseEntity<Doctor> getDoctorDetail(@PathVariable int id){
		System.out.println("doc cotroller");
		Doctor doctor = doctorService.getDetailsOfDoctor(id);
		return new ResponseEntity<Doctor>(doctor, HttpStatus.OK);
		
	}
	
	
}
