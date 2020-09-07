package cn.iqianye.xposed.bilibilipurify.Utils;

import android.util.Log;

import de.robv.android.xposed.XposedBridge;

public class LogUtils {

    public static void debug(String log) {
        XposedBridge.log("[BiliBili Purify] [Debug]" + log);
        Log.d("BiliBili Purify", log);
    }

    public static void info(String log) {
        XposedBridge.log("[BiliBili Purify] [Info]" + log);
        Log.i("BiliBili Purify", log);
    }

    public static void warning(String log) {
        XposedBridge.log("[BiliBili Purify] [Warning]" + log);
        Log.w("BiliBili Purify", log);
    }

    public static void error(String log) {
        XposedBridge.log("[BiliBili Purify] [Error]" + log);
        Log.e("BiliBili Purify", log);
    }
}
