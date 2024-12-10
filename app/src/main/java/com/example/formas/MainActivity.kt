package com.example.formas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.formas.ui.theme.FormasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormasTheme {
                val navController = rememberNavController()

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    content = { innerPadding ->
                        Column(
                            modifier = Modifier
                                .padding(innerPadding)
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            NavHost(navController = navController, startDestination = "splash") {
                                composable("splash") { Inicio(navController) }
                                composable("login") { ConteudoLogin(navController) }
                                composable("cadastro") { TelaCadastro(navController) }
                                composable("novo") { CadastroSucesso(navController) }
                                composable("esqueci") { Esqueci(navController) }
                                composable("mudarsenha") { SenhaNova(navController) }
                                composable("senhaalterada") { NewPass(navController) }
                                composable("home") { Home(navController) }
                                composable("matematica") { PageMath(navController) }
                                composable("retangulo") { CalcReta(navController) }
                                composable("circulo") { CalcCirculo(navController) }
                                composable("quadrado") { CalcQuadrado(navController) }
                                composable("trapezoide") { CalcTrapezio(navController) }
                                composable("poligono") { CalcPoligono(navController) }

                            }
                        }
                    }
                )
            }
        }
    }
}


val uranium = 0xFFAEDFF7
val corEscura = 0xFFFF213F4E
val corAzul = 0xFFFF3288F6
val corText = 0xFFFF03022C
val corArea = 0xFFFF4F5965
val corCalc = 0xFFFF3288F6

val uranium_blue = Color(0xFFAEDFF7)
val indigo_dye = Color(0xFF005377)

@Composable
// Conteúdo da tela de login
fun Inicio(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(indigo_dye)


    ) {
        Text(
            "Cresça como estudante, cresça com MathEmpower",
            color = uranium_blue,
            textAlign = TextAlign.Center,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(10.dp),
        )

        Image(
            painter = painterResource(id = R.drawable.logo_mathempower),
            contentDescription = "",
            modifier = Modifier.padding(top = 80.dp)
        )

        Spacer(modifier = Modifier.padding(top = 40.dp))

        Text("MathEmpower", fontSize = 38.sp, color = uranium_blue)

        Spacer(modifier = Modifier.padding(top = 70.dp))


        ElevatedButton(
            elevation = ButtonDefaults.elevatedButtonElevation(
                8.dp,
                focusedElevation = 10.dp,
                hoveredElevation = 10.dp,
                pressedElevation = 20.dp
            ),
            colors = ButtonDefaults.buttonColors(containerColor = uranium_blue),
            onClick = { navController.navigate("login") },
            modifier = Modifier
                .width(249.dp)
                .height(53.dp),

            ) {
            Text("Começar", fontSize = 25.sp, fontWeight = FontWeight.Medium, color = indigo_dye)
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FormasTheme {
        Inicio(rememberNavController())
    }
}
