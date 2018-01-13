package id.sch.mlg.smktelkom.learn.ankokotlinandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_layout.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.sdk25.coroutines.onLongClick

class LayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)

        btn_alert.onClick {

            alert {
             title = "Hallo Ini Tittle"

                yesButton {
                    toast("Hallo")
                }
                noButton {
                    longToast("")
                }

            }.show()

            // Alert Version 2

            alert{
                positiveButton("INI BUTTON POSITIF !!!!1!11!11", onClicked =
                {

                }
                    )

                negativeButton("INI BUTTON NEGATIF !!!!1!11!11", onClicked =
                {

                }
                )



            }
        }

        btn_load.onLongClick {
            //Without Anko
            var intent = Intent(Intent.ACTION_VIEW)
            browse("http://github.com")
        }

    }
}
