package iics.sasot.seanmichael.myfirsttime3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                    int number = 20;
                    for (int i = 1; i <= number; i++)

                    {
                        if (i % 2 == 0) {
                            textView.append(i + ", ");
                        }
                    }
                }
            });
        }
    }
