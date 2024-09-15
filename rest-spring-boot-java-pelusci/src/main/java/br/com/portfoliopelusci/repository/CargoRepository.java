package br.com.portfoliopelusci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.portfoliopelusci.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {

}
