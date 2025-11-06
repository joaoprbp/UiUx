# UiUx
Para esta atividade avaliativa de Ui e Ux, precisavamos analisar um código jáa disponibilizado e montar um grafo e um fluxograma do mesmo.

Logo abaixo, está o grafo criado a partir do código da classe User dentro da pasta de Login já disponibilizado pela atividade. Com o grafo feito, conseguimos analisar todos os caminhos possíveis, nós e outras informações úteis.

graph TD
    A[Início] --> B[Chamar método verificarUsuario()]
    B --> C[Conectar ao Banco de Dados]
    C --> D[Executar consulta SQL]
    D --> E{Existe resultado?}
    E -->|Sim| F[Define result = true]
    F --> G[Armazena nome do usuário]
    G --> H[Fim do método]
    E -->|Não| I[Define result = false]
    I --> H
    H --> J[Retorna result]
    J --> K[Fim]
