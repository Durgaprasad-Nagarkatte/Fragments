package com.company.durgaprasad.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    EditText text;
    Communicator communicator;
    Button click;
    String number;


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one_layout, container, false);
        //TextView textView = new TextView(getActivity());
        //textView.setText(R.string.hello_blank_fragment);
        text = (EditText) view.findViewById(R.id.text1);
        click = (Button) view.findViewById(R.id.button);



        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                communicator = (Communicator) getActivity();
                number = text.getText().toString();
                communicator.respond(number);
            }
        });
        return view;
    }

    public String getData(){
        return text.getText().toString();
    }

}
