package nyc.c4q.yojana.snippet.Notification;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by yojanasharma on 12/13/16.
 */

public class Cat implements Parcelable {

    public Cat() {
    }

    protected Cat(Parcel in) {
    }

    public static final Creator<Cat> CREATOR = new Creator<Cat>() {
        @Override
        public Cat createFromParcel(Parcel in) {
            return new Cat(in);
        }

        @Override
        public Cat[] newArray(int size) {
            return new Cat[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
