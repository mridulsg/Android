package com.example.mridul.memeapp;
import android.support.v4.app.Fragment;
//import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;



public class BottomSectionFragment extends Fragment {
    TextView editText3;
    TextView editText4;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.bottom_picture_fragmnet, container, false);
        editText3=(EditText)view.findViewById(R.id.editText3);
        editText4=(EditText)view.findViewById(R.id.editText4);
        return view;
    }
    public void setClickedText(String top, String bottom){
        editText3.setText(top);
        editText4.setText(bottom);
    }
}
