package com.example.coronainfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    ListView coronaInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coronaInfo = findViewById(R.id.coronainfo);

        String[] values = new String[]{
                "Symptoms", "Vaccine", "Medical Advice",
                "Rummors Cleared", "Hygiene Measurs",
                "About Covid19", "About New variant of Covid19",
                "Hystory Of Covid", "Goverments Reaction",
                "Impact On Economy"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        coronaInfo.setAdapter(adapter);

        coronaInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), Activity_Symptoms.class);
                    startActivity(intent);
                }
            }
        });
        coronaInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), Activity_Vaccine.class);
                    startActivity(intent);
                }
            }
        });
        coronaInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), Activity_Medical_Advice.class);
                    startActivity(intent);
                }
            }
        });
        coronaInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), Activity_Rummors_Cleared.class);
                    startActivity(intent);
                }
            }
        });
        coronaInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), Activity_Hystory_Of_Covid.class);
                    startActivity(intent);
                }
            }
        });
        coronaInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), Activity_Hygiene_Measurs.class);
                    startActivity(intent);
                }
            }
        });
        coronaInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), Activity_Goverments_Reaction.class);
                    startActivity(intent);
                }
            }
        });
        coronaInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 7) {
                    Intent intent = new Intent(view.getContext(), Activity_About_New_variant_of_Covid19.class);
                    startActivity(intent);
                }
            }
        });
        coronaInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 8) {
                    Intent intent = new Intent(view.getContext(), Impact_On_Economy.class);
                    startActivity(intent);
                }
            }
        });
        coronaInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 9) {
                    Intent intent = new Intent(view.getContext(), Activity_About_Covid19.class);
                    startActivity(intent);
                }
            }
        });

    }
}