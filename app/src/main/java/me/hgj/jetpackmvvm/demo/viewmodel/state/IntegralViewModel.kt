package me.hgj.jetpackmvvm.demo.viewmodel.state

import android.app.Application
import androidx.databinding.ObservableField
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel
import me.hgj.jetpackmvvm.demo.data.model.bean.IntegralResponse

/**
 * 作者　: hegaojian
 * 时间　: 2020/3/10
 * 描述　:
 */
class IntegralViewModel(application: Application) : BaseViewModel(application){

    var rank = ObservableField<IntegralResponse>()
}