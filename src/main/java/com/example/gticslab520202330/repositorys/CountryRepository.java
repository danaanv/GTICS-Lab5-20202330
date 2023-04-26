package com.example.gticslab520202330.repositorys;

import com.example.gticslab520202330.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}