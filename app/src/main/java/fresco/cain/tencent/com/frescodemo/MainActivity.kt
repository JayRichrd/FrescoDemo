package fresco.cain.tencent.com.frescodemo

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.facebook.drawee.view.SimpleDraweeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadImg()
    }

    private fun loadImg() {
        val uri = Uri.parse("https://www.gstatic.com/webp/gallery/1.sm.jpg")
        val simpleDraweeView = findViewById<SimpleDraweeView>(R.id.sdv_image_view)
        val layoutParame = simpleDraweeView.layoutParams
//        layoutParame.width = DensityUtil.px2dp(this, 320f).toInt()
//        layoutParame.height = DensityUtil.px2dp(this, 210f).toInt()
        simpleDraweeView.setImageURI(uri)
    }
}
