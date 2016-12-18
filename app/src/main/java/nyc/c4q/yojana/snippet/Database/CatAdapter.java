//package nyc.c4q.yojana.snippet.Database;
//
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import java.text.DateFormat;
//import java.util.Date;
//import java.util.List;
//
//import nyc.c4q.yojana.snippet.R;
//
///**
// * Created by Ramona Harrison
// * on 11/19/16.
// */
//
//public class CatAdapter extends RecyclerView.Adapter<CatAdapter.CatViewHolder> {
//
//    private Listener listener;
//    private List<Pokemon> pokemons;
//
//    public CatAdapter(List<Pokemon> pokemons, Listener listener) {
//        this.pokemons = pokemons;
//        this.listener = listener;
//    }
//
//    @Override
//    public CatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cat, parent, false);
//        CatViewHolder vh = new CatViewHolder(view);
//        return vh;
//
//
//    }
//
//    @Override
//    public void onBindViewHolder(CatViewHolder holder, int position) {
//        Pokemon pokemon = pokemons.get(position);
//        holder.bind(pokemon);
//    }
//
//    @Override
//    public int getItemCount() {
//        return pokemons.size();
//    }
//
//    public void setData(List<Pokemon> pokemons) {
//        this.pokemons = pokemons;
//        notifyDataSetChanged();
//    }
//
//    public class CatViewHolder extends RecyclerView.ViewHolder {
//
//        LinearLayout layout;
//        TextView catName;
//        TextView lastFed;
//
//        public CatViewHolder(View itemView) {
//            super(itemView);
//            layout = (LinearLayout) itemView.findViewById(R.id.layout);
//            catName = (TextView) itemView.findViewById(R.id.tv_cat_name);
//            lastFed = (TextView) itemView.findViewById(R.id.tv_last_fed);
//        }
//
//        public void bind(Pokemon c) {
//            final Pokemon pokemon = c;
//            catName.setText(pokemon.getName());
//            lastFed.setText(DateFormat.getDateTimeInstance().format(new Date(pokemon.getLastFed())));
//            layout.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    listener.onCatClicked(pokemon);
//                }
//            });
//
//            layout.setOnLongClickListener(new View.OnLongClickListener() {
//                @Override
//                public boolean onLongClick(View view) {
//                    listener.onCatLongClicked(pokemon);
//                    return true;
//                }
//            });
//        }
//    }
//
//    interface Listener {
//        void onCatClicked(Pokemon pokemon);
//
//        void onCatLongClicked(Pokemon pokemon);
//    }
//}
