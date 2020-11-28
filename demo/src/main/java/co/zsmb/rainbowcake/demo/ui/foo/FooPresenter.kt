package co.zsmb.rainbowcake.demo.ui.foo

import co.zsmb.rainbowcake.withIOContext
import javax.inject.Inject

class FooPresenter @Inject constructor() {

    suspend fun getData(): String = withIOContext {
        "Data"
    }

}
