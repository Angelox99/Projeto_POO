import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
public class Estoque 
{
   
    public void menu()
    {
        System.out.println("|----------------------------------------|");
        System.out.println("|------------[ESTOQUE_LOCK]--------------|");
        System.out.println("|----------------------------------------|\n\n");
        System.out.println("|------------MENU-PRINCIPAL--------------|\n\n");
        System.out.println("[1] - Almoxarifado.\n");
        System.out.println("[2] - Colaborador.\n");
        System.out.println("[3] - Sair.\n");
        
        System.out.printf("Escolha uma opcao: ");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        
        switch (s) 
        {
            case 1:
                LoginA();
            break;
            
            case 2:
                LoginC();
            break;
            
            case 3:
                System.out.println("\n\n[ESTOQUE_LOCK]-AGRADECE\n\n");
            break;
        
            default:
            break;
        }
    }

    // LOGIN - USUARIO E SENHA -----------------------
    public void LoginA ()
    {
        Scanner in = new Scanner(System.in);
        //USUARIO -------------------------
        System.out.printf("USUARIO: ");
        String USUARIO = in.nextLine();
        
        //SENHA -------------------------
        System.out.printf("SENHA: ");
        String SENHA = in.nextLine();
        
        //CHECAGEM ----------------------------------------
        // Almoxarife Almo = new Almoxarife();

    if (USUARIO.equals("Mauricio") && SENHA.equals("789"))
        {
            System.out.printf("\n !Usuario %s logado com SUCESSO!\n\n",USUARIO); 
            menuAlmoxarifado();
            
        }
        else
        {
            System.out.printf("\n !Usuario ou Senha INVALIDOS!\n\n");
            menu();
        }
    }
    
    public void LoginC ()
    {
        Scanner in = new Scanner(System.in);
        //USUARIO -------------------------
        System.out.printf("USUARIO: ");
        String USUARIO = in.nextLine();
        
        //SENHA -------------------------
        System.out.printf("SENHA: ");
        String SENHA = in.nextLine();
        
        //CHECAGEM ----------------------------------------
        // Almoxarife Almo = new Almoxarife();

        if (USUARIO.equals("Angelo") && SENHA.equals("999"))
        {
            System.out.printf("\n !Usuario %s logado com SUCESSO!\n\n",USUARIO); 
            menuColaborador();
        }
        else
        {
            System.out.printf("\n !Usuario ou Senha INVALIDOS!\n\n");
            menu();
        }
    }


    public void menuAlmoxarifado()
    {
        System.out.println("|----------------------------------------|");
        System.out.println("|------------[ESTOQUE_LOCK]--------------|");
        System.out.println("|----------------------------------------|\n\n");
        System.out.println("|-----------MENU-ALMOXARIFADO------------|\n\n");
        System.out.println("[1] - Novo material.\n");
        System.out.println("[2] - Armazenar material.\n");
        System.out.println("[3] - Consultar material.\n");
        System.out.println("[4] - Reservar material.\n");
        System.out.println("[5] - Retirar material.\n");
        System.out.println("[6] - Voltar.\n");
        System.out.println("[7] - Sair.\n");
        
        System.out.printf("Escolha uma opcao: ");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        
        switch (s) 
        {
            case 1:
                Material M = new Material();
                menuAlmoxarifado();
            break;
            
            case 2:
                Almoxarife Mauricio = new Almoxarife();
                Mauricio.armazenarMaterial();
                menuAlmoxarifado();
            break;

            case 3:

                menuAlmoxarifado(); 
            break;

            case 4:
                Reserva();
                menuAlmoxarifado();
            break;

            case 5:
    
                menuAlmoxarifado();
            break;
            
            case 6:
                menu();
            break;
            
            case 7:
                System.out.println("\n\n[ESTOQUE_LOCK]-AGRADECE\n\n");
            break;
   
            default:
            break;
        }

    }
    public void menuColaborador()
    {
        System.out.println("|----------------------------------------|");
        System.out.println("|------------[ESTOQUE_LOCK]--------------|");
        System.out.println("|----------------------------------------|\n\n");
        System.out.println("|-----------MENU-COLABORADOR-------------|\n\n");
        System.out.println("[1] - Consultar material.\n");
        System.out.println("[2] - Reservar material.\n");
        System.out.println("[3] - Voltar.\n");
        System.out.println("[4] - Sair.\n");
        
        System.out.printf("Escolha uma opcao: ");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        
        switch (s) 
        {
            case 1:
               
                menuColaborador();
            break;
            
            case 2:
                
            break;

            case 3:
                menu();
            break;
            
            case 4:
                System.out.println("\n\n[ESTOQUE_LOCK]-AGRADECE\n\n");
            break;

            default:
            break;
        }

    }

    public void Reserva()
    {
        Material M = new Material();
        Scanner in = new Scanner(System.in);

        System.out.printf("Digite o material: ");
        String material = in.nextLine();
        M.setNomeM(material);


        System.out.println("Digite a quantidade: ");
        int quantidade = in.nextInt();
        M.setQuantidadeM(quantidade);
        
        int quantidadeM=quantidade+1;
        if (quantidadeM < quantidade) 
        {
            System.out.println("\nQuantidade Reservada!\n");
        }
        else
        {
            System.out.println("\nNao e possivel reservar!");
            System.out.println("Quantidade Insuficiente!\n");
        }
    }
}