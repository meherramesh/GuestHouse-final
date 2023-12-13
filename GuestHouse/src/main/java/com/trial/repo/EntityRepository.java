package com.trial.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trial.model.EntityModel;

public interface EntityRepository extends JpaRepository<EntityModel, Long> {
}
