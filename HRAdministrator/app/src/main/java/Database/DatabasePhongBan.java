package Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import Model.PhongBan;


    public class DatabasePhongBan {
    SQLiteDatabase database;
    String TB="TAB";
    public DatabasePhongBan(Context context){
        CreateDatabase createDatabase = new CreateDatabase(context);
        database = createDatabase.Open();
    }
    public  long ThemPhong(PhongBan phongBan){
        ContentValues contentValues = new ContentValues();
        //id khong can them tai vi id se tu dong tang
        contentValues.put(CreateDatabase.TB_PHONGBAN_STT,phongBan.getStt());
        contentValues.put(CreateDatabase.TB_PHONGBAN_MAPHONG,phongBan.getMaphong());
        contentValues.put(CreateDatabase.TB_PHONGBAN_TEN,phongBan.getTenphong());
        long check = database.insert(CreateDatabase.TB_PHONGBAN,null,contentValues);
        return check;
    }
    public List<PhongBan> layDSPhong()
    {
        List<PhongBan> list = new ArrayList<>();
        String TruyVan= " SELECT * FROM " + CreateDatabase.TB_PHONGBAN;
        //cursor: là con trỏ item đầu tiên
        Cursor cursor=database.rawQuery(TruyVan,null);
        cursor.moveToFirst();
        while ((!cursor.isAfterLast()))
        {
            PhongBan phongBan=new PhongBan();
            phongBan.setId(cursor.getInt(cursor.getColumnIndex(CreateDatabase.TB_PHONGBAN_ID)));
            phongBan.setStt(cursor.getString(cursor.getColumnIndex(CreateDatabase.TB_PHONGBAN_TEN)));
            phongBan.setMaphong(cursor.getString(cursor.getColumnIndex(CreateDatabase.TB_PHONGBAN_MAPHONG)));
            phongBan.setTenphong(cursor.getString(cursor.getColumnIndex(CreateDatabase.TB_PHONGBAN_TEN)));
            list.add(phongBan);
            cursor.moveToNext();
        }
        return  list;
    }

    public boolean DeleteItem(int id)
    {
        long check = database.delete(CreateDatabase.TB_PHONGBAN,CreateDatabase.TB_PHONGBAN_ID+" = " + id, null);
        if (check != 0)
        {
            return  true;
        }
        return false;
    }

    public boolean EditItem(int id,PhongBan phongBan)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CreateDatabase.TB_PHONGBAN_STT,phongBan.getStt());
        contentValues.put(CreateDatabase.TB_PHONGBAN_MAPHONG,phongBan.getMaphong());
        contentValues.put(CreateDatabase.TB_PHONGBAN_TEN,phongBan.getTenphong());
        long check = database.update(CreateDatabase.TB_PHONGBAN,contentValues,CreateDatabase.TB_PHONGBAN_ID + " = "+ id,null);
        if (check != 0)
        {
            return  true;
        }
        return false;
    }

}
