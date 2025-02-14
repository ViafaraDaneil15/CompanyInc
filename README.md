# Proyecto CompanyInc

## 📌 Descripción
Este es un proyecto desarrollado con **Spring Boot** que permite la gestión de médicos dentro de una aplicación. Implementa **Spring Data JPA** para la gestión de la base de datos y utiliza **MySQL** como motor de almacenamiento de datos.

---
## 🚀 Tecnologías utilizadas

| Tecnología  | Versión |
|-------------|---------|
| Java        | 23.0.1  |
| Spring Boot | 3.4.2   |
| MySQL       | 8.0     |
| Hibernate   | 6.6.5   |
| XAMPP       | Última  |
| Postman     | Última  |

---
## 📂 Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes programas:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [XAMPP](https://www.apachefriends.org/es/index.html) (para MySQL)
- [Postman](https://www.postman.com/downloads/) (opcional, para probar la API)

---
## 🔹 Clonar el repositorio

Ejecuta el siguiente comando en tu terminal para clonar el repositorio en tu máquina local:

```sh
 git clone https://github.com/tu-usuario/CompanyInc.git
 cd CompanyInc
```

---
## ⚙️ Configuración de la base de datos

1. **Iniciar MySQL en XAMPP:**
   - Abre **XAMPP** y activa el servicio **MySQL**.

2. **Crear la base de datos:**
   - Ingresa a `http://localhost/phpmyadmin/` en tu navegador.
   - Crea una base de datos con el nombre `company_inc`.

3. **Configurar `application.properties` en el proyecto:**
   
   En `src/main/resources/application.properties`, asegúrate de que la configuración sea similar a esta:
   
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/company_inc
   spring.datasource.username=root
   spring.datasource.password=
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
   ```

---
## ▶️ Ejecutar el proyecto

Para ejecutar la aplicación, abre una terminal en la raíz del proyecto y ejecuta:

```sh
 mvn spring-boot:run
```

Si deseas ejecutarlo desde un IDE como **IntelliJ IDEA** o **Eclipse**, asegúrate de que la clase principal `CompanyIncApplication` tenga la anotación `@SpringBootApplication`, luego ejecútala como una aplicación Spring Boot.

---
## 🛠️ Probar la API en Postman

Una vez que el servidor esté en ejecución, puedes probar los endpoints en **Postman**:

### 🔹 Crear un médico (POST)
```http
POST http://localhost:8080/api/medicos
```
#### **Body (JSON):**
```json
{
  "nombre": "Dr. Juan Pérez",
  "especialidad": "Cardiología",
  "email": "juan.perez@example.com"
}
```

### 🔹 Obtener todos los médicos (GET)
```http
GET http://localhost:8080/api/medicos
```

---
## 📜 Licencia
Este proyecto está bajo la licencia de Daniel Viafara.
