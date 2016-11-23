package pl.edu.agh.mkolbusz.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by mkolbusz on 23.11.16.
 */

public class MovieRVAdapter extends RecyclerView.Adapter {
    List<Movie> movies;

    RecyclerView recyclerView;

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView year;
        public TextView actors;

        public MovieViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            year = (TextView) itemView.findViewById(R.id.year);
            actors = (TextView) itemView.findViewById(R.id.actors);
        }
    }

    public MovieRVAdapter(List<Movie> movies, RecyclerView recyclerView) {
        this.movies = movies;
        this.recyclerView = recyclerView;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MovieViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Movie movie = movies.get(position);

        ((MovieViewHolder) holder).actors.setText(movie.actorsToReadableString());
        ((MovieViewHolder) holder).year.setText(String.valueOf(movie.getYear()));
        ((MovieViewHolder) holder).title.setText(movie.getTitle());
    }
    @Override
    public int getItemCount() {
        return movies.size();
    }



}
