package oo.relacoes;

import oo.relacoes.agragacao.Carrinho;
import oo.relacoes.agragacao.Produto;
import oo.relacoes.associacao_simples.Cliente;
import oo.relacoes.associacao_simples.Conta;
import oo.relacoes.composicao.Revista;

public class Principal {
    public static void main(String[] args) {
        
        // Associação Simples
        Cliente juliano = new Cliente("Juliano", "11111111111", 1976, "teste@teste.com");
        Conta um = new Conta(juliano);
        
        um.imprimirConta();
        
        Cliente lucas = new Cliente("Lucas", "22222222222", 1994, "lucas@teste.com");
        Conta dois = new Conta(lucas);
        dois.setSaldo(1000.0);
        
        dois.imprimirConta();
        System.out.println("____________________________\n");
        
        // Agragação
        Produto xboxSeriesX = new Produto("Xbox Series X", 4500.00);
        Produto playStationCinco = new Produto("PlayStation 5", 5000.00);
        Produto nitendoSwitch = new Produto("Nitendo Switch", 3100.00);
        Carrinho shops = new Carrinho();
        
        shops.adicionar(xboxSeriesX, 1);
        shops.adicionar(playStationCinco, 2);
        shops.adicionar(nitendoSwitch, 3);
        shops.exibir();
        System.out.println("Valor total da compra: R$ "+shops.valorTotal()+" reais.");
        System.out.println("____________________________\n");
        
        // Composição
        
        // Construtor :  nome / tipo / numero edicao / ano / título
        Revista motorEsporte1 = new Revista("Motor Esporte", "automobilismo", 1, 2024, "O Hiper-carro da Red Bull!");
        System.out.println(motorEsporte1.getEdicao());
        System.out.println("Codigo Revista: "+motorEsporte1.getCodigo());
        
        Revista curioso1 = new Revista("Curioso!", "curiosidades", 1, 2024, "Ciclo de vida do Whey Protein");
        System.out.println(curioso1.getEdicao());
        System.out.println("Codigo Revista: "+curioso1.getCodigo());
   }
}
