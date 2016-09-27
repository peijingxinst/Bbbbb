package com.atguigu.fragment2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by PeiJingXinDc on 2016/9/27.
 */
public class Fragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView view = new TextView(getActivity());
        view.setText("this is Fragment2");
        view.setBackgroundColor(Color.BLUE);
        view.setTextSize(40);
        return view;
        //super.onCreateView(inflater, container, savedInstanceState);
    }
}
