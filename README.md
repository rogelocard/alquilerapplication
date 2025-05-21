# AlquilerApp

![Java](https://img.shields.io/badge/Java-17-blue) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-brightgreen) ![Maven](https://img.shields.io/badge/Maven-3.8.8-red) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue)

---

## 📖 Descripción

**AlquilerApp** es un microservicio REST para gestionar el alquiler de prendas (vestidos de dama, trajes de caballero y disfraces).  
Implementa patrones de diseño (Factory, Singleton, Facade, Composite, Decorator, Bridge, Adapter) y persiste datos con Spring Data JPA sobre PostgreSQL.

---

## 🚀 Tecnologías

- **Java 17**
- **Spring Boot 3.4.5**
- **Maven 3.x**
- **PostgreSQL 14+**
- **Lombok** (getters/setters automáticos)
- **JUnit 5** (pruebas unitarias)

---

## 🔧 Requisitos previos

1. **IDE** con soporte Spring Boot (IntelliJ IDEA, Eclipse, VS Code…)  
2. **Java 17 SDK** instalado y configurado (`JAVA_HOME`)  
3. **Maven** (o usar el wrapper `./mvnw`)  
4. **PostgreSQL 14+** instalado

---

## ⚙️ Instalación y arranque local

### 1. Clonar el repositorio
```bash
git clone https://github.com/tu-usuario/AlquilerApp.git
cd AlquilerApp
```
--- 
### 2. 🐘 Instalar PostgreSQL

- Descarga e instala [PostgreSQL](https://www.postgresql.org/download/) desde su sitio oficial.
- Usa el puerto por defecto (`5432`) o el que prefieras.
- Crea un usuario y contraseña para la base de datos.
- Añade PostgreSQL a las variables de entorno para acceder fácilmente desde la terminal.

---
### 3. 🗃️ Crear la base de datos

Usando pgAdmin, DBeaver o la terminal, ejecuta la siguiente instrucción SQL:

```sql
CREATE DATABASE atuendos_db;
```
---
### 4. ⚙️ Configurar el archivo de propiedades

- Navega a la carpeta `src/main/resources/`.
- Si no existe, crea un archivo llamado `application.properties`.
- Agrega tus credenciales y configuración de conexión a PostgreSQL:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/atuendos_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

# Opcional: configuración adicional para desarrollo
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
---
### 5. ▶️ Construir y ejecutar la aplicación

Puedes ejecutar la aplicación de dos maneras:

#### 🔸 Opción A: Desde línea de comandos

Si estás usando el wrapper de Maven incluido en el proyecto:

```bash
./mvnw spring-boot:run
```
O si tienes Maven instalado globalmente:
```bash
mvn spring-boot:run
```
🔸 Opción B: Desde el IDE
Ejecuta la clase principal del proyecto:
```Java
com.losatuendos.alquilerapp.AlquilerAppApplication
```
Una vez iniciada correctamente, el backend estará disponible en:
```
http://localhost:8080
```
---
### 6. 🧪 Ejecutar pruebas unitarias

El proyecto incluye pruebas automatizadas ubicadas en:
src/test/java
Para ejecutarlas desde la terminal, usa:

```bash
./mvnw test
```
O si tienes Maven instalado globalmente:
```bash
mvn test
```
💡 También puedes ejecutar las pruebas desde el IDE (IntelliJ, Eclipse) haciendo clic derecho sobre la clase de test y seleccionando "Run Test".
---
## 7. 📡 Endpoints REST

Estos son los endpoints principales disponibles en la API REST de **AlquilerApp**.  
Puedes consumirlos desde herramientas como Postman o Insomnia.

| Método | Ruta                                  | Descripción                                         |
|--------|---------------------------------------|-----------------------------------------------------|
| POST   | `/api/clientes`                       | Registrar nuevo cliente                            |
| GET    | `/api/clientes/{id}`                  | Consultar cliente por ID                           |
| POST   | `/api/empleados`                      | Registrar nuevo empleado                           |
| GET    | `/api/empleados/{id}`                 | Consultar empleado por ID                          |
| POST   | `/api/prendas`                        | Registrar una nueva prenda (vestido, traje, disfraz) |
| GET    | `/api/prendas/talla/{talla}`          | Consultar prendas por talla                        |
| POST   | `/api/alquileres`                     | Registrar un nuevo servicio de alquiler            |
| GET    | `/api/alquileres/{id}`                | Consultar un alquiler por su número                |
| GET    | `/api/alquileres/cliente/{clienteId}` | Consultar alquileres vigentes por cliente          |
| GET    | `/api/alquileres/fecha/{yyyy-MM-dd}`  | Consultar alquileres por fecha específica          |
| POST   | `/api/lavanderia/registro`            | Registrar prenda para envío a lavandería           |
| GET    | `/api/lavanderia/cola`                | Visualizar la cola de lavandería                   |
| POST   | `/api/lavanderia/enviar`              | Enviar prendas a lavandería (proceso estándar o urgente) |

🧩 Todos los endpoints están organizados según su dominio: clientes, empleados, prendas, alquileres y lavandería.

¡Gracias por visitar el proyecto AlquilerApp! ✨
