package com.activebuilding.residents.mypriorityjobqueue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.activebuilding.residents.mypriorityjobqueue.job.AppJobManager;
import com.activebuilding.residents.mypriorityjobqueue.job.PostTweetJob;
import com.birbit.android.jobqueue.JobManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppJobManager.getJobManager(getApplicationContext()).addJobInBackground(new PostTweetJob(""));
                //manager.addJobInBackground(new PostTweetJob("Hello"));
            }
        });
    }
}
