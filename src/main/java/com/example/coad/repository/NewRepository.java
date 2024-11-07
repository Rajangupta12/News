package com.example.coad.repository;

import com.example.coad.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewRepository extends JpaRepository< NewsEntity, Long> {
}
