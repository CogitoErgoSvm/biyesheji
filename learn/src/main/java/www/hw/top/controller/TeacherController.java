package www.hw.top.controller;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.ibatis.annotations.Param;
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
import www.hw.top.pojo.Teacher;
import www.hw.top.util.ResultResponse;
import www.hw.top.service.TeacherService;

import com.github.pagehelper.PageInfo;
@Api(tags = "Teacher")
@RestController
@Validated
@RequestMapping("/Teacher")
public class TeacherController {

	@Autowired
	public TeacherService teacherService;
	
	@ApiOperation(value="删除记录")
	@DeleteMapping(value="/del/{id}")
	public ResultResponse<Teacher> delById(
	@ApiParam(required=true,value="查询编号") @PathVariable Integer id) {
		  teacherService.delById(id);
    return new ResultResponse<Teacher>(0,"删除成功", null);
	}

	@ApiOperation(value="新增记录")
	@PostMapping(value="/add")
	@ApiParam(required = true, value = "添加Teacher")
	public ResultResponse<Teacher>  save(@ApiParam(required = true, value = "添加Teacher")@Valid  @RequestBody Teacher record) {
	 teacherService.save(record);
	 return new ResultResponse<Teacher>(0,"新增成功", record);
	}

	@ApiOperation(value = "根据ID查询记录") 
	@GetMapping(value = "/get/{id}")
	public ResultResponse<Teacher> getById(
			@ApiParam(required = true, value = "查询编号")
			@PathVariable Integer id) {
			
			Teacher record=teacherService.getById(id);
		return new ResultResponse<Teacher>(0,"查询成功", record);
	}

	@ApiParam(required = true , value = "修改内容")
	@PutMapping(value = "/edit") 
	public ResultResponse<Teacher>  editById(@ApiParam(required=true,value="修改Teacher") @Valid @RequestBody Teacher record) {
	
		  teacherService.editById(record);
	
		 return  new ResultResponse<Teacher>(0,"修改成功", record);
	}
 
	
	@ApiOperation(value = "详细列表查询") 
	@PutMapping(value = "/list")
	public  ResultResponse list(@ApiParam(required=true,value="查询Demo")@RequestParam(value = "page", required = false) int page,
			@RequestParam(value = "limit", required = false) int limit) {
	 List<Teacher> list =   teacherService.list((page-1)*limit,limit);
     int count=teacherService.getCount();
     return  new ResultResponse (0,count,"查询成功", list);
	}
	
	@ApiOperation(value = "教师登录")
	@PostMapping("/Teacherlogin")
	public Map Teacherlogin(@ApiParam(required = true , value = "教师登录") @RequestBody @Valid Teacher teacher)
	{
		Teacher Teacherlogin = new Teacher();
		Teacherlogin = teacherService.loginTeacher(teacher.getTUsername(), teacher.getTPassword());
		
		Map msg = new HashMap();
		if(Teacherlogin != null)
		{
			msg.put("msg",Teacherlogin);
			return msg;
		}
		else
		{
			msg.put("msg", "登录失败！请检查用户名或者密码");
			return msg;
		}
		
		
	}
}
