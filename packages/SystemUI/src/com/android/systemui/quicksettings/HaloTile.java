package com.android.systemui.quicksettings;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

import com.android.systemui.R;
import com.android.systemui.statusbar.phone.QuickSettingsController;

public class HaloTile extends QuickSettingsTile {
    private static final String TAG = "HaloTile";

    public HaloTile(Context context, QuickSettingsController qsc) {
        super(context, qsc);

        mOnClick = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Settings.System.putInt(mContext.getContentResolver(), Settings.System.HALO_ACTIVE, !getEnabled() ? 1 : 0);
            }
        };

        mOnLongClick = new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                startSettingsActivity(Settings.ACTION_CUSTOM_SETTINGS);
                return true;
            }
        };

        qsc.registerObservedContent(Settings.Secure.getUriFor(Settings.System.HALO_ACTIVE), this);
        updateResources();
    }

    @Override
    public void updateResources() {
        updateTile();
        super.updateResources();
    }

    @Override
    public void onChangeUri(ContentResolver resolver, Uri uri) {
        updateResources();
    }

    private synchronized void updateTile() {
        if (getEnabled()) {
            // If enabled
            mLabel = mContext.getString(R.string.quick_settings_halo_enabled_label);
            mDrawable = R.drawable.ic_qs_halo_on;
        } else {
            // Otherwise set the disabled label and icon
            mLabel = mContext.getString(R.string.quick_settings_halo_disabled_label);
            mDrawable = R.drawable.ic_qs_halo_off;
        }
    }

    private boolean getEnabled() {
        return (Settings.System.getInt(mContext.getContentResolver(), Settings.System.HALO_ACTIVE, 0) == 1);
    }

}
