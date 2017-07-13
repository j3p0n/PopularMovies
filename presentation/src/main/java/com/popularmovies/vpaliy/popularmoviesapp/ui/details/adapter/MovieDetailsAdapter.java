package com.popularmovies.vpaliy.popularmoviesapp.ui.details.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.popularmovies.vpaliy.popularmoviesapp.R;
import com.popularmovies.vpaliy.popularmoviesapp.ui.details.fragment.MovieCastFragment;
import com.popularmovies.vpaliy.popularmoviesapp.ui.details.fragment.MovieInfoFragment;
import com.popularmovies.vpaliy.popularmoviesapp.ui.details.fragment.MovieReviewFragment;

import android.support.annotation.NonNull;

public class MovieDetailsAdapter extends FragmentPagerAdapter {

    private static final int INFO=0;
    private static final int CAST=1;
    private static final int REVIEW=2;

    private Context context;
    private int movieId;


    public MovieDetailsAdapter(@NonNull Context context,
                               @NonNull FragmentManager manager,
                               int movieId){
        super(manager);
        this.movieId=movieId;
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case INFO:
                return MovieInfoFragment.newInstance(movieId);
            case CAST:
                return MovieCastFragment.newInstance(movieId);
            case REVIEW:
                return MovieReviewFragment.newInstance(movieId);

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case INFO:
                return context.getString(R.string.info_title);
            case CAST:
                return context.getString(R.string.cast_title);
            case REVIEW:
                return context.getString(R.string.review_title);
        }
        return super.getPageTitle(position);
    }
}