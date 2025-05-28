# ED03 - Sistemas em Java

Este projeto contém três sistemas implementados em Java, demonstrando diferentes conceitos de orientação a objetos.

## 1. Sistema de Folha de Pagamento

Implementa um sistema simplificado de folha de pagamento com diferentes tipos de funcionários:
- `Funcionario` (classe abstrata)
- `FuncionarioCLT` (adicional fixo de R$ 300,00)
- `FuncionarioTemporario` (desconto fixo de R$ 100,00)

## 2. Sistema de Gráfica Online

Implementa um sistema de impressão de diferentes tipos de conteúdo:
- `Imprimivel` (interface)
- `DocumentoTexto`
- `ImagemDigital`
- `GraficoEstatistico`
- `RelatorioPDF`

## 3. Sistema de Login

Implementa um sistema de autenticação com diferentes tipos de usuários:
- `Usuario` (classe abstrata)
- `Administrador` (implementa Autenticavel, Gerenciavel e Logavel)
- `Visitante` (acesso restrito)
- `Cliente` (implementa Autenticavel)

## Como Executar

Cada sistema possui sua própria classe principal:
1. `ProgramaFolha.java` - Sistema de Folha de Pagamento
2. `ProgramaImpressao.java` - Sistema de Gráfica Online
3. `ProgramaLogin.java` - Sistema de Login

## Data de Entrega
28/05/2024 