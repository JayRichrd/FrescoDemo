package fresco.cain.tencent.com.frescodemo;

import android.databinding.BindingAdapter;
import android.net.Uri;
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
            simpleDraweeView.setImageURI(Uri.parse(url));
        }
    }
}
