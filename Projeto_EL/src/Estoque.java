import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
public class Estoque 
{
    ArrayList<String> materials = new ArrayList<>();
    ArrayList<Material> materials2 = new ArrayList<>();

    /**
     * Menu principal onde seleciona o usuario
     * @menu()
     */
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

    /**
     * Login do Almoxarifado
     * @loginA()     
     * */
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
    
    /**
     * Login do Colaborador
     * @LoginC()
     */
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

    /**
     * Menu de opcoes para o usuario do almoxarifado onde se encontram os metodos do estoque
     * menuAlmoxarifado()
     */
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
            case 1:// Novo material
                Material M = new Material();
                materials2.add(M);
                menuAlmoxarifado();
            break;
            
            case 2://Armazena Material
                armazena();
                menuAlmoxarifado();
            break;

            case 3://Consulta Material
                ConsultarMateriais();
                menuAlmoxarifado(); 
            break;

            case 4://Reserva Material
                Reserva();
                menuAlmoxarifado();
            break;

            case 5://Retira Material
                retirar();
                menuAlmoxarifado();
            break;
            
            case 6://Volta para o menu anterior
                menu();
            break;
            
            case 7://Encerra o Estoque
                System.out.println("\n\n[ESTOQUE_LOCK]-AGRADECE\n\n");
            break;
   
            default:
            break;
        }

    }
    
    /**
     * Menu do Colaborador onde se encontram as metodos que tem acesso
     * menuColaborador()
     */
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
            case 1://Consulta Material
                ConsultarMateriais(); 
                menuColaborador();
            break;
            
            case 2://Reserva Material
                Reserva();
                menuColaborador();
            break;

            case 3://Volta para o menu anterior
                menu();
            break;
            
            case 4://Encerra o estoque
                System.out.println("\n\n[ESTOQUE_LOCK]-AGRADECE\n\n");
            break;

            default:
            break;
        }

    }

    /**
     * Reserva a quantidade do material que deve ser retirado
     * Reserva()
     */
    public void Reserva()
    {
        String nome;
        int quantidade;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o material: ");
        nome = in.nextLine();

        System.out.print("Digite a quantidade: ");
        quantidade = in.nextInt();

        for (int i = 0; i<materials2.size();i++){
            if(materials2.get(i).NomeM.equals(nome)){
            
                if(quantidade <= materials2.get(i).QuantidadeM){
                    System.out.println("Quantidade reservada");
                }
                else{
                    System.out.println("Quantidade insuficiente");
                }
            }
                                
        }
        
        
        
    }

    /**
     * Armazena material existente aumentando a quantidade
     * armazena()
     * @return
     */
    public void armazena(){
        Scanner ler = new Scanner(System.in);
        String nome;
        int quantidade;

        System.out.print("Nome do objeto a ser adicionado:");
        nome = ler.nextLine();
        System.out.print("Quantidade:");
        quantidade = ler.nextInt();
        
        for (int i = 0; i<materials2.size();i++){
            if(materials2.get(i).NomeM.equals(nome)){
            
                if(quantidade <= materials2.get(i).QuantidadeM){
                    materials2.get(i).QuantidadeM = materials2.get(i).QuantidadeM + quantidade; 
                    System.out.println("Quantidade Adicionada");
                }
            }                   
        }
    }

    /**
     * Retira a quantidade do material selecionado
     * retirar()
     * @return
     */
    public void retirar(){
        Scanner ler = new Scanner(System.in);
        String nome;
        int quantidade;

        System.out.print("Nome do objeto a ser retirado:");
        nome = ler.nextLine();
        System.out.print("Quantidade:");
        quantidade = ler.nextInt();
        
        for (int i = 0; i<materials2.size();i++){
            if(materials2.get(i).NomeM.equals(nome)){
            
                if(quantidade <= materials2.get(i).QuantidadeM){
                    materials2.get(i).QuantidadeM = materials2.get(i).QuantidadeM - quantidade; 
                    System.out.println("Quantidade retirada");
            
                }
                else{
                    System.out.println("Quantidade insuficiente");
                }
            }                   
        }
    }

    /**
     * Consulta o material selecionado , retornando seus atributos,
     * e caso digite TODOS retorna todos os materiais e seus atributos
     * ConsultarMateriais()
     * @return
     */
    public void ConsultarMateriais(){
    
        Scanner ler = new Scanner(System.in);
        String nome;
       
        System.out.print("Nome do objeto a ser consultado:");
        nome = ler.nextLine();
        
        for (int i = 0; i<materials2.size();i++){
           
            if(materials2.get(i).NomeM.equals(nome)){
                System.out.println("\n"+"Material:"+materials2.get(i).NomeM);
                System.out.println("Tipo de Material:"+materials2.get(i).TipoM);
                System.out.println("Quantidade:"+materials2.get(i).QuantidadeM);
                System.out.println("Codigo:"+materials2.get(i).CodigoM);
                
            }
            
        }
        if(nome.equals("TODOS")){
            System.out.println("\n===================LISTA COMPLETA===================");
            for (int j = 0; j<materials2.size();j++){
                System.out.println("\n"+"Material:"+materials2.get(j).NomeM);
                System.out.println("Tipo de Material:"+materials2.get(j).TipoM);
                System.out.println("Quantidade:"+materials2.get(j).QuantidadeM);
                System.out.println("Codigo:"+materials2.get(j).CodigoM);
            }
        }
    }
}