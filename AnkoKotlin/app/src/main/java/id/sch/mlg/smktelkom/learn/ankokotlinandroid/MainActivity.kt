package id.sch.mlg.smktelkom.learn.ankokotlinandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

/*
        // TODO 1 : Membuat View Group ( Jenis Layout )
        verticalLayout{
            // TODO 2 : Menambahkan View Edit Text
            var input1 = editText {
                hint = "Input Name"
            }

            var input2 = editText {
                hint = "Input Alamat"
            }

            button{
                text = "Submit"
                onClick {
                    toast(input1.text.toString() + input2.text.toString())
                }
            }
        }

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
*/
        verticalLayout{
            var input1 = editText {
                hint = "Masukkan Input 1"
            }

            var input2 = editText {
                hint = "Masukkan Input 2"
            }

            button {
                text = "+"
                onClick {
                    var hasil = input1.text.toString().toInt() + input2.text.toString().toInt()
                    toast(hasil.toString())
                }
            }
           button{
               text = "-"
               onClick {
                   var hasil = input1.text.toString().toInt() - input2.text.toString().toInt()
                   toast(hasil.toString())
               }
           }

            button{
                text = "x"
                onClick {
                    var hasil = input1.text.toString().toInt() * input2.text.toString().toInt()
                    toast(hasil.toString())
                }

            }

            button{
                text = "/"
                onClick {
                   var hasil = input1.text.toString().toInt() / input2.text.toString().toInt()
                    toast(hasil.toString())
                }
            }


        }

        linearLayout{
            orientation = LinearLayout.HORIZONTAL
        }


    }
}
