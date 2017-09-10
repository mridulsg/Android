package com.example.mridul.memeapp;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



public class TopSectionFragment extends Fragment {
    EditText editText;
    EditText editText2;
    TopSectionListner activityCommander;
    public interface TopSectionListner{
        public void createClick(String top,String bottom);
    }

   @Override
   public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander=(TopSectionListner)context;
        }
        catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.top_picture_fragment, container, false);
        editText=(EditText)view.findViewById(R.id.editText);
        editText2=(EditText)view.findViewById(R.id.editText2);
        Button button=(Button)view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });
        return view;
    }
  public void buttonClicked(View view){
      activityCommander.createClick(editText.getText().toString(),editText2.getText().toString());
  }
}
