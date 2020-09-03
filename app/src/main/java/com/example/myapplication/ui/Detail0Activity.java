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

public class Detail0Activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // 每个activity需获取
        getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_page0_layout);
        ListView listview = findViewById(R.id.list_view);
        SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.list_item, new String[] { "foodName",  "img", "description" }, new int[] {R.id.foodName, R.id.foodPicture, R.id.description});
        listview.setAdapter(adapter);
    }

    private List<Map<String, Object>> getData() {
//map.put(参数名字,参数值)
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("foodName", "西红柿炒鸡蛋");
        map.put("img", R.drawable.abc);
        map.put("description", "西红柿炒鸡蛋的描述");
        list.add(map);

        map = new HashMap<>();
        map.put("foodName", "干椒辣子鸡");
        map.put("img", R.drawable.abc);
        map.put("description", "干椒辣子鸡的描述");
        list.add(map);

        map = new HashMap<>();
        map.put("foodName", "水煮肉片");
        map.put("img", R.drawable.abc);
        map.put("description", "水煮肉片的描述");
        list.add(map);
        return list;
    }

}
