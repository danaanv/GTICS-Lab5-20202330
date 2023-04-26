package com.example.gticslab520202330.repositorys;

import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractAuditableRepository<T extends AbstractAuditable, ID> extends JpaRepository<T, ID> {
}