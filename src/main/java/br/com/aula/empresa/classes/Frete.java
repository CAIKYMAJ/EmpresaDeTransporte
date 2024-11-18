package br.com.aula.empresa.classes;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Frete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroConhecimento;
    private String quemPaga;
    private Double peso;
    private Double valor;
    private Double icms;
    private Double pedagio;
    private LocalDate dataFrete;

    @ManyToOne
    @JoinColumn(name = "origem_id")
    private Cidade origem;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private Cidade destino;

    @ManyToOne
    @JoinColumn(name = "remetente_id")
    private Cliente remetente;

    @ManyToOne
    @JoinColumn(name = "destinatario_id")
    private Cliente destinatario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroConhecimento() {
        return numeroConhecimento;
    }

    public void setNumeroConhecimento(String numeroConhecimento) {
        this.numeroConhecimento = numeroConhecimento;
    }

    public String getQuemPaga() {
        return quemPaga;
    }

    public void setQuemPaga(String quemPaga) {
        this.quemPaga = quemPaga;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getIcms() {
        return icms;
    }

    public void setIcms(Double icms) {
        this.icms = icms;
    }

    public Double getPedagio() {
        return pedagio;
    }

    public void setPedagio(Double pedagio) {
        this.pedagio = pedagio;
    }

    public LocalDate getDataFrete() {
        return dataFrete;
    }

    public void setDataFrete(LocalDate dataFrete) {
        this.dataFrete = dataFrete;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    public Cliente getRemetente() {
        return remetente;
    }

    public void setRemetente(Cliente remetente) {
        this.remetente = remetente;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }
}
