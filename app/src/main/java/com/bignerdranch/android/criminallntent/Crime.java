package com.bignerdranch.android.criminallntent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by g__agee on 2017/5/21.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        //Generate unique identifier 生成唯一标识符
        mId=UUID.randomUUID();
        mDate=new Date();
    }
    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date Date) {
        this.mDate = Date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean Solved) {
        this.mSolved = Solved;
    }

}
