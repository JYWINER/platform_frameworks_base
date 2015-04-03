/*
 * Copyright (C) 2015 The Android Open Source Project
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

package android.view;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextPaint;

/**
 * Container for storing additional per-view data generated by {@link View#onProvideAssistStructure
 * View.onProvideAssistStructure}.
 */
public abstract class ViewAssistStructure {
    public abstract void setId(int id, String packageName, String typeName, String entryName);

    public abstract void setDimens(int left, int top, int scrollX, int scrollY, int width,
            int height);

    public abstract void setVisibility(int visibility);

    public abstract void setEnabled(boolean state);

    public abstract void setClickable(boolean state);

    public abstract void setLongClickable(boolean state);

    public abstract void setFocusable(boolean state);

    public abstract void setFocused(boolean state);

    public abstract void setAccessibilityFocused(boolean state);

    public abstract void setCheckable(boolean state);

    public abstract void setChecked(boolean state);

    public abstract void setSelected(boolean state);

    public abstract void setActivated(boolean state);

    public abstract void setClassName(String className);

    public abstract void setContentDescription(CharSequence contentDescription);

    public abstract void setText(CharSequence text);
    public abstract void setText(CharSequence text, int selectionStart, int selectionEnd);
    public abstract void setTextPaint(TextPaint paint);
    public abstract void setHint(CharSequence hint);

    public abstract CharSequence getText();
    public abstract int getTextSelectionStart();
    public abstract int getTextSelectionEnd();
    public abstract CharSequence getHint();

    public abstract Bundle editExtras();
    public abstract void clearExtras();

    public abstract void setChildCount(int num);
    public abstract int getChildCount();
    public abstract ViewAssistStructure newChild(int index);

    public abstract ViewAssistStructure asyncNewChild(int index);
    public abstract void asyncCommit();

    /** @hide */
    public abstract Rect getTempRect();
}
