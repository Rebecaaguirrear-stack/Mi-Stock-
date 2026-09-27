# \# Mi Stock

# 

# Aplicación móvil Android para la gestión y control de productos del hogar.

# 

# \## 1. Descripción del proyecto

# 

# Mi Stock es una aplicación móvil desarrollada para Android cuyo objetivo es facilitar el control de los productos de consumo habitual en el hogar.

# 

# La aplicación permite conocer qué productos están disponibles, qué cantidad queda de cada uno y cuándo es necesario realizar una nueva compra.

# 

# Entre sus principales funciones se encuentran:

# 

# \- Registrar productos.

# \- Controlar cantidades disponibles.

# \- Establecer niveles mínimos de stock.

# \- Identificar productos con stock bajo.

# \- Registrar precios.

# \- Registrar tiendas habituales.

# \- Registrar compras y movimientos.

# \- Consultar el historial.

# \- Mostrar alertas de productos que necesitan reposición.

# \- Consultar estadísticas de consumo y compras.

# 

# \## 2. Problema que resuelve

# 

# En un hogar es frecuente olvidar cuántas unidades quedan de determinados productos o cuándo es necesario volver a comprarlos.

# 

# Mi Stock busca solucionar este problema mediante un sistema centralizado que permita consultar rápidamente el estado del inventario y recibir avisos cuando un producto alcance el nivel mínimo configurado.

# 

# \## 3. Plataforma y tecnologías

# 

# \- Plataforma: Android

# \- Lenguaje: Kotlin

# \- IDE: Android Studio

# \- Interfaz: Jetpack Compose

# \- Base de datos: Room sobre SQLite

# \- Arquitectura: MVVM

# \- Control de versiones: Git y GitHub

# \- Notificaciones: sistema de notificaciones de Android

# 

# La aplicación está planteada para utilizar almacenamiento local, permitiendo que las funciones principales del inventario puedan utilizarse sin conexión a Internet.

# 

# \## 4. Funcionalidades principales

# 

# \### Gestión de productos

# 

# Cada producto puede contener información como:

# 

# \- Nombre

# \- Categoría

# \- Cantidad actual

# \- Cantidad máxima

# \- Stock mínimo

# \- Precio

# \- Tienda habitual

# \- Imagen

# 

# \### Control de stock

# 

# La aplicación muestra la cantidad disponible de cada producto y permite identificar diferentes estados:

# 

# \- Stock completo

# \- Stock bajo

# \- Muy bajo

# 

# \### Alertas

# 

# El usuario puede establecer una cantidad mínima para cada producto.

# 

# Cuando la cantidad disponible alcanza o queda por debajo del límite configurado, el producto se identifica como stock bajo y puede generar una alerta.

# 

# \### Historial

# 

# La aplicación contempla el registro de movimientos del inventario, incluyendo compras y consumo de productos.

# 

# \### Estadísticas

# 

# Se contempla mostrar información como:

# 

# \- Gasto mensual

# \- Número de compras

# \- Gasto por categoría

# \- Productos comprados con mayor frecuencia

# \- Precio medio de determinados productos

# 

# \## 5. Diseño de la aplicación

# 

# El diseño inicial se realizó mediante wireframes.

# 

# La pantalla principal contiene:

# 

# \- Encabezado de la aplicación.

# \- Resumen de stock.

# \- Número de productos.

# \- Cantidad de productos con stock bajo.

# \- Valor aproximado del inventario.

# \- Lista de productos.

# \- Botón para añadir productos.

# \- Navegación inferior.

# 

# La versión actual del diseño en Figma incorpora una interfaz más visual, con tarjetas de resumen, indicadores de stock, barras de progreso y controles para modificar cantidades.

# 

# \## 6. Estado actual del diseño

# 

# La versión actual de la pantalla principal muestra:

# 

# \- Resumen de stock.

# \- Número total de productos.

# \- Productos con stock bajo.

# \- Valor aproximado del inventario.

# \- Lista de productos.

# \- Indicadores visuales del nivel de stock.

# \- Botones para aumentar o disminuir cantidades.

# \- Botón para añadir productos.

