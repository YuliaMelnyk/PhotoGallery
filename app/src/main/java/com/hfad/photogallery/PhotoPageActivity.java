package com.hfad.photogallery;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.fragment.app.Fragment;

/**
 * @author yuliiamelnyk on 24/08/2020
 * @project PhotoGallery
 */
public class PhotoPageActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context, Uri photoPageUri) {
        Intent i = new Intent(context, PhotoPageActivity.class);
        i.setData(photoPageUri);
        return i;
    }

    @Override
    protected Fragment createFragment() {
        return PhotoPageFragment.newInstance(getIntent().getData());
    }
}
