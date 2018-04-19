package com.a986415.lab7;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;
//https://github.com/codepath/android_guides/wiki/Endless-Scrolling-with-AdapterViews-and-RecyclerView
public class RidesAdapter extends RecyclerView.Adapter<RidesAdapter.ViewHolder> {
    private List<String> Rides;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        // each data item is just a string in this case
        public TextView txt_datetime,txt_origin,txt_destination,txt_provider;
        public ViewHolder(View v) {
            super(v);
            txt_datetime= itemView.findViewById(R.id.txt_time);
            txt_origin= itemView.findViewById(R.id.txt_origin);
            txt_destination= itemView.findViewById(R.id.txt_destination);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RidesAdapter(List<String> myDataset) {
        Rides = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RidesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_recycle_view_layout, parent, false);
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        String ride=Rides.get(position);
        holder.txt_datetime.setText(ride);
        holder.txt_origin.setText(ride);
        holder.txt_destination.setText(ride);
        holder.txt_provider.setText(ride);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return Rides.size();
    }
}