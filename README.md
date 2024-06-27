## ORDENAÇÃO

### Descrição

Este projeto demonstra como manipular e ordenar listas de objetos em três linguagens de programação diferentes: JavaScript, Python e Java. Em cada linguagem, os seguintes métodos são aplicados a listas de objetos:

1. Ordenação por nome.
2. Ordenação por idade.
3. Seleção dos três primeiros itens da lista.
4. Filtragem e ordenação dos quatro primeiros itens da lista.
5. Filtragem e ordenação de vencedores.

### JavaScript

#### Código

```javascript
// Dados iniciais
const dados = [
  { nome: "Robson", idade: 30 },
  { nome: "Barbara", idade: 29 },
  { nome: "José", idade: 26 },
  { nome: "Eduardo", idade: 35 },
  { nome: "Rafaella", idade: 27 },
  { nome: "Anderson", idade: 25 },
];

// Ordenando por nome
let NewOrdem = dados.sort((a, b) => a.nome.localeCompare(b.nome));
console.table(NewOrdem);

// Ordenando por idade
let ordemDeIdade = dados.sort((a, b) => a.idade - b.idade);
console.table(ordemDeIdade);

// Pegando os três primeiros itens
let ordemNew = dados.slice(0, 3);
console.table(ordemNew);

// Pegando os quatro primeiros itens, filtrando strings e ordenando por nome
let ordemDiferente = dados
  .slice(0, 4)
  .filter((item) => typeof item.nome === "string")
  .sort((a, b) => a.nome.localeCompare(b.nome));
console.table(ordemDiferente);

// Dados de vencedores
const winners = [
  { nome: "Ricardo", Win: "Ganhou" },
  { nome: "Gisele", Win: "Perdeu" },
  { nome: "Owsvaldo", Win: "Ganhou" },
  { nome: "Ana", Win: "Perdeu" },
  { nome: "Isla", Win: "Ganhou" },
];

// Função para encontrar vencedores
function vencedores(winner) {
  let result = winner
    .filter((item) => item.Win === "Ganhou")
    .sort((a, b) => a.nome.localeCompare(b.nome));
  return console.table(result);
}

// Chamando a função vencedores
vencedores(winners);
```

#### Explicação

1. **Ordenação por nome**: Utiliza `sort()` e `localeCompare()` para ordenar a lista `dados` pelo campo `nome`.
2. **Ordenação por idade**: Utiliza `sort()` para ordenar a lista `dados` pelo campo `idade`.
3. **Seleção dos três primeiros itens**: Utiliza `slice(0, 3)` para selecionar os três primeiros itens da lista `dados`.
4. **Filtragem e ordenação dos quatro primeiros itens**: Utiliza `slice(0, 4)`, `filter()` e `sort()` para selecionar, filtrar e ordenar os quatro primeiros itens da lista `dados`.
5. **Filtragem e ordenação de vencedores**: Utiliza `filter()` e `sort()` para filtrar e ordenar a lista `winners` pelo campo `nome`.

### Python

#### Código

```python
# Dados iniciais
dados = [
    {"nome": "Robson", "idade": 30},
    {"nome": "Barbara", "idade": 29},
    {"nome": "José", "idade": 26},
    {"nome": "Eduardo", "idade": 35},
    {"nome": "Rafaella", "idade": 27},
    {"nome": "Anderson", "idade": 25}
]

# Ordenando por nome
new_ordem = sorted(dados, key=lambda x: x["nome"])
print("Ordenado por nome:")
for item in new_ordem:
    print(item)

# Ordenando por idade
ordem_de_idade = sorted(dados, key=lambda x: x["idade"])
print("\nOrdenado por idade:")
for item in ordem_de_idade:
    print(item)

# Pegando os três primeiros itens
ordem_new = dados[:3]
print("\nTrês primeiros itens:")
for item in ordem_new:
    print(item)

# Pegando os quatro primeiros itens, filtrando strings e ordenando por nome
ordem_diferente = sorted(
    filter(lambda x: isinstance(x["nome"], str), dados[:4]),
    key=lambda x: x["nome"]
)
print("\nQuatro primeiros itens filtrados e ordenados:")
for item in ordem_diferente:
    print(item)

# Dados de vencedores
winners = [
    {"nome": "Ricardo", "Win": "Ganhou"},
    {"nome": "Gisele", "Win": "Perdeu"},
    {"nome": "Owsvaldo", "Win": "Ganhou"},
    {"nome": "Ana", "Win": "Perdeu"},
    {"nome": "Isla", "Win": "Ganhou"}
]

# Função para encontrar vencedores
def vencedores(winner):
    result = sorted(
        filter(lambda x: x["Win"] == "Ganhou", winner),
        key=lambda x: x["nome"]
    )
    print("\nVencedores:")
    for item in result:
        print(item)

# Chamando a função vencedores
vencedores(winners)
```

