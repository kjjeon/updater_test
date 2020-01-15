package com.altimedia.updater;

import android.app.Application;

import com.facebook.flipper.android.AndroidFlipperClient;
import com.facebook.flipper.android.utils.FlipperUtils;
import com.facebook.flipper.core.FlipperClient;
import com.facebook.flipper.plugins.crashreporter.CrashReporterPlugin;
import com.facebook.flipper.plugins.inspector.DescriptorMapping;
import com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin;
import com.facebook.flipper.plugins.network.NetworkFlipperPlugin;
import com.facebook.flipper.plugins.sharedpreferences.SharedPreferencesFlipperPlugin;
import com.facebook.soloader.SoLoader;

public class UpdaterApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, false);
        if (FlipperUtils.shouldEnableFlipper(this)) {
            FlipperClient client = AndroidFlipperClient.getInstance(this);
            //Layout inspector
            final DescriptorMapping descriptorMapping = DescriptorMapping.withDefaults();
            client.addPlugin(new InspectorFlipperPlugin(this, descriptorMapping));
            //Network
            NetworkFlipperPlugin networkFlipperPlugin = new NetworkFlipperPlugin();
            client.addPlugin(networkFlipperPlugin);
            //Shared Preferences
            client.addPlugin(new SharedPreferencesFlipperPlugin(this, "my_shared_preference_file"));
            //Crash Reporter
            client.addPlugin(CrashReporterPlugin.getInstance());

            client.start();
        }
    }
}
