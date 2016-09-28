package com.mayankattri.sunshine;

import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;

import com.mayankattri.sunshine.data.WeatherDbHelper;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class Testdb extends AndroidTestCase {

    public void testCreateDb() throws Throwable {
        mContext.deleteDatabase(WeatherDbHelper.DATABASE_NAME);
        SQLiteDatabase db = new WeatherDbHelper(this.mContext).getWritableDatabase();
        assertEquals(true, db.isOpen());
        db.close();
    }
}