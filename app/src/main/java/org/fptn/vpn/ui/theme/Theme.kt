package org.fptn.vpn.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

/**
 * Material 3 color foundations for the FPTN Compose UI.
 *
 * The dark appearance remains the default to preserve the existing product
 * experience. The light palette is complete for a future explicit appearance
 * setting; this function does not silently change the user's current mode.
 */
private val DarkColorScheme = darkColorScheme(
    primary = BrandTeal,
    onPrimary = BrandPurpleDeep,
    primaryContainer = BrandPurpleElevated,
    onPrimaryContainer = BrandTealMuted,
    secondary = BrandTealMuted,
    onSecondary = BrandPurpleDeep,
    secondaryContainer = BrandPurpleSurface,
    onSecondaryContainer = TextPrimaryDark,
    tertiary = StatusInfo,
    onTertiary = BrandPurpleDeep,
    background = BrandPurpleDeep,
    onBackground = TextPrimaryDark,
    surface = SurfaceDark,
    onSurface = TextPrimaryDark,
    surfaceVariant = SurfaceDarkVariant,
    onSurfaceVariant = TextSecondaryDark,
    outline = OutlineDark,
    error = StatusError,
    onError = BrandPurpleDeep,
)

private val LightColorScheme = lightColorScheme(
    primary = BrandPurple,
    onPrimary = White,
    primaryContainer = ColorTokens.LightPrimaryContainer,
    onPrimaryContainer = BrandPurpleDeep,
    secondary = ColorTokens.LightSecondary,
    onSecondary = BrandPurpleDeep,
    secondaryContainer = ColorTokens.LightSecondaryContainer,
    onSecondaryContainer = BrandPurple,
    tertiary = ColorTokens.LightTertiary,
    onTertiary = BrandPurpleDeep,
    background = SurfaceLight,
    onBackground = TextPrimaryLight,
    surface = SurfaceLight,
    onSurface = TextPrimaryLight,
    surfaceVariant = SurfaceLightVariant,
    onSurfaceVariant = TextSecondaryLight,
    outline = OutlineLight,
    error = ColorTokens.LightError,
    onError = White,
)

/** Keeps light-only semantic colors grouped without changing the brand aliases. */
private object ColorTokens {
    val LightPrimaryContainer = androidx.compose.ui.graphics.Color(0xFFE9DDF5)
    val LightSecondary = androidx.compose.ui.graphics.Color(0xFF006B62)
    val LightSecondaryContainer = androidx.compose.ui.graphics.Color(0xFF9CF2E4)
    val LightTertiary = androidx.compose.ui.graphics.Color(0xFF315F91)
    val LightError = androidx.compose.ui.graphics.Color(0xFFBA1A1A)
}

@Composable
fun FptnTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        content = content,
    )
}
