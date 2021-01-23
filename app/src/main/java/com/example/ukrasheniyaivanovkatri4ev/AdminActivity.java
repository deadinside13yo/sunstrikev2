package com.example.ukrasheniyaivanovkatri4ev;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AdminActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }
    //  public final static String POSITION = "position";
    //  private Decoration_list decorList;
    //  EditText DecorTextView, CountTextView;
    //  @Override
    //   protected void onCreate(Bundle savedInstanceState) {
        //      // super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_admin);
        //   int position = getIntent().getIntExtra(POSITION, 0);
        //   decorList = decorList.get(position);
        //  Init();
        //  setUserInfo();
        // }
    //  public static  int parseIntOfDefault(String whatParse, int defaultValue)
    //  {
        //   int parse;
        //    try{
            //     parse = Integer.parseInt(whatParse);
            //  }
        //  catch (Exception NumberFormatException)
        //   {
            //      parse = defaultValue;
            //  }
        //   return parse;
        //  }
    //   public static int parseIntOrDefault(String toString, int i) {
        //    return 0;
//  }
    //  private void setUserInfo() {
        //  DecorTextView.setText(decorList.getDecoration());
        //   CountTextView.setText(String.valueOf(decorList.getCount()));
        //  }
    //   private void Init() {
        //    DecorTextView = findViewById(R.id.DecorTextView);
        //   CountTextView = findViewById(R.id.CountTextView);
        // }
    public void Back(View view) {
     onBackPressed();
  }
    public void Save(View view) {
        //   decorList.setDecoration(DecorTextView.getText().toString());
        //   decorList.setCount(CountTextView.getText().toString());
        //   String count = CountTextView.getText().toString();
//
        //  decorList.setCount(parseIntOfDefault(count, decorList.getCount()));
        //     BracerActivity.UpdateList(decorList);
        //      finish();
   }
}