package www.hw.top.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.hw.top.dao.ResourceDao;
import www.hw.top.pojo.Resource;
import www.hw.top.service.ResourceService;
@Service
public class ResourceServiceImpl implements ResourceService{

	@Autowired
	public ResourceDao resourcedao;
	@Override
	public int delById(Integer id) {
		return resourcedao.delById(id);
	}

	@Override
	public int save(Resource record) {
		return resourcedao.save(record);
	}
	
	@Override
	public int getCount () {
		return resourcedao.getCount();
	}

	@Override
	public Resource getById(Integer id) {
		return resourcedao.getById(id);
	}


	@Override
	public int editById(Resource record) {
		return resourcedao.editById(record);
	}

	@Override
	public List<Resource> list(int page, int limit) {
		return  resourcedao.list(page, limit);
	}

}
