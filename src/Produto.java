public class Produto {

    private String nome;
    private int preco;
    private int quantidade;

    Produto(String nome, int preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //get nome
    String getNome(){
        return this.nome;
    }

    //set nome
    void setNome(){
        this.nome = nome;
    }

    //get preço
    int getPreco(){
        return this.preco;
    }

    //set preço
    void setPreco(){
        this.preco = preco;
    }

    //get quantidade
    int getQuantidade(){
        return this.quantidade;
    }

    //set quantidade

    void setQuantidade(){
        this.quantidade = quantidade;
    }

    void comprarProduto(int quantidade){
        this.quantidade -= quantidade;
    }
}
