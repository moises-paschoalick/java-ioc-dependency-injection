# 💡 Injeção de Dependência --- Exemplo Casa e Energia

Este exemplo demonstra de forma didática o conceito de **Injeção de
Dependência (Dependency Injection)** utilizando a analogia de uma casa e
suas fontes de energia.

------------------------------------------------------------------------

## ❌ Antes --- Alto Acoplamento

No modelo inicial, a casa é responsável por criar suas próprias fontes
de energia.

### Diagrama

    +----------------------+
    |        Casa          |
    |----------------------|
    | - gerador            |
    | - energiaSolar       |
    |----------------------|
    | + ligarLuzGerador()  |
    | + ligarLuzSolar()    |
    +----------+-----------+
               |
         +-----+------+
         |            |
    +---------+   +--------------+
    | Gerador |   | EnergiaSolar |
    +---------+   +--------------+

### Problemas

-   A classe `Casa` conhece todas as implementações
-   Forte acoplamento
-   Difícil manutenção
-   Para adicionar nova fonte de energia, é necessário alterar a classe
    `Casa`

------------------------------------------------------------------------

## ✅ Depois --- Com Injeção de Dependência

Agora a casa depende de uma abstração (`FonteEnergia`) e recebe a
dependência de fora.

### Diagrama

               +----------------------+
               |        Casa          |
               |----------------------|
               | - FonteEnergia       |
               |----------------------|
               | + ligarLuz()         |
               +----------+-----------+
                          |
                          |
                  +-------+--------+
                  | FonteEnergia   |  <<interface>>
                  +-------+--------+
                          ^
              ------------+-------------
              |                          |
       +--------------+          +--------------+
       |   Gerador    |          | EnergiaSolar |
       +--------------+          +--------------+

------------------------------------------------------------------------

## 🔌 Quem faz a Injeção?

A responsabilidade de decidir qual energia usar agora está fora da
classe `Casa`.

            +----------------------+
            |        Main          |
            |----------------------|
            | new Casa(new ... )   |
            +----------+-----------+
                       |
         ------------------------------
         |                            |
    new Gerador()           new EnergiaSolar()

------------------------------------------------------------------------

## 🎯 Comparação Didática

### Antes

> A casa cria e controla suas próprias dependências.

### Depois

> A casa apenas usa. A dependência é injetada de fora.

------------------------------------------------------------------------

## 🧠 Conceito-chave

> **"Quem usa a dependência não deve ser responsável por criá-la."**

------------------------------------------------------------------------

## 🚀 Benefícios

-   Baixo acoplamento
-   Alta flexibilidade
-   Facilidade para testes (mock/stub)
-   Extensibilidade (Open/Closed Principle)

------------------------------------------------------------------------

## 📌 Conclusão

A Injeção de Dependência é uma forma de aplicar **Inversão de Controle
(IoC)**, delegando a criação das dependências para um agente externo,
tornando o sistema mais modular, testável e escalável.