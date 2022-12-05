package com.ahmfarisi.myquote.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmfarisi.myquote.Model.QuoteModel;
import com.ahmfarisi.myquote.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterQuote extends RecyclerView.Adapter<AdapterQuote.ViewHolderQuote>{
    private List<QuoteModel> listQuote = new ArrayList<>();
    private Context ctx;

    public AdapterQuote(List<QuoteModel> listQuote, Context ctx) {
        this.listQuote = listQuote;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolderQuote onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderQuote holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderQuote extends RecyclerView.ViewHolder {
        TextView tvText, tvAuthor;

        public ViewHolderQuote(@NonNull View itemView) {
            super(itemView);
            tvText = itemView.findViewById(R.id.tv_text);
            tvAuthor = itemView.findViewById(R.id.tv_author);
        }
    }

}
