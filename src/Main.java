public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Xbox series X",4500,180);

        System.out.println("nome do produto: "+ p1.getNome());
        System.out.println("Preço R$"+ p1.getPreco());
        System.out.println("A quantidade no estoque é de: "+ p1.getQuantidade() + " unidades");


        //COMPRA DE UM PRODUTO
        System.out.println("\n Após um cliente comprar 1 produto: ");
        p1.comprarProduto(1);
        System.out.println("A nova quantidade é: "+p1.getQuantidade()+ " unidades");


        //COMPRA DE UM PRODUTO
        System.out.println("\nApós um cliente comprar 1 produto:");
        p1.comprarProduto(1);
        System.out.println("A nova quantidade é: "+p1.getQuantidade() +" unidades");



        System.out.println("\nApós um cliente comprar 9 produtos: ");
        p1.comprarProduto(9);
        System.out.println("A nova quantidade é: "+ p1.getQuantidade()+" unidades");











    }
}