# ED04 - Agenda de Contatos

Sistema de agenda de contatos implementado em Java, seguindo o padrão MVC (Model-View-Controller).

## Estrutura do Projeto

### Model
- `Contato` (interface)
- `ContatoBase` (classe abstrata)
- `PessoaFisica` (classe concreta)
- `PessoaJuridica` (classe concreta)

### View
- `ContatoView` (interface com o usuário)

### Controller
- `ContatoController` (lógica da aplicação)

## Funcionalidades

1. Cadastro de contatos
   - Pessoa Física (CPF)
   - Pessoa Jurídica (CNPJ)

2. Listagem de contatos
   - Exibição em formato tabular
   - Ordenação por nome

3. Busca de contatos
   - Por CPF/CNPJ

4. Atualização de contatos
   - Nome, telefone e email

5. Exclusão de contatos
   - Por CPF/CNPJ

## Regras de Validação

- Nome: obrigatório, mínimo 3 caracteres
- CPF: 11 dígitos numéricos
- CNPJ: 14 dígitos numéricos
- Contatos únicos por CPF/CNPJ

## Como Executar

1. Compile todos os arquivos Java
2. Execute a classe `Main`
3. Siga as instruções do menu
