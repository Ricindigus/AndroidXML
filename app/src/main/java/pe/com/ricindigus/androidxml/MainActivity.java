package pe.com.ricindigus.androidxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<Producto> productos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lista);

        ProductosPullParser parser = new ProductosPullParser();
        productos = parser.parseXML(this);

        ArrayAdapter<Producto> adapter = new ArrayAdapter<Producto>(this,android.R.layout.simple_expandable_list_item_1,productos);
        listView.setAdapter(adapter);
    }
}
