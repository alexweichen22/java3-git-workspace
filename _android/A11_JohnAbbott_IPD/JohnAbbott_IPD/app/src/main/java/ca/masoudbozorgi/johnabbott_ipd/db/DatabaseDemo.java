package ca.masoudbozorgi.johnabbott_ipd.db;

import android.content.ContentValues;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.Arrays;

import ca.masoudbozorgi.johnabbott_ipd.model.Flower;

public class DatabaseDemo {

    ArrayList<Flower> flowerArrayList;

    // Database .....................
    DBManager dbManager;
    Cursor cursor;
    //...............................

    Flower modelItem_0, modelItem_1, modelItem_2, modelItem_3, modelItem_4,
           modelItem_5, modelItem_6, modelItem_7, modelItem_8, modelItem_9 ;

    /*
    *  SQLite --> SQLiteDatabase -->                                          |--> Cursor        --> Array of Objects
    *       SQLiteOpenHelper [Create DB and Tables]  -->                      |
    *           sqLiteOpenHelper.getWritableDatabase() [Writable access to DB]|
    *                                                                         |
    *                                                                         |<-- ContentValue  <-- Java Object
    * */

    public DatabaseDemo(DBManager dbManager) {
        this.dbManager = dbManager;

        initializeModel();
        insertDummyDataToDB();
        readFromDB();
        deleteFromDB();
    }

    private void initializeModel() {
        flowerArrayList = new ArrayList<>();
        modelItem_0 = new Flower(2391, "Category 0", "Flower 0", "Some instruction for test reading from DB 0", 10, "california_snow.jpg");
        modelItem_1 = new Flower(2391, "Category 1", "Flower 1", "Some instruction for test reading from DB 1", 11, "princess_flower.jpg");
        modelItem_2 = new Flower(2392, "Category 2", "Flower 2", "Some instruction for test reading from DB 2", 12, "haight_ashbury.jpg");
        modelItem_3 = new Flower(2393, "Category 3", "Flower 3", "Some instruction for test reading from DB 3", 13, "mona_lavender.jpg");
        modelItem_4 = new Flower(2394, "Category 4", "Flower 4", "Some instruction for test reading from DB 4", 14, "camellia.jpg");
        modelItem_5 = new Flower(2395, "Category 5", "Flower 5", "Some instruction for test reading from DB 5", 15, "bougainvillea.jpg");
        modelItem_6 = new Flower(2396, "Category 6", "Flower 6", "Some instruction for test reading from DB 6", 16, "rosa_burgundy.jpg");
        modelItem_7 = new Flower(2397, "Category 7", "Flower 7", "Some instruction for test reading from DB 7", 17, "rosa_iceberg.jpg");
        modelItem_8 = new Flower(2398, "Category 8", "Flower 8", "Some instruction for test reading from DB 8", 18, "bonsai.jpg");
        modelItem_9 = new Flower(2399, "Category 9", "Flower 9", "Some instruction for test reading from DB 9", 19, "calibrachoa.jpg");

        flowerArrayList.addAll(Arrays.asList(modelItem_0, modelItem_1, modelItem_2, modelItem_3, modelItem_4, modelItem_5, modelItem_6,
                modelItem_7, modelItem_8, modelItem_9));
    }

    private void insertDummyDataToDB() {
        ArrayList<ContentValues> contentValuesArrayList = dbManager.javaObjectToContentValue(flowerArrayList);
        dbManager.insertInTable(SQLCommands.TABLE_NAME, contentValuesArrayList);
    }

    private Cursor readFromDB() {
        cursor = dbManager.queryInTable(
                SQLCommands.TABLE_NAME,
                SQLCommands.TABLE_COLUMNS,
                null,
                null);
        System.out.println("----------------------- Read from database after insertion");
        System.out.println(dbManager.cursorToArrayList(cursor));
        return  cursor;
    }

    private void deleteFromDB() {
        dbManager.deleteRowFromTable(SQLCommands.TABLE_NAME,
                SQLCommands.COLUMN_NAME + "=? OR " +
                        SQLCommands.COLUMN_NAME + "=?"
                , new String[]{"name8_db", "name9_db"});

        readFromDB();
    }
}