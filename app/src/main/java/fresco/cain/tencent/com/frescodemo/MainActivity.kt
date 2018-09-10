package fresco.cain.tencent.com.frescodemo

import android.databinding.DataBindingUtil
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import com.facebook.binaryresource.FileBinaryResource
import com.facebook.cache.common.SimpleCacheKey
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.view.SimpleDraweeView
import fresco.cain.tencent.com.frescodemo.databinding.ActivityMainBinding
import java.io.File

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btn_left_action -> {
                showInfo()
            }
            R.id.btn_left_action -> {

            }
            else -> {

            }
        }
    }

    fun showInfo() {
        var bitmap: Bitmap? = null
        var resource: FileBinaryResource = Fresco.getImagePipelineFactory().mainFileCache.getResource(SimpleCacheKey(Uri.parse("https://www.gstatic.com/webp/gallery/1.sm" + ".jpg").toString())) as FileBinaryResource
        var file: File = resource.file
        bitmap = BitmapFactory.decodeFile(file.path)
        var memorySize: Int? = 0
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            memorySize = bitmap?.allocationByteCount
        } else {
            memorySize = bitmap?.byteCount
        }
        if (memorySize != null) {
            Log.d("Jay", "当前图片的占用内存大小：" + (memorySize / 1024) + "k")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.activity_main, null, false)
        setContentView(binding.root)
        var user = User()
        user.name.set("姜瑜")
        user.imgUrl.set("https://www.gstatic.com/webp/gallery/1.sm.jpg")
        binding.user = user
        binding.btnLeftAction.setOnClickListener(this)

//        loadImg()
    }

    private fun loadImg() {
        val simpleDraweeView: SimpleDraweeView = findViewById(R.id.sdv_before) as SimpleDraweeView
        val layoutParame = simpleDraweeView.layoutParams
        layoutParame.width = DensityUtil.px2dp(this, 320f).toInt()
        layoutParame.height = DensityUtil.px2dp(this, 210f).toInt()
        simpleDraweeView.setImageURI("https://www.gstatic.com/webp/gallery/1.sm.jpg")
    }
}
