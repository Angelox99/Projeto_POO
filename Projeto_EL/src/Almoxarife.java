import java.util.ArrayList;

public class Almoxarife extends Funcionario implements ConsultarEstoque, RetirarMaterial, NovoMaterial, ReservarMaterial,ArmazenarMaterial{
    
    

    public String getCargo() {

    return super.getCargo();
    }
    public String getDepartamento() {

    return super.getDepartamento();
    }
    public int getMatricula() {
    return super.getMatricula();
    }
    public String getNome() {
    return super.getNome();
    }
    public void setCargo(String cargo) {
    super.setCargo(cargo);
    }
    public void setDepartamento(String departamento) {
    super.setDepartamento(departamento);
    }
    public void setMatricula(int matricula) {
    super.setMatricula(matricula);
    }
    public void setNome(String nome) {
    super.setNome(nome);
    }
    // SENHA FUNCIONARIO ------
    public int getSenha() {
        return super.getSenha();
    }
    
    public void setSenha(int senha) {
        super.setSenha(senha);

    }

    //----------------------ATRIBUIÇÕES----------------------
    //--------------------CRIAR MATERIAL---------------------
    public void criarMaterial(Material nome){
    
        Material M = new Material();

    }

    //------------------ARMAZENAR MATERIAL-------------------
    public void armazenarMaterial( nome){
        
    }

    //-----------------------CONSULTAR-----------------------
    public void consultaNomeMaterial(){
         
    }
    public void consultaCodigoMaterial(){
        
    }
    public void consultaTipoMaterial(){
        
    }
    public void consultaDataEntradaMaterial(){
        
    }
    public void consultaDataSaidaMaterial(){
        
    }
    
    //------------------RETIRAR MATERIAL-------------------

    public void retirarMaterial(){

    }

    //-----------------RESERVAR MATERIAL-------------------
    public void reservarMaterial(){

    }
}
