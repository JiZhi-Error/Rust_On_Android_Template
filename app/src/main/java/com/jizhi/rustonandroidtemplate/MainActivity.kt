package com.jizhi.rustonandroidtemplate

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        findViewById<TextView>(R.id.sample_text).text = stringFromJNI("JiZhi")
        val currentTimeMillis = System.currentTimeMillis()
        val findViewById = findViewById<ListView>(R.id.list_item)
        val strs = arrayOf(
            "引领翘首秋",
            "狝春苗灭私",
            "奉公枯骨朽",
            "脊遁世离俗",
            "墨西哥湾先",
            "声夺人白面",
            "儒生身败名",
            "隳虫龁鼠伤",
            "心荡神迷起",
            "兵动众清词",
            "丽句吃醋拈",
            "酸不堪设想",
            "令人莫测有",
            "滋有味通衢",
            "越巷以力服",
            "人防意如城",
            "自产自销种",
            "学绩文巴山",
            "夜雨工业产",
            "品期期艾艾",
            "不甘示弱浇",
            "醇散朴消声",
            "匿影聚讼纷",
            "纭一底一面",
            "众叛亲离危",
            "急存亡企业",
            "定价边老便",
            "便疾雷迅电",
            "古生物学吃",
            "食讳食圭角",
            "不露身心健",
            "康滑线电阻",
            "千变万轸惨",
            "引领翘首秋",
            "狝春苗灭私",
            "奉公枯骨朽",
            "脊遁世离俗",
            "墨西哥湾先",
            "声夺人白面",
            "儒生身败名",
            "隳虫龁鼠伤",
            "心荡神迷起",
            "兵动众清词",
            "丽句吃醋拈",
            "酸不堪设想",
            "令人莫测有",
            "滋有味通衢",
            "越巷以力服",
            "人防意如城",
            "自产自销种",
            "学绩文巴山",
            "夜雨工业产",
            "品期期艾艾",
            "不甘示弱浇",
            "醇散朴消声",
            "匿影聚讼纷",
            "纭一底一面",
            "众叛亲离危",
            "急存亡企业",
            "定价边老便",
            "便疾雷迅电",
            "古生物学吃",
            "食讳食圭角",
            "不露身心健",
            "康滑线电阻",
            "千变万轸惨",
            "引领翘首秋",
            "狝春苗灭私",
            "奉公枯骨朽",
            "脊遁世离俗",
            "墨西哥湾先",
            "声夺人白面",
            "儒生身败名",
            "隳虫龁鼠伤",
            "心荡神迷起",
            "兵动众清词",
            "丽句吃醋拈",
            "酸不堪设想",
            "令人莫测有",
            "滋有味通衢",
            "越巷以力服",
            "人防意如城",
            "自产自销种",
            "学绩文巴山",
            "夜雨工业产",
            "品期期艾艾",
            "不甘示弱浇",
            "醇散朴消声",
            "匿影聚讼纷",
            "纭一底一面",
            "众叛亲离危",
            "急存亡企业",
            "定价边老便",
            "便疾雷迅电",
            "古生物学吃",
            "食讳食圭角",
            "不露身心健",
            "康滑线电阻",
            "千变万轸惨",
        )
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
            this,
            android.R.layout.simple_expandable_list_item_1,
            strs
        )
        findViewById.adapter = adapter
        val currentTimeMillis1 = System.currentTimeMillis()
        val l = currentTimeMillis1 - currentTimeMillis
        findViewById<TextView>(R.id.sample_text).text = l.toString()
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(str: String): String

}