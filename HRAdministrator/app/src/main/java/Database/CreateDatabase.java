package Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;


public class CreateDatabase extends SQLiteOpenHelper {
    public static  final String TB_PHONGBAN="PHONGBAN";
    public static  final String TB_PHONGBAN_ID="ID";
    public static  final String TB_PHONGBAN_STT="STT";
    public static  final String TB_PHONGBAN_MAPHONG="MAPHONG";
    public static  final String TB_PHONGBAN_TEN="TENPHONG";


    public CreateDatabase(@Nullable Context context) {


        super(context,"DB",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String tb_PhongBan= " CREATE TABLE " + TB_PHONGBAN + " ( " + TB_PHONGBAN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TB_PHONGBAN_STT + " TEXT, " + TB_PHONGBAN_MAPHONG + " TEXT, " + TB_PHONGBAN_TEN + " TEXT ) ";
        sqLiteDatabase.execSQL(tb_PhongBan);


    }

    /**
     * Called when the database needs to be upgraded. The implementation
     * should use this method to drop tables, add tables, or do anything else it
     * needs to upgrade to the new schema version.
     *
     * <p>
     * The SQLite ALTER TABLE documentation can be found
     * <a href="http://sqlite.org/lang_altertable.html">here</a>. If you add new columns
     * you can use ALTER TABLE to insert them into a live table. If you rename or remove columns
     * you can use ALTER TABLE to rename the old table, then create the new table and then
     * populate the new table with the contents of the old table.
     * </p><p>
     * This method executes within a transaction.  If an exception is thrown, all changes
     * will automatically be rolled back.
     * </p>
     *
     * @param db         The database.
     * @param oldVersion The old database version.
     * @param newVersion The new database version.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public  SQLiteDatabase Open() { return  this.getWritableDatabase(); }
}
