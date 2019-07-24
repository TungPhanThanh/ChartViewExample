package com.tungpt.chartviewexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class MainActivity extends AppCompatActivity {

    private PieChartView mPieChartView;
    private List<SliceValue> pieData;
    private PieChartData pieChartData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        mPieChartView = findViewById(R.id.chart_view);
        pieData = new ArrayList<>();
        pieChartData = new PieChartData(pieData);
        initData();
        mPieChartView.setPieChartData(pieChartData);
    }

    private void initData(){
        pieData.add(new SliceValue(15, Color.BLUE));
        pieData.add(new SliceValue(25, Color.GRAY));
        pieData.add(new SliceValue(25, Color.RED));
        pieData.add(new SliceValue(45, Color.MAGENTA));
    }
}
