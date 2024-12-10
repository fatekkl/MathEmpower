package com.example.formas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.formas.ui.theme.FormasTheme
import kotlin.math.sqrt

@Composable
fun Home(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(indigo_dye)
    ) {
        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_mathempower),
                contentDescription = "",
                modifier = Modifier.size(33.dp)

            )
            Text(
                "MathEmpower",
                color = Color.White,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(
            "Visualize as possibilidades da matemática.",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 22.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .padding(10.dp)
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row {

            Button(
                onClick = { },
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .width(172.dp)
                    .height(40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = uranium_blue
                )
            ) {
                Text("Geometria", fontSize = 15.sp, color = indigo_dye)
            }

            Spacer(modifier = Modifier.padding(10.dp))

            Button(
                onClick = { navController.navigate("matematica") },
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .width(172.dp)
                    .height(40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = uranium_blue
                )
            ) {
                Text(
                    "Matemática",
                    color = indigo_dye,
                    fontSize = 15.sp,
                )
            }


        }

        Spacer(modifier = Modifier.padding(top = 5.dp))

        Text(
            "Formas Geométricas em 2D",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.line_10),
            contentDescription = "",
            modifier = Modifier
                .offset(y = (-2).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { navController.navigate("circulo") },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = uranium_blue
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.circulo_home),
                    contentDescription = "",
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Círculo", fontSize = 15.sp, color = indigo_dye)
            }
        }

        Spacer(modifier = Modifier.padding(top = 14.dp))

        Button(
            onClick = { navController.navigate("quadrado") },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = uranium_blue
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.quadrado),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Quadrado", fontSize = 15.sp, color = indigo_dye)
            }
        }

        Spacer(modifier = Modifier.padding(top = 14.dp))

        Button(
            onClick = { navController.navigate("retangulo") },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = uranium_blue
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.ret_ngulo),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Retângulo", fontSize = 15.sp, color = indigo_dye)
            }
        }

        Spacer(modifier = Modifier.padding(top = 14.dp))

        Button(
            onClick = { navController.navigate("trapezoide") },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = uranium_blue
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.trape),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Trapezoide", fontSize = 15.sp, color = indigo_dye)
            }
        }

        Spacer(modifier = Modifier.padding(top = 14.dp))

        Button(
            onClick = { navController.navigate("poligono") },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = uranium_blue
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.poligonp),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Polígono", fontSize = 15.sp, color = indigo_dye)
            }
        }

        Spacer(modifier = Modifier.padding(top = 5.dp))

        Text(
            "Formas Geométricas em 3D",
            color = uranium_blue,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.line_10),
            contentDescription = "",
            modifier = Modifier
                .offset(y = (-2).dp)
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = uranium_blue
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.cubo),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Cubo", fontSize = 15.sp, color = indigo_dye)
            }
        }

        Spacer(modifier = Modifier.padding(top = 13.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = uranium_blue
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.cuboide),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Cubóide", fontSize = 15.sp, color = indigo_dye)
            }
        }

        Spacer(modifier = Modifier.padding(top = 13.dp))
    }
}

@Composable
fun PageMath(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(indigo_dye)
    ) {
        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_mathempower),
                contentDescription = "",
                modifier = Modifier.size(33.dp)

            )
            Text(
                "MathEmpower",
                color = Color.White,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(
            "O País da Matemágica e O Número de Ouro",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .padding(10.dp)
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row {

            Button(
                onClick = { navController.navigate("home") },
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .width(172.dp)
                    .height(40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = uranium_blue
                )
            ) {
                Text(
                    "Geometria",
                    color = indigo_dye,
                    fontSize = 15.sp,
                )
            }

            Spacer(modifier = Modifier.padding(10.dp))

            Button(
                onClick = { },
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .width(172.dp)
                    .height(40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(uranium)
                )
            ) {
                Text(
                    "Matemática",
                    fontSize = 15.sp,
                    color = indigo_dye
                )
            }


        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(
            "Matemática",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.line_10),
            contentDescription = "",
            modifier = Modifier
                .offset(y = (-3).dp)
        )

        Text(
            "Olá! Vamos mergulhar nesta plataforma incrível que tenho repleta de ferramentas para lógica e matemática. É como ter uma caixa de ferramentas supercarregada cheia de tudo que você precisa para lidar com todos os tipos de quebra-cabeças e equações alucinantes.",
            fontWeight = FontWeight.Medium,
            color = Color.White,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(20.dp)
                .offset(y = (-17).dp)
        )

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(uranium)
            )
        ) {
            Text(
                "Conheça seu número",
                fontSize = 15.sp,
                color = indigo_dye
            )
        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(uranium)
            )
        ) {
            Text(
                "Maior divisor comum",
                fontSize = 15.sp,
                color = indigo_dye
            )
        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(uranium)
            )
        ) {
            Text(
                "Menor multiplo comum",
                fontSize = 14.sp,
                color = indigo_dye
            )
        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(uranium)
            )
        ) {
            Text(
                "Par ou ímpar",
                fontSize = 15.sp,
                color = indigo_dye
            )
        }


    }

}

