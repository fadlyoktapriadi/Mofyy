import android.media.Image
import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem(
    val title: String,
    val icon: Int,
    val selectedIcon: Int,
    val screen: Screen
)