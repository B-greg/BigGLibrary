package com.smartsoftasia.bigglibrary.widget;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import java.util.Calendar;

/**
 * Created by gregoire barret on 7/3/15.
 * For Tops project.
 */
public class DatePickerFragment extends DialogFragment
    implements DatePickerDialog.OnDateSetListener {

  private OnDateSelected mListener;

  public void setListener(OnDateSelected listener) {
    this.mListener = listener;
  }

  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState) {
    // Use the current date as the default date in the picker
    final Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH);
    int day = c.get(Calendar.DAY_OF_MONTH);

    // Create a new instance of DatePickerDialog and return it
    return new DatePickerDialog(getActivity(), this, year, month, day);
  }

  public void onDateSet(DatePicker view, int year, int month, int day) {
    // Do something with the date chosen by the user
    if(mListener!=null)mListener.onDateSelected(year+"-"+month+"-"+day);
  }

  public interface OnDateSelected{
    void onDateSelected(String date);
  }
}
