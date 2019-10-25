package com.example.task1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class mailAdapter extends RecyclerView.Adapter<mailAdapter.MailHolder> {


    private Context context;
    private List<Mail> mailList;

    public mailAdapter(Context context) {
        this.context = context ;
    }

    @NonNull
    @Override
    public MailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.mail_row, parent, false);
        MailHolder holder = new MailHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MailHolder holder, int i) {
        Mail mail = mailList.get(i);
        holder.textView1.setText(mail.getContent());
        holder.textView2.setText(mail.getInfo());
    }

    @Override
    public int getItemCount() {
        return mailList!=null?mailList.size():0;
    }

    public void setDataSource(List<Mail> mailList) {
        this.mailList =mailList;
    }

    class MailHolder extends RecyclerView.ViewHolder{
        TextView textView1 , textView2 ;

    public MailHolder(@NonNull View itemView) {
        super(itemView);
        textView1 = itemView.findViewById(R.id.textView4);
        textView2 = itemView.findViewById(R.id.textView5);
    }
}
}
