package entities;

import java.time.LocalDate;
import java.util.Date;

public class HoraContrato {
    private int mes;
    private int ano;
    private Double valorPorHora;
    private Integer horaTrabalhada;
    private String nome;

    



    public HoraContrato() {
    }

    public HoraContrato(String nome, int mes, int ano, Double valorPorHora, Integer horaTrabalhada) {
        this.mes = mes;
        this.ano = ano;
        this.valorPorHora = valorPorHora;
        this.horaTrabalhada = horaTrabalhada;
        this.nome = nome;
    }





    public Double valorTotal(){
        return valorPorHora * horaTrabalhada;
    }

    

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(Integer horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "HoraContrato [mes=" + mes + ", ano=" + ano + ", valorPorHora=" + valorPorHora + ", horaTrabalhada="
                + horaTrabalhada + ", nome=" + nome + "]";
    }

    
}
