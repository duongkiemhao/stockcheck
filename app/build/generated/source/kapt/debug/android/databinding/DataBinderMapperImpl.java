package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.siliconstack.stockcheck.DataBinderMapperImpl());
  }
}
