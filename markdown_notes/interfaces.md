# interfaces -> config

> a interface deve ter apenas os metodos definidos:
```java

public interface ClasseInterface{
    void acao1();
    void acao2();
}

```
# criando Classes de implementação

```java
public class ClasseArquivo implements ClasseInterface {
    @Override //sobrescrever
    public void acao1() {
        print("acao acontecendo...");
    }

    @Override
    public void acao2() {
        print("outra acao acontecendo...");
    }
}

```
> posso criar 800 classes de implementacao se eu quiser, com informações diferentes nos metodos, desde que eu use "implements" para fazer "referencia" a classeInterface

---

### no main

```java
public class Main {

    public static void main(String[] args) {
        ClasseInterface nomeVariavel = new ClasseArquivo();
        nomeVariavel.acao1();
    }
}
```
