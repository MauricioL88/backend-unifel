package oo.relacoes.agragacao;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto produto, Integer qtd) {
        produto.setQuantidade(qtd);
        produtos.add(produto);
        System.out.println("Valor total do item no carrinho: R$ " + (produto.getValor() * produto.getQuantidade()) + " reais.");
    }

    public void exibir() {
        System.out.println("Produto(s) no Carrinho:");
        for (Produto produto : produtos) {
            System.out.println("Item: " + produto.getNome() + " Quantidade: " + produto.getQuantidade());
        }
    }

    public Double valorTotal() {
        Double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getValor() * produto.getQuantidade();
        }
        return total;
    }
}
