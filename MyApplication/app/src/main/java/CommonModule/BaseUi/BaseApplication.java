package commonmodule.BaseUi;

import android.app.Application;

import com.orhanobut.hawk.Hawk;

/**
 * Created by haifeng on 2016/11/11 11:15.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Hawk.init(this).build();
    }
}
