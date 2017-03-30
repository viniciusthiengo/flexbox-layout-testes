package br.com.thiengo.flexboxlayouttestes;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.flexbox.FlexboxLayoutManager;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;


class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ViewHolder> {
    private Context context;
    private ArrayList<String> images;

    ImagesAdapter(Context context, ArrayList<String> images){
        this.context = context;
        this.images = images;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from( parent.getContext() )
                .inflate(R.layout.item_image, parent, false);

        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Picasso.with( context )
                .load( images.get( position ) )
                .into( holder.imageView );

        FlexboxLayoutManager.LayoutParams lp = (FlexboxLayoutManager.LayoutParams) holder.imageView.getLayoutParams();
        lp.setFlexGrow( 1f );
    }

    @Override
    public int getItemCount() {
        return images.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        private ViewHolder(View view) {
            super(view);

            imageView = (ImageView) view;
        }
    }
}
