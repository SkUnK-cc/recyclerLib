/*
 * Copyright (C) 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.recycler.itemanimator;

import android.support.v7.widget.RecyclerView;
import android.view.animation.DecelerateInterpolator;

public class ItemAnimatorFactory {

    static public RecyclerView.ItemAnimator slidein() {
        SlideInUpDelayedAnimator animator = new SlideInUpDelayedAnimator(new DecelerateInterpolator(1.2f));
        animator.setAddDuration(600);
        return animator;
    }
}
