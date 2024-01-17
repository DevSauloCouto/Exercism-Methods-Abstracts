# Exercício Métodos Abstratos

### ESPECIFICAÇÃO

Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado. 

Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as seguintes: 

Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
destes gastos são abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
fica: (50000 * 25%) - (2000 * 50%) = 11500.00 

Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00

### Detalhes sobre a solução

Utilizei os conceitos de Herança e Polimorfismo para resolver o exercício. As Classes `PhysicalPerson` e `LegalPerson` possuem em comum alguns atributos e métodos, sendo assim criei uma 
Classe abstrata `Person` que irá possuir os atributos e métodos que são comuns entre suas futuras Subclasses (`PhysicalPerson`, `LegalPerson`). 

As implementações do método em comum entre as Subclasses utilizam de diferentes regras de negócio, com isso analisado, declarei este método como abstrato na Superclasse genérica, para em
cada Subclasse ser implementado de acordo com sua regra de negócio. 

No programa principal, ele irá coletar os dados necessários dependendo do tipo de Pessoa e vai adicionar a uma lista do tipo da Superclasse genérica objetos `PhysicalPerson` ou `LegalPerson`.
Com isso eu posso livremente apresentar/imprimir no console os valores de imposto para cada Pessoa seguindo a ordem em que foram adicionadas e também posso fazer o cálculo total do imposto
arrecadado.
