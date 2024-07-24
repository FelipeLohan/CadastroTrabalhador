package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.enums.*;

import entities.enums.NivelTrabalhador;

public class Trabalhador {
    private String name;
    private NivelTrabalhador nivel;
    private  Double salarioBase;

    private Departamento departamento;
    List<HoraContrato> contratos = new ArrayList<>();

    //constructors
    public Trabalhador() {
    }

    public Trabalhador(String name, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
        this.name = name;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    //methods
    public void adicionarContrato(HoraContrato contrato){
        contratos.add(contrato);
    }

    public void removerContrato(HoraContrato contrato){
        contratos.remove(contrato);
    }

    public void calcularContrato(Integer ano, Integer mes){

    }
    
    public void cadastrar(){
        Scanner teclado = new Scanner(System.in);

            System.out.println("Nome: ");
                setName(teclado.nextLine());
            System.out.println("Departamento: " );
                String nomeDepartamento = teclado.nextLine();
                Departamento departamento = new Departamento(nomeDepartamento);
            System.out.println("Nivel:");
                String nivelStr = teclado.nextLine();
                setNivel(NivelTrabalhador.valueOf(nivelStr));
            System.out.println("Salario base: ");
                setSalarioBase(teclado.nextDouble());
                                        

    }



    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
}   