@Composable
fun CalcCirculo(navController: NavController) {
    var altura by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(0.0) }
    var area_circulo = "%.2f".format(area)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(indigo_dye)
    ) {
        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_mathempower),
                contentDescription = "",
                modifier = Modifier.size(33.dp)

            )
            Text(
                "MathEmpower",
                color = Color.White,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.padding(top = 30.dp))

        Text(
            "Geometria do Círculo",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.line_10),
            contentDescription = "",
            modifier = Modifier
                .offset(y = (-3).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(172.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(uranium)
            )
        ) {
            Text("Geometria", fontSize = 15.sp, color = indigo_dye)
        }

        Spacer(modifier = Modifier.padding(top = 5.dp))

        Text(
            "Utilize esta calculadora para acessar informações diversas sobre um Círculo perfeito. Introduza os dados necessários para visualizar os resultados.",
            fontWeight = FontWeight.Light,
            color = Color.White,
            fontSize = 17.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
                .offset(y = (-1).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Card(
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(370.dp)
                .height(258.dp),
        ) {
            Box(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Row {
                    Column {

                        Image(
                            painter = painterResource(id = R.drawable.circulo),
                            contentDescription = "",
                            modifier = Modifier
                                .size(150.dp)
                                .offset(y = 30.dp)
                        )

                        Card(
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier
                                .width(160.dp)
                                .height(50.dp)
                                .offset(y = 30.dp),
                            colors = CardDefaults.cardColors(containerColor = indigo_dye)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.offset(y = 10.dp)
                            ) {
                                Text(
                                    "Área :  ",
                                    modifier = Modifier
                                        .padding(start = 15.dp),
                                    color = Color.White,
                                    fontWeight = FontWeight.Light,
                                    fontSize = 18.sp,
                                )

                                Text(
                                    text = area_circulo,
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White,

                                    )
                            }

                        }
                    }
                    Column {
                        Spacer(
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .padding(start = 10.dp)
                        )

                        OutlinedTextField(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(60.dp),
                            value = altura,
                            onValueChange = { newText -> altura = newText },
                            label = {
                                Text(
                                    "Raio (r): ",
                                    color = indigo_dye,
                                    fontSize = 15.sp,
                                )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(uranium),
                                unfocusedBorderColor = Color(uranium),
                                focusedContainerColor = Color(uranium),
                                unfocusedContainerColor = Color(uranium)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            )
                        )

                        Spacer(modifier = Modifier.padding(top = 20.dp))



                        Button(
                            onClick = {
                                area =
                                    if (altura.isNotEmpty()) (altura.toDouble() * altura.toDouble()) * 3.14 else 0.0
                            },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = uranium_blue),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(50.dp)
                        ) {
                            Text(
                                "Calcular",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Light,
                                color = indigo_dye
                            )
                        }

                    }
                }
            }
        }

    }


}

