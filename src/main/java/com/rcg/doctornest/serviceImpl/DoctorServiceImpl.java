package com.rcg.doctornest.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcg.doctornest.entity.Doctor;
import com.rcg.doctornest.repo.DoctorRepo;
import com.rcg.doctornest.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepo doctorRepo;

	@Override
	public Doctor SaveDetails(Doctor d) {
		return doctorRepo.save(d);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Doctor getDetailsOfDoctor(int id) {
		Optional<Doctor> d = doctorRepo.findById(id);
		return d.get();
	}

}
