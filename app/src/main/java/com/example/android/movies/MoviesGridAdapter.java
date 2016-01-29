package com.example.android.movies;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;
/**
 * Created by almanara on 26/01/2016.
 */
public class MoviesGridAdapter extends BaseAdapter {
    private Context mContext;
    private List<String> mList;

    public MoviesGridAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView view = (ImageView) convertView;
        if (view == null) {
            view = new ImageView(mContext);
        }
        String url =  getItem(position).toString();
        Picasso.with(mContext).load(url).into(view);
        return view;
    }

}
