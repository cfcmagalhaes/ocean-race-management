package dev.cfcmagalhaes.oceanracemanagement.domain;

import javax.persistence.*;
import java.util.List;

@Table( name = "barco_classe" )
@Entity
public class BarcoClasse
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @ManyToOne
    @JoinColumn( name = "barco_id")
    private Barco barco;

    @ManyToOne
    @JoinColumn( name = "classe_id" )
    private Classe classe;

    @OneToOne( mappedBy = "barcoClasse")
    private Resultado resultado;

    private Double fct;
    private Integer colocacao;
}
