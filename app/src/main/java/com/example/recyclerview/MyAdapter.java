package com.example.recyclerview;

//AndroidX
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Integer> iImages;
    private List<String> iNames;
    private List<String> iContacters;
    private List<String> iPhones;
    private List<String> iLocations;
    private List<Integer> iNumsOfEmployyes;
    private List<String> iEmails;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // access to all the views for a data item in a view holder
    static class ViewHolder extends RecyclerView.ViewHolder {

        // data item
        ImageView imageView;
        TextView textView;
        TextView emailView;
        TextView contacterView;
        TextView phoneView;
        TextView locationView;
        TextView numView;

        ViewHolder(View v) {
            super(v);
            imageView = v.findViewById(R.id.image_view);
            textView = v.findViewById(R.id.text_view);
            contacterView = v.findViewById(R.id.contacter_view);
            phoneView = v.findViewById(R.id.phone_view);
            locationView = v.findViewById(R.id.location_view);
            numView = v.findViewById(R.id.num_view);
            emailView = v.findViewById(R.id.email_view);
        }
    }

    // Provide a suitable constructor
    MyAdapter(List<Integer> itemImages, List<String> itemNames, List<String> itemContacters, List<String> itemPhones,
              List<String> itemLocations, List<Integer> itemNumsOfEmployees, List<String> itemEmails) {
        this.iImages = itemImages;
        this.iNames = itemNames;
        this.iContacters = itemContacters;
        this.iPhones = itemPhones;
        this.iLocations = itemLocations;
        this.iNumsOfEmployyes = itemNumsOfEmployees;
        this.iEmails = itemEmails;
    }

    // Create new views (invoked by the layout manager)
    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);

        // view's size, margins, paddings and layout parameters
        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // - get element from dataset at this position
        // - replace the contents of the view with that element
        holder.imageView.setImageResource(iImages.get(position));
        holder.textView.setText(iNames.get(position));
        holder.contacterView.setText(iContacters.get(position));
        holder.phoneView.setText(iPhones.get(position));
        holder.locationView.setText(iLocations.get(position));
        holder.numView.setText(Integer.toString(iNumsOfEmployyes.get(position)));
        holder.emailView.setText(iEmails.get(position));    }

    // Return the size of dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return iNames.size();
    }
}