#### Explicação

1. **Ordenação por nome**: Utiliza `sorted()` com `lambda` para ordenar a lista `dados` pelo campo `nome`.
2. **Ordenação por idade**: Utiliza `sorted()` com `lambda` para ordenar a lista `dados` pelo campo `idade`.
3. **Seleção dos três primeiros itens**: Utiliza slicing (`dados[:3]`) para selecionar os três primeiros itens da lista `dados`.
4. **Filtragem e ordenação dos quatro primeiros itens**: Utiliza `filter()`, `sorted()` e `lambda` para selecionar, filtrar e ordenar os quatro primeiros itens da lista `dados`.
5. **Filtragem e ordenação de vencedores**: Utiliza `filter()`, `sorted()` e `lambda` para filtrar e ordenar a lista `winners` pelo campo `nome`.

### Java

#### Código

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + ", idade=" + idade + '}';
    }
}

class Winner {
    String nome;
    String win;

    Winner(String nome, String win) {
        this.nome = nome;
        this.win = win;
    }

    @Override
    public String toString() {
        return "Winner{" + "nome='" + nome + '\'' + ", win='" + win + '\'' + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Pessoa> dados = new ArrayList<>();
        dados.add(new Pessoa("Robson", 30));
        dados.add(new Pessoa("Barbara", 29));
        dados.add(new Pessoa("José", 26));
        dados.add(new Pessoa("Eduardo", 35));
        dados.add(new Pessoa("Rafaella", 27));
        dados.add(new Pessoa("Anderson", 25));

        // Ordenando por nome
        List<Pessoa> newOrdem = new ArrayList<>(dados);
        Collections.sort(newOrdem, Comparator.comparing(p -> p.nome));
        System.out.println("Ordenado por nome:");
        newOrdem.forEach(System.out::println);

        // Ordenando por idade
        List<Pessoa> ordemDeIdade = new ArrayList<>(dados);
        Collections.sort(ordemDeIdade, Comparator.comparingInt(p -> p.idade));
        System.out.println("\nOrdenado por idade:");
        ordemDeIdade.forEach(System.out::println);

        // Pegando os três primeiros itens
        List<Pessoa> ordemNew = new ArrayList<>(dados.subList(0, 3));
        System.out.println("\nTrês primeiros itens:");
        ordemNew.forEach(System.out::println);

        // Pegando os quatro primeiros itens, filtrando strings e ordenando por nome
        List<Pessoa> ordemDiferente = dados.subList(0, 4).stream()
                .filter(item -> item.nome instanceof String)
                .sorted(Comparator.comparing(p -> p.nome))
                .collect(Collectors.toList());
        System.out.println("\nQuatro primeiros itens filtrados e ordenados:");
        ordemDiferente.forEach(System.out::println);

        // Dados de vencedores
        List<Winner> winners = new ArrayList<>();
        winners.add(new Winner("Ricardo", "Ganhou"));
        winners.add(new Winner("Gisele", "Perdeu"));
        winners.add(new Winner("Owsvaldo", "Ganhou"));
        winners.add(new Winner("Ana", "Perdeu"));
        winners.add(new Winner("Isla", "Ganhou"));

        // Função para encontrar vencedores
        List<Winner> vencedores = winners.stream()
                .filter(item -> item.win.equals("Ganhou"))
                .sorted(Comparator.comparing(w -> w.nome))
                .collect(Collectors.toList());
        System.out.println("\nVencedores

:");
        vencedores.forEach(System.out::println);
    }
}
```

#### Explicação

1. **Ordenação por nome**: Utiliza `Collections.sort()` com `Comparator.comparing()` para ordenar a lista `dados` pelo campo `nome`.
2. **Ordenação por idade**: Utiliza `Collections.sort()` com `Comparator.comparingInt()` para ordenar a lista `dados` pelo campo `idade`.
3. **Seleção dos três primeiros itens**: Utiliza `subList(0, 3)` para selecionar os três primeiros itens da lista `dados`.
4. **Filtragem e ordenação dos quatro primeiros itens**: Utiliza `subList(0, 4)`, `filter()`, `sorted()` e `Comparator.comparing()` para selecionar, filtrar e ordenar os quatro primeiros itens da lista `dados`.
5. **Filtragem e ordenação de vencedores**: Utiliza `filter()`, `sorted()` e `Comparator.comparing()` para filtrar e ordenar a lista `winners` pelo campo `nome`.

### Conclusão

Este projeto demonstra como realizar operações comuns de manipulação de listas em três linguagens diferentes, fornecendo uma comparação direta entre JavaScript, Python e Java. Cada linguagem tem suas próprias peculiaridades e métodos para realizar essas operações, mas o conceito subjacente permanece o mesmo.
