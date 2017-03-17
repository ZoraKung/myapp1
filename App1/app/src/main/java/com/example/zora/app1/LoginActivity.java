package com.example.zora.app1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Zora on 2017/3/17.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    // 声明控件对象
    private EditText et_name, et_pass;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        //初始化一个Adapter
//        ArrayAdapter<String> teacherAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Teacher.getAllTeachers());
//
//        //通过ID获取listView
//        ListView listView = (ListView) findViewById(R.id.teacher_listView);
//
//        //设置listView的Adapter
//        listView.setAdapter(teacherAdapter);

        /*TeacherAdapter teacherAdapter = new TeacherAdapter(this, R.layout.teacher_item, Teacher.getAllTeachers());

        ListView listView = (ListView) findViewById(R.id.teacher_listView);

        listView.setAdapter(teacherAdapter);*/

        setContentView(R.layout.activity_login);
        initView();

    }

    //初始哈View
    private void initView() {

        et_name = (EditText) findViewById(R.id.username);
        et_pass = (EditText) findViewById(R.id.password);
        mLoginButton = (Button) findViewById(R.id.btn_login);
        mLoginButton.setOnClickListener(this);
    }

    //点击事件
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_login) {
            login();
        }
    }

    /**
     * 登陆
     */
    private void login() {
//        String name = et_name.getText().toString();
//        String pass = et_pass.getText().toString();
        Intent intent = new Intent();
        intent.setClass(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
