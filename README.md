# 📱 PokeTinder - App Android Studio

Este proyecto consiste en una aplicación móvil desarrollada en **Android Studio** como parte del **Laboratorio 14 del curso de Desarrollo de Aplicaciones Móviles**. La app simula una especie de "Tinder de Pokémon", donde el usuario debe **registrarse** o **iniciar sesión** para acceder a la **galería principal de Pokémon**, la cual muestra imágenes y nombres de cada criatura.

## ✅ Funcionalidades Implementadas

- Registro de usuario con validación:
  - Correo electrónico válido.
  - Contraseña mínima de 8 caracteres.
  - Confirmación de contraseña.
- Login con validación de datos.
- Persistencia de credenciales usando `SharedPreferences`.
- Navegación entre pantallas (Splash ➝ Login ➝ Registro ➝ Principal).
- Visualización de Pokemones (nombre + imagen).
- Validaciones de errores con mensajes personalizados (campos vacíos, credenciales incorrectas, usuario no registrado).
- Interfaz moderna y adaptable.

## 🛠️ Tecnologías Usadas

- **Lenguaje:** Kotlin
- **IDE:** Android Studio
- **Arquitectura MVVM**
- `SharedPreferences` para persistencia local
- `ViewModel` y `LiveData` para manejo de estados
- Diseño con `ConstraintLayout` y `Material Components`
- Emulador Android o dispositivo físico para pruebas

---

## 🚀 Cómo Ejecutar

1. Clona este repositorio:

   git clone https://github.com/Anjelisahori/PokeTinder_PrograMovil.git
````

2. Ábrelo con Android Studio.

3. Conecta tu dispositivo Android **o usa el emulador**.

4. Ejecuta el proyecto con el botón ▶️.

---

## 🔗 Enlaces del Proyecto

* 🎥 Youtube: https://youtube.com/shorts/uKmcIYFH9Rw
* 🧠 GitHub: https://github.com/Anjelisahori/PokeTinder_PrograMovil.git

## ✍️ Autor

* Verastigue Tejeda, Anjeli Sahori
* Ciclo: III | Grupo: C24-B

## 📌 Observaciones

* Se presentaron dificultades iniciales con las dependencias de Gradle, que fueron solucionadas tras ajustar versiones.
* La interfaz funciona correctamente, aunque sería recomendable mejorar su adaptabilidad en pantallas más pequeñas.

---

## 📎 Conclusiones

* Se consolidaron conocimientos en el manejo de formularios, validaciones y navegación en Android.
* Se comprendió la importancia de usar buenas prácticas en persistencia de datos con `SharedPreferences` y el uso correcto de ViewModels para gestionar la lógica de negocio.

