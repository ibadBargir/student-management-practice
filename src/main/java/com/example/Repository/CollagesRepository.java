package com.example.Repository;

import com.example.Model.collages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollagesRepository extends JpaRepository<collages, Integer> {
}
