package cdw.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cdw.mapper.RemoveMapper;
import cdw.pojo.Data;
import cdw.service.RemoveService;
@Service
@Transactional
public class RemoveDataServiceImp implements RemoveService {
	@Autowired
	private RemoveMapper removeMapper;
	public void RemoveData() {
		//获取原表数据
		List<Data> data = removeMapper.selectData();
		

		//数据处理
		for (Data data2 : data) {
			//设置发生额
			String jdbz = data2.getJdbz();
			Double fse = data2.getFse();
			if(jdbz.equals("1"))
				data2.setFse(0-fse-fse);
			
			//设置冲账标识
			String jylx = data2.getJylx();
			if(jylx.equals("1"))
				data2.setCzbz("01");
			else
				data2.setCzbz("02");
			
			//设置业务流水号
			String mxbc = data2.getMxbc();
			String a="0000"+mxbc.trim();
			String ywlsh = a.substring(a.length()-4, a.length());
			data2.setYwlsh(ywlsh);
			
			//设置借贷标志
			if(jdbz.equals("1"))
				data2.setJdbz("01");
			else
				data2.setJdbz("02");
			
			

		}
		
		//将数据插入新表
		removeMapper.insertData(data);
	}

}
