package fresco.cain.tencent.com.frescodemo

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import fresco.cain.tencent.com.frescodemo.databinding.ActivityRxJavaBinding

class RxJavaActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val TAG = "RxJavaActivity"
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_ok -> {

            }
            else -> {
                Log.i(TAG, "nothing to do.")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityRxJavaBinding = DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.activity_rx_java, null, false)
        setContentView(binding.root)
        binding.btnOk.setOnClickListener(this)
    }

}
