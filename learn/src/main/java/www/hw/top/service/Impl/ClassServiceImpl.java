package www.hw.top.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.hw.top.dao.ClassDao;
import www.hw.top.pojo.Class;
import www.hw.top.service.ClassService;
@Service
public class ClassServiceImpl implements ClassService{

	@Autowired
	public ClassDao classdao;
	@Override
	public int delById(Integer id) {
		return classdao.delById(id);
	}

	@Override
	public int save(Class record) {
		return classdao.save(record);
	}
	
	@Override
	public int getCount () {
		return classdao.getCount();
	}

	@Override
	public Class getById(Integer id) {
		return classdao.getById(id);
	}


	@Override
	public int editById(Class record) {
		return classdao.editById(record);
	}

	@Override
	public List<Class> list(int page, int limit) {
		return  classdao.list(page, limit);
	}

}
