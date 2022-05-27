
# 🤒 CRUD Farmácia
Este repositório possui o objetivo de apresentar um CRUD desenvolvido em Java que possui integração com MySql, o tema do CRUD baseia-se em uma farmácia, com cadastro e manipulação de dados de seus medicamentos. Esse projeto foi desenvolvido em trabalho feito na disciplina de Programação Orientada a Objetos, do curso de Análise e Desenvolvimento de Sistemas.


## 👨‍💻 Sobre o projeto: 

Como foi dito antes, o sistema é um CRUD de dados de medicamentos de uma farmácia. Com as funcionalidades de criar, ler, atualizar e apagar os dados dos mesmos. As classes utilizadas no projeto são: 

Uma classe para a declaração dos atributos que serão utilizados no projeto, com seus ```Getters``` e ```Setters```;

Uma classe chamada ```ConnectionFactory``` que fará a conexão com o banco de dados e possui um método principal que será chamado nas outras classes;

Uma classe DAO/```Data Acess Object``` que fará a manipulação desta conexão feita na ```ConnectionFactory``` e que terá os principais métodos do CRUD;

Uma classe ```Main``` que instaciará todas essas outras classes e fará a manipulação de seus atributos e métodos e terá a interface principal do projeto.


### 💊 Classe Medicamentos

Como foi dito, essa classe possui a declaração dos atributos que servirão futuramente para as outras classes
com seus ```Getters/Setters``` 

### 🔌 Classe ConnectionFactory

Essa classe possui os atributos relacionados ao usuário, senha e url de conexão pelo localhost da máquina com o MySql. Em seguida, uma função principal chamada ```Connection createConnToSQL()```  junta esses atributos dentro dos parâmetros de um sub-método ```DriverManager.getConnection(url, user, pass)```
onde, esse método é atribuído a um atributo chamado ```conn``` que é inserido dentro de um try catch que tentará de fato executar a função de conexão com o banco de dados em si.

### 💉 Classe FarmaciaDAO

Essa classe será responsável por manipular essa conexão feita anteriormente, criando as funções do CRUD, que além de manipular os dados dentro do sistema, atualizará eles dentro do banco de dados. Os métodos contidos nela possuem quase sempre a mesma lógica, eles possuem dois atributos, um do tipo ```Connection``` e outro do tipo ```PreparedStatement``` que inicialmente possuem os valores nulos,
além disso, existe uma variável do tipo ```String``` chamada ```sql```, que nela terá o comando SQL que fará parte da lógica daquele método, ou seja, se for o método de Inser/Create o valor da variável ```sql``` será:

```"INSERT INTO medicamento(nome_laboratorio, preco, dt_vencimento, nome_medicamento, qtd_estoque) VALUES (?, ?, ?, ?, ?)";```

E dessa forma o comando vai mudando de acordo com o método.

Voltando nos outros atributos citados, eles serão inicializados corretamente a partir de um ```try catch```
que tentará efetuar a função de cada método, por exemplo, voltando no método de Insert/Create, dentro do ```try catch```
terá a lógica necessária para efetuar a funcionalidade de inserir um medicamento, e dessa forma o código vai fluindo e se adaptando de acordo com suas funcionalidades.

### 🔥 Classe Main

Por último temos a classe principal, todas as funcionalidades do CRUD estão separadas por métodos, com seus devidos atributos e objetos declarados dentro de seus escopos. Elas são chamadas por um menu 
que está organizado por um ```switch case```, de acordo com o que o usuário solicita o ```switch``` chama cada método do CRUD.

Confira um exemplo do menu: 
```
================================
Bem-vindo ao sistema de farmácia
================================

Escolha uma opção: 
(L) Listar todos os medicamentos
(I) Inserir novo medicamento
L

=========================
Listagem de medicamentos: 
ID - Nome
4 - Dorflex
5 - Resfrenol
6 - Novalgina 
9 - Gelol
11 - Dipirona

Escolha uma outra opção: 
(V) Voltar para o menu principal
(E) Exibir medicamento pelo ID
(A) Atualizar medicamento
(X) Apagar medicamento
```

## 🙏🏻 Obrigado pela atenção!

Dessa forma finalizo por aqui, caso queira me passar algum feedback ou sugestão sobre o que e como posso melhorar, basta me mandar um e-mail: saulobarbosadelima@gmail.com

<img src="https://tenor.com/view/cute-adorable-one-piece-luffy-wave-gif-17513607" alt="Luffy"></img>

