package adhanjas.com.example.recyclerview_retrofit;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RetrofitAdaptor extends RecyclerView.Adapter<RetrofitAdaptor.RetrofitHolder> {
private List<Retrofit_model>list;

    public RetrofitAdaptor(List<Retrofit_model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RetrofitHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RetrofitHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_retrofit,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RetrofitHolder holder, int position) {
        Picasso.get().load(list.get(position).getBadge_Url()).into(holder.profile);
        holder.name.setText(list.get(position).getName());
        holder.hrs.setText(list.get(position).getHours());
        holder.country.setText(list.get(position).getCountry());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class RetrofitHolder extends RecyclerView.ViewHolder{
        CircleImageView profile;
        TextView name,hrs,country;

        public RetrofitHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.imageProfile);
            name=itemView.findViewById(R.id.textName);
            hrs=itemView.findViewById(R.id.textCode);
            country=itemView.findViewById(R.id.textCountry);
        }
    }
}
