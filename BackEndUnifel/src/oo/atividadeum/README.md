# Dica de relacionamento entre objetos

## Relação 1:1
* Adiciona um atributo do tipo da classe em ambas que se relacionam;
* No método construtor vincula os objetos criados de ambas as classes;
* Quando private criar os métodos getters e setters normalmente;

ex:
<br>
1 aluno possui uma turma;
<br>

```
public class Aluno {
    // Atributo
    private Turma turma

    // Método Construtor
    public Aluno() {
        this.turma = turma;
    }
}
```

## Relação 1:n
* Na classe que possui relação "1" repete as instruções anteriores;
* Na classe que possui relação "n" cria como atributo um "ArrayList" do tipo da classe que se relaciona;
    * Instancia o objeto "ArrayList" no método construtor com o atributo do tipo da classe;
    * Para o atributo objeto de "Arraylist" não se cria métodos getters e setters;
    * Criar na classe métodos para manipulação CRUD;

ex:
<br>
1 turma pode ter vários alunos;
<br>

```
public class Turma {
   // Atributo
    private ArrayList<Aluno> alunos;

    // Método Construtor
    public Turma() {
        this.alunos = new ArrayList<Aluno>();
    }
    
    // Métodos de manipulação
    
    // Adicionar Aluno
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    // Excluir Aluno
    public void excluirAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
    
    // Selecionar Aluno
    public Aluno getAluno(int posicao) {
        return alunos.get(posicao);
    }
    
    // Quantidade de Alunos
    public int quantidadeAlunos() {
        return alunos.size();
    }
}
```
## Relação n:n
* Relacionamento bi-direcional, instanciando no método construtor de ambas as classes o objeto lista
(como atributo) da classe relacionada, como na relação "n", citada anteriormente, adicionando também
os métodos de manipulação para criar o vínculo.