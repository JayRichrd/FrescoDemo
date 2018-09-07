package fresco.cain.tencent.com.frescodemo;

import android.databinding.ObservableField;

/**
 * @author cainjiang
 * @date 2018/9/7
 */
public class User {
    public final ObservableField<String> name = new ObservableField<>("jiang");
    public final ObservableField<String> imgUrl = new ObservableField<>();
}
