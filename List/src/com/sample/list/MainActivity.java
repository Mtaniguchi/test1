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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {
  ArrayAdapter<String> adapter;
  static List<String> items = new ArrayList<String>();
  
  private int count2;
  
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        count2 = 0;

        //ListView�I�u�W�F�N�g�̎擾
        ListView listView=(ListView)findViewById(R.id.list_view);
        
        /*
        List<Map<String, String>> retDataList = new ArrayList<Map<String, String>>();

        Map<String, String> data = new HashMap<String, String>();
        data.put("title", "��s��");
        data.put("comment", "�P�P�P");
        data.put("note", "aaa");
        retDataList.add(data);
        
        data = new HashMap<String, String>();
        data.put("title", "��s��");
        data.put("comment", "�Q�Q�Q");
        data.put("note", "bbb");
        retDataList.add(data);
        
        SimpleAdapter adapter2 = new SimpleAdapter(this, retDataList,
        		R.layout.row, new String[] { "title", "comment" ,"note"},
        	    new int[] {R.id.textView1, R.id.textView2 , R.id.textView3});
        
        listView.setAdapter(adapter2);
        */
        
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
        
        /*
        TextView textView1=(TextView)findViewById(R.id.textView1);
        // EditText editText1=(EditText)findViewById(R.id.editText1);
        // Editable input=editText1.getText();
        //textView1.setText(input);
        textView1.setText("hei");
        */
        
      }
    });
        //Adapter�̃Z�b�g
        listView.setAdapter(adapter);

    }
    //�v�f�ǉ�����
    private void addStringData(){

    	TextView textView1=(TextView)findViewById(R.id.textView1);
    	
    	count2++;
    	EditText edit=(EditText)findViewById(R.id.edit_text);
    	
    	 ListView listView=(ListView)findViewById(R.id.list_view);
    	 items.add(edit.getText().toString());
    	 
    	 
    	    adapter = 
    	      new ArrayAdapter<String>(
    	        this,
    	        R.layout.row,
    	        R.id.textView1,
    	        items);
    	    
    	    listView.setAdapter(adapter);
    
    	
    /*
      //EditText�I�u�W�F�N�g�擾
      EditText edit=(EditText)findViewById(R.id.edit_text);
      
      
      count2++;
      
      //EditText(�e�L�X�g)���擾���A�A�_�v�^�ɒǉ�
      adapter.add(edit.getText().toString());
      adapter.add((count2)+"hey");
      
      */
    }
}