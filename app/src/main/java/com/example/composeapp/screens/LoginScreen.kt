package com.example.composeapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.R
import com.example.composeapp.components.ButtonComponent
import com.example.composeapp.components.CheckboxComponent
import com.example.composeapp.components.ClickableLoginTextComponent
import com.example.composeapp.components.DividerTextComponent
import com.example.composeapp.components.HeadingTextComponent
import com.example.composeapp.components.NormalTextComponent
import com.example.composeapp.components.PasswordTextFieldComponent
import com.example.composeapp.components.TextFieldComponent
import com.example.composeapp.components.UnderlinedTextComponent
import com.example.composeapp.navigation.AppRouter
import com.example.composeapp.navigation.Screen
import com.example.composeapp.navigation.SystemBackButtonHandler

@Composable
fun LoginScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.welcome_back))
            Spacer(modifier = Modifier.height(20.dp))
            TextFieldComponent(
                label = stringResource(id = R.string.email),
                painterResource(id = R.drawable.baseline_email_24)
            )
            PasswordTextFieldComponent(
                label = stringResource(id = R.string.password),
                icon = painterResource(id = R.drawable.baseline_password_24)
            )
            Spacer(modifier = Modifier.height(40.dp))
            UnderlinedTextComponent(value = stringResource(id = R.string.forgot_password))
            Spacer(modifier = Modifier.height(40.dp))
            ButtonComponent(label = stringResource(id = R.string.login))
            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()
            ClickableLoginTextComponent(
                tryingToLogin = false,
                onTextSelected = {
                    AppRouter.navigateTo(Screen.SignUpScreen)
                }
            )
        }
    }

    SystemBackButtonHandler {
        AppRouter.navigateTo(Screen.SignUpScreen)
    }

}


@Preview
@Composable
private fun DefaultPreview() {
    LoginScreen()
}