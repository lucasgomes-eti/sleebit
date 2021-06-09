package com.sleebit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sleebit.ui.theme.SleebitTheme
import com.sleebit.ui.theme.Typography
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SleebitTheme {
                Surface {
                    val scaffoldState = rememberScaffoldState()
                    val scope = rememberCoroutineScope()
                    Scaffold(
                        scaffoldState = scaffoldState,
                        floatingActionButton = {
                            FloatingActionButton(onClick = {
                                scope.launch {
                                    scaffoldState.snackbarHostState.showSnackbar("Not implemented yet.")
                                }
                            }) {
                                Icon(Icons.Filled.Add, null)
                            }
                        }) {
                        LazyColumn {
                            items(4) {
                                Item()
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Item() {
    val checked = remember {
        mutableStateOf(true)
    }
    Column(
        Modifier.clickable { checked.value = !checked.value }
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.weight(0.9f)) {
                Text(text = "06:30", style = Typography.subtitle1)
                Text(
                    text = "Wake Up", style = Typography.body2,
                    modifier = Modifier
                        .alpha(0.6f)
                        .padding(top = 2.dp)
                )
            }
            Switch(
                checked = checked.value, onCheckedChange = { checked.value = it },
                modifier = Modifier.weight(0.1f)
            )

        }
        Divider(startIndent = 16.dp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SleebitTheme(darkTheme = false) {
        Surface {
            Item()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondPreview() {
    SleebitTheme(darkTheme = true) {
        Surface {
            Item()
        }
    }
}