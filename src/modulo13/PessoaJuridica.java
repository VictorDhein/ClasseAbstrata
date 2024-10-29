package modulo13;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    // Construtor da classe PessoaJuridica
    public PessoaJuridica(String nome, String endereco, String cnpj, String razaoSocial) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    // Getters e Setters para cnpj e razaoSocial
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    public String getDetalhes() {
        return "CNPJ: " + cnpj + ", Razão Social: " + razaoSocial;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", " + getDetalhes();
    }
}
