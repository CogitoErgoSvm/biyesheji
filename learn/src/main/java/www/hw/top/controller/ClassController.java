package www.hw.top.controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import www.hw.top.util.ResultResponse;
import io.swagger.annotations.Api; 
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import www.hw.top.pojo.Class;
import www.hw.top.util.ResultResponse;
import www.hw.top.service.ClassService;
import com.github.pagehelper.PageInfo;
@Api(tags = "Class")
@RestController
@Validated
@RequestMapping("/Class")
public class ClassController {

	@Autowired
	public ClassService classService;
	
	@ApiOperation(value="删除记录")
	@DeleteMapping(value="/del/{id}")
	public ResultResponse<Class> delById(
	@ApiParam(required=true,value="查询编号") @PathVariable Integer id) {
		  classService.delById(id);
    return new ResultResponse<Class>(0,"删除成功", null);
	}

	@ApiOperation(value="新增记录")
	@PostMapping(value="/add")
	@ApiParam(required = true, value = "添加Class")
	public ResultResponse<Class>  save(@ApiParam(required = true, value = "添加Class")@Valid  @RequestBody Class record) {
	 classService.save(record);
	 return new ResultResponse<Class>(0,"新增成功", record);
	}

	@ApiOperation(value = "根据ID查询记录") 
	@GetMapping(value = "/get/{id}")
	public ResultResponse<Class> getById(
			@ApiParam(required = true, value = "查询编号")
			@PathVariable Integer id) {
			
			Class record=classService.getById(id);
		return new ResultResponse<Class>(0,"查询成功", record);
	}

	@ApiParam(required = true , value = "修改内容")
	@PutMapping(value = "/edit") 
	public ResultResponse<Class>  editById(@ApiParam(required=true,value="修改Class") @Valid @RequestBody Class record) {
	
		  classService.editById(record);
	
		 return  new ResultResponse<Class>(0,"修改成功", record);
	}
 
	
	@ApiOperation(value = "详细列表查询") 
	@PutMapping(value = "/list")
	public  ResultResponse list(@ApiParam(required=true,value="查询Demo")@RequestParam(value = "page", required = false) int page,
			@RequestParam(value = "limit", required = false) int limit) {
	 List<Class> list =   classService.list((page-1)*limit,limit);
     int count=classService.getCount();
     return  new ResultResponse (0,count,"查询成功", list);
	}

}
