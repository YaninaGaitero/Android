package DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

import com.andyyani.registrodeelementos.Foto;

public class DAOfotos extends SQLiteOpenHelper{

	public DAOfotos(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String cmd="CREATE TABLE fotos(id INTEGER PRIMARY KEY AUTOINCREMENT,nombre TEXT UNIQUE, descripcion TEXT, categoria TEXT, lugar TEXT, fecha TEXT )";
		db.execSQL(cmd);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}
	
	public void insertarDatos(Foto foto){
		String cmd= "INSERT INTO fotos(nombre, descripcion,categoria,lugar,fecha)VALUES("+foto.getNombre()+","+foto.getDescripcion()+","+foto.getCategoria()+","+foto.getLugar()+","+foto.getFecha()+")";
		SQLiteDatabase baseDatos=getWritableDatabase();
		baseDatos.execSQL(cmd);
		baseDatos.close();
	}
	public Foto recuperarDatos(String nombre){
		Foto rta=null;
		SQLiteDatabase baseDatos= getWritableDatabase();
		String cmd="SELECT * FROM fotos WHERE nombre ="+nombre;
		Cursor cursor=baseDatos.rawQuery(cmd, null);
		if(cursor.getCount()==1){
			rta=new Foto();
			cursor.moveToNext();
			rta.setNombre(cursor.getString(1));
			rta.setDescripcion(cursor.getString(2));
			rta.setCategoria(cursor.getString(3));
			rta.setLugar(cursor.getString(4));
			rta.setFecha(cursor.getString(5));
			}
		return rta;
	}
}
