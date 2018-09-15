package com.mbhgroup.expandablenewsfeed.AdapterList;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;


public class Bangla_Font extends AppCompatTextView {
    public static Typeface m_typeFace = null;

    public Bangla_Font(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        if (isInEditMode()) {
            return;
        }
        loadTypeFace(context);
    }

    public Bangla_Font(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) {
            return;
        }
        loadTypeFace(context);
    }

    public Bangla_Font(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (isInEditMode()) {
            return;
        }
        loadTypeFace(context);
    }

    private void loadTypeFace(Context context) {
        if (m_typeFace == null)
            m_typeFace = Typeface.createFromAsset(context.getAssets(),
                    "ben.ttf");
        this.setTypeface(m_typeFace);
    }
}