@Composable
fun CalcQuadrado(navController: NavController) {
    var altura by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(0.0) }
    var area_quadrado = "%.2f".format(area)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(indigo_dye)
    ) {
        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_mathempower),
                contentDescription = "",
                modifier = Modifier.size(33.dp)

            )
            Text(
                "MathEmpower",
                color = uranium_blue,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.padding(top = 30.dp))

        Text(
            "Geometria do Quadrado",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.line_10),
            contentDescription = "",
            modifier = Modifier
                .offset(y = (-3).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(172.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(uranium)
            )
        ) {
            Text("Geometria", fontSize = 15.sp, color = indigo_dye)
        }

        Spacer(modifier = Modifier.padding(top = 5.dp))

        Text(
            "Este instrumento de cálculo oferece a capacidade de obter diferentes informações sobre a figura de um quadrado. Introduza as medidas para visualizar os resultados.",
            fontWeight = FontWeight.Light,
            color = Color.White,
            fontSize = 17.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
                .offset(y = (-1).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Card(
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(370.dp)
                .height(258.dp)
                .align(Alignment.CenterHorizontally),
        ) {
            Box(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Row {
                    Column(
                        modifier = Modifier.padding(end = 10.dp)
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.quadra),
                            contentDescription = "",
                            modifier = Modifier
                                .size(150.dp)
                                .offset(y = 30.dp)
                        )

                        Card(
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier
                                .width(160.dp)
                                .height(50.dp)
                                .offset(y = 30.dp),
                            colors = CardDefaults.cardColors(containerColor = indigo_dye)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.offset(y = 12.dp)
                            ) {
                                Text(
                                    "Área :  ",
                                    modifier = Modifier
                                        .padding(start = 15.dp),
                                    color = Color.White,
                                    fontSize = 18.sp,
                                )

                                Text(
                                    text = area_quadrado,
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White,

                                    )
                            }

                        }
                    }
                    Column {
                        Spacer(
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .padding(start = 10.dp)
                        )

                        OutlinedTextField(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(60.dp),
                            value = altura,
                            onValueChange = { newText -> altura = newText },
                            label = {
                                Text(
                                    "Aresta (e): ",
                                    color = indigo_dye,
                                    fontSize = 15.sp,
                                )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(uranium),
                                unfocusedBorderColor = Color(uranium),
                                focusedContainerColor = Color(uranium),
                                unfocusedContainerColor = Color(uranium)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            )
                        )

                        Spacer(modifier = Modifier.padding(top = 20.dp))



                        Button(
                            onClick = {
                                area =
                                    if (altura.isNotEmpty()) altura.toDouble() * altura.toDouble() else 0.0
                            },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(corCalc)),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(50.dp)
                        ) {
                            Text(
                                "Calcular",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Light
                            )
                        }

                    }
                }
            }
        }

    }


}

@Composable
fun CalcReta(navController: NavController) {

    var base by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(0.0) }
    var area_retangulo = "%.2f".format(area)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(indigo_dye)
    ) {
        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_mathempower),
                contentDescription = "",
                modifier = Modifier.size(33.dp)

            )
            Text(
                "MathEmpower",
                color = Color.White,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.padding(top = 30.dp))

        Text(
            "Geometria do Retângulo",
            color = indigo_dye,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.line_10),
            contentDescription = "",
            modifier = Modifier
                .offset(y = (-3).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(172.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(uranium)
            )
        ) {
            Text("Geometria", fontSize = 15.sp, color = indigo_dye)
        }

        Spacer(modifier = Modifier.padding(top = 5.dp))

        Text(
            "Esta calculadora permite calcular diferentes informações sobre o Retângulo. Insira as dimensões para obter o resultado.",
            fontWeight = FontWeight.Light,
            color = Color.White,
            fontSize = 17.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
                .offset(y = (-1).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Card(
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(370.dp)
                .height(258.dp)
                .align(Alignment.CenterHorizontally),
        ) {
            Box(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Row {
                    Column(
                        modifier = Modifier.padding(end = 10.dp)
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.area_retangulo),
                            contentDescription = "",
                            modifier = Modifier
                                .size(150.dp)
                                .offset(y = 30.dp)
                        )

                        Card(
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier
                                .width(160.dp)
                                .height(50.dp)
                                .offset(y = 30.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(corArea))
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.offset(y = 12.dp)
                            ) {
                                Text(
                                    "Área :  ",
                                    modifier = Modifier
                                        .padding(start = 15.dp),
                                    color = Color.White,
                                    fontWeight = FontWeight.Light,
                                    fontSize = 18.sp,
                                )

                                Text(
                                    text = area_retangulo,
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White,

                                    )
                            }

                        }
                    }
                    Column {
                        Spacer(
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .padding(start = 10.dp)
                        )


                        OutlinedTextField(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(60.dp),
                            value = base,
                            onValueChange = { newText -> base = newText },
                            label = {
                                Text(
                                    "Base (b):",
                                    color = indigo_dye,
                                    fontSize = 15.sp,
                                )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(uranium),
                                unfocusedBorderColor = Color(uranium),
                                focusedContainerColor = Color(uranium),
                                unfocusedContainerColor = Color(uranium)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            )
                        )

                        Spacer(modifier = Modifier.padding(top = 10.dp))


                        OutlinedTextField(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(60.dp),
                            value = altura,
                            onValueChange = { newText -> altura = newText },
                            label = {
                                Text(
                                    "Altura (h): ",
                                    color = indigo_dye,
                                    fontSize = 15.sp,
                                )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(uranium),
                                unfocusedBorderColor = Color(uranium),
                                focusedContainerColor = Color(uranium),
                                unfocusedContainerColor = Color(uranium)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            )
                        )

                        Spacer(modifier = Modifier.padding(top = 20.dp))



                        Button(
                            onClick = {
                                area =
                                    if (base.isNotEmpty() && altura.isNotEmpty()) altura.toDouble() * base.toDouble() else 0.0
                            },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(corCalc)),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(50.dp)
                        ) {
                            Text(
                                "Calcular",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Light
                            )
                        }

                    }
                }
            }
        }

    }


}

