# 📄 Descripció - Enunciat de l'exercici

En aquest exercici, es crea una classe anomenada `Telèfon` amb els atributs següents:
- `marca`
- `model`

A més, aquesta classe conté un mètode `trucar(String numero)`, que mostra per consola un missatge indicant que s'està trucant al número rebut per paràmetre.

També es creen dues interfícies:
- `Camera`, amb el mètode `fotografiar()`, que imprimeix per consola "S’està fent una foto".
- `Rellotge`, amb el mètode `alarma()`, que imprimeix per consola "Està sonant l’alarma".

Es crea una classe `Smartphone` que és subclasse de `Telèfon` i implementa les interfícies `Camera` i `Rellotge`.

Finalment, des del `main()` de l’aplicació, es crea un objecte `Smartphone` i es criden als mètodes `trucar()`, `fotografiar()` i `alarma()` per demostrar el seu funcionament.

---

# 💻 Tecnologies Utilitzades

- Java
- Programació Orientada a Objectes (POO)
- Herència i interfícies en Java

---

# 📋 Requisits

Per a executar aquest projecte, es requereix:

- JDK 8 o superior
- Un entorn de desenvolupament com IntelliJ IDEA, Eclipse o VS Code amb extensió per a Java
- Coneixements bàsics de Java i POO

Per compilar i executar el programa des de terminal:

```sh
javac Telefon.java Smartphone.java
java Main
```

