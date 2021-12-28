package dev.cfcmagalhaes.oceanracemanagement.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Barco
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long         id;

    @ManyToMany
    @JoinTable( name = "barco_classe",
                    joinColumns = @JoinColumn( name = "barco_id" ),
                    inverseJoinColumns = @JoinColumn( name = "classe_id" ) )
    private List<Classe> classes;

    private String       numeral;
    private String       modelo;
    private String       nome;
    private String       comandante;
    private Integer      tripulantes;
    private Double       loa;
    private String       clube;
}
