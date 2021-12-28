package dev.cfcmagalhaes.oceanracemanagement.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Evento
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @OneToMany( mappedBy = "evento")
    private List<Classe> classes;

    private String sigla;
    private String nome;
    private String patrocinio;
    private String apoio;
    private String urlLogo;
    private String urlLogoClube;
}
