package com.billionman.com.assignment_8_3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gv = (GridView) findViewById(R.id.gview);
        ImageAdapter ima = new ImageAdapter(this);
        gv.setAdapter(ima);
    }

    class ImageAdapter extends BaseAdapter {
        Context imgContext;

        // Constructor
        public ImageAdapter(Context c) {
            this.imgContext = c;
        }

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
            ImageView imageView;
            if (convertView == null) {
                imageView = new ImageView(imgContext);
                imageView.setLayoutParams(new GridView.LayoutParams(350, 350));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(8, 8, 8, 8);
            }
            else
            {
                imageView = (ImageView) convertView;
            }
            imageView.setImageResource(images[position]);
            return imageView;
        }

        public Integer[] images = {
                R.drawable.img_gingerbread, R.drawable.img_honeycomb,
                R.drawable.img_icecream, R.drawable.img_jellybean,
                R.drawable.img_kitkat, R.drawable.img_lollipop,
        };
    }

}
