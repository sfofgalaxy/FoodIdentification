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
        map.put("foodName", "素炒生菜");
        map.put("img", R.drawable.vegetable);
        map.put("description", "\u3000\u3000炒生菜是一道美食，由生菜等材料制作而成。原材料：生菜，姜丝\n" +
                "配料：盐，生抽，葵花油\n");
        list.add(map);

        map = new HashMap<>();
        map.put("foodName", "卤鸭腿");
        map.put("img", R.drawable.duck);
        map.put("description", "\u3000\u3000卤鸭腿是一种传统酱卤制品，深受广大消费者喜爱。卤鸭腿以鸭腿和香辛料为主要食材，口感紧实，耐咀嚼；具有经卤制后的良好的滋味与气味，无异味。\n");
        list.add(map);

        map = new HashMap<>();
        map.put("foodName", "麻婆豆腐");
        map.put("img", R.drawable.tofu);
        map.put("description", "\u3000\u3000麻婆豆腐，是四川省传统名菜之一，属于川菜，主料为：豆腐，辅料为：蒜苗、牛肉沫(其他肉也可以)，调料为：豆瓣、辣椒面和花椒面、酱油等，麻来自花椒，辣来自辣椒面，此菜成菜麻、辣、鲜、香、烫、翠、嫩、酥，将川菜麻辣味型的特点展现的淋漓尽致.\n" +
                "    营养成分：热量（1912.55千卡）、蛋白质（106.58克）、脂肪（144.00克）、碳水化合物 （49.25克）\n");
        list.add(map);
        return list;
    }

}
