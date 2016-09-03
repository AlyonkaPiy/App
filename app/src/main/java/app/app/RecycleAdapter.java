package app.app;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.List;


public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ProdViewHolder>{


        public static class ProdViewHolder extends RecyclerView.ViewHolder {


            TextView productName;

            ImageView image;

            ProdViewHolder(View itemView) {
                super(itemView);

                productName = (TextView)itemView.findViewById(R.id.product_name);
                image = (ImageView)itemView.findViewById(R.id.im);
            }
        }

        List<ProductData> products;

        RecycleAdapter(List<ProductData> products){
            this.products = products;
        }

        @Override
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
        }

        @Override
        public ProdViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_behavior, viewGroup, false);
            ProdViewHolder pvh = new ProdViewHolder(v);
            return pvh;
        }

        @Override
        public void onBindViewHolder(ProdViewHolder prodViewHolder, int i) {
            prodViewHolder.productName.setText(products.get(i).name);
            prodViewHolder.image.setImageResource(products.get(i).imageId);
        }

        @Override
        public int getItemCount() {
            return products.size();
        }
}
