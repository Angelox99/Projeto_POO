import java.util.ArrayList;

public class Colaborador extends Funcionario{
    
    
    
    // NOME DO FUNCIONARIO -----------
    protected String nome;
    
    /** 
     * @return String
     */
    public String getNome() {
        return nome;
    }
    
    /** 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    // MATRICULA DO FUNCIONARIO ------
    protected int matricula;
    
    /** 
     * @return int
     */
    public int getMatricula() {
        return matricula;
    }
    
    /** 
     * @param matricula
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    // DEPARTAMENTO DO FUNCIONARIO ------
    protected String departamento;
    
    /** 
     * @return String
     */
    public String getDepartamento() {
        return departamento;
    }
    
    /** 
     * @param departamento
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    // CARGO FUNCIONARIO ------
    protected String cargo;
    
    /** 
     * @return String
     */
    public String getCargo() {
        return cargo;
    }
    
    /** 
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    /** 
     * @return int
     */
    public int getSenha() {
        return super.getSenha();
    }
    
    /** 
     * @param senha
     */
    // SENHA FUNCIONARIO ------
    public void setSenha(int senha) {
        super.setSenha(senha);

    }
}
