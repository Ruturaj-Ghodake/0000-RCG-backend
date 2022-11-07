package com.rcg.doctornest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcg.doctornest.entity.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital, Integer> {

}
