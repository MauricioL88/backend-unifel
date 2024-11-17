# Estudo de Relacionamentos entre as classes na Orientação à Objetos

## Associação Simples
* Quando duas classes se relacionam (se utilizam, uma dentro da outra ou como parâmetro)
mas não há dependencia entre elas para existirem;
* No diagrama de classe essa relação é representada por uma linha simples;

ex:
<br>

```mermaid

classDiagram
class Conta {
    +static num : int
    -conta : Integer
    -agencia : String
    -cliente : Cliente
    -saldo : Double
}

class Cliente {
    +static num : int
    -id : Integer
    -nome : String
    -cpf : String
    -anoNascimento : Integer
    -email : String
}


Cliente -- Conta

```

## Agragação


## Composição 