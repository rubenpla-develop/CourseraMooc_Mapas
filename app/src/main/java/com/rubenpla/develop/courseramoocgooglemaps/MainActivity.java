package com.rubenpla.develop.courseramoocgooglemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.campnou) private ImageView campNou;
    @BindView(R.id.sagradafamilia) private ImageView sagradaFamilia;
    @BindView(R.id.batllo) private ImageView batllo;
    @BindView(R.id.university) private ImageView university;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.campnou)
    void onClickCampNou(View v) {

    }

    @OnClick(R.id.university)
    void onClickUniversity(View v) {

    }

    @OnClick(R.id.sagradafamilia)
    void onClickSagradaFamilia(View v) {

    }

    @OnClick(R.id.batllo)
    void onClickCasaBatllo(View v) {

    }

    private void goToMaps() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
