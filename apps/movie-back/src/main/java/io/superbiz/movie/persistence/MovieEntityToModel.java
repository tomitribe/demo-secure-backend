package io.superbiz.movie.persistence;
/*
 * Tomitribe Confidential
 *
 * Copyright Tomitribe Corporation. 2018
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */


import io.superbiz.movie.rest.MovieModel;

public class MovieEntityToModel {

    public static MovieModel transform(final Movie movie,
                                       final int rating) {
        final MovieModel model = new MovieModel();
        model.setComments(movie.getComments());
        model.setDirector(movie.getDirector());
        model.setGenre(movie.getGenre());
        model.setId(movie.getId());
        model.setRating(rating);
        model.setTitle(movie.getTitle());
        model.setYear(movie.getYear());
        return model;
    }

    public static Movie transform(final MovieModel movieModel) {
        final Movie movie = new Movie();
        movie.setComments(movieModel.getComments());
        movie.setDirector(movieModel.getDirector());
        movie.setGenre(movieModel.getGenre());
        movie.setId(movieModel.getId());
        movie.setTitle(movieModel.getTitle());
        movie.setYear(movieModel.getYear());
        return movie;
    }
}
