package com.hitanshudhawan.popcorn.network.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by hitanshu on 2/8/17.
 */

public class CreditsResponse {

    @SerializedName("id")
    private Integer id;
    @SerializedName("cast")
    List<CastBrief> casts;
    @SerializedName("crew")
    List<Crew> crews;

    public CreditsResponse(Integer id, List<CastBrief> casts, List<Crew> crews) {
        this.id = id;
        this.casts = casts;
        this.crews = crews;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<CastBrief> getCasts() {
        return casts;
    }

    public void setCasts(List<CastBrief> casts) {
        this.casts = casts;
    }

    public List<Crew> getCrews() {
        return crews;
    }

    public void setCrews(List<Crew> crews) {
        this.crews = crews;
    }

}
