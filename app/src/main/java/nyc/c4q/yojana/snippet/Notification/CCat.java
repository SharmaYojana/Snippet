package nyc.c4q.yojana.snippet.Notification;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by yojanasharma on 12/13/16.
 */

public class CCat implements Parcelable {

    public CCat() {
    }

    protected CCat(Parcel in) {
    }

    public static final Creator<CCat> CREATOR = new Creator<CCat>() {
        @Override
        public CCat createFromParcel(Parcel in) {
            return new CCat(in);
        }

        @Override
        public CCat[] newArray(int size) {
            return new CCat[size];
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
