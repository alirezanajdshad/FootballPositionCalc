package iri.alirezanajd28.overallcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView gk, rb, rwb, cb, lb, lwb, cdm, cm, cam, rm, rw, lm, lw, cf, st;
    Intent i;
    Bundle att;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        i = getIntent();
        att = i.getExtras();
        gk = (TextView) findViewById(R.id.gk);
        rb = (TextView) findViewById(R.id.rb);
        rwb = (TextView) findViewById(R.id.rwb);
        cb = (TextView) findViewById(R.id.cb);
        lb = (TextView) findViewById(R.id.lb);
        lwb = (TextView) findViewById(R.id.lwb);
        cdm = (TextView) findViewById(R.id.cdm);
        cm = (TextView) findViewById(R.id.cm);
        cam = (TextView) findViewById(R.id.cam);
        rm = (TextView) findViewById(R.id.rm);
        rw = (TextView) findViewById(R.id.rw);
        lm = (TextView) findViewById(R.id.lm);
        lw = (TextView) findViewById(R.id.lw);
        cf = (TextView) findViewById(R.id.cf);
        st = (TextView) findViewById(R.id.st);

        calculateOverall();
    }

    public void calculateOverall() {
        gk.setText("GK" + '\n' +
                String.valueOf(
                        Math.round((8 * att.getInt("physical") + 20 * att.getInt("diving") + 15 * att.getInt("handling") + 10 * att.getInt("kicking")
                                + 25 * att.getInt("reflections") + 2 * att.getInt("speed") + 20 * att.getInt("positioning")) / 100)
                )
        );

        rb.setText("RB" + '\n' +
                String.valueOf(
                        Math.round((15 * att.getInt("pace") + 5 * att.getInt("shooting") + 23 * att.getInt("passing") + 15 * att.getInt("dribbling")
                                + 27 * att.getInt("defence") + 15 * att.getInt("physical")) / 100)
                )
        );

        lb.setText("LB" + '\n' +
                String.valueOf(
                        Math.round((15 * att.getInt("pace") + 5 * att.getInt("shooting") + 23 * att.getInt("passing") + 15 * att.getInt("dribbling")
                                + 27 * att.getInt("defence") + 15 * att.getInt("physical")) / 100)
                )
        );

        cb.setText("CB" + '\n' +
                String.valueOf(
                        Math.round((att.getInt("pace") + 11 * att.getInt("passing") + att.getInt("dribbling")
                                + 52 * att.getInt("defence") + 35 * att.getInt("physical")) / 100)
                )
        );

        rwb.setText("RWB" + '\n' +
                String.valueOf(
                        Math.round((15 * att.getInt("pace") + 15 * att.getInt("shooting") + 20 * att.getInt("passing") + 20 * att.getInt("dribbling")
                                + 15 * att.getInt("defence") + 15 * att.getInt("physical")) / 100)
                )
        );

        lwb.setText("LWB" + '\n' +
                String.valueOf(
                        Math.round((15 * att.getInt("pace") + 15 * att.getInt("shooting") + 20 * att.getInt("passing") + 20 * att.getInt("dribbling")
                                + 15 * att.getInt("defence") + 15 * att.getInt("physical")) / 100)
                )
        );

        cdm.setText("CDM" + '\n' +
                String.valueOf(
                        Math.round((2 * att.getInt("pace") + 5 * att.getInt("shooting") + 35 * att.getInt("passing") + 10 * att.getInt("dribbling")
                                + 25 * att.getInt("defence") + 23 * att.getInt("physical")) / 100)
                )
        );

        cm.setText("CM" + '\n' +
                String.valueOf(
                        Math.round((3 * att.getInt("pace") + 12 * att.getInt("shooting") + 35 * att.getInt("passing") + 20 * att.getInt("dribbling")
                                + 15 * att.getInt("defence") + 15 * att.getInt("physical")) / 100)
                )
        );

        cam.setText("CAM" + '\n' +
                String.valueOf(
                        Math.round((5 * att.getInt("pace") + 20 * att.getInt("shooting") + 35 * att.getInt("passing") + 35 * att.getInt("dribbling")
                                + 5 * att.getInt("physical")) / 100)
                )
        );
        lm.setText("LM" + '\n' +
                String.valueOf(
                        Math.round((15 * att.getInt("pace") + 20 * att.getInt("shooting") + 25 * att.getInt("passing") + 35 * att.getInt("dribbling")
                                + 5 * att.getInt("physical")) / 100)));

        rm.setText("RM" + '\n' +
                String.valueOf(
                        Math.round((15 * att.getInt("pace") + 20 * att.getInt("shooting") + 25 * att.getInt("passing") + 35 * att.getInt("dribbling")
                                + 5 * att.getInt("physical")) / 100)));

        cf.setText("CF" + '\n' +
                String.valueOf(
                        Math.round((10 * att.getInt("pace") + 30 * att.getInt("shooting") + 15 * att.getInt("passing") + 35 * att.getInt("dribbling")
                                + 10 * att.getInt("physical")) / 100)));

        st.setText("ST" + '\n' +
                String.valueOf(
                        Math.round((10 * att.getInt("pace") + 35 * att.getInt("shooting") + 5 * att.getInt("passing") + 30 * att.getInt("dribbling")
                                + 20 * att.getInt("physical")) / 100)));

        rw.setText("RW" + '\n' +
                String.valueOf(
                        Math.round((15 * att.getInt("pace") + 30 * att.getInt("shooting") + 15 * att.getInt("passing") + 30 * att.getInt("dribbling")
                                + 10 * att.getInt("physical")) / 100)));

        lw.setText("LW" + '\n' +
                String.valueOf(
                        Math.round((15 * att.getInt("pace") + 30 * att.getInt("shooting") + 15 * att.getInt("passing") + 30 * att.getInt("dribbling")
                                + 10 * att.getInt("physical")) / 100)));
    }

    @Override
    public void onBackPressed() {
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
