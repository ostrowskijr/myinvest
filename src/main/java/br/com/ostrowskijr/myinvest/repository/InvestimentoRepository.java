package br.com.ostrowskijr.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ostrowskijr.myinvest.model.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {

}
