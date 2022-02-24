package com.sibaamap.edittext2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text2,text3,text4,text5;
    EditText edit1,edit2,edit3,edit4,edit5;
    Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }
    void Init(){
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);
        edit4 = findViewById(R.id.edit4);
        edit5 = findViewById(R.id.edit5);

        but1 = findViewById(R.id.but1);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sdt = edit1.getText().toString();
                String email = edit2.getText().toString();
                String name = edit3.getText().toString();
                String namecty = edit4.getText().toString();
                String pass = edit5.getText().toString();

                if(sdt.isEmpty()){
                    edit1.setError("Mời nhập số điện thoại");
                }
                if(email.isEmpty()){
                    text2.setText("Email của bạn không đúng. Vui lòng nhập lại");
                    edit2.setBackgroundResource(R.color.pink);
                }
                if(name.isEmpty()){
                    text3.setText("Tên của bạn không đúng. Vui lòng nhập lại");
                    edit3.setBackgroundResource(R.color.pink);
                }
                if(namecty.isEmpty()){
                    text4.setText("Cơ quan của bạn không đúng. Vui lòng nhập lại");
                    edit4.setBackgroundResource(R.color.pink);
                }
                if(pass.length()<8){
                    text5.setText("Mật khẩu của bạn quá ngắn. Vui lòng nhập lại");
                    edit5.setBackgroundResource(R.color.pink);
                }
                else{
                    text2.setText("Đăng kí thành công");
                    edit2.setBackgroundResource(R.color.white);
                    edit3.setBackgroundResource(R.color.white);
                    edit4.setBackgroundResource(R.color.white);
                    edit5.setBackgroundResource(R.color.white);
                }



            }
        });


    }
}