package com.qf.day35_coordinatorlayout;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.qf.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adatper;
    private List<String> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adatper = new MyAdapter(this);
        recyclerView.setAdapter(adatper);

        datas = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            datas.add("内容：" + i);
        }
        adatper.setDatas(datas);
    }

    public void btnclick(View v){
        Snackbar.make(v, "一个普通的通知", Snackbar.LENGTH_SHORT).show();

        //点击view1
//        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) v.getLayoutParams();
//        layoutParams.topMargin += 10;
//        v.setLayoutParams(layoutParams);
    }
}
