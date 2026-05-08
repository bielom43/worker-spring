package com.devbielom.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devbielom.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	
}
