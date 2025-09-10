
package DTO;

public class Alnuo extends Pessoa{
    
    private String NMatricula, Curso, Responsavel;
            
    public Alnuo(String nome, String sobrenome, String email,
            String telefone, String CEP, String CPF, String RG, int idade,
            String NMatricula, String Curso, String Responsavel) {
        super(nome, sobrenome, email, telefone, CEP, CPF, RG, idade);
        this.Curso = Curso;
        this.NMatricula = NMatricula;
        this.Responsavel = Responsavel;
    }

    public String getNMatricula() {
        return NMatricula;
    }
    public void setNMatricula(String NMatricula) {
        this.NMatricula = NMatricula;
    }
    public String getCurso() {
        return Curso;
    }
    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    public String getResponsavel() {
        return Responsavel;
    }
    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }

    @Override
    public String toString() {
        return "Alnuo{" + "Nome: " + getNome() + "| Sobrenome: " + getSobrenome() + "| CPF: " + getCPF() + "| RG: " + getRG()
                + "| Telefone: " + getTelefone() + "| Curso: " + Curso + "| NMatricula: " + NMatricula + "| Responsável: " + Responsavel +'}';
    }
    
    
    
    
    
}
