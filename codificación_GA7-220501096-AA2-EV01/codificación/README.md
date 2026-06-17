# 🛡️ Sistema de Seguridad Vecinal (CRUD Java + MySQL)

Este es un proyecto educativo desarrollado en **Java** que implementa un sistema CRUD completo (Crear, Leer, Actualizar y Eliminar) interactuando con una base de datos local en **MySQL**. El sistema gestiona registros de usuarios simulando una base de datos para la seguridad comunitaria.

---

## 🛠️ Tecnologías y Herramientas utilizadas
* **Lenguaje:** Java 17
* **Base de Datos:** MySQL (ejecutado en servidor local)
* **IDE:** Visual Studio Code
* **Conector:** MySQL Connector/J 8.4.0

---

## 🚀 Requisitos de Instalación y Configuración

Sigue estos pasos para poner a funcionar el proyecto en tu entorno local:

### 1. Clonar o descargar el repositorio
Descarga el código en tu computadora y abre la carpeta raíz en tu editor de código.

### 2. Configurar la Base de Datos
Abre tu gestor de base de datos (MySQL Workbench, phpMyAdmin, etc.) y ejecuta el siguiente script para crear la estructura necesaria:

```sql
CREATE DATABASE seguridad_vecinal;
USE seguridad_vecinal;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL,
    telefono VARCHAR(20) NOT NULL
);
```

### 3. Verificar Credenciales de Conexión
Abre el archivo `ConexionBD.java` y asegúrate de modificar los parámetros `user` y `pass` con tus propias credenciales locales de MySQL si es necesario:
```java
String url = "jdbc:mysql://localhost:3306/seguridad_vecinal";
String user = "tu_usuario"; // Por defecto suele ser 'root'
String pass = "tu_contraseña";
```

### 4. Dependencias (Conector JDBC)
Asegúrate de tener el archivo `.jar` del conector de MySQL referenciado en las librerías de tu proyecto en el IDE.

---

## 💻 Ejecución del Proyecto
Para probar el sistema, abre el archivo `Main.java` y ejecútalo (`Run`). La consola (Terminal) mostrará de forma secuencial las siguientes operaciones:
1. Confirmación de **Conexión exitosa**.
2. **Inserción** de un nuevo usuario en la base de datos.
3. **Lectura/Consulta** de los registros existentes mostrados en formato de lista.
4. **Actualización** del nombre o datos de un usuario por su ID.
5. **Eliminación** lógica o física del registro asignado.

---
*Proyecto creado como práctica de programación orientada a objetos y persistencia de datos en Java.*