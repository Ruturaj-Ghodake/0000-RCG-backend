package com.rcg.doctornest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcg.doctornest.entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {

}
