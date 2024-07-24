package entities;

import java.util.Date;

public class HoraContrato {
    private Date data;
    private Double valorPorHora;
    private Integer horaTrabalhada;
    
    public Double valorTotal(){
        return valorPorHora * horaTrabalhada;
    }
}
