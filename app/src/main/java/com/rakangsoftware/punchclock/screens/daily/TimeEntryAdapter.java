package com.rakangsoftware.punchclock.screens.daily;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rakangsoftware.punchclock.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pererikbergman on 2017-12-07.
 */

public class TimeEntryAdapter extends RecyclerView.Adapter<TimeEntryViewHolder> {

    private List<TimeEntry> mTimeEntryList = new ArrayList<>();
    private OnTimeEntryClickedListener mListener;

    public TimeEntryAdapter() {

    }

    @Override
    public int getItemCount() {
        return mTimeEntryList.size();
    }

    @Override
    public TimeEntryViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        return TimeEntryViewHolder.newInstance(parent, mListener);
    }

    @Override
    public void onBindViewHolder(final TimeEntryViewHolder holder, final int position) {
        holder.bind(mTimeEntryList.get(position));
    }

    public void addTimeEntry(TimeEntry entry){
        mTimeEntryList.add(entry);
        notifyDataSetChanged();
    }

    public void setOnTimeEntryClickListener(OnTimeEntryClickedListener listener){
        mListener = listener;
    }
}
