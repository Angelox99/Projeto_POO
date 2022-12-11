import java.util.Scanner;
public class Estoque 
{

void menu()
    {
    System.out.println("|----------------------------------------|");
    System.out.println("|------------[ESTOQUE_LOCK]--------------|");
    System.out.println("|----------------------------------------|\n\n");
    System.out.println("[1] - Novo material.\n");
    System.out.println("[2] - Armazenar material.\n");
    System.out.println("[3] - Consultar material.\n");
    System.out.println("[4] - Retirar material.\n");
    
    System.out.println("Escolha uma opcao: ");
    Scanner scanner = new Scanner(System.in);
    int s = scanner.nextInt();
        
        switch (s) 
        {
            case 1:
            System.out.println("teste 1");
            
            break;
            
            case 2:
            System.out.println("teste 2");
            
            break;
        
            case 3:
            System.out.println("teste 3");
            
            break;
            
            case 4:
            System.out.println("teste 4");
            
            break;
    
            default:
            break;
        }

    }

}