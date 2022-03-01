package com.example.taskbrightroots;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadaptor adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("BrightRoots Task");

        rcv = (RecyclerView) findViewById(R.id.recview);


        adapter = new myadaptor(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("Computer");
        ob1.setDesc("Product Price ");
        ob1.setImgname(R.drawable.cmp);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("Dell Laptop");
        ob2.setDesc("ProductPrice");
        ob2.setImgname(R.drawable.cmp);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("HP Laptop");
        ob3.setDesc("Product Price");
        ob3.setImgname(R.drawable.cmp);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("Asus Laptop");
        ob4.setDesc("Product Price");
        ob4.setImgname(R.drawable.cmp);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("Lanevo Laptop");
        ob5.setDesc("Product price");
        ob5.setImgname(R.drawable.cmp);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("Apple Laptop");
        ob6.setDesc("Product Price");
        ob6.setImgname(R.drawable.cmp);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("Macbook Laptop");
        ob7.setDesc("Product Price");
        ob7.setImgname(R.drawable.cmp);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("Rog Laptop");
        ob8.setDesc("Product Price");
        ob8.setImgname(R.drawable.cmp);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("Microsoft Surface");
        ob9.setDesc("Product Price");
        ob9.setImgname(R.drawable.cmp);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("Acer Laptop");
        ob10.setDesc("Product Price");
        ob10.setImgname(R.drawable.cmp);
        holder.add(ob10);



        return holder;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        MenuItem item=menu.findItem(R.id.search_menu);

        SearchView searchView=(SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText)
            {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
