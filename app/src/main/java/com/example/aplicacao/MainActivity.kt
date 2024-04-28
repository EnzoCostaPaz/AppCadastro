package com.example.aplicacao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aplicacao.ui.theme.AplicacaoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AplicacaoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}
@Composable
fun App() {
    AplicacaoTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column (
                Modifier
                    .background(Color.White),
                            verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "App Cadastro")

                Row(
                    Modifier
                        .padding(20.dp)
                ){
                    var texto by remember { mutableStateOf(" ") }
                    OutlinedTextField(

                        value = texto,
                        onValueChange ={texto = it},
                        label={Text("Nome")}
                    )

                }
                Spacer(modifier = Modifier.width(16.dp))

                Row(
                    Modifier
                        .padding(20.dp)
                ){
                    var texto by remember { mutableStateOf(" ") }
                    OutlinedTextField(

                        value = texto,
                        onValueChange ={texto = it},
                        label={Text("Endereço")}
                    )

                }
                Spacer(modifier = Modifier.width(16.dp))

                Row(
                    Modifier
                        .padding(20.dp)
                ){
                    var texto by remember { mutableStateOf(" ") }
                    OutlinedTextField(

                        value = texto,
                        onValueChange ={texto = it},
                        label={Text("Bairro")}
                    )

                }
                Spacer(modifier = Modifier.width(16.dp))
                Row(
                    Modifier
                        .padding(20.dp)
                ){
                    var texto by remember { mutableStateOf(" ") }
                    OutlinedTextField(

                        value = texto,
                        onValueChange ={texto = it},
                        label={Text("Cep")}
                    )

                }
                Spacer(modifier = Modifier.width(16.dp))
                Row(
                    Modifier
                        .padding(20.dp)
                ){
                    var texto by remember { mutableStateOf(" ") }
                    OutlinedTextField(

                        value = texto,
                        onValueChange ={texto = it},
                        label={Text("Cidade")}
                    )

                }
                Spacer(modifier = Modifier.width(16.dp))
                Row(
                    Modifier
                        .padding(20.dp)
                ){
                    var texto by remember { mutableStateOf(" ") }
                    OutlinedTextField(

                        value = texto,
                        onValueChange ={texto = it},
                        label={Text("Estado")}
                    )

                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(onClick = { /*TODO*/ }) {

                    Text(text = "Cadastrar")
            }
            }
        }
    }
}
@Preview
@Composable
fun AppPreview() {
    App()
}
