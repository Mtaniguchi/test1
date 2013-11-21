package com.sample.list;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
public class MainActivity extends Activity {
  ArrayAdapter<String> adapter;
  private TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListViewオブジェクトの取得
        ListView listView=(ListView)findViewById(R.id.list_view);

        //ArrayAdapterオブジェクト生成
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        //Buttonオブジェクト取得
        Button btn=(Button)findViewById(R.id.btn);

        //クリックイベントの通知先指定
        btn.setOnClickListener(new OnClickListener() {

          //クリックイベント
      @Override
      public void onClick(View v) {
        //要素追加
        addStringData();
        
        TextView textView1=(TextView)findViewById(R.id.textView1);
        // EditText editText1=(EditText)findViewById(R.id.editText1);
        // Editable input=editText1.getText();
        //textView1.setText(input);
        textView1.setText("hei");
        
      }
    });
        //Adapterのセット
        listView.setAdapter(adapter);

    }
    //要素追加処理
    private void addStringData(){

      //EditTextオブジェクト取得
      EditText edit=(EditText)findViewById(R.id.edit_text);
      
      
      

      //EditText(テキスト)を取得し、アダプタに追加
      adapter.add(edit.getText().toString());
    }
}