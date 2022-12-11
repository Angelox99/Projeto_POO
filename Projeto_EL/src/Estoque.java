import java.util.Scanner;
import java.util.*;
public class Estoque 
{
    public void menu()
    {
        System.out.println("|----------------------------------------|");
        System.out.println("|------------[ESTOQUE_LOCK]--------------|");
        System.out.println("|----------------------------------------|\n\n");
        System.out.println("[1] - Login.\n");
        System.out.println("[2] - Sair.\n");
        
        System.out.printf("Escolha uma opcao: ");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        
        switch (s) 
        {
            case 1:
                Login();
            break;
            
            case 2:
                System.out.println("\n\n[ESTOQUE_LOCK]-AGRADECE\n\n");
            break;
        
            default:
            break;
        }
    }

    // LOGIN - USUARIO E SENHA -----------------------
    public void Login ()
    {
        Scanner in = new Scanner(System.in);
        //USUARIO -------------------------
        System.out.println("USUARIO: ");
        String USUARIO = in.nextLine();
        
        //SENHA -------------------------
        System.out.println("SENHA: ");
        String SENHA = in.nextLine();
        
        //CHECAGEM ----------------------------------------
        if (USUARIO.equals("Angelo") && SENHA.equals("009900"))
        {
            System.out.printf("Usuario %s logado com SUCESSO!\n\n",USUARIO); 
            menuFuncionario();
        }
        else
        {
            System.out.printf("Usuario ou Senha INVALIDOS!\n\n");
            menu();
        }
    }


    public void menuFuncionario()
    {
        System.out.println("|----------------------------------------|");
        System.out.println("|------------[ESTOQUE_LOCK]--------------|");
        System.out.println("|----------------------------------------|\n\n");
        System.out.println("[1] - Novo material.\n");
        System.out.println("[2] - Armazenar material.\n");
        System.out.println("[3] - Consultar material.\n");
        System.out.println("[4] - Retirar material.\n");
        System.out.println("[5] - Voltar.\n");
        System.out.println("[6] - Sair.\n");
        
        System.out.printf("Escolha uma opcao: ");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        
        switch (s) 
        {
            case 1:
            
            break;
            
            case 2:

            break;

            case 3:
            
            break;
            
            case 4:
            
            break;

            case 5:
                Login();
            break;
            
            case 6:
                System.out.println("\n\n[ESTOQUE_LOCK]-AGRADECE\n\n");
            break;
   
            default:
            break;
        }

    }

    public void novoMaterial()
    {

    }


}