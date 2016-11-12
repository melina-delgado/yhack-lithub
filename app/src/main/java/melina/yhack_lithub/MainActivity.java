package melina.yhack_lithub;
//Steph is everyone's fav
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.esri.android.map.GraphicsLayer;
import com.esri.android.map.MapView;
import com.esri.core.geometry.Point;

public class MainActivity extends AppCompatActivity {
    MapView mMapView;
    GraphicsLayer mLocationLayer;
    Point mLocationLayerPoint;
    String mLocationLayerPointString;

    // Create and add a GraphicsLayer
    mMapView.addLayer(new GraphicsLayer());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}