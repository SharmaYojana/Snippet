package nyc.c4q.yojana.snippet.Notification;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.yojana.snippet.R;

/**
 * Created by yojanasharma on 12/4/16.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        Bundle b = getIntent().getExtras();

        Cat clickedCat = b.getParcelable("cat");
    }
}
