package com.tanjiajun.booleanextensiondemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by TanJiaJun on 2020-01-28.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 第一个例子
        val name = "谭嘉俊"
        (name == "谭嘉俊")
            .yes { Log.i("TanJiaJun", name) }
            .otherwise { Log.i("TanJiaJun", "苹果") }

        // 第二个例子
        val strings = mutableListOf(2, 4, 6, 8, 10)
        (strings
            .filter { it % 2 == 0 }
            .count() == strings.size)
            .yes { Log.i("TanJiaJun", "是偶数集合") }
            .otherwise { Log.i("TanJiaJun", "不是偶数集合") }
    }

}