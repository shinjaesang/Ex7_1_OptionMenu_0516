package kr.ac.ex7_1_optionmenu_0516

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    lateinit var linear : LinearLayout
    lateinit var imgv : ImageView
    lateinit var editDegree : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linear = findViewById<LinearLayout>(R.id.linear)
        editDegree = findViewById<EditText>(R.id.editDegree)
        imgv = findViewById<ImageView>(R.id.imgv)


    }

    //옵션메뉴 등록
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)

        menuInflater.inflate(R.menu.optionmenu, menu)

        return true
    }

    //항목이 선택되었을 때 이벤트 처리할 수 있는 메소드
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId){

            R.id.itemRotate ->{
                imgv.rotation += editDegree.text.toString().toFloat()
                return true
            }

            R.id.itemHanra ->{
                imgv.setImageResource(R.drawable.img1)
                item.setChecked(true)
                return true
            }

            R.id.itemChuja ->{
                imgv.setImageResource(R.drawable.img2)
                item.setChecked(true)
                return true
            }

            R.id.itemBum ->{
                imgv.setImageResource(R.drawable.img3)
                item.setChecked(true)
                return true
            }

        }

        return false
    }
}