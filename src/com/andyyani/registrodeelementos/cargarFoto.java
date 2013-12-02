package com.andyyani.registrodeelementos;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cargarFoto extends Activity {
	Button galeriaBTN;
	Button camBTN;
	EditText nombreET;
	EditText descripcionET;
	EditText categoriaET;
	EditText lugarET;
	TextView fechaTV;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cargarfoto);
		levantarXML();
	}
	public void levantarXML(){
		galeriaBTN=(Button)findViewById(R.id.galeriaBTN);
		camBTN= (Button)findViewById(R.id.camBTN);
		nombreET=(EditText)findViewById(R.id.nombreET);
		descripcionET=(EditText)findViewById(R.id.descripcionET);
		categoriaET=(EditText)findViewById(R.id.categoriaET);
		lugarET=(EditText)findViewById(R.id.lugarET);
		fechaTV=(TextView)findViewById(R.id.fechaLB);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.layout.cargarfoto, menu);
		return true;
	}
}
