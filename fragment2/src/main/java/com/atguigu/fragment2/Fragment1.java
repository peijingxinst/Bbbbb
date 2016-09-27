package com.atguigu.fragment2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by PeiJingXinDc on 2016/9/27.
 */
public class Fragment1 extends Fragment {
    /**
     * 当Fragment创建view是调用
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        TextView textView = new TextView(getActivity());
        textView.setText("这是Fragment111111");
        textView.setTextSize(40);
        textView.setBackgroundColor(Color.YELLOW);

        return textView;
        //super.onCreateView(inflater, container, savedInstanceState);
    }
}
