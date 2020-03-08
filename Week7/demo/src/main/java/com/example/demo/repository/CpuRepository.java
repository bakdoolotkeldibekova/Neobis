package com.example.demo.repository;

import com.example.demo.entity.CpuEntity;
import org.springframework.data.repository.CrudRepository;

public interface CpuRepository extends CrudRepository<CpuEntity, Integer> {
}