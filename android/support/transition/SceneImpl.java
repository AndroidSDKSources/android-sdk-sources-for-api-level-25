/*
 * Copyright (C) 2016 The Android Open Source Project
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

package android.support.transition;

import android.view.View;
import android.view.ViewGroup;

/**
 * Base class for platform specific Scene implementations.
 */
abstract class SceneImpl {

    public abstract void init(ViewGroup sceneRoot);

    public abstract void init(ViewGroup sceneRoot, View layout);

    public abstract ViewGroup getSceneRoot();

    public abstract void exit();

    public abstract void enter();

    public abstract void setEnterAction(Runnable action);

    public abstract void setExitAction(Runnable action);

}
