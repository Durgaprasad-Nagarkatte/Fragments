package com.company.durgaprasad.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {
    TextView text;
    TextView textViewSecond;
    int a,b,sum=0;
    Communicator communicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three_layout, container, false);
        text = (TextView) view.findViewById(R.id.textView);
        textViewSecond = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    public void changeData(String data){
        a = Integer.parseInt(data);
        text.setText(data);
    }

    public void changeDataSecond(String data){
        b = Integer.parseInt(data);
        textViewSecond.setText(data);
    }

    public void printSum(String a, String b){
        if(TextUtils.isEmpty(a) && TextUtils.isEmpty(b)){
            textViewSecond.setText("Empty");
        }
        else if(TextUtils.isEmpty(b)){
            textViewSecond.setText(a);
        }
        else if(TextUtils.isEmpty(a)){
            textViewSecond.setText(b);
        }
        else {
            textViewSecond.setText(Integer.parseInt(a) + Integer.parseInt(b));
        }
    }
}
