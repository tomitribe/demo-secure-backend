package io.superbiz.movie.persistence;
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import io.superbiz.movie.rest.MovieModel;

public class MovieEntityToModel {

    private MovieEntityToModel() {
    }

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
