Para esta atividade avaliativa de UI e UX, precisávamos analisar um código já disponibilizado e montar um grafo e um fluxograma do mesmo.

Logo abaixo, está o grafo criado a partir do código da classe `User` dentro da pasta de `Login`, já disponibilizado pela atividade. Com o grafo feito, conseguimos analisar todos os caminhos possíveis, nós e outras informações úteis.

```mermaid
graph TD
    A[Inicio] --> B[Chamar metodo verificarUsuario]
    B --> C[Conectar ao Banco de Dados]
    C --> D[Executar consulta SQL]
    D --> E{Existe resultado?}
    E -->|Sim| F[Define result = true]
    F --> G[Armazena nome do usuario]
    G --> H[Fim do metodo]
    E -->|Nao| I[Define result = false]
    I --> H
    H --> J[Retorna result]
    J --> K[Fim]
