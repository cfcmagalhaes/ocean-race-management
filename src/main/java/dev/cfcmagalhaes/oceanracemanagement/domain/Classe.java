package dev.cfcmagalhaes.oceanracemanagement.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Classe
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @ManyToOne
    @JoinColumn( name = "evento_id" )
    private Evento evento;

    @OneToMany( mappedBy = "classe")
    private List<Regata> regatas;

    @ManyToMany( mappedBy = "classes")
    private List<Barco> barcos;

    private String  nome;
    private Integer regatasPrevistas;
    private Integer descarte;
    private Integer minimoParaDescarte;
    private Integer criterioDesempate;
}
