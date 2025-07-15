package com.alura.literatura.repository;

import com.alura.literatura.model.AuthorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<AuthorData, Long> {
    AuthorData findByName(String name);

    @Query("SELECT a FROM AuthorData a WHERE a.birthYear <= :year AND a.deathYear>= :year")
    List<AuthorData> findAuthorAliveInYear(Integer year);
}