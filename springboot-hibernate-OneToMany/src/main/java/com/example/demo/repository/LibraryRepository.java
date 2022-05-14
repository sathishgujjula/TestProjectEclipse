package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity1.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long>{

}
