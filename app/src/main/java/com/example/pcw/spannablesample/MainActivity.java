package com.example.pcw.spannablesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.widget.TextView;

import library.android.visual.camp.vmex.EyeController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.textView);
        EyeController

//        SpannableStringBuilder builder = new SpannableStringBuilder();
//        builder.append("abcdefghijklmn")
//                .append("opqrstuvwxyz")
//                .setSpan(new AbsoluteSizeSpan(4,true), 0, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
//                .setSpan(new AbsoluteSizeSpan(4,true), 0, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        CharSequence regex = "· ";
        String text = "11111abcdefghijklmn12345670000000000333333333333777777777777777";
        SpannableString str = new SpannableString("·"+text);

//        str.setSpan(new LeadingMarginSpan.Standard(0, 8), 0, str.length(),0);




        SpannableString str2 = new SpannableString(regex + "11111opqrstuvwxyz1234567aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        str2.setSpan(new LeadingMarginSpan.Standard(0, 50), 0, str2.length(),0);
        CharSequence cs = TextUtils.concat(str,"\n",str2);
        tv.setText(cs);
    }
}
