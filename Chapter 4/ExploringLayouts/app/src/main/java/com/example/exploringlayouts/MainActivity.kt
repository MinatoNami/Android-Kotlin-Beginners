package com.example.exploringlayouts

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.exploringlayouts.ui.theme.ExploringLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)
    }

    fun loadConstraintLayout(v: View) {
        setContentView(R.layout.activity_main)
    }

    fun loadTableLayout(v:View) {
        setContentView(R.layout.my_table_layout)
    }

    fun loadMenuLayout(v:View) {
        setContentView(R.layout.main_menu)
    }
}


//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ExploringLayoutsTheme {
//        Greeting("Android")
//    }
//}