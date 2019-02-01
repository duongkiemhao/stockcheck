package com.siliconstack.stockcheck.dao;

import android.arch.persistence.db.SupportSQLiteQuery;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.arch.persistence.room.util.StringUtil;
import android.database.Cursor;
import com.siliconstack.stockcheck.model.MainDTO;
import com.siliconstack.stockcheck.model.MainModel;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class MainDAO_Impl implements MainDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMainModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfMainModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfMainModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  public MainDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMainModel = new EntityInsertionAdapter<MainModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `MainModel`(`id`,`scanText`,`timestamp`,`locationID`,`floorID`,`operatorID`,`bayNumber`,`scanTextTypeId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MainModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getScanText() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getScanText());
        }
        stmt.bindLong(3, value.getTimestamp());
        if (value.getLocationID() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getLocationID());
        }
        if (value.getFloorID() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getFloorID());
        }
        if (value.getOperatorID() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getOperatorID());
        }
        if (value.getBayNumber() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBayNumber());
        }
        if (value.getScanTextTypeId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getScanTextTypeId());
        }
      }
    };
    this.__deletionAdapterOfMainModel = new EntityDeletionOrUpdateAdapter<MainModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `MainModel` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MainModel value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfMainModel = new EntityDeletionOrUpdateAdapter<MainModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `MainModel` SET `id` = ?,`scanText` = ?,`timestamp` = ?,`locationID` = ?,`floorID` = ?,`operatorID` = ?,`bayNumber` = ?,`scanTextTypeId` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MainModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getScanText() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getScanText());
        }
        stmt.bindLong(3, value.getTimestamp());
        if (value.getLocationID() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getLocationID());
        }
        if (value.getFloorID() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getFloorID());
        }
        if (value.getOperatorID() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getOperatorID());
        }
        if (value.getBayNumber() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBayNumber());
        }
        if (value.getScanTextTypeId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getScanTextTypeId());
        }
        stmt.bindLong(9, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from MainModel";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from MainModel where id =?";
        return _query;
      }
    };
  }

  @Override
  public void addRow(MainModel mainModel) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMainModel.insert(mainModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteRow(MainModel mainModel) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfMainModel.handle(mainModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateRow(MainModel mainModel) {
    __db.beginTransaction();
    try {
      __updateAdapterOfMainModel.handle(mainModel);
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
  public void deleteByIds(int[] ids) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("delete from MainModel where id IN(");
    final int _inputSize = ids.length;
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
    int _argIndex = 1;
    for (int _item : ids) {
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<MainDTO> query(SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    final Cursor _cursor = __db.query(_internalQuery);
    try {
      final int _cursorIndexOfIsDesc = _cursor.getColumnIndex("isDesc");
      final int _cursorIndexOfId = _cursor.getColumnIndex("id");
      final int _cursorIndexOfScanText = _cursor.getColumnIndex("scanText");
      final int _cursorIndexOfTimestamp = _cursor.getColumnIndex("timestamp");
      final int _cursorIndexOfType = _cursor.getColumnIndex("type");
      final int _cursorIndexOfLocationID = _cursor.getColumnIndex("locationID");
      final int _cursorIndexOfLocationName = _cursor.getColumnIndex("locationName");
      final int _cursorIndexOfFloorID = _cursor.getColumnIndex("floorID");
      final int _cursorIndexOfFloorName = _cursor.getColumnIndex("floorName");
      final int _cursorIndexOfOperatorID = _cursor.getColumnIndex("operatorID");
      final int _cursorIndexOfOperatorName = _cursor.getColumnIndex("operatorName");
      final int _cursorIndexOfBayNumber = _cursor.getColumnIndex("bayNumber");
      final int _cursorIndexOfDateString = _cursor.getColumnIndex("dateString");
      final int _cursorIndexOfIsSelected = _cursor.getColumnIndex("isSelected");
      final int _cursorIndexOfCompareTime = _cursor.getColumnIndex("compareTime");
      final int _cursorIndexOfCompareTimeFullStr = _cursor.getColumnIndex("compareTimeFullStr");
      final int _cursorIndexOfImage = _cursor.getColumnIndex("image");
      final int _cursorIndexOfLat = _cursor.getColumnIndex("lat");
      final int _cursorIndexOfLng = _cursor.getColumnIndex("lng");
      final List<MainDTO> _result = new ArrayList<MainDTO>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MainDTO _item;
        _item = new MainDTO();
        if (_cursorIndexOfIsDesc != -1) {
          final boolean _tmpIsDesc;
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfIsDesc);
          _tmpIsDesc = _tmp != 0;
          _item.setDesc(_tmpIsDesc);
        }
        if (_cursorIndexOfId != -1) {
          final Integer _tmpId;
          if (_cursor.isNull(_cursorIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = _cursor.getInt(_cursorIndexOfId);
          }
          _item.setId(_tmpId);
        }
        if (_cursorIndexOfScanText != -1) {
          final String _tmpScanText;
          _tmpScanText = _cursor.getString(_cursorIndexOfScanText);
          _item.setScanText(_tmpScanText);
        }
        if (_cursorIndexOfTimestamp != -1) {
          final Long _tmpTimestamp;
          if (_cursor.isNull(_cursorIndexOfTimestamp)) {
            _tmpTimestamp = null;
          } else {
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
          }
          _item.setTimestamp(_tmpTimestamp);
        }
        if (_cursorIndexOfType != -1) {
          final Integer _tmpType;
          if (_cursor.isNull(_cursorIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = _cursor.getInt(_cursorIndexOfType);
          }
          _item.setType(_tmpType);
        }
        if (_cursorIndexOfLocationID != -1) {
          final Integer _tmpLocationID;
          if (_cursor.isNull(_cursorIndexOfLocationID)) {
            _tmpLocationID = null;
          } else {
            _tmpLocationID = _cursor.getInt(_cursorIndexOfLocationID);
          }
          _item.setLocationID(_tmpLocationID);
        }
        if (_cursorIndexOfLocationName != -1) {
          final String _tmpLocationName;
          _tmpLocationName = _cursor.getString(_cursorIndexOfLocationName);
          _item.setLocationName(_tmpLocationName);
        }
        if (_cursorIndexOfFloorID != -1) {
          final Integer _tmpFloorID;
          if (_cursor.isNull(_cursorIndexOfFloorID)) {
            _tmpFloorID = null;
          } else {
            _tmpFloorID = _cursor.getInt(_cursorIndexOfFloorID);
          }
          _item.setFloorID(_tmpFloorID);
        }
        if (_cursorIndexOfFloorName != -1) {
          final String _tmpFloorName;
          _tmpFloorName = _cursor.getString(_cursorIndexOfFloorName);
          _item.setFloorName(_tmpFloorName);
        }
        if (_cursorIndexOfOperatorID != -1) {
          final Integer _tmpOperatorID;
          if (_cursor.isNull(_cursorIndexOfOperatorID)) {
            _tmpOperatorID = null;
          } else {
            _tmpOperatorID = _cursor.getInt(_cursorIndexOfOperatorID);
          }
          _item.setOperatorID(_tmpOperatorID);
        }
        if (_cursorIndexOfOperatorName != -1) {
          final String _tmpOperatorName;
          _tmpOperatorName = _cursor.getString(_cursorIndexOfOperatorName);
          _item.setOperatorName(_tmpOperatorName);
        }
        if (_cursorIndexOfBayNumber != -1) {
          final String _tmpBayNumber;
          _tmpBayNumber = _cursor.getString(_cursorIndexOfBayNumber);
          _item.setBayNumber(_tmpBayNumber);
        }
        if (_cursorIndexOfDateString != -1) {
          final String _tmpDateString;
          _tmpDateString = _cursor.getString(_cursorIndexOfDateString);
          _item.setDateString(_tmpDateString);
        }
        if (_cursorIndexOfIsSelected != -1) {
          final boolean _tmpIsSelected;
          final int _tmp_1;
          _tmp_1 = _cursor.getInt(_cursorIndexOfIsSelected);
          _tmpIsSelected = _tmp_1 != 0;
          _item.setSelected(_tmpIsSelected);
        }
        if (_cursorIndexOfCompareTime != -1) {
          final String _tmpCompareTime;
          _tmpCompareTime = _cursor.getString(_cursorIndexOfCompareTime);
          _item.setCompareTime(_tmpCompareTime);
        }
        if (_cursorIndexOfCompareTimeFullStr != -1) {
          final String _tmpCompareTimeFullStr;
          _tmpCompareTimeFullStr = _cursor.getString(_cursorIndexOfCompareTimeFullStr);
          _item.setCompareTimeFullStr(_tmpCompareTimeFullStr);
        }
        if (_cursorIndexOfImage != -1) {
          final String _tmpImage;
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
          _item.setImage(_tmpImage);
        }
        if (_cursorIndexOfLat != -1) {
          final Double _tmpLat;
          if (_cursor.isNull(_cursorIndexOfLat)) {
            _tmpLat = null;
          } else {
            _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
          }
          _item.setLat(_tmpLat);
        }
        if (_cursorIndexOfLng != -1) {
          final Double _tmpLng;
          if (_cursor.isNull(_cursorIndexOfLng)) {
            _tmpLng = null;
          } else {
            _tmpLng = _cursor.getDouble(_cursorIndexOfLng);
          }
          _item.setLng(_tmpLng);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
    }
  }
}
