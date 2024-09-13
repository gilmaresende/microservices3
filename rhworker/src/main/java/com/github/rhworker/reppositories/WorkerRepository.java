package com.github.rhworker.reppositories;

import com.github.rhworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  WorkerRepository extends JpaRepository<Worker, Long> {
}
