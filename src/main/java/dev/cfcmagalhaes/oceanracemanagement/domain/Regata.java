package dev.cfcmagalhaes.oceanracemanagement.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Regata
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @ManyToOne
    @JoinColumn( name = "classe_id" )
    private Classe        classe;

    private String        nome;
    private Integer       numero;
    private LocalDateTime largada;
    private Double        distancia;
    private Integer       fitaAzul;
    private Double        peso;
    private Integer       protesto;

}
