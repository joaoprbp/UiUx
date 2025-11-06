Para esta atividade avaliativa de UI e UX, precisávamos analisar um código já disponibilizado e montar um grafo e um fluxograma do mesmo.

Logo abaixo, está o grafo de fluxo criado a partir do código da classe `User` dentro da pasta de `Login`, já disponibilizado pela atividade. Com o grafo feito, conseguimos analisar todos os caminhos possíveis, nós e outras informações úteis.

```mermaid
flowchart TD
A1["1"] --> A2["2"]
    A2 --> A3["3"]
    A3 --> A4["4"]
    A4 --> A5["5"]

    A5 -->|Sim| A6["6"]
    A6 --> A7["7"]
    A7 --> A8["8"]
    A8 --> A10["10"]

    A5 -->|Nao| A9["9"]
    A9 --> A10
