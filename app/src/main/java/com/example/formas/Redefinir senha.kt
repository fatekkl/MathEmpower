package com.example.formas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.formas.ui.theme.FormasTheme
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Esqueci(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(corEscura))
    ) {
        Row(
            modifier = Modifier
                .padding(top = 45.dp, start = 25.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.vector3),
                contentDescription = "",
                modifier = Modifier
                    .padding(end = 90.dp)
                    .size(20.dp)
                    .clickable { navController.navigate("login") }
            )
            Image(
                painter = painterResource(id = R.drawable.group),
                contentDescription = "",
                modifier = Modifier
                    .size(33.dp)
            )
            Text(
                "AlgebrApp",
                color = Color.White,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.padding(37.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Card(
                modifier = Modifier.fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = Color(corAzul)),
                shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        "Redefinir a senha",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White,
                        modifier = Modifier.padding(top = 60.dp)
                    )

                    Spacer(modifier = Modifier.padding(2.dp))

                    Image(
                        painter = painterResource(R.drawable.line_roxo),
                        contentDescription = "linha roxa",
                        modifier = Modifier
                            .size(width = 163.dp, height = 4.dp)
                    )

                    Spacer(modifier = Modifier.padding(16.dp))

                    Column(horizontalAlignment = Alignment.Start) {
                        Row {
                            Text(
                                "Esqueceu sua senha?",
                                fontSize = 13.sp,
                                color = Color.Black,
                            )
                            Spacer(modifier = Modifier.width(5.dp))
                            Text(
                                "Sem problemas!",
                                fontSize = 13.sp,
                                color = Color.White
                            )
                        }
                        Text(
                            "Vamos ajudá-lo a criar uma nova",
                            fontSize = 13.sp,
                            color = Color.White,
                            modifier = Modifier.padding(start = 14.dp)
                        )
                    }

                    Spacer(modifier = Modifier.padding(25.dp))

                    Text(
                        "Por favor, insira o endereço de e-mail associado à sua conta. " +
                                "Enviaremos um link para redefinir sua senha.",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.padding(15.dp))

                    var email by remember { mutableStateOf("") }

                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Email", fontSize = 12.sp) },
                        modifier = Modifier.width(274.43.dp),
                        shape = RoundedCornerShape(7.dp),
                        textStyle = TextStyle(fontSize = 13.sp, textAlign = TextAlign.Start),
                        singleLine = true,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(uranium),
                            unfocusedBorderColor = Color(uranium),
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White
                        )
                    )

                    Spacer(modifier = Modifier.padding(30.dp))

                    Button(
                        onClick = { navController.navigate("mudarsenha") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(uranium)),
                        modifier = Modifier.size(width = 159.dp, height = 42.dp),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = "Enviar",
                            color = Color.White,
                            fontSize = 20.sp
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun SenhaNova(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(corEscura))
    ) {
        Row(
            modifier = Modifier
                .padding(top = 45.dp)
                .padding(start = 25.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.vector3),
                contentDescription = "",
                modifier = Modifier
                    .padding(end = 90.dp)
                    .size(20.dp)
                    .clickable { navController.navigate("login") }
            )
            Image(
                painter = painterResource(id = R.drawable.group),
                contentDescription = "",
                modifier = Modifier
                    .size(33.dp)

            )
            Text(
                "AlgebrApp",
                color = Color.White,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.padding(37.dp))

        Card(
            modifier = Modifier.fillMaxSize(),
            colors = CardDefaults.cardColors(containerColor = Color(corAzul)),
            shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
                    .fillMaxSize()
            ) {
                Text(
                    "Redefinir a senha",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    modifier = Modifier.padding(top = 60.dp)
                )

                Spacer(modifier = Modifier.padding(2.dp))

                Image(
                    painter = painterResource(R.drawable.line_roxo),
                    contentDescription = "linha roxa",
                    modifier = Modifier
                        .size(width = 163.dp, height = 4.dp)
                )
                Spacer(modifier = Modifier.padding(top = 60.dp))

                var senha by remember {
                    mutableStateOf("")
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp)
                ) {
                    Text(
                        "Nova Senha:",
                        fontSize = 13.sp,
                        color = Color(corText),
                        fontWeight = FontWeight.SemiBold,
                    )
                }

                Spacer(modifier = Modifier.padding(top = 5.dp))

                androidx.compose.material3.OutlinedTextField(
                    value = senha,
                    onValueChange = { novoTexto -> senha = novoTexto },
                    modifier = Modifier
                        .width(321.62.dp),
                    shape = RoundedCornerShape(7.dp),
                    textStyle = TextStyle(
                        fontSize = 13.sp,
                        textAlign = TextAlign.Start
                    ),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(uranium),
                        unfocusedBorderColor = Color(uranium),
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White
                    ),
                    singleLine = true
                )

                Spacer(modifier = Modifier.padding(10.dp))

                var confirma by remember {
                    mutableStateOf("")
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp)
                ) {
                    Text(
                        "Repita a nova Senha:",
                        fontSize = 13.sp,
                        color = Color(corText),
                        fontWeight = FontWeight.SemiBold,
                    )
                }

                Spacer(modifier = Modifier.padding(top = 5.dp))

                androidx.compose.material3.OutlinedTextField(
                    value = confirma,
                    onValueChange = { novoTexto -> confirma = novoTexto },
                    modifier = Modifier
                        .width(321.62.dp)   ,
                    shape = RoundedCornerShape(7.dp),
                    textStyle = TextStyle(
                        fontSize = 13.sp,
                        textAlign = TextAlign.Start
                    ),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(uranium),
                        unfocusedBorderColor = Color(uranium),
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White
                    ),
                    singleLine = true
                )

                Spacer(modifier = Modifier.padding(top = 20.dp))


                Button(
                    onClick = { navController.navigate("senhaalterada") },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(uranium)
                    ),

                    modifier = Modifier
                        .size(width = 159.dp, height = 42.dp),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    androidx.compose.material3.Text(
                        text = "Redefinir",
                        color = Color.White,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically)
                    )
                }
            }
        }
    }
}


@Composable
fun NewPass(navController: NavController) {
    val splashScreenDuration = 1500L // 1500 ms = 1,5 segundos

    LaunchedEffect(Unit) {
        delay(splashScreenDuration)
        navController.navigate("login") {
            popUpTo("login") { inclusive = true }
        }
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(corEscura))
    ) {
        Row(
            modifier = Modifier
                .padding(top = 45.dp)
                .padding(start = 25.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.vector3),
                contentDescription = "",
                modifier = Modifier
                    .padding(end = 90.dp)
                    .size(20.dp)
                    .clickable { navController.navigate("login") }
            )
            Image(
                painter = painterResource(id = R.drawable.group),
                contentDescription = "",
                modifier = Modifier
                    .size(33.dp)

            )
            Text(
                "AlgebrApp",
                color = Color.White,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.padding(37.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Card(
                modifier = Modifier
                    .fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = Color(corAzul)),
                shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp)
            ) {
                Text(
                    "Senha alterada!",
                    color = Color.White,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 230.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.padding(10.dp))
            }
        }
    }
}

@Preview
@Composable
private fun EsqueciPreview() {
    FormasTheme {
        Esqueci(rememberNavController())
    }
}

@Preview
@Composable
private fun NewPreview() {
    FormasTheme {
        SenhaNova(rememberNavController())
    }
}

@Preview
@Composable
private fun SenhaPreview() {
    FormasTheme {
        NewPass(rememberNavController())
    }
}

