package com.andrezacampbell.adidevhighlanders.model;

import android.os.Parcel;
import android.os.Parcelable;

public class StoriesIFollowModel implements Parcelable {

    private int photo;

    public StoriesIFollowModel(int photo) {
        this.photo = photo;
    }

    protected StoriesIFollowModel(Parcel in) {
        photo = in.readInt();
    }

    public static final Creator<StoriesIFollowModel> CREATOR = new Creator<StoriesIFollowModel>() {
        @Override
        public StoriesIFollowModel createFromParcel(Parcel in) {
            return new StoriesIFollowModel(in);
        }

        @Override
        public StoriesIFollowModel[] newArray(int size) {
            return new StoriesIFollowModel[size];
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
