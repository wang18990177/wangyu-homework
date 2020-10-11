package com.example.homework002;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class Marquee extends AppCompatTextView {
    public Marquee(Context context) {
        super(context);
    }

    public Marquee(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Marquee(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public boolean isFocused() {
        return true;
    }
}
