package com.example.listviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvThucAn;
    ArrayList<ThucAn> arrayThucAn;
    ThucAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        
        adapter = new ThucAnAdapter(this, R.layout.dong_thuc_an, arrayThucAn);
        lvThucAn.setAdapter(adapter);
    }

    private void AnhXa() {
        lvThucAn = (ListView) findViewById(R.id.listviewThucAn);
        arrayThucAn = new ArrayList<>();

        arrayThucAn.add(new ThucAn("Mì Quảng", "Mì Quảng Quảng Nam", R.drawable.miquang));
        arrayThucAn.add(new ThucAn("Cháo", "Cháo Chí Phèo", R.drawable.chao));
        arrayThucAn.add(new ThucAn("Bánh Mì", "Ngon Bổ Rẻ", R.drawable.banhmi));
        arrayThucAn.add(new ThucAn("Hủ Tiếu", "Rất ngon", R.drawable.hutieu));
        arrayThucAn.add(new ThucAn("Phở Bò", "Chán cơm thèm Phở", R.drawable.phobo));

    }
}