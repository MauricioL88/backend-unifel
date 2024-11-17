package oo.associacao;

import oo.associacao.simples.Cliente;
import oo.associacao.simples.Conta;

public class Principal {
    public static void main(String[] args) {
        Cliente juliano = new Cliente("Juliano", "11111111111", 1976, "teste@teste.com");
        Conta um = new Conta(juliano);
        
        um.imprimirConta();
        
        Cliente lucas = new Cliente("Lucas", "22222222222", 1994, "lucas@teste.com");
        Conta dois = new Conta(lucas);
        dois.setSaldo(1000.0);
        
        dois.imprimirConta();
   }
}
