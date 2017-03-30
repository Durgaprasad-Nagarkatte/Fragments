package com.company.durgaprasad.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.R.attr.fragment;
import static com.company.durgaprasad.fragment.R.id.fragmentThree;
import static com.company.durgaprasad.fragment.R.id.fragmentTwo;

public class MainActivity extends AppCompatActivity implements Communicator {

    private Fragment1 frag1;
    private Fragment2 frag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {
        Fragment3 fragment3 = (Fragment3) getSupportFragmentManager().findFragmentById(R.id.fragmentThree);
        fragment3.changeData(data);
     }

     public void respondSecond(String data){
         Fragment3 fragment3 = (Fragment3) getSupportFragmentManager().findFragmentById(R.id.fragmentThree);
         fragment3.changeDataSecond(data);
     }

     public void getFragmentValues(){
         Fragment3 fragment3 = (Fragment3) getSupportFragmentManager().findFragmentById(R.id.fragmentThree);
         String val1 = frag1.getData();
         String val2 = frag2.getData();
         fragment3.printSum(val1, val2);
     }
}
