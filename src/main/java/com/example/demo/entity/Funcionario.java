package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private Long idFuncionario;
    private String nome;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @ManyToOne
    private Setor setor;


}
