# 🍔 Cardápio Online + ERP

Sistema web para gerenciamento de cardápio online, pedidos via WhatsApp e controle administrativo de vendas.

---

# 📌 Objetivo do Projeto

O projeto tem como objetivo permitir que estabelecimentos comerciais:

- exibam seus produtos online
- recebam pedidos automaticamente pelo WhatsApp
- controlem pedidos e vendas
- possuam um painel administrativo simples
- tenham um mini ERP para acompanhamento do negócio

---

# 🚀 Funcionalidades

## Cliente

- Visualizar cardápio online
- Pesquisar produtos
- Adicionar produtos ao carrinho
- Finalizar pedido
- Enviar pedido automaticamente para WhatsApp

---

## Administrador

- Login administrativo
- Cadastro de produtos
- Edição de produtos
- Controle de pedidos
- Dashboard de vendas
- Relatórios básicos

---

# 🛠️ Tecnologias Utilizadas

## Backend

- Java 21
- Spring Boot
- Spring Data JPA
- Spring Security
- JWT
- PostgreSQL
- Lombok
- Maven

---

## Frontend

- React
- Vite
- Tailwind CSS
- Axios

---

# 📂 Estrutura do Projeto

```txt
projeto/
│
├── backend/
│
├── frontend/
│
├── README.md
│
└── regra_de_negocio.md
```

---

# 📂 Estrutura Backend

```txt
backend/
│
├── src/main/java/com/cardapio/
│
├── auth/
├── category/
├── chatbot/
├── customer/
├── dashboard/
├── order/
├── product/
└── whatsapp/
```

---

# 📦 Estrutura dos Módulos

Cada módulo segue o padrão:

```txt
product/
│
├── controller/
├── dto/
├── entity/
├── repository/
├── service/
└── mapper/
```

---

# ⚙️ Dependências Backend

Adicionar no Spring Initializr:

- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Validation
- Lombok
- Spring Boot DevTools

---

# 🗄️ Banco de Dados

## PostgreSQL

Criar banco:

```sql
CREATE DATABASE cardapio_db;
```

---

# ⚙️ application.yml

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/cardapio_db
    username: postgres
    password: sua_senha

  jpa:
    hibernate:
      ddl-auto: update

    show-sql: true

    properties:
      hibernate:
        format_sql: true

server:
  port: 8080
```

---

# ▶️ Como Rodar o Backend

## Entrar na pasta backend

```bash
cd backend
```

---

## Rodar aplicação

### Linux / Mac

```bash
./mvnw spring-boot:run
```

### Windows

```bash
mvnw spring-boot:run
```

---

# ▶️ Como Rodar o Frontend

## Entrar na pasta frontend

```bash
cd frontend
```

---

## Instalar dependências

```bash
npm install
```

---

## Rodar projeto

```bash
npm run dev
```

---

# 🔗 Endpoints Iniciais

## Produtos

### Listar produtos

```http
GET /produtos
```

---

### Criar produto

```http
POST /produtos
```

---

# 📋 Exemplo Produto

```json
{
  "nome": "X-Burguer",
  "descricao": "Hamburguer artesanal",
  "preco": 29.90,
  "imagemUrl": "https://link.com/imagem.jpg",
  "disponivel": true
}
```

---

# 📈 Roadmap do Projeto

## MVP Inicial

- [x] Estrutura do projeto
- [x] Regras de negócio
- [ ] CRUD de produtos
- [ ] Cardápio online
- [ ] Carrinho
- [ ] Integração WhatsApp

---

## Próximas Funcionalidades

- [ ] Login admin
- [ ] JWT
- [ ] Dashboard ERP
- [ ] Relatórios
- [ ] Chatbot
- [ ] Multiempresa
- [ ] Pagamentos online

---

# 🧠 Arquitetura

O projeto utiliza:

- Arquitetura modular
- Separação por domínio
- API REST
- Backend desacoplado do frontend

---

# 🎯 Objetivo Profissional

Este projeto foi criado com foco em:

- aprendizado de arquitetura backend
- desenvolvimento full stack
- criação de produto real
- experiência prática de mercado
- possibilidade futura de SaaS

---

# 👨‍💻 Autor

Projeto desenvolvido por Breno Melo.