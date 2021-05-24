package br.com.ostrowskijr.myinvest.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_investimento")
public class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ativo;
    private int qtCota;
    private Double vlCota;
    private LocalDate dataCompra;
    @ManyToOne
    @JoinColumn(name = "fk_idCategoria")
    private Categoria idCategoria;

}
