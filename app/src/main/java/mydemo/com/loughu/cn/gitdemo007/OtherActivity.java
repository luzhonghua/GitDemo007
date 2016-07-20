package mydemo.com.loughu.cn.gitdemo007;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2016/7/20.
 */
public class OtherActivity  extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("haha");
    }
}
