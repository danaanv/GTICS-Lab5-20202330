package com.example.gticslab520202330.repositorys;

import com.example.gticslab520202330.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, String> {
}