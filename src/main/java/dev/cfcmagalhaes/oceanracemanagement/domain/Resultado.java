package dev.cfcmagalhaes.oceanracemanagement.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Resultado
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @OneToOne
    @JoinColumn( name = "barco_classe_id")
    private BarcoClasse barcoClasse;

    @ManyToOne
    @JoinColumn( name = "regata_id")
    private Regata        regata;

    private LocalDateTime tempoLargada;
    private Float         distancia;
    private LocalDateTime tempoReal;
    private LocalDateTime tempoCorrigido;
    private Integer       observacao;
    private Double        pontos;
    private Integer       descartavel;
}
