package com.eminem.weatherapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by eminem on 2017/4/14.
 *
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public UpDate upDate;

    public class UpDate{
        @SerializedName("loc")
        public String upDateTime;
    }

}
