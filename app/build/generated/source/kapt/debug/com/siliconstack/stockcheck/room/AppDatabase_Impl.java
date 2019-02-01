package com.siliconstack.stockcheck.room;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import com.siliconstack.stockcheck.dao.FloorDAO;
import com.siliconstack.stockcheck.dao.FloorDAO_Impl;
import com.siliconstack.stockcheck.dao.LocationDAO;
import com.siliconstack.stockcheck.dao.LocationDAO_Impl;
import com.siliconstack.stockcheck.dao.MainDAO;
import com.siliconstack.stockcheck.dao.MainDAO_Impl;
import com.siliconstack.stockcheck.dao.NameDAO;
import com.siliconstack.stockcheck.dao.NameDAO_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class AppDatabase_Impl extends AppDatabase {
  private volatile MainDAO _mainDAO;

  private volatile LocationDAO _locationDAO;

  private volatile FloorDAO _floorDAO;

  private volatile NameDAO _nameDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `MainModel` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scanText` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `locationID` INTEGER, `floorID` INTEGER, `operatorID` INTEGER, `bayNumber` TEXT, `scanTextTypeId` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `LocationModel` (`name` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `FloorModel` (`name` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `OperatorModel` (`name` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c9d4f416b5877aa98dd3661bf5e1a583\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `MainModel`");
        _db.execSQL("DROP TABLE IF EXISTS `LocationModel`");
        _db.execSQL("DROP TABLE IF EXISTS `FloorModel`");
        _db.execSQL("DROP TABLE IF EXISTS `OperatorModel`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMainModel = new HashMap<String, TableInfo.Column>(8);
        _columnsMainModel.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsMainModel.put("scanText", new TableInfo.Column("scanText", "TEXT", true, 0));
        _columnsMainModel.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0));
        _columnsMainModel.put("locationID", new TableInfo.Column("locationID", "INTEGER", false, 0));
        _columnsMainModel.put("floorID", new TableInfo.Column("floorID", "INTEGER", false, 0));
        _columnsMainModel.put("operatorID", new TableInfo.Column("operatorID", "INTEGER", false, 0));
        _columnsMainModel.put("bayNumber", new TableInfo.Column("bayNumber", "TEXT", false, 0));
        _columnsMainModel.put("scanTextTypeId", new TableInfo.Column("scanTextTypeId", "INTEGER", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMainModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMainModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMainModel = new TableInfo("MainModel", _columnsMainModel, _foreignKeysMainModel, _indicesMainModel);
        final TableInfo _existingMainModel = TableInfo.read(_db, "MainModel");
        if (! _infoMainModel.equals(_existingMainModel)) {
          throw new IllegalStateException("Migration didn't properly handle MainModel(com.siliconstack.stockcheck.model.MainModel).\n"
                  + " Expected:\n" + _infoMainModel + "\n"
                  + " Found:\n" + _existingMainModel);
        }
        final HashMap<String, TableInfo.Column> _columnsLocationModel = new HashMap<String, TableInfo.Column>(2);
        _columnsLocationModel.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsLocationModel.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLocationModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLocationModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLocationModel = new TableInfo("LocationModel", _columnsLocationModel, _foreignKeysLocationModel, _indicesLocationModel);
        final TableInfo _existingLocationModel = TableInfo.read(_db, "LocationModel");
        if (! _infoLocationModel.equals(_existingLocationModel)) {
          throw new IllegalStateException("Migration didn't properly handle LocationModel(com.siliconstack.stockcheck.model.LocationModel).\n"
                  + " Expected:\n" + _infoLocationModel + "\n"
                  + " Found:\n" + _existingLocationModel);
        }
        final HashMap<String, TableInfo.Column> _columnsFloorModel = new HashMap<String, TableInfo.Column>(2);
        _columnsFloorModel.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsFloorModel.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFloorModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFloorModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFloorModel = new TableInfo("FloorModel", _columnsFloorModel, _foreignKeysFloorModel, _indicesFloorModel);
        final TableInfo _existingFloorModel = TableInfo.read(_db, "FloorModel");
        if (! _infoFloorModel.equals(_existingFloorModel)) {
          throw new IllegalStateException("Migration didn't properly handle FloorModel(com.siliconstack.stockcheck.model.FloorModel).\n"
                  + " Expected:\n" + _infoFloorModel + "\n"
                  + " Found:\n" + _existingFloorModel);
        }
        final HashMap<String, TableInfo.Column> _columnsOperatorModel = new HashMap<String, TableInfo.Column>(2);
        _columnsOperatorModel.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsOperatorModel.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOperatorModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOperatorModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOperatorModel = new TableInfo("OperatorModel", _columnsOperatorModel, _foreignKeysOperatorModel, _indicesOperatorModel);
        final TableInfo _existingOperatorModel = TableInfo.read(_db, "OperatorModel");
        if (! _infoOperatorModel.equals(_existingOperatorModel)) {
          throw new IllegalStateException("Migration didn't properly handle OperatorModel(com.siliconstack.stockcheck.model.OperatorModel).\n"
                  + " Expected:\n" + _infoOperatorModel + "\n"
                  + " Found:\n" + _existingOperatorModel);
        }
      }
    }, "c9d4f416b5877aa98dd3661bf5e1a583", "d25ff649c32300a15bebdbf02d9740de");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "MainModel","LocationModel","FloorModel","OperatorModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `MainModel`");
      _db.execSQL("DELETE FROM `LocationModel`");
      _db.execSQL("DELETE FROM `FloorModel`");
      _db.execSQL("DELETE FROM `OperatorModel`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MainDAO mainDAO() {
    if (_mainDAO != null) {
      return _mainDAO;
    } else {
      synchronized(this) {
        if(_mainDAO == null) {
          _mainDAO = new MainDAO_Impl(this);
        }
        return _mainDAO;
      }
    }
  }

  @Override
  public LocationDAO locationDAO() {
    if (_locationDAO != null) {
      return _locationDAO;
    } else {
      synchronized(this) {
        if(_locationDAO == null) {
          _locationDAO = new LocationDAO_Impl(this);
        }
        return _locationDAO;
      }
    }
  }

  @Override
  public FloorDAO floorDAO() {
    if (_floorDAO != null) {
      return _floorDAO;
    } else {
      synchronized(this) {
        if(_floorDAO == null) {
          _floorDAO = new FloorDAO_Impl(this);
        }
        return _floorDAO;
      }
    }
  }

  @Override
  public NameDAO nameDAO() {
    if (_nameDAO != null) {
      return _nameDAO;
    } else {
      synchronized(this) {
        if(_nameDAO == null) {
          _nameDAO = new NameDAO_Impl(this);
        }
        return _nameDAO;
      }
    }
  }
}
