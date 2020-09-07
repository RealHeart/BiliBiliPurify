package cn.iqianye.xposed.bilibilipurify.Utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class OtherUtils {

    public static String getVersionName(Context context, String pName) throws Exception {
        // 获取packagemanager的实例
        PackageManager packageManager = context.getPackageManager();
        // getPackageName()是你当前类的包名，0代表是获取版本信息
        PackageInfo packInfo = packageManager.getPackageInfo(pName, 0);
        return packInfo.versionName;
    }

}
