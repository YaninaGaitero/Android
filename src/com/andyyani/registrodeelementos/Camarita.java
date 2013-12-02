package com.andyyani.registrodeelementos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Camarita extends Activity {

	Button cargarBTN;
	Button buscarBTN;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_camarita);
		levantarXML();//recordar nunca antes del oncreate
		asignarEventos();
	}
	public void levantarXML(){
		cargarBTN= (Button)findViewById(R.id.cargarBTN);
		buscarBTN=(Button)findViewById(R.id.buscarBTN);
	}
	public void asignarEventos(){
		cargarBTN.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent accion=new Intent(Camarita.this,cargarFoto.class);
				startActivity(accion);
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.camarita, menu);
		return true;
	}

}
