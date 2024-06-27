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
        System.out.println("\nVencedores:");
        vencedores.forEach(System.out::println);
    }
}