@Composable
fun CalcTrapezio(navController: NavController) {

    var base_maior by remember { mutableStateOf("") }
    var base_menor by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(0.0) }
    var area_retangulo = "%.2f".format(area)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(indigo_dye)
    ) {
        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_mathempower),
                contentDescription = "",
                modifier = Modifier.size(33.dp)

            )
            Text(
                "MathEmpower",
                color = uranium_blue,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.padding(top = 30.dp))

        Text(
            "Geometria do Retângulo",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.line_10),
            contentDescription = "",
            modifier = Modifier
                .offset(y = (-3).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(172.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(uranium)
            )
        ) {
            Text("Geometria", fontSize = 15.sp, color = indigo_dye)
        }

        Spacer(modifier = Modifier.padding(top = 5.dp))

        Text(
            "Esta calculadora permite calcular diferentes informações sobre o Retângulo. Insira as dimensões para obter o resultado.",
            fontWeight = FontWeight.Light,
            color = Color.White,
            fontSize = 17.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
                .offset(y = (-1).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Card(
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(370.dp)
                .height(320.dp)
                .align(Alignment.CenterHorizontally),
        ) {
            Box(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Row {
                    Column(
                        modifier = Modifier.padding(end = 10.dp)
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.trapezoid),
                            contentDescription = "",
                            modifier = Modifier
                                .size(150.dp)
                                .offset(y = 30.dp)
                        )

                        Card(
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier
                                .width(160.dp)
                                .height(50.dp)
                                .offset(y = 20.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(corArea))
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.offset(y = 12.dp)
                            ) {
                                Text(
                                    "Área :  ",
                                    modifier = Modifier
                                        .padding(start = 15.dp),
                                    color = Color.White,
                                    fontWeight = FontWeight.Light,
                                    fontSize = 18.sp,
                                )

                                Text(
                                    text = area_retangulo,
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White,

                                    )
                            }

                        }
                    }
                    Column(
                        verticalArrangement = Arrangement.Center
                    ) {
                        Spacer(
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .padding(start = 10.dp)
                        )

                        OutlinedTextField(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(60.dp),
                            value = base_maior,
                            onValueChange = { newText -> base_maior = newText },
                            label = {
                                Text(
                                    "Base M (B):",
                                    color = indigo_dye,
                                    fontSize = 15.sp,
                                )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(uranium),
                                unfocusedBorderColor = Color(uranium),
                                focusedContainerColor = Color(uranium),
                                unfocusedContainerColor = Color(uranium)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            )
                        )

                        Spacer(modifier = Modifier.padding(top = 10.dp))

                        OutlinedTextField(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(60.dp),
                            value = base_menor,
                            onValueChange = { newText -> base_menor = newText },
                            label = {
                                Text(
                                    "Base m (b):",
                                    color = indigo_dye,
                                    fontSize = 15.sp,
                                )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(uranium),
                                unfocusedBorderColor = Color(uranium),
                                focusedContainerColor = Color(uranium),
                                unfocusedContainerColor = Color(uranium)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            )
                        )

                        Spacer(modifier = Modifier.padding(top = 10.dp))


                        OutlinedTextField(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(60.dp),
                            value = altura,
                            onValueChange = { newText -> altura = newText },
                            label = {
                                Text(
                                    "Altura (h): ",
                                    color = indigo_dye,
                                    fontSize = 15.sp,
                                )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(uranium),
                                unfocusedBorderColor = Color(uranium),
                                focusedContainerColor = Color(uranium),
                                unfocusedContainerColor = Color(uranium)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            )
                        )

                        Spacer(modifier = Modifier.padding(top = 20.dp))



                        Button(
                            onClick = {
                                area =
                                    if (base_maior.isNotEmpty() && base_menor.isNotEmpty() && altura.isNotEmpty()) (base_maior.toDouble() + base_menor.toDouble()) * altura.toDouble() / 2 else 0.0
                            },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = indigo_dye),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(50.dp)
                        ) {
                            Text(
                                "Calcular",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Light
                            )
                        }

                    }
                }
            }
        }

    }


}

