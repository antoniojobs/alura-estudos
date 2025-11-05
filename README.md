## ☕ Jogo de Adivinhar o Número (Java 21 + Maven)

### 🚀 Visão Geral

Projeto de exercício em Java para adivinhar um número secreto. É um **Console Application** (execução via terminal) gerenciado pelo **Apache Maven**.

| Build Tool | Linguagem | Versão Mínima |
| :--- | :--- | :--- |
| Maven | Java | 21+ |

### ⚠️ Aviso (Para Consulta)

Este projeto tem uma implementação mais complexa do que o básico para um jogo de adivinhar. Não é a versão mais simples para consulta rápida, mas segue as práticas de um projeto Maven completo.

### 🧠 Como Instanciar

O número de tentativas do jogo é configurado via construtor da classe principal `GamerSort`.

| Classe | Construtor | Parâmetro | Descrição |
| :--- | :--- | :--- | :--- |
| `GamerSort` | `GamerSort(int maxTentativas)` | `int` | **Obrigatório.** Define o limite de chances que o jogador terá. |

**Exemplo de uso:** `GamerSort jogo = new GamerSort(20);`

### ⚙️ Execução Rápida

Pré-requisito: **JDK 21** e **Maven** instalados.

1.  **Construir e Empacotar (Gerar JAR):**
    ```bash
    mvn clean package
    ```

2.  **Rodar o Jogo:**

    * **Opção 1 (Desenvolvimento):**
        ```bash
        mvn exec:java
        ```
    * **Opção 2 (JAR Executável):**
        ```bash
        java -jar target/seu-artefato.jar 
        ```
