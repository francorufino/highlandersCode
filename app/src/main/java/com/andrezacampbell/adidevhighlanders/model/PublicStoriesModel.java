package com.andrezacampbell.adidevhighlanders.model;

import android.os.Parcel;
import android.os.Parcelable;

public class PublicStoriesModel implements Parcelable {

    private int photo;

    public PublicStoriesModel(int photo) {
        this.photo = photo;
    }

    protected PublicStoriesModel(Parcel in) {
        photo = in.readInt();
    }

    public static final Creator<PublicStoriesModel> CREATOR = new Creator<PublicStoriesModel>() {
        @Override
        public PublicStoriesModel createFromParcel(Parcel in) {
            return new PublicStoriesModel(in);
        }

        @Override
        public PublicStoriesModel[] newArray(int size) {
            return new PublicStoriesModel[size];
        }
    };

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(photo);
    }
}
