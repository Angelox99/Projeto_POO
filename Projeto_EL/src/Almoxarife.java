import java.util.ArrayList;

public class Almoxarife extends Funcionario implements ConsultarEstoque, RetirarMaterial, NovoMaterial, ReservarMaterial,ArmazenarMaterial{
    
    

    
    /** 
     * @return String
     */
    public String getCargo() {

    return super.getCargo();
    }
    
    /** 
     * @return String
     */
    public String getDepartamento() {

    return super.getDepartamento();
    }
    
    /** 
     * @return int
     */
    public int getMatricula() {
    return super.getMatricula();
    }
    
    /** 
     * @return String
     */
    public String getNome() {
    return super.getNome();
    }
    
    /** 
     * @param cargo
     */
    public void setCargo(String cargo) {
    super.setCargo(cargo);
    }
    
    /** 
     * @param departamento
     */
    public void setDepartamento(String departamento) {
    super.setDepartamento(departamento);
    }
    
    /** 
     * @param matricula
     */
    public void setMatricula(int matricula) {
    super.setMatricula(matricula);
    }
    
    /** 
     * @param nome
     */
    public void setNome(String nome) {
    super.setNome(nome);
    }
    
    /** 
     * @return int
     */
    // SENHA FUNCIONARIO ------
    public int getSenha() {
        return super.getSenha();
    }
    
    
    /** 
     * @param senha
     */
    public void setSenha(int senha) {
        super.setSenha(senha);

    }

    
    /** 
     * @param nome
     */
    //----------------------ATRIBUIÇÕES----------------------
    //--------------------CRIAR MATERIAL---------------------
    public void criarMaterial(Material nome){
    
        Material M = new Material();

    }

    //------------------ARMAZENAR MATERIAL-------------------
    public void armazenarMaterial(){
        
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
