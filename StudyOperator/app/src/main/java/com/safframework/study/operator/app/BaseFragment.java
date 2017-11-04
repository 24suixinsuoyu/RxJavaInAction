package com.safframework.study.operator.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.Fragment;

/**
 * Created by Tony Shen on 2017/3/12.
 */

public class BaseFragment extends Fragment {

    /**
     * Fragment 所在的 FragmentActivity
     */
    public Activity mContext;

    /**
     * Deprecated on API 23
     * @param activity
     */
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (Build.VERSION.SDK_INT < 23) {
            this.mContext = activity;
        }
    }

    @TargetApi(23)
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof Activity){
            this.mContext = (Activity) context;
        }
    }
}
