public class Colaborador extends Funcionario{
    
    
    // NOME DO FUNCIONARIO -----------
    protected String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // MATRICULA DO FUNCIONARIO ------
    protected int matricula;
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    // DEPARTAMENTO DO FUNCIONARIO ------
    protected String departamento;
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    // CARGO FUNCIONARIO ------
    protected String cargo;
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public int getSenha() {
        return super.getSenha();
    }
    // SENHA FUNCIONARIO ------
    public void setSenha(int senha) {
        super.setSenha(senha);

    }
}