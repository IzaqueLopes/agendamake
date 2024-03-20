package com.agendamake.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    private String nome;
    private String data;
    private String local;
    private String horario;
    private String procedimento1;
    private String procedimento2;
    private String procedimento3;
    private String valor;
    private String pagamento;

    // Getters e Setters
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getProcedimento1() {
        return procedimento1;
    }

    public void setProcedimento1(String procedimento1) {
        this.procedimento1 = procedimento1;
    }

    public String getProcedimento2() {
        return procedimento2;
    }

    public void setProcedimento2(String procedimento2) {
        this.procedimento2 = procedimento2;
    }

    public String getProcedimento3() {
        return procedimento3;
    }

    public void setProcedimento3(String procedimento3) {
        this.procedimento3 = procedimento3;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
}
