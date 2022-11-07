package com.rcg.doctornest.service;

import com.rcg.doctornest.entity.Doctor;

public interface DoctorService {

	Doctor SaveDetails(Doctor d);

	Doctor getDetailsOfDoctor(int id);
}
