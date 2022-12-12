import java.util.ArrayList;
import java.util.Scanner;

public class Material {
   
    /**
     * Atributos dos materiais
     *@return
     */
    String NomeM;
    int CodigoM;
    String TipoM;
    int QuantidadeM;
    String DataEM;
    String DataSM;
    Scanner ler = new Scanner(System.in);

    /**
     * Construtor dos materiais
     * @return
     */
    Material(){
        System.out.println("Tipo do material:");	
        TipoM = ler.nextLine();
        System.out.println("Nome do material:");	
        NomeM = ler.nextLine();
        System.out.println("Quantidade do material:");	
        QuantidadeM = ler.nextInt();
        System.out.println("Codigo do material:");	
        CodigoM = ler.nextInt();
        System.out.println("\n\n");	
    }

    
    /** 
     * Get do Codigo do material
     * @return 
     */
    // CODIGO DO MATERIAL -----------------------
    
    public int getCodigoM() {
        return CodigoM;
    }
    
    /** 
     * SET do codigo do material
     * @return
     */
    public void setCodigoM(int codigoM) {
        CodigoM = codigoM;
    }
    
    
    /** 
     * GET da Quantidade do material
     * @return 
     */
    // QUANTIDADE DO MATERIAL -----------
    
    public int getQuantidadeM() {
        return QuantidadeM;
    }
    
    /** 
     * SET da quantidade de material
     * @return
     */
    public void setQuantidadeM(int quantidadeM) {
        QuantidadeM = quantidadeM;
    }

    
    /** 
     * GET do nome do material
     * @return 
     */
    // NOME DO MATERIAL -------------------------
    
    public String getNomeM() {
        return NomeM;
    }
    
    /** 
     * SET do nome do material
     * @return
     */
    public void setNomeM(String nomeM) {
        NomeM = nomeM;
    }

    
    /** 
     * GET do tipo do material
     * @return 
     */
    // TIPO DO MATERIAL -----------
    
    public String getTipoM() {
        return TipoM;
    }
    
    /** 
     * SET do tipo do material
     * @return 
     */
    public void setTipoM(String tipoM) {
        TipoM = tipoM;
    }
}
