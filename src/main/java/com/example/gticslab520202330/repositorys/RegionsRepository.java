package com.example.gticslab520202330.repositorys;

import com.example.gticslab520202330.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface RegionsRepository extends JpaRepository<Regions, BigDecimal> {
}