package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven;


import br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.cliente.ClienteController;



import java.util.Scanner;

public class HomeController {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;
        do {
            System.out.print("\n-------  Home -------\n");
            System.out.print(
                    """
                        0. Sair
                        1. Manipular usuário:\s""");

            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 ->  ClienteController.main(null);
                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        } while(opcao != 0) ;
        System.out.println("\n\n!!!!!!!! Fim da aplicação !!!!!!!!");
        input.close(); //libera o recurso
    }

}//fim classe