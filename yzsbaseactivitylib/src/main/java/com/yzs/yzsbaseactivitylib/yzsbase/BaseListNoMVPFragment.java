package com.yzs.yzsbaseactivitylib.yzsbase;

import com.yzs.yzsbaseactivitylib.basemvp.BaseModel;
import com.yzs.yzsbaseactivitylib.basemvp.BasePresenter;

/**
 * Author: 姚智胜
 * Version: V1.0版本
 * Description: 列表类fragment（不使用mvp架构）
 * Date: 2017/6/13
 * Email: 541567595@qq.com
 */

public abstract class BaseListNoMVPFragment<T> extends BaseListFragment<BasePresenter, BaseModel, T> {

    @Override
    protected int getLayoutResource() {
        setMvp(false);
        return getLayoutRes();
    }

    @Override
    public void initPresenter() {

    }
}
