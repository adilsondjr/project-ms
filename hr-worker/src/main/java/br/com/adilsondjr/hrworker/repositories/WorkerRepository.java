package br.com.adilsondjr.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adilsondjr.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
