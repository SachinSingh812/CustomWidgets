package com.example.custom.customWidgets;

import androidx.appcompat.widget.AppCompatButton;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class CustomButton extends AppCompatButton implements View.OnClickListener {

    private CustomOnClickListener customOnClickListener;
    private Context mContext;

    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mContext = context;
        setOnClickListener(this);
    }

    public CustomButton(Context context, AttributeSet attributeSet, int defStyleAttr) {
        super(context, attributeSet, defStyleAttr);
    }


    @Override
    public void onClick(View v) {
        customOnClickListener.onClick(v);
    }

    public void setCustomClickListener(CustomOnClickListener clickListener) {
        this.customOnClickListener = clickListener;
    }

    public interface CustomOnClickListener {
        public void onClick(View var1);
    }
}