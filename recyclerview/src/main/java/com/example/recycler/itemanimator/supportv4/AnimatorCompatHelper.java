package com.example.recycler.itemanimator.supportv4;

import android.os.Build;
import android.view.View;

public final class AnimatorCompatHelper {
    private final static AnimatorProvider IMPL;

    static {
        if (Build.VERSION.SDK_INT >= 12) {
            IMPL = new HoneycombMr1AnimatorCompatProvider();
        } else {
            IMPL = new DonutAnimatorCompatProvider();
        }
    }

    public static ValueAnimatorCompat emptyValueAnimator() {
        return IMPL.emptyValueAnimator();
    }

    private AnimatorCompatHelper() {}

    public static void clearInterpolator(View view) {
        IMPL.clearInterpolator(view);
    }
}
