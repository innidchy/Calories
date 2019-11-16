package com.example.caloriesdiary.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.caloriesdiary.R;
import com.example.caloriesdiary.model.itemFood;

import java.util.ArrayList;


public class itemListAdapter extends ArrayAdapter<itemFood> {

    private Context mContext;
    private int mLayoutResId;
    private ArrayList<itemFood> mitemList;

    public itemListAdapter(Context context, int resource, ArrayList<itemFood> itemList) {
        super(context, resource,itemList);

        this.mContext = context;
        this.mLayoutResId = resource;
        this.mitemList = itemList;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemLayout = convertView;
        if(itemLayout == null){
            itemLayout = View.inflate(mContext, mLayoutResId, null);
        }

        TextView foodTextView = itemLayout.findViewById(R.id.list_item_View1);
        TextView calTextView = itemLayout.findViewById(R.id.list_item_View2);

        itemFood item = mitemList.get(position);

        foodTextView.setText(item.getFood());
        calTextView.setText("Calories = "+ item.getCal() +" , "+item.getDate());

        return itemLayout;
    }
}
