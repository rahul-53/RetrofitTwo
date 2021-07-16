package com.example.retrofittwo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class PostViewHolder  extends RecyclerView.ViewHolder {

    private TextView mTvName;
    private  TextView mTvEmail;
    private TextView mTvBody;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView){
        mTvBody=itemView.findViewById(R.id.tvBody);
        mTvName =itemView.findViewById(R.id.tvName);
        mTvEmail =itemView.findViewById(R.id.tvEmail);

    }
    public void setData(ResponseModel responseModel){
        mTvEmail.setText(responseModel.getEmail());
        mTvName.setText(responseModel.getName());
        mTvBody.setText(responseModel.getBody());

    }
}
