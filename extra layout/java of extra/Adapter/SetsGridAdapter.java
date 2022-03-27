package com.example.tqappprashantsubedi.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.tqappprashantsubedi.QuestionsActivity;
import com.example.tqappprashantsubedi.R;

public class SetsGridAdapter extends BaseAdapter {

    private int numOfSets;

    public SetsGridAdapter(int numOfSets) {
        this.numOfSets = numOfSets;
    }

    @Override
    public int getCount() {
        return numOfSets;
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
    public View getView(final int position, View convertView, final ViewGroup parent) {

        View view;

        if (convertView == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sets_item_layout,parent,false);
        }else {
            view = convertView;
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parent.getContext(), QuestionsActivity.class);
                intent.putExtra("SETNO",position + 1);
                parent.getContext().startActivity(intent);

            }
        });

        ((TextView) view.findViewById(R.id.setNo_Tv)).setText(String.valueOf(position+1));


        return view;
    }
}
