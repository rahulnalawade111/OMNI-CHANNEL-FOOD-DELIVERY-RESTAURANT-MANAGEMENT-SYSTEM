# Omni-channel Food Delivery & Restaurant Management System

A modular monorepo for a React operations console and Spring Boot REST API. The initial vertical slice implements secured restaurant and centralized order management, including idempotent external-order ingestion and normalized status transitions.

## Run locally

```bash
cd backend && mvn spring-boot:run
cd frontend && npm install && npm run dev
```

The backend defaults to the `dev` profile and an in-memory H2 database for local evaluation. Use the `prod` profile with MySQL environment variables for deployments. Seed login: `admin@omni.local` / `ChangeMe123!`.
