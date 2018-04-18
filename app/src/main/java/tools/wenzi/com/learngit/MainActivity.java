package tools.wenzi.com.learngit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private String getName() {
        return name;
    }

    private int getVersion() {
        return 1;
    }

    private int getVersion2() {
        return 2;
    }

}