package com.example.formas

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.formas.ui.theme.FormasTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
// Conteúdo da tela de cadastro
fun ConteudoLogin(navController: NavHostController) {

    var email by remember {
        mutableStateOf("") // variavel para o campo de texto email
    }
    var senha by remember {
        mutableStateOf("") // variavel para o campo de texto senha
    }
    var rememberMe by remember { mutableStateOf(false) }  // Variável para o botão de "Lembre de mim"

    var senhaVisivel by remember { mutableStateOf(false) } // Controle de visibilidade

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp)
            .background(indigo_dye),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
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

        Spacer(modifier = Modifier.padding(50.dp))

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            OutlinedTextField(
                value = email,
                onValueChange = { newText -> email = newText },
                label = {
                    Text(
                        "E-mail ou nome de usuário",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                },
                leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.vector2),
                        contentDescription = "Ícone do campo de texto",
                        modifier = Modifier
                            .size(20.dp)
                            .offset(x = 282.dp)
                    )
                },
                modifier = Modifier
                    .width(334.dp)
                    .height(60.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = uranium_blue,
                    unfocusedBorderColor = uranium_blue,
                ),
                shape = RoundedCornerShape(25.dp),
                textStyle = TextStyle(
                    fontSize = 16.sp, textAlign = TextAlign.Start
                )
            )
            Spacer(modifier = Modifier.padding(2.dp))

            OutlinedTextField(
                value = senha,
                onValueChange = { newText -> senha = newText },
                label = {
                    Text(
                        "Senha",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                },
                visualTransformation = if (senhaVisivel) VisualTransformation.None else PasswordVisualTransformation(), // Alterna entre texto visível e bolinhas
                trailingIcon = {
                    IconButton(onClick = {
                        senhaVisivel = !senhaVisivel
                    }) { // Alterna o estado ao clicar
                    }
                },
                leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.vector),
                        contentDescription = "Ícone do campo de texto",
                        modifier = Modifier
                            .size(20.dp)
                            .offset(x = 282.dp)
                    )
                },
                modifier = Modifier
                    .padding(top = 15.dp)
                    .width(334.dp)
                    .height(55.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = uranium_blue,
                    unfocusedBorderColor = uranium_blue

                ),
                shape = RoundedCornerShape(25.dp),
                textStyle = TextStyle(
                    fontSize = 16.sp, textAlign = TextAlign.Start
                )
            )

            Text(
                "Esqueci minha senha",
                fontSize = 16.sp,
                color = Color.White,
                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp)
                    .padding(top = 20.dp)
                    .clickable { navController.navigate("esqueci") }
            )

            Row(
                modifier = Modifier.padding(start = 30.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Lembrar de mim",
                    fontSize = 16.sp,
                    color = Color.White
                )
                Switch(
                    modifier = Modifier
                        .scale(0.8f)
                        .padding(start = 100.dp),
                    checked = rememberMe,
                    onCheckedChange = { rememberMe = it },
                    colors = SwitchDefaults.colors(
                        uncheckedThumbColor = uranium_blue,
                        checkedTrackColor = uranium_blue
                    )
                )
            }

            Button(
                onClick = { navController.navigate("home") },
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .width(124.dp),
                colors = ButtonDefaults.buttonColors(containerColor = uranium_blue) // faz o conteudo do button ter uma coloracao
            ) {
                Text(
                    text = "Entrar",
                    color = indigo_dye,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterVertically)

                )
            }


            Text(
                "Entrar com contas de redes sociais:",
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .padding(top = 2.dp)
            )
            Image(
                painter = painterResource(R.drawable.group_105),
                contentDescription = "",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(width = 120.dp, height = 80.dp)
            )
            OutlinedCard(
                modifier = Modifier
                    .width(268.dp)
                    .height(47.dp),
                colors = androidx.compose.material3.CardDefaults.outlinedCardColors(
                    containerColor = indigo_dye  // Define a cor de fundo como transparente
                ),
                border = BorderStroke(
                    1.5.dp,
                    uranium_blue
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Não tem uma conta? ",
                        fontSize = 14.sp,
                        color = Color.White
                    )

                    Text(
                        "Cadastre-se",
                        fontSize = 16.sp,
                        color = Color.White,
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.clickable { navController.navigate("cadastro") }

                    )

                }

            }

            Spacer(modifier = Modifier.padding(10.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {
                    Text(
                        "Ao continuar, estou de acordo com os",
                        fontSize = 13.sp, color = Color.White
                    )
                    Spacer(modifier = Modifier.padding(start = 1.dp))
                    Text("Termos de Uso",
                        fontSize = 13.sp,
                        color = uranium_blue,
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier
                            .clickable { })
                }
                Row {
                    Text(
                        "e com o ",
                        fontSize = 13.sp, color = Color.White,
                        modifier = Modifier
                            .padding(start = 70.dp)
                    )
                    Spacer(modifier = Modifier.padding(start = 1.dp))
                    Text("Aviso de Privacidade ",
                        fontSize = 13.sp,
                        color = uranium_blue,
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier
                            .clickable { })
                }
            }
        }


    }
}


@Preview
@Composable
fun LoginPreview() {
    FormasTheme {
        ConteudoLogin(rememberNavController())
    }
}
