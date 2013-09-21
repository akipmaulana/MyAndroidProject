package com.SG.SP;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements OnClickListener{
	EditText I1,I2,Hasil;
	Button RTambah, RKurang, RBagi, RKali;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		I1 = (EditText)findViewById(R.id.editText1);
		I2 = (EditText)findViewById(R.id.EditText01);
		Hasil = (EditText)findViewById(R.id.editText2);
		//jumlah = (TextView) findViewById(R.id.);
		RTambah = (Button)findViewById(R.id.Btambah);
		RKurang = (Button)findViewById(R.id.Bkurang);
		RKali = (Button)findViewById(R.id.Bkali);
		RBagi = (Button)findViewById(R.id.Bbagi);
		RTambah.setOnClickListener(this);
		RKurang.setOnClickListener(this);
		RKali.setOnClickListener(this);
		RBagi.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int nilai1 = Integer.parseInt(I1.getText().toString());
		int nilai2 = Integer.parseInt(I2.getText().toString());
		switch (v.getId()) {
		case R.id.Btambah:
			System.out.print(nilai1+nilai2);
		Hasil.setText(Integer.toString(nilai1+nilai2));
		
		break;
		case R.id.Bkurang:
		Hasil.setText(Integer.toString(nilai1-nilai2));
		break;
		case R.id.Bkali:
		Hasil.setText(Integer.toString(nilai1*nilai2));
		break;
		case R.id.Bbagi:
		Hasil.setText(Integer.toString(nilai1/nilai2));
		break;
		default:
		break;
		}
	}

}
