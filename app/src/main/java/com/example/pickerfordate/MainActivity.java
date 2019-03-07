package com.example.pickerfordate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // method untuk membuat instance FragmentManager untuk mengelola Fragmen dan memperlihatkan pemilih tanggal
    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.datepicker));
    }

    public void processDatePickerResult(int year, int month, int dayOfMonth) {
        // untuk mengonversi bulan, hari, dan tahun menjadi string yang terpisah,
        // dan untuk menyatukan tiga string dengan tanda garis miring untuk format tanggal
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(dayOfMonth);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string +
                "/" + day_string +
                "/" + year_string);

        // untuk menampilkan toast message
        Toast.makeText(this, getString(R.string.date) + dateMessage,
                Toast.LENGTH_SHORT).show();
    }
}
