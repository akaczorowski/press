package press.di

import dagger.Component
import me.saket.press.shared.localization.Strings
import me.saket.press.shared.syncer.SyncCoordinator
import me.saket.press.shared.theme.AppTheme
import me.saket.press.shared.ui.ScreenResults
import press.navigation.ViewFactories
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
  fun strings(): Strings
  fun theme(): AppTheme
  fun syncCoordinator(): SyncCoordinator
  fun viewFactories(): ViewFactories
  fun screenResults(): ScreenResults
}
