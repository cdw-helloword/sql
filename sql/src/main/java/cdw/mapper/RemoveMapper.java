package cdw.mapper;

import java.util.List;

import cdw.pojo.Data;

public interface RemoveMapper {
	//查询原表数据
	public  List<Data> selectData();
	
	//将数据插入新表
	public void insertData(List<Data> data);

}
