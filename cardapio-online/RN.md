# DOCUMENTO DE REGRAS DE NEGÓCIO
# Sistema de Cardápio Online + ERP para Estabelecimentos

---

# 1. VISÃO GERAL DO SISTEMA

## 1.1 Objetivo

O sistema tem como objetivo permitir que estabelecimentos comerciais realizem:

- divulgação de cardápio online
- gerenciamento de produtos
- recebimento de pedidos
- envio automático para WhatsApp
- controle de vendas
- acompanhamento de pedidos
- administração operacional através de um mini ERP

---

# 2. ESCOPO DO SISTEMA

O sistema será dividido em:

- Frontend Web
- Backend API REST
- Painel Administrativo
- Integração com WhatsApp
- Dashboard ERP
- Chat Bot Inicial

---

# 3. TIPOS DE USUÁRIOS

## 3.1 Cliente

Usuário responsável por realizar pedidos.

### Permissões

- visualizar cardápio
- visualizar categorias
- pesquisar produtos
- adicionar produtos ao carrinho
- alterar quantidades
- remover itens
- finalizar pedido
- enviar pedido via WhatsApp

### Restrições

- não pode acessar área administrativa
- não pode alterar produtos
- não pode visualizar relatórios

---

## 3.2 Administrador

Usuário responsável pela gestão do sistema.

### Permissões

- acessar painel administrativo
- cadastrar produtos
- editar produtos
- excluir produtos
- gerenciar categorias
- visualizar pedidos
- alterar status dos pedidos
- visualizar relatórios
- visualizar dashboard financeiro

### Restrições

- acesso protegido por autenticação

---

# 4. REGRAS DE AUTENTICAÇÃO

## 4.1 Login

Administrador deve autenticar utilizando:

- e-mail
- senha

---

## 4.2 Segurança

O sistema deve:

- utilizar JWT
- criptografar senhas
- proteger rotas administrativas
- invalidar tokens expirados

---

## 4.3 Sessão

Token JWT deverá possuir:

- tempo de expiração
- renovação mediante novo login

---

# 5. REGRAS DO CARDÁPIO

## 5.1 Estrutura do Cardápio

O cardápio deverá conter:

- categorias
- produtos
- imagens
- preços
- descrição
- disponibilidade

---

## 5.2 Categorias

Cada produto obrigatoriamente deve pertencer a uma categoria.

### Exemplos

- Hambúrguer
- Pizza
- Bebida
- Sobremesa
- Porções

---

## 5.3 Disponibilidade

Produtos indisponíveis:

- devem aparecer desabilitados
- não podem ser adicionados ao carrinho

---

## 5.4 Ordenação

Produtos poderão ser exibidos:

- por categoria
- por destaque
- por popularidade futuramente

---

# 6. REGRAS DOS PRODUTOS

## 6.1 Cadastro

Produto deverá possuir:

- id
- nome
- descrição
- preço
- categoria
- imagem
- status ativo
- data de cadastro

---

## 6.2 Validações

### Nome

- obrigatório
- mínimo de 3 caracteres

### Preço

- obrigatório
- maior que zero

### Categoria

- obrigatória

---

## 6.3 Exclusão

Ao excluir produto:

- produto não deve aparecer no cardápio

---

# 7. REGRAS DO CARRINHO

## 7.1 Adição de Itens

Cliente poderá:

- adicionar itens
- aumentar quantidade
- diminuir quantidade
- remover itens

---

## 7.2 Quantidade

Quantidade mínima:

- 1 unidade

---

## 7.3 Cálculo

Sistema deve calcular automaticamente:

- subtotal do item
- subtotal do carrinho
- valor total

---

## 7.4 Persistência

Carrinho poderá permanecer salvo:

- durante sessão do navegador

---

# 8. REGRAS DO PEDIDO

## 8.1 Criação

Pedido deverá ser criado quando:

- cliente finalizar compra

---

## 8.2 Número do Pedido

Cada pedido deverá possuir:

- número único
- identificação automática

---

## 8.3 Dados Obrigatórios

Pedido deverá conter:

- nome do cliente
- telefone
- endereço
- itens do pedido
- valor total
- data e hora

---

## 8.4 Tipos de Pedido

Sistema deverá permitir:

- retirada no local
- entrega

---

## 8.5 Status do Pedido

Pedidos poderão possuir:

- PENDENTE
- EM_PREPARO
- SAIU_PARA_ENTREGA
- FINALIZADO
- CANCELADO

---

## 8.6 Cancelamento

Pedidos cancelados:

- não entram no faturamento

---

# 9. REGRAS DO WHATSAPP

