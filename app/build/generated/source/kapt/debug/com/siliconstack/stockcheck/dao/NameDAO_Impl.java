package com.siliconstack.stockcheck.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.siliconstack.stockcheck.model.OperatorModel;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class NameDAO_Impl implements NameDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfOperatorModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfOperatorModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfOperatorModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  public NameDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOperatorModel = new EntityInsertionAdapter<OperatorModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `OperatorModel`(`name`,`id`) VALUES (?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OperatorModel value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        stmt.bindLong(2, value.getId());
      }
    };
    this.__deletionAdapterOfOperatorModel = new EntityDeletionOrUpdateAdapter<OperatorModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `OperatorModel` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OperatorModel value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfOperatorModel = new EntityDeletionOrUpdateAdapter<OperatorModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `OperatorModel` SET `name` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OperatorModel value) {
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
        final String _query = "delete from OperatorModel";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from OperatorModel where id =?";
        return _query;
      }
    };
  }

  @Override
  public void addRow(OperatorModel operatorModel) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfOperatorModel.insert(operatorModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteRow(OperatorModel operatorModel) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfOperatorModel.handle(operatorModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateRow(OperatorModel operatorModel) {
    __db.beginTransaction();
    try {
      __updateAdapterOfOperatorModel.handle(operatorModel);
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
  public List<OperatorModel> getAll() {
    final String _sql = "select * from OperatorModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final List<OperatorModel> _result = new ArrayList<OperatorModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OperatorModel _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item = new OperatorModel(_tmpName,_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
