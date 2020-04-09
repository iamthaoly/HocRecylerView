package com.iamthaoly.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.iamthaoly.hocrecylerview.R;
import com.iamthaoly.model.Contact;

import org.w3c.dom.Text;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder>{
    private List<Contact> contact;
    public ContactAdapter(List<Contact> ct)
    {
        this.contact = ct;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }
    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgAvatar;
        public TextView txtName;
        public TextView txtPhone;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAvatar = itemView.findViewById(R.id.imgAvatar);
            txtName = itemView.findViewById(R.id.txtName);
            txtPhone = itemView.findViewById(R.id.txtPhone);

        }
    }

//    public ContactAdapter(Activity context, int resource) {
//
//        this.context = context;
//        this.resource = resource;
//    }
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        View custom = context.getLayoutInflater().inflate(resource, null);
//        //Lưu ý: ImageView (imgAvatar), TextView(txtName, txtPhone)
//        //nằm trong custom.  Nên phải truy xuất trong custom.
//        ImageView imgAvatar = custom.findViewById(R.id.imgAvatar);
//        TextView txtName = custom.findViewById(R.id.txtName);
//        TextView txtPhone = custom.findViewById(R.id.txtPhone);
//
//        //đối số position ở trên là vị trí dòng dữ liệu đang được nhân bản
//        Contact contact = getItem(position);
//        imgAvatar.setImageResource(contact.getImgAvatar());
//        txtName.setText(contact.getName());
//        txtPhone.setText(contact.getPhone());
//
//        return custom;
//    }

}
