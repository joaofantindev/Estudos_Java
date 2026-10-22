# notas sobre java

### package = pasta do seu projeto
### rodar
```bash
javac pasta/arquivo1 pasta/arquivo2
java pasta.Main
```
---

# some notes

> ordem de criacao de classe

```bash
package pasta;

publica classe nomeClasse {
    visibilidade tipo dado;
    visibilidade tipo dado;
    visibilidade tipo dado;
    
    visibilidade nomeClasse(tipo dado, tipo dado, tipo dado) {
        this.dado = dado;
        this.dado = dado;
        this.dado = dado;
    }

    publico estatico nomeClasse criarClasse(tipo dado, tipo dado, tipo dado) {
        retorna novo nomeClasse(dado, dado, dado);
    }
}

```

# instanciando

```bash
    package pasta;

    importa java.util.ArrayList;
    publico classe Main {
        public static void main(String[] args) {
        nomeClasse nomeVariavel = nomeClasse.criarClasse(dado, dado, dado);
        nomeClasse nomeVariavel2 = nomeClasse.criarClasse(dado, dado, dado);

        ArrayList<nomeClasse> nomeLista = new ArrayList<>();
        nomeLista.add(nomeVariavel1);
        nomeLista.add(nomeVariavel2);

        for (nomeClasse nome : nomeLista) {
            System.out.prinln("dado" + nome.dado);

        }
    
    }


```

---