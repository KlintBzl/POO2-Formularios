
package DTO;

public class Professor extends Pessoa{
    
    private String Curso, NMatricula;

    public Professor(String nome, String sobrenome, String email, String telefone, String CEP, String CPF, String RG, int idade, String curso, String nMatricula) {
        super(nome, sobrenome, email, telefone, CEP, CPF, RG, idade);
        this.Curso = curso;
        this.NMatricula = nMatricula;
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
        return "Professor{" + "nome: " + getNome() + "| Sobrenome: " + getSobrenome() + "| CPF: " + getCPF() + "| RG: " + getRG()
                + "| Telefone: " + getTelefone() + "| Curso: " + Curso + "| NMatricula: " + NMatricula + '}';
    }
    
    
}
