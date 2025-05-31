
![e9a9bc4d6c39357f6dcf3f36241c738f-ezgif com-crop](https://github.com/user-attachments/assets/5049b83c-5f04-4a99-a03d-936b0e11ca5d)


# ♡ RPG Character Builder (Padrão de Projeto Builder)

Este projeto demonstra a aplicação do **padrão de projeto Builder** para criar personagens em um RPG, com foco em código limpo, flexível e fácil de testar.

---

## ♡ O que é o padrão Builder?

O **Builder** é um padrão criacional que permite construir objetos complexos passo a passo, sem ter que criar um construtor gigante cheio de parâmetros ou múltiplas combinações de construtores.

Ele é perfeito para casos onde:
 Existem muitos atributos opcionais  
 Queremos garantir imutabilidade e consistência no objeto final  
 Queremos criar uma interface fluida e fácil de ler

---

## ♡ Como o padrão foi aplicado aqui?

Neste projeto, temos duas classes principais:

### 1️ `CharacterBuilder`

- Responsável por **montar** o personagem.
- Tem métodos encadeáveis (`race()`, `characterClass()`, `addSkill()`, etc.).
- No final, chama `.build()` para gerar o objeto pronto.

### 2️ `Character`

- O objeto final criado pelo Builder.
- Imutável (os atributos não podem ser modificados depois).
- Expõe apenas **getters** para acessar os dados.

### ♡ Exemplo de uso

```java
Character mage = new CharacterBuilder("Urias")
    .race("Elfa")
    .characterClass("Maga")
    .weapon("Cajado Mágico")
    .addSkill("Bola de Fogo")
    .addSkill("Escudo Arcano")
    .build();
````

---

## ♡ Sobre os testes

Usamos **JUnit 5** para validar o comportamento das classes.

### ♡ O que foi testado?

 **Atributos obrigatórios e opcionais**
Garantimos que os campos obrigatórios (`name`) estão corretos e que os opcionais funcionam quando adicionados.

 **Listas imutáveis**
A lista de habilidades (`skills`) não pode ser modificada de fora, protegendo a integridade do objeto.

 **Objetos independentes**
Personagens diferentes não compartilham ou vazam dados entre si.

 **Construção mínima válida**
Podemos criar um personagem apenas com o nome e os demais campos ficarão nulos/vazios.

### ♡ Rodando os testes

1️ Garanta que você tenha **JUnit 5** no projeto (no `pom.xml` ou `build.gradle`).

Exemplo no `pom.xml`:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
```

2️ Execute:

```
mvn test
```

ou

```
gradle test
```

ou rode diretamente pela sua IDE.

---

## ♡ Organização dos arquivos

```
/src
 ├── Character.java
 ├── CharacterBuilder.java
 ├── Main.java
/tests
 └── CharacterTest.java
```

---

## ♡ Possíveis melhorias futuras

✨ Adicionar atributos como HP, mana, inventário.
✨ Implementar heranças (ex: `MageCharacter`, `WarriorCharacter`).
✨ Serializar/deserializar personagens em JSON para salvar no banco.
✨ Integração com um sistema de batalha.
