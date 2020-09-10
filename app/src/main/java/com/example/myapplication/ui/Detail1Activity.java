package com.example.myapplication.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Detail1Activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // 每个activity需获取
        getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_page1_layout);
        ListView listview = findViewById(R.id.list_view);
        SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.list_item, new String[] { "foodName",  "img", "description" }, new int[] {R.id.foodName, R.id.foodPicture, R.id.description});
        listview.setAdapter(adapter);
    }

    private List<Map<String, Object>> getData() {
        //map.put(参数名字,参数值)
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("foodName", "西红柿炒鸡蛋");
        map.put("img", R.drawable.tomato);
        map.put("description", "西红柿炒鸡蛋，又名番茄炒蛋，是许多百姓家庭中一道普通的大众菜肴。烹饪方法简单易学，营养搭配合理。每100g的西红柿可食用部分中，含热能79.49KJ 蛋白质0.9g 脂肪0.2g 糖类3.5g 膳食纤维0.5g");
        list.add(map);

        return list;
    }
}
