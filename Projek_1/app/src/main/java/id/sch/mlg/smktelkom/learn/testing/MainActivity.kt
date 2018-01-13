package id.sch.mlg.smktelkom.learn.testing

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*

        // Deklarasi Variabel , Tipe Tetap Var
        var a = "Fist Kotlin"
        var b = 12
        b = 16 // Var valuenya dapat diganti ganti

        println(a)
        println(b)

        /*

        // Deklarasi Variabel Val
        val c = 14 // Val seperti static final
        c = 90 // Value val Tidak Dapat Diubah Ubah tetap bernilai 14 selamanya

        println(c)

        */ */


        // TODO 1 : Event Listener
        btnSubmit.setOnClickListener {

            // TODO 2 : Get inputan User
            var tangkap = inputhere.text.toString()

            // TODO 3 : Menampilkan Toast
            Toast.makeText(this, tangkap, Toast.LENGTH_SHORT).show()

            // printb() //


            // TODO 4 : Menampilkan Alert Dalog

            // Deklarasi Variabel alert sebagai alert
            var alert = AlertDialog.Builder(this)

            // Menambahkan Pesan Alert
            alert.setTitle("Ini Title ALERT !!111!11!")

            // Menambahkan isi pesan alert
            alert.setPositiveButton("Ok", DialogInterface.OnClickListener { dialogInterface, i ->

                // DO something OnClick
                Toast.makeText(this, tangkap, Toast.LENGTH_SHORT).show()

            })

            // Menampilkan alert
            alert.show()

        }


        /*

    //  Method Making

    /*
    public String print(){
        return "printb"
    }
    */

    fun print():String{
        return "printb"
    }

    ///////////////////


    // Membuat Method
    fun printb(){
        val b = 90
        println(b)
    }

    ///////////////////

    */
    }
}
