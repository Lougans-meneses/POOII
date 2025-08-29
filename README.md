# Exercícios sobre SRP (Single Responsibility Principle) e OCP (Open Closed Principle)

## Exercício 1 - SRP Básico

Crie uma classe `Relatorio` que atualmente possui métodos para: - Gerar
dados de relatório - Exportar em PDF - Enviar por e-mail

**Tarefa:** Refatore a classe para que siga o princípio da
responsabilidade única (SRP).


------------------------------------------------------------------------

## Exercício 2 - SRP em um Sistema de Biblioteca

Uma classe `Livro` contém informações do livro, regras de validação e
regras de persistência no banco de dados.

**Tarefa:** Separe as responsabilidades em classes distintas aplicando
SRP.

------------------------------------------------------------------------

## Exercício 3 - OCP Básico

Implemente uma classe `CalculadoraDesconto` que calcula descontos para
diferentes tipos de clientes (padrão, VIP, estudante).

**Tarefa:** Refatore a implementação para seguir o princípio
aberto/fechado (OCP), permitindo adicionar novos tipos de clientes sem
modificar código existente.

------------------------------------------------------------------------

## Exercício 4 - OCP em Relatórios

Um sistema gera relatórios em `PDF` e `CSV`. Atualmente, a lógica de
exportação está toda em um único método com vários `if/else`.

**Tarefa:** Refatore o código para aplicar OCP, permitindo adicionar
novos formatos sem alterar a classe principal.

------------------------------------------------------------------------

## Exercício 5 - Desafio Final

Você foi contratado para desenvolver um **sistema de pedidos online**.\
O sistema deve permitir: - Cálculo do valor total do pedido - Diferentes
estratégias de desconto (ex: desconto percentual, desconto fixo, cupom
promocional) - Diferentes métodos de pagamento (ex: cartão, PIX, PayPal)

### Requisitos:

1.  Aplique **SRP** para garantir que cada classe tenha uma única
    responsabilidade.
2.  Aplique **OCP** para que seja fácil adicionar novos descontos e
    métodos de pagamento sem modificar o código existente.

**Entrega esperada:**\
- Diagrama de classes UML mostrando a separação de responsabilidades.\
- Implementação em Java seguindo os princípios **SRP** e **OCP**.

------------------------------------------------------------------------


# Lista de Exercícios - Princípios SOLID em Java

## Exercício 1 - SRP (Single Responsibility Principle)
Implemente uma classe `Relatorio` que atualmente gera relatórios e também envia emails. Reestruture essa classe aplicando o princípio da responsabilidade única.

---

## Exercício 2 - OCP (Open/Closed Principle)
Implemente um sistema de cálculo de desconto para uma loja, inicialmente com desconto fixo. Em seguida, adapte o sistema para que possa receber novos tipos de desconto sem modificar a lógica já existente.

---

## Exercício 3 - LSP (Liskov Substitution Principle)
Implemente uma classe `Quadrado` que herda de `Retangulo`. Mostre problemas que podem surgir e reestruture o código para estar em conformidade com o LSP.

---

## Exercício 4 - ISP (Interface Segregation Principle)
Implemente uma interface `Trabalhador` com métodos `trabalhar()` e `estudar()`. Mostre como aplicar o ISP criando interfaces mais coesas.

---

## Exercício 5 - DIP (Dependency Inversion Principle)
Implemente um sistema de notificação que envia mensagens via `EmailService`. Refatore o código para que a classe `Notificador` dependa de abstrações e não de implementações concretas.

---

## Exercício 6 - Desafio Final
Implemente um sistema de **Gerenciamento de Pedidos de uma Loja Online**, aplicando todos os princípios do SOLID:

- SRP: separar responsabilidades de classes de pedido, pagamento e envio.  
- OCP: permitir a adição de novos métodos de pagamento sem alterar código existente.  
- LSP: garantir que substituições de classes funcionem sem quebrar o sistema.  
- ISP: dividir interfaces em contratos menores e específicos.  
- DIP: depender de abstrações em vez de implementações concretas.
