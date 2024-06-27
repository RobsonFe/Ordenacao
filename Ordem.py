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

# Imprimindo a tabela ordenada por nome
print("Ordenado por nome:")
for item in new_ordem:
    print(item)

# Ordenando por idade
ordem_de_idade = sorted(dados, key=lambda x: x["idade"])

# Imprimindo a tabela ordenada por idade
print("\nOrdenado por idade:")
for item in ordem_de_idade:
    print(item)

# Pegando os três primeiros itens
ordem_new = dados[:3]

# Imprimindo os três primeiros itens
print("\nTrês primeiros itens:")
for item in ordem_new:
    print(item)

# Pegando os quatro primeiros itens, filtrando strings e ordenando por nome
ordem_diferente = sorted(
    filter(lambda x: isinstance(x["nome"], str), dados[:4]), 
    key=lambda x: x["nome"]
)

# Imprimindo a tabela filtrada e ordenada
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
    # Imprimindo a tabela de vencedores
    print("\nVencedores:")
    for item in result:
        print(item)

# Chamando a função vencedores
vencedores(winners)
