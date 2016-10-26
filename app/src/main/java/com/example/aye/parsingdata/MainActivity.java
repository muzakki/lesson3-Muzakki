package com.example.aye.parsingdata;

import com.example.aye.parsingdata.model.Example;
import com.example.aye.parsingdata.model.JatuhTempo;
import com.example.aye.parsingdata.model.Kendaraan;
import com.example.aye.parsingdata.rest.ApiClient;
import com.example.aye.parsingdata.rest.ApiInterface;
import com.example.aye.parsingdata.model.Data;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> m_adapter;
    ArrayList<String> m_listItems = new ArrayList<String>();

    Button bt;
    EditText kode;
    EditText nomor;
    EditText seri;
    TextView tv;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.button);
        kode = (EditText) findViewById(R.id.kode);
        nomor = (EditText) findViewById(R.id.nomor);
        seri = (EditText) findViewById(R.id.seri);

        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ApiInterface apiService =
                        ApiClient.getClient().create(ApiInterface.class);

                Call<Example> call = apiService.getPajakKendaraan(kode.getText().toString(), nomor.getText().toString(), seri.getText().toString());
                call.enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example>call, Response<Example> response) {
                        String status = response.body().getStatus();
                        String dataK;
                        if(status == "success") {
                            Data jenis = response.body().getData();
                            Kendaraan kend = jenis.getKendaraan();
                            //JatuhTempo pjk = jenis.getJatuhTempo();
                            dataK = "Jenis: " + kend.getJenis() + "\n Merk: " + kend.getMerk() + "\n Tahun: " + kend.getTahunPembuatan();
                        } else {
                            dataK = response.body().getMessage();
                        }

                        final TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText(dataK);
                    }

                    @Override
                    public void onFailure(Call<Example>call, Throwable t) {
                        // Log error here since request failed
                        final TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText("Something went wrong: " + t.getMessage());
                    }
                });

            }
        });


    }
}
