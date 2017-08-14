package com.rubenpla.develop.courseramoocgooglemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.maps.model.LatLng;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    public static final String BCN_LOCATION = "BCN_LOCATION";

    @BindView(R.id.cv_campnou)
    CardView campNou;
    @BindView(R.id.sagradafamilia)  ImageView sagradaFamilia;
    @BindView(R.id.batllo)  ImageView casabatllo;
    @BindView(R.id.guell)  ImageView parcGuell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.campnou)
    void onClickCampNou(View v) {
        LatLng campNouLocation = new LatLng(41.38089601399098, 2.121366042713926);
        goToMaps(campNouLocation);
    }

    @OnClick(R.id.guell)
    void onClickUniversity(View v) {
        LatLng guellLocation = new LatLng(41.41449481400753, 2.1526945000000524);
        goToMaps(guellLocation);
    }

    @OnClick(R.id.sagradafamilia)
    void onClickSagradaFamilia(View v) {
        LatLng sagradaFamiliaLocation = new LatLng(41.40362991400215, 2.1743558000000576);
        goToMaps(sagradaFamiliaLocation);
    }

    @OnClick(R.id.batllo)
    void onClickCasaBatllo(View v) {
        LatLng batlloLocation = new LatLng(41.391604763996234, 2.1647422999999435);
        goToMaps(batlloLocation);
    }

    private void goToMaps(LatLng location) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(BCN_LOCATION, location);
        startActivity(intent);
    }
}