@Composable
fun CalcPoligono(navController: NavController) {
    var altura by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(0.0) }
    var area_circulo = "%.2f".format(area)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(indigo_dye)
    ) {
        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_mathempower),
                contentDescription = "",
                modifier = Modifier.size(33.dp)

            )
            Text(
                "MathEmpower",
                color = Color.White,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.padding(top = 30.dp))

        Text(
            "Geometria do Hexágono",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.line_10),
            contentDescription = "",
            modifier = Modifier
                .offset(y = (-3).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(172.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(uranium)
            )
        ) {
            Text("Geometria", fontSize = 15.sp, color = indigo_dye)
        }

        Spacer(modifier = Modifier.padding(top = 5.dp))

        Text(
            "Esta ferramenta de cálculo oferece a capacidade de acessar diferentes informações sobre um hexágono. Insira as dimensões para ver os resultados.",
            fontWeight = FontWeight.Light,
            color = Color.White,
            fontSize = 17.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
                .offset(y = (-1).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Card(
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(370.dp)
                .height(258.dp),
        ) {
            Box(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Row {
                    Column {

                        Image(
                            painter = painterResource(id = R.drawable.poligono),
                            contentDescription = "",
                            modifier = Modifier
                                .size(150.dp)
                                .offset(y = 15.dp)
                        )

                        Card(
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier
                                .width(160.dp)
                                .height(50.dp)
                                .offset(y = 30.dp),
                            colors = CardDefaults.cardColors(containerColor = indigo_dye)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.offset(y = 10.dp)
                            ) {
                                Text(
                                    "Área :  ",
                                    modifier = Modifier
                                        .padding(start = 15.dp),
                                    color = Color.White,
                                    fontWeight = FontWeight.Light,
                                    fontSize = 18.sp,
                                )

                                Text(
                                    text = area_circulo,
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White,

                                    )
                            }

                        }
                    }
                    Column {
                        Spacer(
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .padding(start = 10.dp)
                        )

                        OutlinedTextField(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(60.dp),
                            value = altura,
                            onValueChange = { newText -> altura = newText },
                            label = {
                                Text(
                                    "Aresta (e): ",
                                    color = indigo_dye,
                                    fontSize = 15.sp,
                                )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(uranium),
                                unfocusedBorderColor = Color(uranium),
                                focusedContainerColor = Color(uranium),
                                unfocusedContainerColor = Color(uranium)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            )
                        )

                        Spacer(modifier = Modifier.padding(top = 20.dp))



                        Button(
                            onClick = {
                                area =
                                    if (altura.isNotEmpty()) (3 * sqrt(3.0) / 2) * altura.toDouble() * altura.toDouble() else 0.0
                            },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(corCalc)),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .width(140.dp)
                                .height(50.dp)
                        ) {
                            Text(
                                "Calcular",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Light
                            )
                        }

                    }
                }
            }
        }

    }


}


@Preview
@Composable
private fun HomePreview() {
    FormasTheme {
        Home(rememberNavController())
    }
}

@Preview
@Composable
private fun CalcTrapePreview() {
    FormasTheme {
        CalcPoligono(rememberNavController())
    }
}





