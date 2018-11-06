package dev.basic_messaging_app;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    // Your holder should contain a member variable
    // for any view that will be set as you render a row
    public TextView messageText ;
    public TextView messageUser ;
    public TextView messageTime ;


    // We also create a constructor that accepts the entire item row
    // and does the view lookups to find each subview
    public ViewHolder(View itemView) {
        // Stores the itemView in a public final member variable that can be used
        // to access the context from any ViewHolder instance.
        super(itemView);

        messageText=(TextView)itemView.findViewById(R.id.message_text);
        messageUser=(TextView)itemView.findViewById(R.id.message_user);
        messageTime=(TextView)itemView.findViewById(R.id.message_time);
    }
}