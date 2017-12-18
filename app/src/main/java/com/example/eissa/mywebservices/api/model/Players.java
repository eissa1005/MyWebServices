package com.example.eissa.mywebservices.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by EISSA on 17/12/2017.
 */

public class Players {

    private  int Id;
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    @SerializedName("LastName")
    @Expose
    private String LastName;

    @SerializedName("Gender")
    @Expose
    private String Gender;

    @SerializedName("Email")
    @Expose
    private  String Email;

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getGender() {
        return Gender;
    }

    public String getEmail() {
        return Email;
    }
}
