# sozin — Estudos de Java: do básico ao avançado

Repositório de estudos pessoal em **Java**, organizado como uma trilha de aprendizado contínua,
do primeiro `Hello World` até conceitos intermediários/avançados de POO (herança, polimorfismo,
interfaces, encapsulamento) e, no futuro, frameworks como Spring Boot.

O objetivo não é ser um projeto de produção, mas sim um **laboratório vivo**: cada pasta
é um tópico estudado na prática, com código executável e comentários explicando *por quê*
cada decisão foi tomada.

---

## 📚 Trilha de estudos

| Nível | Tópico | Pasta / Arquivo | O que é estudado |
| :---: | :--- | :--- | :--- |
| Básico | Classes e objetos | `src/` | Atributos, construtor padrão, construtor parametrizado, `this`, encapsulamento |
| Básico | Modificadores de acesso | `Clean/` | `public`, `private`, `protected` e *package-private*, construtor privado, *factory method* |
| Intermediário | Arrays e Coleções | `API/arrays/` | Arrays unidimensionais, `length`, `ArrayList`, *for-each* |
| Intermediário | Conversão de tipos (*cast*) | `API/cast_conversaoDeTipos/` | `parseDouble`, coerção implícita e explícita (`(int)`) |
| Intermediário | Classes | `API/classes/` | Encapsulamento, construtor privado + `createCarro`, classes no mesmo arquivo |
| Intermediário | Herança | `API/heranca/` | Classes abstratas, `super`, `@Override`, métodos concretos vs. abstratos |
| Intermediário | Interfaces | `API/Interfaces/` | Contratos de comportamento, `implements`, sobrescrita, coerção para a interface |
| Avançado | Polimorfismo | `API/polimorfismo/` | Herança + abstração + sobrescrita, referência do tipo base apontando para subtipo |
| Avançado | Spring Boot | `API/SpringBoot/` | *Em andamento* — reservada para o próximo ciclo de estudos |

### Mapa de conceitos por pasta

**`src/` —Classes e objetos**
- Classe `Caneta` com atributos `public`, `private` e `protected`.
- Dois construtores: o parametrizado e o padrão, que delega o trabalho para o primeiro
  via `this(...)`.
- Demonstração de que **não se deve instanciar objetos dentro da própria classe**
  (`//Caneta caneta1 = new Caneta(...)` está comentado justamente por isso).

**`Clean/` — Modificadores de acesso**
- `Car` e `Human` com construtor **privado** e *factory methods* (`createCar`, `createHuman`),
  garantindo que objetos só sejam criados por um ponto único e controlado.
- Atributos `private` (ex.: `socialSecurityNumber`) ficam inacessíveis fora da classe.
- Comparação com `API/classes/`, que mostra a mesma ideia de forma mais simples.

**`API/` — Módulo de APIs e POO**
- `arrays/` — arrays vs. `ArrayList`, *for* clássico vs. *for-each*.
- `cast_conversaoDeTipos/` — `Double.parseDouble` e *casting* de `double` para `int`.
- `classes/` — encapsulamento e criação controlada de objetos.
- `heranca/` — classe abstrata `SerVivo` com `Humano` como implementação concreta.
- `Interfaces/` — interface `Carro` implementada por `Fusca` e `GolBola`.
- `polimorfismo/` — o mesmo método `respirar()` se comporta de forma diferente em `Humano`
  e `Cachorro`, chamada através de uma referência do tipo `SerVivo`.

---

## 🛠️ Como executar

Pré-requisito: **JDK** instalado e `javac`/`java` disponíveis no `PATH`
(`java -version` e `javac -version` para conferir).

### Compilar e rodar um exemplo

```bash
# 1. compila os arquivos do pacote desejado
javac API/polimorfismo/*.java

# 2. executa a classe principal (o pacote é separado por ponto)
java API.polimorfismo.Main
```

### Compilando separando os `.class` (organização)

```bash
# gera os .class em ./out preservando a estrutura de pacotes
javac -d out API/polimorfismo/*.java

# executa a partir do diretório de saída
java -cp out API.polimorfismo.Main
```

> **Nota:** o `package` sempre corresponde à pasta do projeto. O nome da pasta vira o
> nome do pacote (`API/polimorfismo` → `package API.polimorfismo;`) e é assim que a JVM
> resolve as classes em tempo de execução. Mais detalhes em [`java_package_run.md`](java_package_run.md).

### Executando em uma IDE

IntelliJ IDEA, Eclipse ou VS Code: importe a pasta raiz do projeto e marque `src/` e as
pastas dentro de `API/` como *source roots*. Depois é só dar **Run** no `main` desejado.

---

## 📂 Estrutura do repositório

```
sozin/
├── README.md                  # este arquivo
├── java_package_run.md        # notas rápidas sobre packages e execução
├── src/                       # nível básico: classes, objetos, construtores
├── Clean/                     # nível básico/intermediário: encapsulamento e visibilidade
├── API/                       # módulo de estudos da linguagem e POO
│   ├── arrays/
│   ├── cast_conversaoDeTipos/
│   ├── classes/
│   ├── heranca/
│   ├── Interfaces/
│   ├── polimorfismo/
│   └── SpringBoot/            # reservado para os próximos estudos
└── out/                       # saída de compilação (javac -d out)
```

---

## 📝 Convenções do repositório

- Cada tópico de estudo vive em **uma pasta = um pacote**, com o próprio `Main` quando há
  comportamento para demonstrar.
- Os exemplos são **executáveis e independentes**: rode qualquer um sem depender dos outros.
- Comentários no código explicam o *conceito*, não a sintaxe óbvia — é onde fica a maior
  parte do aprendizado.
- `.class` e a pasta `out/` são artefatos de compilação e não fazem parte do conteúdo
  de estudo.

---

## 🚀 Próximos passos

- [ ] Completar o módulo `API/SpringBoot` (annotations, DI, Spring Data, REST).
- [ ] Adicionar exemplos de **generics**, **collections** (`Map`, `Set`, `Queue`) e **streams**.
- [ ] Praticar **exceptions** e tratamento de erros (`try/catch`, checked vs. unchecked).
- [ ] Introduzir **testes unitários** com JUnit.
- [ ] Adicionar **threads e concorrência** e boas práticas de uso da API de collections.
- [ ] Criar um projeto final integrando os conceitos estudados.
