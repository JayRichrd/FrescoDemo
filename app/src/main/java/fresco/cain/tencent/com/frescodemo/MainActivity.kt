package fresco.cain.tencent.com.frescodemo

import android.databinding.DataBindingUtil
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import com.facebook.drawee.view.SimpleDraweeView
import fresco.cain.tencent.com.frescodemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.activity_match_individual_record, null, false)
        val binding: ActivityMainBinding = DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.activity_main, null, false)
        setContentView(binding.root)
        var user = User()
        user.name.set("姜瑜")
        user.imgUrl.set("https://www.gstatic.com/webp/gallery/1.sm.jpg")
        binding.user = user
//        setContentView(R.layout.activity_main)
//        loadImg()
    }

    private fun loadImg() {
//        val uri = Uri.parse("https://www.gstatic.com/webp/gallery/1.sm.jpg")
//        val simpleDraweeView = findViewById<SimpleDraweeView>(R.id.sdv_image_view)
//        val layoutParame = simpleDraweeView.layoutParams
//        layoutParame.width = DensityUtil.px2dp(this, 320f).toInt()
//        layoutParame.height = DensityUtil.px2dp(this, 210f).toInt()
//        simpleDraweeView.setImageURI(uri)
    }
}
