package fresco.cain.tencent.com.frescodemo

import android.app.Application
import com.facebook.drawee.backends.pipeline.DraweeConfig
import com.facebook.drawee.backends.pipeline.Fresco

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val builder = DraweeConfig.newBuilder()
        builder.setDrawDebugOverlay(true)
        Fresco.initialize(this,null,builder.build())
    }
}