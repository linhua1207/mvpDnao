package com.linxh.mvpdnao.model;

import java.util.List;

/**
 * model与MVC没什么区别
 */
public interface IGirlModel {

    /**
     * 不要考虑用参数的回调
     * 因为参数的来源多，可能为Service、http
     * 等等为耗时操作。如果用参数回调，得到返回值
     * 的时间，等待时间过长。
     * 为了避免尴尬，设计一个回调的接口
     * */
     void loadGirl(GirlOnLoadListener girlOnLoadListener);

    //设置一个回调接口
    interface GirlOnLoadListener{
        void onComplete(List<Girl> list);
    }

}
