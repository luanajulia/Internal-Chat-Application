package com.example.chatjavafirefox;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class User implements Parcelable {
    private String uid;
    private String username;
    private String token;

    public User(){

    }


    public User(String uid, String username) {
        this.uid = uid;
        this.username = username;
    }

    protected User(Parcel in) {
        uid = in.readString();
        username = in.readString();
        token = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getUid(){
        return uid;
    }
    public String getUsername(){
        return username;
    }
    public String getToken() { return token; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(uid);
        dest.writeString(username);
        dest.writeString(token);
    }




}
