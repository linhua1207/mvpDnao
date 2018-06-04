package com.linxh.mvpdnao.model;

import com.linxh.mvpdnao.R;

import java.util.ArrayList;
import java.util.List;

public class IGirlMOdelImpl implements IGirlModel{
    @Override
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {
        List<Girl> data = new ArrayList<>();
        data.add(new Girl(R.mipmap.ic_launcher, "0", ""))

    }
}
