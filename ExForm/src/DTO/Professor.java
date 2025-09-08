
package DTO;

public class Professor extends Pessoa{
    
    private String nome, Sobrenome, CPF, RG, Telefone, Curso, NMatricula;

    public Professor(String nome, String sobrenome, String email, String telefone, String CEP, String CPF, String RG, int idade, String curso, String nMatricula) {
        super(nome, sobrenome, email, telefone, CEP, CPF, RG, idade);
        this.Curso = curso;
        this.NMatricula = nMatricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return Sobrenome;
    }
    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getRG() {
        return RG;
    }
    public void setRG(String RG) {
        this.RG = RG;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    public String getCurso() {
        return Curso;
    }
    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    public String getNMatricula() {
        return NMatricula;
    }
    public void setNMatricula(String NMatricula) {
        this.NMatricula = NMatricula;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", Sobrenome=" + Sobrenome + ", CPF=" + CPF + ", RG=" + RG + ", Telefone=" + Telefone + ", Curso=" + Curso + ", NMatricula=" + NMatricula + '}';
    }
    
    
}
