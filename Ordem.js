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
// A função sort() ordena a lista baseada na comparação do nome de cada objeto.
// localeCompare() compara dois valores string no local especificado e retorna um número indicando se a string de referência vem antes ou depois ou é a mesma que a string comparada.
let NewOrdem = dados.sort((a, b) => a.nome.localeCompare(b.nome));

// Imprimindo a tabela ordenada por nome
console.table(NewOrdem);

// Ordenando por idade
// A função sort() agora ordena a lista baseada na idade de cada objeto.
// Subtraindo b.idade de a.idade ordena a lista em ordem crescente de idade.
let ordemDeIdade = dados.sort((a, b) => a.idade - b.idade);

// Imprimindo a tabela ordenada por idade
console.table(ordemDeIdade);

// Pegando os três primeiros itens
// A função slice() pega os três primeiros itens da lista (índices 0, 1, 2).
let ordemNew = dados.slice(0, 3);

// Imprimindo os três primeiros itens
console.table(ordemNew);

// Pegando os quatro primeiros itens, filtrando strings e ordenando por nome
// slice(0, 4) pega os quatro primeiros itens.
// filter() filtra os itens onde o campo nome é uma string.
// sort() ordena os itens filtrados pelo campo nome usando localeCompare().
let ordemDiferente = dados
  .slice(0, 4)
  .filter((item) => typeof item.nome === "string")
  .sort((a, b) => a.nome.localeCompare(b.nome));

// Imprimindo a tabela filtrada e ordenada
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
// A função vencedores() filtra a lista winners para incluir apenas os itens onde o campo Win é "Ganhou".
// Em seguida, ordena os itens filtrados pelo campo nome usando localeCompare().
// Finalmente, imprime a tabela dos vencedores.
function vencedores(winner) {
  let result = winner
    .filter((item) => item.Win === "Ganhou")
    .sort((a, b) => a.nome.localeCompare(b.nome));
  return console.table(result);
}

// Chamando a função vencedores
vencedores(winners);
