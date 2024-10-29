package modulo13;

public abstract class Pessoa {
    private String nome;
    private String endereco;

    // Construtor da classe Pessoa
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método abstrato para obter detalhes específicos
    public abstract String getDetalhes();
    
    
    public String toString() {
        return "Nome: " + nome + ", Endereço: " + endereco;
    }
}
