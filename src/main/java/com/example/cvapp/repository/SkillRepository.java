package com.example.cvapp.repository;

import com.example.cvapp.model.SkillModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<SkillModel,Long> {
}
