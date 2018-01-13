package id.sch.mlg.smktelkom.learn.ankokotlinandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button Listener
        btn_commons.onClick {

            /*

             
            // Without Anko
            var intent = Intent(this@MainActivity , LayoutActivity::class.java)
            intent.putExtra("nilai", 12)
            //startActivity(intent)

            */

            // With Anko
            startActivity(intentFor<LayoutActivity>("nilai" to 12))
        }

        btn_layout.onClick {

        }

    }
}
