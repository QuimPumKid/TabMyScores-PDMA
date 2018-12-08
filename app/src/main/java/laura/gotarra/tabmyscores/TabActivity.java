package laura.gotarra.tabmyscores;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TabActivity extends AppCompatActivity {

    private TabView test;
    private Canvas canvas;
    //private List<Integer> frets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        /*frets = new ArrayList<>();

        frets.add(1);
        frets.add(1);
        frets.add(2);
        frets.add(3);
        frets.add(3);
        frets.add(1);*/

        //test = findViewById(R.id.tabView);
        test = new TabView(this);
        //test.AddChord(frets);
    }


}
