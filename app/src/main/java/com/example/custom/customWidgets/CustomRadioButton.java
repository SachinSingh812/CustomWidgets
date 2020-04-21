package com.example.custom.customWidgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.widget.CompoundButton;

import androidx.appcompat.widget.AppCompatRadioButton;

public class CustomRadioButton extends AppCompatRadioButton {


    @Override
    protected void onCreateContextMenu(ContextMenu menu) {
        super.onCreateContextMenu(menu);

    }

    private OnCheckedChangeListener onCheckedChangeListener;


    public CustomRadioButton(Context context) {
        super(context);
    }

    public CustomRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomRadioButton(Context context, AttributeSet attributeSet, int defStyleAttr) {
        super(context, attributeSet, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        
        setOwnOnCheckedChangeListener();
        setButtonDrawable(null);
    }

    public void setOwnOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }


    private void setOwnOnCheckedChangeListener() {
    setOnCheckedChangeListener(new OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView,boolean isChecked ) {

            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(buttonView, isChecked);
            }
        }
    });
    }
}
