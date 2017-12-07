package com.rakangsoftware.punchclock.screens.daily;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.rakangsoftware.punchclock.R;

public class DailyActivity extends AppCompatActivity {

    private static final String TAG = DailyActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        // RecycleView reference
        RecyclerView dailyList = findViewById(R.id.daily_list);

        // Created a layout manager.
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        dailyList.setLayoutManager(layoutManager);

        // Create an adapter
        final TimeEntryAdapter adapter = new TimeEntryAdapter();
        TimeEntry e = new TimeEntry();
        e.setProject("Ikea");
        e.setActivity("Documentation");
        e.setTimeSpent(1000*60*4);
        adapter.addTimeEntry(e);

        adapter.setOnTimeEntryClickListener(new OnTimeEntryClickedListener() {
            @Override
            public void onTimeEntryClicked(final TimeEntry entry) {
                Log.d(TAG, "onTimeEntryClicked() called with: entry = [" + entry + "]");

                TimeEntry e = new TimeEntry();
                e.setProject("Ikea 2");
                e.setActivity("Documentation");
                e.setTimeSpent(1000*60*4);
                adapter.addTimeEntry(e);
            }
        });
        dailyList.setAdapter(adapter);

        // TODO: Add click listener to floating action button and add new time entry on click.

    }
}
