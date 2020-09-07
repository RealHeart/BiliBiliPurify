package cn.iqianye.xposed.bilibilipurify.Xposed;

import cn.iqianye.xposed.bilibilipurify.Utils.LogUtils;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class HookLoader implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        String bilipNname = "tv.danmaku.bili";
        if (lpparam.packageName.equals(bilipNname)) {
            LogUtils.info("Hooked in BiliBili China Version");
        }
    }
}
