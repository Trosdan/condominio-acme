package br.com.acme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.acme.unidade.Unidade;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long> {
	// public List<Unidade> listMulta(boolean isMulta);
}
