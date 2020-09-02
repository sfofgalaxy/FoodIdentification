package com.example.myapplication.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Detail0Activity extends Activity {
    private ListView listview;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // 每个activity需获取
        Context context = getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_page0_layout);
        listview = findViewById(R.id.list_view);
        SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.list_item, new String[] { "title",  "img" }, new int[] { R.id.foodName, R.id.foodPicture });
        listview.setAdapter(adapter);
    }

    private List<Map<String, Object>> getData() {
//map.put(参数名字,参数值)
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("title", "摩托罗拉");
        map.put("img", R.drawable.abc);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "诺基亚");
        map.put("img", R.drawable.abc);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "三星");
        map.put("img", R.drawable.abc);
        list.add(map);
        return list;
    }

}
