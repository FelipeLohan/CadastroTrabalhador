import java.util.Scanner;

import entities.HoraContrato;
import entities.Trabalhador;

public class MenuInteracao {
    
    
    public static void menuInteracao(){
        
        Trabalhador t1 = new Trabalhador();

        Scanner teclado = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("-------------SISTEMA DE FUNCIONARIOS-------------");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Gerenciar Contratos");
            System.out.println("3 - Ver contratos");
            System.out.println("4 - Sair");
                opcao = teclado.nextInt();
                    teclado.nextLine();

                    switch(opcao){
                        case 1:
                            t1.cadastrar();
                            break;
                        case 2:
                            for (HoraContrato c : t1.contratos) {
                                
                            }    
                    }
                        
        }

    }
}
