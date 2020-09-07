package cn.iqianye.xposed.bilibilipurify.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

import cn.iqianye.xposed.bilibilipurify.R;
import cn.iqianye.xposed.bilibilipurify.Utils.ExpUtils;
import cn.iqianye.xposed.bilibilipurify.Utils.OtherUtils;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
    }

    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.settings, rootKey);
            Preference status = findPreference("status");
            if (ExpUtils.isExpModuleActive(this.getContext())) {
                status.setSummary(R.string.active_taichi_title);
            }
            Preference biliver = findPreference("biliver");
            Preference version = findPreference("version");
            try {
                biliver.setSummary(OtherUtils.getVersionName(this.getContext(), "tv.danmaku.bili"));
                version.setSummary(OtherUtils.getVersionName(this.getContext(), "cn.iqianye.xposed.bilibilipurify"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}