## 9.1 Integração

Ao finalizar pedido:

- sistema deverá gerar mensagem automática

---

## 9.2 Conteúdo da Mensagem

Mensagem deverá conter:

- número do pedido
- itens
- quantidades
- valor total
- endereço
- nome do cliente

---

## 9.3 Redirecionamento

Sistema deverá:

- abrir automaticamente WhatsApp do estabelecimento

---

# 10. REGRAS DO PAINEL ADMINISTRATIVO

## 10.1 Dashboard

Dashboard deverá exibir:

- vendas do dia
- total de pedidos
- pedidos pendentes
- pedidos finalizados
- faturamento diário
- faturamento mensal

---

## 10.2 Gestão de Produtos

Administrador poderá:

- criar produtos
- editar produtos
- excluir produtos
- alterar disponibilidade

---

## 10.3 Gestão de Categorias

Administrador poderá:

- criar categorias
- editar categorias
- excluir categorias

---

## 10.4 Gestão de Pedidos

Administrador poderá:

- visualizar pedidos
- alterar status
- cancelar pedidos

---

# 11. REGRAS FINANCEIRAS

## 11.1 Faturamento

Sistema deverá calcular:

- faturamento diário
- faturamento semanal
- faturamento mensal

---

## 11.2 Relatórios

Sistema deverá possuir:

- relatório de vendas
- relatório de pedidos
- relatório de produtos mais vendidos

---

## 11.3 Produtos Mais Vendidos

Sistema deverá registrar:

- quantidade vendida por produto

---

# 12. REGRAS DO CHAT BOT

## 12.1 Objetivo

Chat bot deverá auxiliar clientes com:

- dúvidas rápidas
- horários
- promoções
- localização

---

## 12.2 Funcionamento Inicial

Chat bot inicialmente deverá funcionar:

- com respostas prontas

---

## 12.3 Fluxos

Fluxos disponíveis:

- horário de funcionamento
- formas de pagamento
- taxa de entrega
- promoções
- falar com atendente

---

# 13. REGRAS DE INTERFACE

## 13.1 Frontend

Sistema deverá possuir:

- layout responsivo
- compatibilidade mobile
- carregamento rápido

---

## 13.2 Experiência do Usuário

Fluxo de compra deve possuir:

- poucos passos
- interface simples
- botões claros

---

# 14. REGRAS DE BANCO DE DADOS

## 14.1 Persistência

Sistema deverá salvar:

- produtos
- categorias
- pedidos
- usuários
- vendas

---

## 14.2 Banco Utilizado

Banco principal:

- PostgreSQL

---

# 15. REGRAS TÉCNICAS

## 15.1 Backend

Tecnologias:

- Java 21
- Spring Boot
- Spring Security
- JWT
- JPA/Hibernate

---

## 15.2 Frontend

Tecnologias:

- React
- Vite
- Tailwind CSS
- Axios

---

## 15.3 API

Comunicação deverá ocorrer:

- via REST API

---

# 16. REGRAS DE ESCALABILIDADE

Sistema deverá permitir futuramente:

- múltiplos estabelecimentos
- pagamentos online
- integração iFood
- aplicativo mobile
- multiusuários
- painel avançado
- cupons de desconto
- fidelidade
- chatbot inteligente

---

# 17. REGRAS DE DISPONIBILIDADE

Sistema deverá:

- funcionar 24 horas
- possuir tratamento de erros
- validar entradas do usuário

---

# 18. REGRAS DE LOG

Sistema deverá registrar:

- erros
- autenticações
- alterações administrativas

---

# 19. REGRA PRINCIPAL DO PROJETO

O sistema deve sempre priorizar:

- simplicidade
- estabilidade
- facilidade de uso
- velocidade
- experiência do usuário

---

# 20. FLUXO PRINCIPAL DO SISTEMA

```txt
Cliente acessa cardápio
↓
Escolhe produtos
↓
Adiciona ao carrinho
↓
Finaliza pedido
↓
Sistema salva pedido
↓
Sistema gera mensagem
↓
WhatsApp é aberto automaticamente
↓
Estabelecimento recebe pedido
```

---

# 21. MVP INICIAL

A primeira versão obrigatoriamente deverá conter:

- cardápio online
- carrinho
- integração WhatsApp
- painel admin
- cadastro de produtos
- gestão de pedidos

---

# 22. FUNCIONALIDADES FUTURAS

## Futuro 1

- pagamentos online

## Futuro 2

- notificações automáticas

## Futuro 3

- sistema SaaS multiempresa

## Futuro 4

- aplicativo mobile

## Futuro 5

- inteligência artificial no atendimento