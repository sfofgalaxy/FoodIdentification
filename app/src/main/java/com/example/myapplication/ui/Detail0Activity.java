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
        map.put("img", R.drawable.tomato);
        map.put("description", "\u3000\u3000西红柿炒鸡蛋，又名番茄炒蛋，是许多百姓家庭中一道普通的大众菜肴。烹饪方法简单易学，营养搭配合理。每100g的西红柿可食用部分中，含热能79.49KJ 蛋白质0.9g 脂肪0.2g 糖类3.5g 膳食纤维0.5g\n");
        list.add(map);

        map = new HashMap<>();
        map.put("foodName", "干椒辣子鸡");
        map.put("img", R.drawable.spicy);
        map.put("description", "\u3000\u3000辣子鸡，是一道经典的川菜。一般以整鸡为主料，加上葱、干辣椒、花椒、盐、胡椒、味精等多种材料精制而成，虽然是同一道菜，各地制作也各有特色。\n");
        list.add(map);

        map = new HashMap<>();
        map.put("foodName", "水煮肉片");
        map.put("img", R.drawable.water);
        map.put("description", "\u3000\u3000水煮肉片，是一道地方新创名菜，起源于自贡，发扬于西南，属于川菜中著名的家常菜。水煮肉片肉味香辣，软嫩，易嚼。吃时肉嫩菜鲜 ，汤红油亮，麻辣味浓，最宜下饭，为家常美食之一。特色是“麻、辣、鲜、香”。\n");
        list.add(map);
        return list;
    }

}
