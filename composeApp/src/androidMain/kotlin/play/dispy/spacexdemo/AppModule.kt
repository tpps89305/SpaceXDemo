package play.dispy.spacexdemo

import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import play.dispy.spacexdemo.cache.AndroidDatabaseDriverFactory
import play.dispy.spacexdemo.network.SpaceXApi

val appModule = module {
    single<SpaceXApi> { SpaceXApi() }
    single<SpaceXSDK> {
        SpaceXSDK(
            databaseDriverFactory = AndroidDatabaseDriverFactory(
                androidContext()
            ), api = get()
        )
    }
    viewModel {
        RocketLaunchViewModel(sdk = get())
    }
}
