package fpoly.hungph53757.duanprostore.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import fpoly.hungph53757.duanprostore.Database.UserHelper;

public class UserDao {
    private UserHelper userHelper;
    public UserDao(Context context) {
        userHelper = new UserHelper(context);
    }

    public boolean insertUser(String username,String email, String password) {
        SQLiteDatabase db = userHelper.getWritableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM users WHERE email = ?", new String[]{email});
        if (cursor.getCount() > 0){
            cursor.close();
            return false;
        }
        ContentValues values = new ContentValues();
        values.put("username",username);
        values.put("email",email);
        values.put("password",password);

        long result = db.insert("users", null, values);
        return result != -1;
    }
    public boolean checkLogin(String email, String password) {
        SQLiteDatabase db = userHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery(
                "SELECT * FROM users WHERE email = ? AND password = ?",
                new String[]{email, password}
        );
        boolean result = cursor.getCount() > 0;
        cursor.close();
        return result;
    }
}
