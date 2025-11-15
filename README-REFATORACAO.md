# Refatoração – Spring Framework PetClinic

Este diretório contém arquivos de apoio para a atividade de **Análise Estática e Refatoração de Código**.

## Arquivos incluídos

- `src/main/java/org/springframework/samples/petclinic/web/ViewNames.java`  
  Classe Java criada para centralizar os nomes das views, removendo *strings mágicas* dos controllers.

## Como usar no seu fork

1. Faça o fork do repositório original:  
   https://github.com/spring-petclinic/spring-framework-petclinic

2. Clone o seu fork localmente:

   ```bash
   git clone https://github.com/SEU-USUARIO/spring-framework-petclinic.git
   cd spring-framework-petclinic
   ```

3. Crie uma branch para a refatoração:

   ```bash
   git checkout -b refatoracao-analise-estatica
   ```

4. Copie o arquivo `ViewNames.java` para dentro do seu projeto, seguindo o mesmo caminho de diretórios:

   `src/main/java/org/springframework/samples/petclinic/web/ViewNames.java`

5. Nos controllers (por exemplo, `OwnerController`, `VisitController` etc.), substitua strings literais de views, como:

   ```java
   return "owners/createOrUpdateOwnerForm";
   ```

   por:

   ```java
   return ViewNames.OWNER_FORM;
   ```

6. Faça o commit das alterações:

   ```bash
   git add .
   git commit -m "Refatoração: criação de ViewNames e remoção de strings mágicas"
   git push origin refatoracao-analise-estatica
   ```

7. Use o link da branch `refatoracao-analise-estatica` no seu relatório para comprovar o código refatorado.

---

Ajuste o nome do usuário e demais detalhes conforme a sua conta no GitHub e a necessidade da disciplina.