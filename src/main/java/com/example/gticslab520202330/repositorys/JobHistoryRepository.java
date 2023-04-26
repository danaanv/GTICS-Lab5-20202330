package com.example.gticslab520202330.repositorys;

import com.example.gticslab520202330.entity.JobHistory;
import com.example.gticslab520202330.entity.JobHistoryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryId> {
}