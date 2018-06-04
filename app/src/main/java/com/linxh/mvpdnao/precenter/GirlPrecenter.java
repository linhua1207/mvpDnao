package com.linxh.mvpdnao.precenter;


import com.linxh.mvpdnao.model.Girl;
import com.linxh.mvpdnao.model.IGirlMOdelImpl;
import com.linxh.mvpdnao.model.IGirlModel;
import com.linxh.mvpdnao.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * 所有业务逻辑都在表示层完成
 * 1、View 层的引用
 * 2、model 层的引用
 *
 */
public class GirlPrecenter<T extends IGirlView> {

    /**
     * T暂时用泛型来规范，因为也不知道以后会用什么数据
     */
    WeakReference<T> mView;

    GirlPrecenter(T view){
        this.mView = new WeakReference<T>(view);
    }


    //-----------------

    IGirlModel iGirlModel = new IGirlMOdelImpl();

    /**
     * 执行UI逻辑操作
     */
    public void  fetch(){
        if(mView.get() != null && iGirlModel !=null){
            iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                @Override
                public void onComplete(List<Girl> list) {

                }
            });
        }
    }
}
