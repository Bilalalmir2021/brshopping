package io.flutter.plugins

import androidx.annotation.Keep
import io.flutter.Log
import io.flutter.embedding.engine.FlutterEngine

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
object GeneratedPluginRegistrant {
    private const val TAG = "GeneratedPluginRegistrant"
    fun registerWith(@NonNull flutterEngine: FlutterEngine) {
        try {
            flutterEngine.getPlugins().add(AudioSessionPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(ConnectivityPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(EmojiPickerFlutterPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin emoji_picker_flutter, com.fintasys.emoji_picker_flutter.EmojiPickerFlutterPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(FilePickerPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(FlutterFirebaseCorePlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(FlutterFirebaseMessagingPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(FlutterDownloaderPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin flutter_downloader, vn.hunghd.flutterdownloader.FlutterDownloaderPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(FlutterFacebookAuthPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin flutter_facebook_auth, app.meedu.flutter_facebook_auth.FlutterFacebookAuthPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(InAppWebViewFlutterPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin flutter_inappwebview, com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(FlutterKeyboardVisibilityPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin flutter_keyboard_visibility, com.jrai.flutter_keyboard_visibility.FlutterKeyboardVisibilityPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(FlutterLocalNotificationsPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(PDFViewFlutterPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin flutter_pdfview, io.endigo.plugins.pdfviewflutter.PDFViewFlutterPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(FlutterAndroidLifecyclePlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(FlutterToastPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(GeocodingPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin geocoding_android, com.baseflow.geocoding.GeocodingPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(GeolocatorPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin geolocator_android, com.baseflow.geolocator.GeolocatorPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(GoogleMapsPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin google_maps_flutter_android, io.flutter.plugins.googlemaps.GoogleMapsPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(GoogleSignInPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(ImagePickerPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(JustAudioPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(OpenFileManagerPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin open_file_manager, com.aubergine.open_file_manager.OpenFileManagerPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(OpenFilePlusPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin open_file_plus, com.joutvhu.openfile.OpenFilePlusPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(PackageInfoPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(PathProviderPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(PermissionHandlerPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(SharePlusPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(SharedPreferencesPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(SignInWithApplePlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin sign_in_with_apple, com.aboutyou.dart_packages.sign_in_with_apple.SignInWithApplePlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(SqflitePlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(UrlLauncherPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(VideoPlayerPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(WakelockPlusPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", e)
        }
        try {
            flutterEngine.getPlugins().add(WebViewFlutterPlugin())
        } catch (e: Exception) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e)
        }
    }
}