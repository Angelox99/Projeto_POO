import java.util.ArrayList;
import java.util.Scanner;

public class Material {
   
    String NomeM;
    int CodigoM;
    String TipoM;
    int QuantidadeM;
    String DataEM;
    String DataSM;
    Scanner ler = new Scanner(System.in);

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

    // CODIGO DO MATERIAL -----------------------
    
    public int getCodigoM() {
        return CodigoM;
    }
    public void setCodigoM(int codigoM) {
        CodigoM = codigoM;
    }
    
    // QUANTIDADE DO MATERIAL -----------
    
    public int getQuantidadeM() {
        return QuantidadeM;
    }
    public void setQuantidadeM(int quantidadeM) {
        QuantidadeM = quantidadeM;
    }

    // NOME DO MATERIAL -------------------------
    
    public String getNomeM() {
        return NomeM;
    }
    public void setNomeM(String nomeM) {
        NomeM = nomeM;
    }

    // TIPO DO MATERIAL -----------
    
    public String getTipoM() {
        return TipoM;
    }
    public void setTipoM(String tipoM) {
        TipoM = tipoM;
    }
}
