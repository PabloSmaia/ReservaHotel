package mapa.demo;

public class Hospede {
    private int codigo;
    private String nome;
    private String endereço;
    private int idade;

    /**
     * @param codigo
     * @param nome
     * @param endereço
     * @param idade
     */
    public Hospede(int codigo, String nome, String endereço, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereço = endereço;
        this.idade = idade;
    }

    public Hospede() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Hospede [codigo=" + codigo + ", endereço=" + endereço + ", idade=" + idade + ", nome=" + nome + "]";
    }

}
