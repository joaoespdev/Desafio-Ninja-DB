#  Exercício de Programação Orientada a Objetos (POO) em Java - Anime Naruto 🍥

Este repositório contém um projeto educativo de Programação Orientada a Objetos (POO) em Java, inspirado no universo do anime Naruto. O objetivo é praticar conceitos como herança, interfaces e encapsulamento, criando classes que representam os personagens do anime e suas habilidades.

---

## 🦊 **Descrição do Projeto**

Neste projeto, foram criadas classes que representam personagens especializados em diferentes habilidades (Taijutsu, Ninjutsu e Genjutsu). Cada personagem possui atributos e métodos para interagir com suas características e realizar ações típicas do universo Naruto.

---

## 🍜 **Requisitos do Projeto**

### **Atributos do Personagem**
- `Nome` (String)
- `Idade` (int)
- `Aldeia` (String)
- `Jutsus` (Array de Strings)
- `Chakra` (int)

### 🍢 **Métodos**
- **Construtor:** Inicializa os atributos do personagem.
- **Adicionar Jutsu:** Permite adicionar um novo jutsu ao array de jutsus.
- **Aumentar Chakra:** Aumenta o chakra do personagem em uma quantidade específica.
- **Exibir Informações:** Exibe todas as informações do personagem (nome, idade, aldeia, jutsus e chakra).

---

## 🍃 **Interface: Ninja**

### 🍢 **Métodos**
1. `usarJutsu()`: Exibe uma mensagem indicando que o personagem está usando um jutsu.
2. `desviar()`: Exibe uma mensagem indicando que o personagem está desviando de um ataque.

---

## 🍡**Classes**

### **1. NinjaDeTaijutsu**
Representa um personagem especializado em Taijutsu.
- **Método `usarJutsu()`:** Exibe uma mensagem indicando que o personagem está usando um golpe de Taijutsu.
- **Método `desviar()`:** Exibe uma mensagem indicando que o personagem está desviando de um ataque usando sua habilidade em Taijutsu.

### **2. NinjaDeNinjutsu**
Representa um personagem especializado em Ninjutsu.
- **Método `usarJutsu()`:** Exibe uma mensagem indicando que o personagem está usando um jutsu de Ninjutsu.
- **Método `desviar()`:** Exibe uma mensagem indicando que o personagem está desviando de um ataque usando sua habilidade em Ninjutsu.

### **3. NinjaDeGenjutsu**
Representa um personagem especializado em Genjutsu.
- **Método `usarJutsu()`:** Exibe uma mensagem indicando que o personagem está usando um jutsu de Genjutsu.
- **Método `desviar()`:** Exibe uma mensagem indicando que o personagem está desviando de um ataque usando sua habilidade em Genjutsu.

---

## 🏮 **Estrutura do Projeto**

```plaintext
+---.idea
|       .gitignore
|       compiler.xml
|       encodings.xml
|       jarRepositories.xml
|       misc.xml
|       vcs.xml
|       workspace.xml
|       
+---.mvn
|   \---wrapper
|           maven-wrapper.properties
|           
+---src
|   +---main
|   |   +---java
|   |   |   \---com
|   |   |       \---narutodb
|   |   |           \---desafioninja
|   |   |               |   DesafioninjaApplication.java
|   |   |               |   
|   |   |               +---controller
|   |   |               |       NinjaController.java
|   |   |               |       
|   |   |               \---model
|   |   |                       Ninja.java
|   |   |                       NinjaDeGenjutsu.java
|   |   |                       NinjaDeNinjutsu.java
|   |   |                       NinjaDeTaijutsu.java
|   |   |                       Personagem.java
|   |   |                       
|   |   \---resources
|   |       |   application.properties
|   |       |   
|   |       +---static
|   |       \---templates
|   \---test
|       \---java
|           \---com
|               \---narutodb
|                   \---desafioninja
|                           DesafioninjaApplicationTests.java
|                           
\---target
    +---classes
    |   |   application.properties
    |   |   
    |   \---com
    |       \---narutodb
    |           \---desafioninja
    |               |   DesafioninjaApplication.class
    |               |   
    |               +---controller
    |               |       NinjaController.class
    |               |       
    |               \---model
    |                       Ninja.class
    |                       NinjaDeGenjutsu.class
    |                       NinjaDeNinjutsu.class
    |                       NinjaDeTaijutsu.class
    |                       Personagem.class
    |                       
    \---generated-sources
        \---annotations
