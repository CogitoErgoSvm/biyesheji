package www.hw.top.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.hw.top.dao.ProjectDao;
import www.hw.top.pojo.Project;
import www.hw.top.service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	public ProjectDao projectdao;
	@Override
	public int delById(Integer id) {
		return projectdao.delById(id);
	}

	@Override
	public int save(Project record) {
		return projectdao.save(record);
	}
	
	@Override
	public int getCount () {
		return projectdao.getCount();
	}

	@Override
	public Project getById(Integer id) {
		return projectdao.getById(id);
	}


	@Override
	public int editById(Project record) {
		return projectdao.editById(record);
	}

	@Override
	public List<Project> list(int page, int limit) {
		return  projectdao.list(page, limit);
	}

}
