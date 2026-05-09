# Desafio: Componentes e Injeção de Dependência 🚀

Projeto prático desenvolvido para aplicar conceitos de inversão de controle e injeção de dependência no ecossistema Spring. O objetivo é simular um fluxo de cálculo de pedido, onde o custo final depende da integração entre diferentes serviços (frete e descontos).

## 📌 O que o sistema faz?
O programa recebe os dados de um pedido via terminal, processa o desconto sobre o valor básico e soma o frete conforme a faixa de preço do produto.

### Regra de Frete aplicada:
| Valor Básico | Frete |
| :--- | :--- |
| Menor que R$ 100,00 | R$ 20,00 |
| Entre R$ 100,00 e R$ 199,99 | R$ 12,00 |
| R$ 200,00 ou mais | Grátis |

## 🏗️ Estrutura de código
A lógica foi separada em camadas de serviço para manter o código limpo e seguir o princípio de responsabilidade única:

* **`OrderService`**: Faz o cálculo do total subtraindo o desconto e injetando o serviço de frete.
* **`ShippingService`**: Isolamento da regra de negócio de logística/frete.
* **`Order`**: Classe de entidade básica para carregar os dados do pedido.

## 🛠️ Tecnologias
* Java 17 (ou superior).
* Spring Boot.
* Maven.

## 🏃 Como rodar
1. Clone o projeto.
2. Importe na sua IDE de preferência.
3. Execute a classe `DesafioApplication.java`.
4. No console, insira as informações conforme solicitado (Código, Valor e Desconto).

---
*Este projeto faz parte do treinamento da [DevSuperior](https://devsuperior.com.br).*