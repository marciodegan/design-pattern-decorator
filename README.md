## Design Pattern - Decorator

- Sequence of: https://github.com/marciodegan/design-patterns-observer

### Notes:
- No calculo do imposto, é necessário ser possível calcular vários impostos, sem precisar chamar um por um.
- Criar diferentes classes para fazer a combinação de impostos ficaria inviável, pois são vários.
#### SOLUÇÃO:
- Transformar a interface imposto em classe abstrata.
- É necessário ter um método abstrato para que cada imposto implemente seus detalhes de cálculo. Nota: Esse método pode ser protected para não o deixá-lo exposto.
- É terá também um método calcular (que não será abstrato), que terá uma implementação para calcular o imposto principal e o "outro" imposto (ver classe Imposto).
- As classes ICMS e ISS agora "extends" a classe abstrata Imposto
- O código fica flexivel. Agora conseguimos decorar um imposto com outro imposto sem precisar alterar o código.
- Um imposto não conhece o outro. Conhece pelo atributo "imposto" da classe Imposto, mas não sabe qual é exatamente o outro imposto. 
- Agora não precisamos ficar alterando a calculadora sempre que surgir um novo imposto.
- Decorator = decorar um objeto com outro objeto. Como se fosse uma composição.
- Analogia da Arvore de Natal.
- O padrão Decorator permite adicionar novos comportamentos a um objeto, tornando o código bastante flexível e dinâmico.
- O padrão Decorator é muito poderoso e bastante comum de ser implementado, mas possui alguns detalhes importantes a serem observados, como o fato do Decorator precisar possuir a mesma interface do objeto que ele está decorando.
- É possível adicionar comportamento a classes em tempo de execução;
- More: https://refactoring.guru/design-patterns/decorator