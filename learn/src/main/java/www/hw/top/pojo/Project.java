package www.hw.top.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include; 
import cn.afterturn.easypoi.excel.annotation.Excel;
import io.swagger.annotations.ApiModelProperty;
@JsonInclude(Include.NON_NULL)

/**Project*/
public class Project implements Serializable {
	/***/
	private Integer id;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String pName;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String pStartTime;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String pEndTime;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String pFilePath;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String pState;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String pHeadman;
	

    private static final long serialVersionUID = 1L;


	public Integer getId () {   
		return id;
	}
		
	public void setId (Integer id) {
		this.id= id ;
	}
    public String getPName () {   
    	 return pName;
    }

    public void setPName (String pName) {
    	 this.pName= pName == null ? null : pName.trim();
    }

    public String getPStartTime () {   
    	 return pStartTime;
    }

    public void setPStartTime (String pStartTime) {
    	 this.pStartTime= pStartTime == null ? null : pStartTime.trim();
    }

    public String getPEndTime () {   
    	 return pEndTime;
    }

    public void setPEndTime (String pEndTime) {
    	 this.pEndTime= pEndTime == null ? null : pEndTime.trim();
    }

    public String getPFilePath () {   
    	 return pFilePath;
    }

    public void setPFilePath (String pFilePath) {
    	 this.pFilePath= pFilePath == null ? null : pFilePath.trim();
    }

    public String getPState () {   
    	 return pState;
    }

    public void setPState (String pState) {
    	 this.pState= pState == null ? null : pState.trim();
    }

    public String getPHeadman () {   
    	 return pHeadman;
    }

    public void setPHeadman (String pHeadman) {
    	 this.pHeadman= pHeadman == null ? null : pHeadman.trim();
    }

}