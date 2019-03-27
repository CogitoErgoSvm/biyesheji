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

/**Resource*/
public class Resource implements Serializable {
	/***/
	private Integer id;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String rName;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String rType;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String rFilePath;
	
	/***/
	private Date rSendTime;
	

    private static final long serialVersionUID = 1L;


	public Integer getId () {   
		return id;
	}
		
	public void setId (Integer id) {
		this.id= id ;
	}
    public String getRName () {   
    	 return rName;
    }

    public void setRName (String rName) {
    	 this.rName= rName == null ? null : rName.trim();
    }

    public String getRType () {   
    	 return rType;
    }

    public void setRType (String rType) {
    	 this.rType= rType == null ? null : rType.trim();
    }

    public String getRFilePath () {   
    	 return rFilePath;
    }

    public void setRFilePath (String rFilePath) {
    	 this.rFilePath= rFilePath == null ? null : rFilePath.trim();
    }


	public Date getRSendTime () {   
	    return rSendTime;
	}

	public void setRSendTime (Date rSendTime) {
	    this.rSendTime= rSendTime;
	}
}