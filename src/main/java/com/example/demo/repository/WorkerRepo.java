package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.WorkerModel;

public interface WorkerRepo extends JpaRepository<WorkerModel, Integer>{

}
