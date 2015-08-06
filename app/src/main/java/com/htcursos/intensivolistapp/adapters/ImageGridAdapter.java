package com.htcursos.intensivolistapp.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.htcursos.intensivolistapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by mac on 29/07/15.
 */
public class ImageGridAdapter extends ArrayAdapter<Integer> {

    public ImageGridAdapter(Context context, Integer[] images) {
        super(context, R.layout.item_grid_images, images);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = View
                    .inflate(getContext(), R.layout.item_grid_images, null);
            //Tamanho do Item (pixels)
            convertView.setLayoutParams(new GridView.LayoutParams(200, 200));
            holder = new ViewHolder();
            ButterKnife.bind(holder, convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //Posicao da Lista
        final Integer image = getItem(position);
        if (image != null) {
            holder.image.setImageResource(image);
        }
        return convertView;
    }

    class ViewHolder {

        @Bind(R.id.image)
        ImageView image;
    }
}
