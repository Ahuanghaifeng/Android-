package CommonModule.BaseUi;

import android.os.Bundle;

import com.zhy.autolayout.AutoLayoutActivity;

import CommonModule.Http.ActivityLifeCycleEvent;
import rx.subjects.PublishSubject;

/**
 * Created by haifeng on 2016/11/11 10:41.
 */

public class BaseActivity extends AutoLayoutActivity {

    public final PublishSubject<ActivityLifeCycleEvent> lifecycleSubject = PublishSubject.create();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        lifecycleSubject.onNext(ActivityLifeCycleEvent.CREATE);
        super.onCreate(savedInstanceState);
    }
    
    @Override
    protected void onPause() {
        lifecycleSubject.onNext(ActivityLifeCycleEvent.PAUSE);
        super.onPause();
    }

    @Override
    protected void onStop() {
        lifecycleSubject.onNext(ActivityLifeCycleEvent.STOP);
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lifecycleSubject.onNext(ActivityLifeCycleEvent.DESTROY);
    }
}
