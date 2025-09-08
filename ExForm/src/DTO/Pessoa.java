
package DTO;

public class Pessoa {
    
    private String nome, sobrenome, email, telefone, CEP, CPF, RG;
    private int idade;

    public Pessoa(String nome, String sobrenome, String email, String telefone, String CEP, String CPF, String RG, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.CEP = CEP;
        this.CPF = CPF;
        this.RG = RG;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String CEP) {
        this.CEP = CEP;
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
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa { " + "Nome: " + nome + " | Sobrenome: " + sobrenome + " | Email: " + email + " | Telefone: " + telefone 
                + " | CEP: " + CEP + " | CPF: " + CPF + " | RG: " + RG + " | Idade: " + idade + '}';
    }
    
    
}
