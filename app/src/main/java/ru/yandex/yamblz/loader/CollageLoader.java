package ru.yandex.yamblz.loader;

import android.widget.ImageView;

import java.lang.ref.WeakReference;
import java.util.List;

import rx.Subscription;

public interface CollageLoader {

    Subscription loadCollage(List<String> urls, WeakReference<ImageView> imageView);

    Subscription loadCollage(List<String> urls, ImageTarget imageTarget);

    Subscription loadCollage(List<String> urls, WeakReference<ImageView> imageView, CollageStrategy collageStrategy);

    Subscription loadCollage(List<String> urls, ImageTarget imageTarget, CollageStrategy collageStrategy);


}
