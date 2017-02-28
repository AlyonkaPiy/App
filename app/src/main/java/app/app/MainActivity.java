package app.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ProductData> products;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.main);



        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();



    }

    private void initializeData(){
        products = new ArrayList<>();
        products.add(new ProductData("Carrot",  R.drawable.carrot));
        products.add(new ProductData("Tomatos",  R.drawable.tomatos));
        products.add(new ProductData("Lemon",  R.drawable.lemon));
        products.add(new ProductData("Orange", R.drawable.orange));
        products.add(new ProductData("Milk", R.drawable.milk));
        products.add(new ProductData("Vine", R.drawable.vine));
        products.add(new ProductData("Peaches", R.drawable.peaches));
        products.add(new ProductData("Juice", R.drawable.juices));
        products.add(new ProductData("Cucumbers", R.drawable.cucumbers));
    }

    private void initializeAdapter(){
        RecycleAdapter adapter = new RecycleAdapter(products);
        rv.setAdapter(adapter);
    }


    }