# \- Navegación entre Inicio, Historial y Configuración.

# 

# Los estados de stock se representan visualmente para facilitar su identificación.

# 

# \## 7. Gestión de datos

# 

# La aplicación utilizará una base de datos local para almacenar la información de los productos y sus movimientos.

# 

# La estructura de datos contempla información relacionada con:

# 

# \- Productos

# \- Categorías

# \- Cantidades

# \- Precios

# \- Tiendas

# \- Movimientos del inventario

# \- Historial

# 

# La utilización de Room sobre SQLite permitirá organizar la información y facilitar las operaciones de almacenamiento y consulta.

# 

# \## 8. Arquitectura

# 

# El proyecto utilizará una arquitectura MVVM.

# 

# La separación de responsabilidades permitirá mantener diferenciadas:

# 

# \- Interfaz de usuario

# \- Lógica de la aplicación

# \- Gestión de datos

# 

# Esto facilitará el mantenimiento y futuras ampliaciones del proyecto.

# 

# \## 9. Changelog

# 

# \### Versión inicial - Módulo 1

# 

# \- Definición del proyecto Mi Stock.

# \- Identificación del problema.

# \- Definición de objetivos.

# \- Definición de funcionalidades principales.

# \- Selección de Android como plataforma.

# \- Selección de Kotlin.

# \- Selección de Android Studio.

# \- Propuesta inicial de Jetpack Compose.

# \- Propuesta de Room sobre SQLite.

# \- Definición inicial de arquitectura MVVM.

# \- Elaboración de los primeros wireframes.

# 

# \### Actualización - Módulos 2 y 3

# 

# \- Refinamiento de la interfaz principal.

# \- Definición de las pantallas principales.

# \- Organización de la navegación.

# \- Definición más detallada de los campos de los productos.

# \- Preparación del proyecto para el control de versiones mediante Git y GitHub.

# \- Actualización del README.

# 

# \### Actualización - Módulo 4

# 

# \- Refinamiento del diseño visual.

# \- Revisión de la estructura de navegación.

# \- Organización de los componentes de la interfaz.

# \- Preparación de la aplicación para continuar con la implementación de sus funcionalidades.

# 

# \### Actualización - Módulo 5

# 

# \- Incorporación del diseño de almacenamiento de datos.

# \- Definición de la utilización de Room sobre SQLite.

# \- Identificación de las entidades y datos que deberá manejar la aplicación.

# \- Definición de operaciones para registrar, consultar, actualizar y eliminar información.

# \- Consideración del almacenamiento local para permitir el funcionamiento principal sin conexión.

# \- Incorporación visual de estados de stock completo, stock bajo y muy bajo.

# \- Actualización del diseño de la pantalla principal.

# \- Incorporación de controles para aumentar y disminuir cantidades.

# \- Actualización del resumen de inventario.

# \- Preparación de la estructura para futuras funciones de historial y configuración.

# 

# \### Estado actual

# 

# Actualmente se encuentra definido el diseño principal de la aplicación y la estructura de los datos que serán necesarios para gestionar el inventario.

# 

# La interfaz principal muestra el resumen del inventario y permite visualizar rápidamente los productos y su estado de stock.

# 

# \### Próximos cambios

# 

# \- Implementar la base de datos local.

# \- Crear las entidades de Room.

# \- Implementar las operaciones CRUD.

# \- Implementar el registro de productos.

# \- Implementar la modificación de cantidades.

# \- Implementar el historial de movimientos.

# \- Implementar las alertas de stock bajo.

# \- Implementar la pantalla de configuración.

# \- Realizar pruebas de funcionamiento.

# \- Completar y publicar la versión final del proyecto.

# 

# \## 10. Estado del proyecto

# 

# El proyecto se encuentra en fase de desarrollo.

# 

# El diseño visual y la estructura funcional se encuentran definidos y se continuará con la implementación de la gestión de datos y las funcionalidades principales de la aplicación.

# 

# \## 11. Repositorio

# 

# Repositorio del proyecto:

# 

# https://github.com/Rebecaaguirrear-stack/Mi-Stock-.git

