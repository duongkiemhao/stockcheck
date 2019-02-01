package com.siliconstack.stockcheck.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.siliconstack.stockcheck.model.LocationModel;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class LocationDAO_Impl implements LocationDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfLocationModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfLocationModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfLocationModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  public LocationDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLocationModel = new EntityInsertionAdapter<LocationModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `LocationModel`(`name`,`id`) VALUES (?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocationModel value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        stmt.bindLong(2, value.getId());
      }
    };
    this.__deletionAdapterOfLocationModel = new EntityDeletionOrUpdateAdapter<LocationModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `LocationModel` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocationModel value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfLocationModel = new EntityDeletionOrUpdateAdapter<LocationModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `LocationModel` SET `name` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocationModel value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        stmt.bindLong(2, value.getId());
        stmt.bindLong(3, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from LocationModel";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from LocationModel where id =?";
        return _query;
      }
    };
  }

  @Override
  public void addRow(LocationModel locationModel) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfLocationModel.insert(locationModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteRow(LocationModel locationModel) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfLocationModel.handle(locationModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateRow(LocationModel locationModel) {
    __db.beginTransaction();
    try {
      __updateAdapterOfLocationModel.handle(locationModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public void deleteById(int id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, id);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteById.release(_stmt);
    }
  }

  @Override
  public List<LocationModel> getAll() {
    final String _sql = "select * from LocationModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final List<LocationModel> _result = new ArrayList<LocationModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final LocationModel _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item = new LocationModel(_tmpName,_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
