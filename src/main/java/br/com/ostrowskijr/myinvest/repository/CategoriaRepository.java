package br.com.ostrowskijr.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ostrowskijr.myinvest.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
