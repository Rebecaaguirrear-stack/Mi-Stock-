package com.rebeca.mistock

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Producto(
    val nombre: String,
    var cantidad: Int,
    val maximo: Int
)

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MiStockApp()
        }
    }
}

@androidx.compose.runtime.Composable
fun MiStockApp() {

    val productos = remember {
        mutableStateListOf(
            Producto("Agua 1L", 4, 24),
            Producto("Coca Cola", 1, 12),
            Producto("Fanta", 13, 13),
            Producto("Zumo naranja", 6, 12),
            Producto("Leche entera", 8, 12)
        )
    }

    var pantalla by remember {
        mutableStateOf("Inicio")
    }

    MaterialTheme {

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFF5F5FA)
        ) {

            Column(
                modifier = Modifier.fillMaxSize()
            ) {

                // ENCABEZADO
                Header()

                when (pantalla) {

                    "Inicio" -> {

                        InicioScreen(
                            productos = productos
                        )
                    }

                    "Historial" -> {

                        HistorialScreen()
                    }

                    "Configuración" -> {

                        ConfiguracionScreen()
                    }
                }

                Spacer(
                    modifier = Modifier.weight(1f)
                )

                // NAVEGACIÓN INFERIOR
                BottomNavigation(
                    pantallaActual = pantalla,
                    onPantallaSeleccionada = {
                        pantalla = it
                    }
                )
            }
        }
    }
}


/* ---------------------------------------------------
   ENCABEZADO
--------------------------------------------------- */

@androidx.compose.runtime.Composable
fun Header() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(
                horizontal = 16.dp,
                vertical = 14.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = "☰",
            fontSize = 26.sp
        )

        Spacer(
            modifier = Modifier.width(20.dp)
        )

        Text(
            text = "Mi Stock",
            modifier = Modifier.weight(1f),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "⌕",
            fontSize = 27.sp
        )

        Spacer(
            modifier = Modifier.width(16.dp)
        )

        Text(
            text = "⋮",
            fontSize = 26.sp
        )
    }

    Divider()
}


/* ---------------------------------------------------
   PANTALLA PRINCIPAL
--------------------------------------------------- */

@androidx.compose.runtime.Composable
fun InicioScreen(
    productos: MutableList<Producto>
) {

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        item {

            ResumenStock(
                productos = productos
            )
        }

        item {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "Productos",
                    modifier = Modifier.weight(1f),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

                Button(
                    onClick = {
                        // Próximamente:
                        // abrir pantalla para añadir producto
                    }
                ) {
                    Text("+ Añadir")
                }
            }
        }

        items(productos) { producto ->

            ProductoCard(
                producto = producto
            )
        }
    }
}


/* ---------------------------------------------------
   RESUMEN
--------------------------------------------------- */

@androidx.compose.runtime.Composable
fun ResumenStock(
    productos: List<Producto>
) {

    val productosBajo = productos.count {
        it.cantidad <= 4
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column(
                    modifier = Modifier.weight(1f)
                ) {

                    Text(
                        text = "Resumen de stock",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Todo bajo control",
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                }

                Text(
                    text = "›",
                    fontSize = 30.sp
                )
            }

            Spacer(
                modifier = Modifier.height(14.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                Estadistica(
                    valor = productos.size.toString(),
                    titulo = "Productos",
                    modifier = Modifier.weight(1f)
                )

                Estadistica(
                    valor = productosBajo.toString(),
                    titulo = "Bajo",
                    color = Color.Red,
                    modifier = Modifier.weight(1f)
                )

                Estadistica(
                    valor = "48,66 €",
                    titulo = "Valor",
                    color = Color(0xFF4E7D28),
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}


/* ---------------------------------------------------
   TARJETA DE ESTADÍSTICA
--------------------------------------------------- */

@androidx.compose.runtime.Composable
fun Estadistica(
    valor: String,
    titulo: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Black
) {

    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFAFAFA)
        )
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = valor,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = color
            )

            Text(
                text = titulo,
                fontSize = 12.sp,
                color = Color.Gray
            )
        }
    }
}


