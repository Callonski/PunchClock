package com.rakangsoftware.punchclock.screens.daily;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rakangsoftware.punchclock.R;

/**
 * Created by pererikbergman on 2017-12-07.
 */

public class TimeEntryViewHolder extends RecyclerView.ViewHolder {

    private static final String TAG = TimeEntryViewHolder.class.getSimpleName();

    private final TextView mProjectName;
    private TimeEntry mTimeEntry;

    public TimeEntryViewHolder(final View itemView, final OnTimeEntryClickedListener listener) {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                listener.onTimeEntryClicked(mTimeEntry);
            }
        });
        mProjectName = itemView.findViewById(R.id.project_name);
    }

    public void bind(final TimeEntry timeEntry) {
        mTimeEntry = timeEntry;
        mProjectName.setText(timeEntry.getProject());
        // TODO: Set the values of activity and time spent until next tuesday.
    }

    public static TimeEntryViewHolder newInstance(final ViewGroup parent, final OnTimeEntryClickedListener listener) {
        return new TimeEntryViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.list_item_time_entry,
                        parent,
                        false
                ),
                listener
        );
    }
}
