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
        System.out.println("Nome do material:");	
        NomeM = ler.nextLine();
    }

    // CODIGO DO MATERIAL -----------
    
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

    // NOME DO MATERIAL -----------

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

    // DATA DE ENTRADA DO MATERIAL -----------
   
    public String getDataEM() {
        return DataEM;
    }
    public void setDataEM(String dataEM) {
        DataEM = dataEM;
    }

    // DATA DE SAIDA DO MATERIAL -----------
    public String getDataSM() {
        return DataSM;
    }
    public void setDataSM(String dataSM) {
        DataSM = dataSM;
    }
}
