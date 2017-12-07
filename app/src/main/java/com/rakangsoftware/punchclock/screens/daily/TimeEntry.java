package com.rakangsoftware.punchclock.screens.daily;

/**
 * Created by pererikbergman on 2017-12-07.
 */

public class TimeEntry {

    private String mProject;
    private String mActivity;
    private long mTimeSpent;

    public String getProject() {
        return mProject;
    }

    public void setProject(final String project) {
        mProject = project;
    }

    public String getActivity() {
        return mActivity;
    }

    public void setActivity(final String activity) {
        mActivity = activity;
    }

    public long getTimeSpent() {
        return mTimeSpent;
    }

    public void setTimeSpent(final long timeSpent) {
        mTimeSpent = timeSpent;
    }

    @Override
    public String toString() {
        return "TimeEntry{" +
                "mProject='" + mProject + '\'' +
                ", mActivity='" + mActivity + '\'' +
                ", mTimeSpent=" + mTimeSpent +
                '}';
    }
}
