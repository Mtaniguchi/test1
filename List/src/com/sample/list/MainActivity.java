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

        //ListView�I�u�W�F�N�g�̎擾
        ListView listView=(ListView)findViewById(R.id.list_view);

        //ArrayAdapter�I�u�W�F�N�g����
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        //Button�I�u�W�F�N�g�擾
        Button btn=(Button)findViewById(R.id.btn);

        //�N���b�N�C�x���g�̒ʒm��w��
        btn.setOnClickListener(new OnClickListener() {

          //�N���b�N�C�x���g
      @Override
      public void onClick(View v) {
        //�v�f�ǉ�
        addStringData();
        
        TextView textView1=(TextView)findViewById(R.id.textView1);
        // EditText editText1=(EditText)findViewById(R.id.editText1);
        // Editable input=editText1.getText();
        //textView1.setText(input);
        textView1.setText("hei");
        
      }
    });
        //Adapter�̃Z�b�g
        listView.setAdapter(adapter);

    }
    //�v�f�ǉ�����
    private void addStringData(){

      //EditText�I�u�W�F�N�g�擾
      EditText edit=(EditText)findViewById(R.id.edit_text);
      
      
      

      //EditText(�e�L�X�g)���擾���A�A�_�v�^�ɒǉ�
      adapter.add(edit.getText().toString());
    }
}