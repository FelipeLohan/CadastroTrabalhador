package entities;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDate;

public class MenuInteracao {
    
    
    public static void menuInteracao(){
        
        Trabalhador t1 = new Trabalhador();

        Scanner teclado = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("-------------SISTEMA DE FUNCIONARIOS-------------");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Adicionar Contratos");
            System.out.println("3 - Ver contratos");
            System.out.println("4 = Calcular Contratos");
            System.out.println("5 - Sair");
                opcao = teclado.nextInt();
                    teclado.nextLine();

                    switch(opcao){
                        case 1:
                            t1.cadastrar();
                            break;
                        case 2:
                        System.out.println("Mês do contrato: ");
                            int mes = teclado.nextInt();
                                teclado.nextLine();
                                    System.out.println("Ano do contrato: ");
                                        int ano = teclado.nextInt();
                                            teclado.nextLine();
                                                System.out.println("Valor por hora trabalhada: ");
                                                    Double valorPorHora = teclado.nextDouble();
                                                        teclado.nextLine();
                                                            System.out.println("Hora trabalhada: ");
                                                                int horaTrabalhada = teclado.nextInt();
                                                                    teclado.nextLine();
                                                                    System.out.println("Nome do contrato: ");
                                                                        String nome = teclado.nextLine();
                                                                        
                                                                    HoraContrato contrato = new HoraContrato(nome, mes, ano, valorPorHora, horaTrabalhada);    
                                                                            t1.adicionarContrato(contrato);
                            break;
                        case 3:
                            System.out.println("------------------------");
                            for (HoraContrato c : t1.getContratos()) {
                                System.out.println(c);
                            }
                            break;
                        case 4:
                            System.out.println("Qual sera o ano do contrato? ");
                                ano = teclado.nextInt();
                                    teclado.nextLine();
                                    System.out.println("Qual sera o mes do contrato? ");
                                        mes = teclado.nextInt();
                                            teclado.nextLine();
                                                t1.calcularContrato(ano, mes);
                                    break;
                        case 5:
                            System.out.println("Obrigado por usar o sistema! ");
                            break;     
                        default:
                            System.out.println("Opcao invalida");
                            break;                                               
                                                                        
                             
                    }
                        
        } while(opcao != 5);

    }
}
