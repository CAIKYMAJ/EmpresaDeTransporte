package br.com.aula.empresa.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double icmsLocal;
    private Double icmsOutroUf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getIcmsLocal() {
        return icmsLocal;
    }

    public void setIcmsLocal(Double icmsLocal) {
        this.icmsLocal = icmsLocal;
    }

    public Double getIcmsOutroUf() {
        return icmsOutroUf;
    }

    public void setIcmsOutroUf(Double icmsOutroUf) {
        this.icmsOutroUf = icmsOutroUf;
    }
}
