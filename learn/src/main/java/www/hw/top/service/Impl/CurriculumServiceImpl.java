package www.hw.top.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.hw.top.dao.CurriculumDao;
import www.hw.top.pojo.Curriculum;
import www.hw.top.service.CurriculumService;
@Service
public class CurriculumServiceImpl implements CurriculumService{

	@Autowired
	public CurriculumDao curriculumdao;
	@Override
	public int delById(Integer id) {
		return curriculumdao.delById(id);
	}

	@Override
	public int save(Curriculum record) {
		return curriculumdao.save(record);
	}
	
	@Override
	public int getCount () {
		return curriculumdao.getCount();
	}

	@Override
	public Curriculum getById(Integer id) {
		return curriculumdao.getById(id);
	}


	@Override
	public int editById(Curriculum record) {
		return curriculumdao.editById(record);
	}

	@Override
	public List<Curriculum> list(int page, int limit) {
		return  curriculumdao.list(page, limit);
	}

}
