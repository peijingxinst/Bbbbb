package com.atguigu.fragment01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by PeiJingXinDc on 2016/9/27.
 */
public class Fragment1 extends Fragment {

    /**
     * 当Fragment要创建View的时候回调
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment1, null);
        return view;
        //super.onCreateView(inflater, container, savedInstanceState);
    }
}
