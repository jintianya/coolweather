package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jinwenl on 6/25/2017.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cw")
    public Carwash carwash;
    public class Carwash{
        @SerializedName("txt")
        public String info;
    }

    public Sport sport;
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
