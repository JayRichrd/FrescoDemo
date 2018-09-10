package fresco.cain.tencent.com.frescodemo;

import android.databinding.BindingAdapter;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * @author cainjiang
 * @date 2018/9/7
 */
public class Util {
    @BindingAdapter({"imageUrl"})
    public static void loadImage(View view, String url) {
        if (view instanceof SimpleDraweeView) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
            simpleDraweeView.setImageURI(url);
            Drawable drawable = simpleDraweeView.getDrawable();
            if (drawable instanceof BitmapDrawable){
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                int memorySize;
                if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
                    memorySize = bitmap.getAllocationByteCount();
                }else {
                    memorySize = bitmap.getByteCount();
                }
                Log.d("Jay","当前图片的占用内存大小：" + memorySize/1024 + "k");
            }
        }
    }
}
