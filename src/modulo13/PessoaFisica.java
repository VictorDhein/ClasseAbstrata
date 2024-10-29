package modulo13;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataNascimento;

    // Construtor da classe PessoaFisica
    public PessoaFisica(String nome, String endereco, String cpf, String dataNascimento) {
        super(nome, endereco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters para cpf e dataNascimento
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

  
    public String getDetalhes() {
        return "CPF: " + cpf + ", Data de Nascimento: " + dataNascimento;
    }
    
  
    public String toString() {
        return super.toString() + ", " + getDetalhes();
    }
}
