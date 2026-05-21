package com.cardapio.product.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")

public class Produtos {
    
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double preco;

    private String descricao;

}
