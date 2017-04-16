package db;

import android.R.integer;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	/**
	 * Province�������
	 */
	public static final String CREATE_PROVINCE = "create table Province ("
			+ "id integer primary key autoincrement, " + "province_name text, "
			+ "province_code text)";
	/**
	 * City�������
	 */
	public static final String CREATE_CITY = "create table City ("
			+ "id integer primary key autoincrement, " + "city_name text, "
			+ "city_code text, " + "province_id integer)";
	/**
	 * County�������
	 */
	public static final String CREATE_COUNTY = "create table County ("
			+ "id integer primary key autoincrement, " + "county_name text, "
			+ "county_code text, " + "city_id integer)";

	public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version) {
		// TODO Auto-generated constructor stub
		super(context, name, factory, version);
	}
	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		arg0.execSQL(CREATE_PROVINCE); // ����Province��
		arg0.execSQL(CREATE_CITY); // ����City��
		arg0.execSQL(CREATE_COUNTY); // ����County��
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