/* ---------------------------------------------------
   PRODUCTO
--------------------------------------------------- */

@androidx.compose.runtime.Composable
fun ProductoCard(
    producto: Producto
) {

    val porcentaje =
        producto.cantidad.toFloat() /
                producto.maximo.toFloat()

    val muyBajo = producto.cantidad <= 2

    val stockCompleto =
        producto.cantidad >= producto.maximo

    val estado: String
    val estadoColor: Color

    if (stockCompleto) {

        estado = "Stock completo"
        estadoColor = Color(0xFF4E7D28)

    } else if (muyBajo) {

        estado = "Muy bajo"
        estadoColor = Color.Red

    } else {

        estado = "Stock bajo"
        estadoColor = Color(0xFFC58A00)
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Column(
            modifier = Modifier.padding(14.dp)
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column(
                    modifier = Modifier.weight(1f)
                ) {

                    Text(
                        text = producto.nombre,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(
                        modifier = Modifier.height(8.dp)
                    )

                    // Barra de progreso
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(6.dp)
                            .background(
                                Color.LightGray,
                                RoundedCornerShape(10.dp)
                            )
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(
                                    porcentaje.coerceIn(
                                        0f,
                                        1f
                                    )
                                )
                                .height(6.dp)
                                .background(
                                    estadoColor,
                                    RoundedCornerShape(10.dp)
                                )
                        )
                    }
                }

                Spacer(
                    modifier = Modifier.width(12.dp)
                )

                Text(
                    text = estado,
                    color = estadoColor,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "${producto.cantidad}/${producto.maximo}",
                    color = Color.Gray,
                    modifier = Modifier.weight(1f)
                )

                TextButton(
                    onClick = {

                        if (producto.cantidad > 0) {

                            producto.cantidad--
                        }
                    }
                ) {

                    Text(
                        text = "−",
                        fontSize = 24.sp
                    )
                }

                Text(
                    text = producto.cantidad.toString(),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                TextButton(
                    onClick = {

                        if (
                            producto.cantidad <
                            producto.maximo
                        ) {

                            producto.cantidad++
                        }
                    }
                ) {

                    Text(
                        text = "+",
                        fontSize = 24.sp
                    )
                }
            }
        }
    }
}


/* ---------------------------------------------------
   HISTORIAL
--------------------------------------------------- */

@androidx.compose.runtime.Composable
fun HistorialScreen() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {

        Text(
            text = "Historial",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Text(
            text = "Aquí aparecerán las compras y movimientos del inventario.",
            color = Color.Gray
        )
    }
}


/* ---------------------------------------------------
   CONFIGURACIÓN
--------------------------------------------------- */

@androidx.compose.runtime.Composable
fun ConfiguracionScreen() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {

        Text(
            text = "Configuración",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Text(
            text = "Aquí se configurarán las alertas, categorías y preferencias."
        )
    }
}


/* ---------------------------------------------------
   NAVEGACIÓN INFERIOR
--------------------------------------------------- */

@androidx.compose.runtime.Composable
fun BottomNavigation(
    pantallaActual: String,
    onPantallaSeleccionada: (String) -> Unit
) {

    Column {

        Divider()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            TextButton(
                onClick = {
                    onPantallaSeleccionada("Inicio")
                }
            ) {

                Text(
                    text = "⌂\nInicio",
                    color =
                        if (pantallaActual == "Inicio")
                            Color(0xFF4E7D28)
                        else
                            Color.Gray
                )
            }

            TextButton(
                onClick = {
                    onPantallaSeleccionada("Historial")
                }
            ) {

                Text(
                    text = "◷\nHistorial",
                    color =
                        if (pantallaActual == "Historial")
                            Color(0xFF4E7D28)
                        else
                            Color.Gray
                )
            }

            TextButton(
                onClick = {
                    onPantallaSeleccionada("Configuración")
                }
            ) {

                Text(
                    text = "⚙\nConfiguración",
                    color =
                        if (pantallaActual == "Configuración")
                            Color(0xFF4E7D28)
                        else
                            Color.Gray
                )
            }
        }
    }
}