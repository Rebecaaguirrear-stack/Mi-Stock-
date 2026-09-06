# Mi-Stock-

## Desarrollo de Aps Móviles 

### Proyecto de aplicación Android

**Nombre del proyecto:** Mi Stock  
**Plataforma:** Android  
**Lenguaje:** Kotlin  
**IDE:** Android Studio  
**Interfaz:** Jetpack Compose  
**Base de datos:** Room sobre SQLite  
**Arquitectura:** MVVM  
**Control de versiones:** Git y GitHub  

---

## 1. Descripción del proyecto

Para dispositivos Android diseñada para facilitar la gestión de los productos de consumo habitual en el hogar. La aplicación permitirá registrar productos como agua, Coca-Cola, Fanta, etc,con el objetivo principal es que los usuarios puedan conocer en todo momento qué productos tienen disponibles, qué cantidad queda de cada uno y cuándo es necesario realizar una nueva compra, también permitirá registrar precios, tiendas habituales y movimientos de inventario, generará alertas cuando un producto alcance una cantidad mínima previamente configurada.

---

## 2. Problema que busca solucionar

En un hogar es habitual comprar determinados productos de manera recurrente. Sin embargo, muchas veces no se recuerda cuántas unidades quedan disponibles o si es necesario volver a comprarlos.
Por ejemplo, puede ocurrir que en casa queden solamente dos botellas de agua, una Coca-Cola o un paquete de papel higiénico y nadie se dé cuenta hasta que el producto se haya terminado.
Otro problema es que los precios pueden variar entre establecimientos y con el tiempo. Llevar un registro manual mediante notas del teléfono, papel o memoria puede resultar poco práctico

- Registrar los productos del hogar.
- Controlar las cantidades disponibles.
- Establecer un nivel mínimo de stock.
- Recibir alertas cuando queden pocas unidades.
- Registrar precios.
- Registrar la tienda habitual.
- Registrar las compras realizadas.
- Consultar el historial de movimientos.
- Conocer cuánto se gasta en determinados productos o categorías.

---

## 3. Objetivo general

Desarrollar una aplicación Android que permita administrar de manera sencilla y organizada el inventario de productos de consumo habitual en el hogar.

### Objetivos específicos

- Registrar y consultar productos.
- Controlar las cantidades disponibles.
- Establecer cantidades mínimas y máximas.
- Registrar compras y consumos.
- Generar alertas de bajo inventario.
- Registrar precios y tiendas habituales.
- Consultar el historial de movimientos.
- Generar estadísticas sobre compras y gastos.
- Mantener una estructura de aplicación organizada y modular.

---

## 4. Tecnologías propuestas

### Kotlin
Será el lenguaje utilizado para desarrollar la aplicación Android.

### Android Studio
Será el entorno de desarrollo utilizado para crear, probar y organizar el proyecto.

### Jetpack Compose
Se utilizará para construir la interfaz de usuario de la aplicación.

### Room y SQLite
Room permitirá almacenar la información de los productos y movimientos de inventario de manera estructurada sobre SQLite.

Una de las ventajas de esta propuesta es que las funciones principales del inventario podrán utilizarse sin conexión a Internet.

### Arquitectura MVVM
Se utilizará el patrón Model-View-ViewModel (MVVM) para organizar la aplicación y separar la interfaz de usuario de la lógica y los datos.

### Git y GitHub
Se utilizarán para llevar el control de versiones y registrar los avances realizados durante el desarrollo.

### Notificaciones de Android
Se utilizarán para informar al usuario cuando un producto alcance o se encuentre por debajo del nivel mínimo de stock.

---

## 5. Estructura y organización de la aplicación

La aplicación estará organizada en diferentes secciones para facilitar la navegación y el mantenimiento del proyecto.

### Inicio
La pantalla principal mostrará un resumen del estado del inventario.

Ejemplo:
- 12 productos registrados.
- 3 productos con stock bajo.
- Valor aproximado del inventario.

También mostrará el listado de productos y su estado actual.

### Detalle del producto
Permitirá consultar:
- Nombre.
- Imagen.
- Categoría.
- Cantidad actual.
- Cantidad máxima.
- Stock mínimo.
- Precio.
- Tienda habitual.
- Historial.
- Opción para comprar.
- Opción para editar.

### Alertas
Mostrará los productos que necesiten reposición.

Ejemplo:

Coca-Cola 2 L  
Stock actual: 2 unidades  
Stock mínimo: 3 unidades

La aplicación podrá mostrar una alerta indicando que quedan pocas unidades.

### Historial
Permitirá consultar:
- Compras realizadas.
- Productos consumidos.
- Entradas de inventario.
- Salidas de inventario.

### Estadísticas
La aplicación podrá calcular:
- Dinero gastado durante el mes.
- Número de compras.
- Gasto por categoría.
- Productos comprados con mayor frecuencia.
- Precio medio de determinados productos.

### Ajustes
Permitirá configurar:
- Alertas.
- Categorías.
- Tiendas.
- Preferencias de la aplicación.

---

## 6. Funcionalidades principales

### Gestión de productos

El usuario podrá crear productos indicando:
- Nombre.
- Categoría.
- Cantidad actual.
- Cantidad máxima.
- Cantidad mínima.
- Precio por unidad.
- Tienda habitual.
- Imagen.

### Control del inventario

Cada producto tendrá una cantidad disponible.

Ejemplo:

Coca-Cola 2 L  
Cantidad inicial: 2 unidades

Si el usuario compra 6 unidades:

2 + 6 = 8 unidades

Si posteriormente consume 1 unidad:

8 - 1 = 7 unidades

De esta manera, el sistema permitirá mantener actualizado el inventario.

### Sistema de alertas

El usuario podrá establecer un nivel mínimo de stock.

Ejemplo:

Coca-Cola 2 L  
Stock actual: 2  
Stock mínimo: 3

La aplicación detectará que el producto está por debajo del límite y podrá mostrar:

**Stock muy bajo**

También podrá enviar una notificación:

Mi Stock: Quedan pocas unidades de Coca-Cola 2 L.

### Gestión de precios

La aplicación permitirá almacenar el precio de los productos.

Ejemplo:

Coca-Cola 2 L
- Precio actual: 1,65 €
- Tienda habitual: Mercadona
- Última compra: 1,65 €

En futuras versiones se podrá permitir guardar diferentes precios dependiendo de la tienda.

### Historial de movimientos

Cada movimiento realizado sobre un producto podrá quedar registrado.

Ejemplo:

Coca-Cola 2 L  
-2 unidades  
Consumo registrado

Agua 1,5 L  
+6 unidades  
Compra registrada

Esto permitirá conocer cómo evoluciona el inventario.

---



