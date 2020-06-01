package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// TODO : update this interface
@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
}
