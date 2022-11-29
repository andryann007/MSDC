package com.example.msdc.api;

import com.google.gson.annotations.SerializedName;

public class TVDetails {
    @SerializedName("name")
    String name;

    @SerializedName("poster_path")
    String posterPath;

    @SerializedName("backdrop_path")
    String backdropPath;

    @SerializedName("episode_run_time")
    String episodeRuntime;

    @SerializedName("first_air_date")
    String firstAirDate;

    @SerializedName("last_air_date")
    String lastAirDate;

    @SerializedName("number_of_episodes")
    String numberOfEpisodes;

    @SerializedName("number_of_seasons")
    String numberOfSeasons;

    @SerializedName("original_language")
    String originalLanguage;

    @SerializedName("overview")
    String overview;

    @SerializedName("popularity")
    String popularity;

    @SerializedName("status")
    String status;

    @SerializedName("tagline")
    String tagline;

    @SerializedName("vote_average")
    String voteAverage;

    @SerializedName("vote_count")
    String voteCount;

    @SerializedName("homepage")
    String homepage;

    public String getName() {
        return name;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public String getEpisodeRuntime() {
        return episodeRuntime;
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public String getLastAirDate() {
        return lastAirDate;
    }

    public String getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOverview() {
        return overview;
    }

    public String getPopularity() {
        return popularity;
    }

    public String getStatus() {
        return status;
    }

    public String getTagline() {
        return tagline;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public String getHomepage() {
        return homepage;
    }
}
