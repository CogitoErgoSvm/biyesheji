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

/**Student*/
public class Student implements Serializable {
	/***/
	private Integer id;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String sName;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String sUsername;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String sPassword;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String sNumber;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String sSex;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String sTelephone;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String sIsTutor;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String sIsHeadman;
	

    private static final long serialVersionUID = 1L;


	public Integer getId () {   
		return id;
	}
		
	public void setId (Integer id) {
		this.id= id ;
	}
    public String getSName () {   
    	 return sName;
    }

    public void setSName (String sName) {
    	 this.sName= sName == null ? null : sName.trim();
    }

    public String getSUsername () {   
    	 return sUsername;
    }

    public void setSUsername (String sUsername) {
    	 this.sUsername= sUsername == null ? null : sUsername.trim();
    }

    public String getSPassword () {   
    	 return sPassword;
    }

    public void setSPassword (String sPassword) {
    	 this.sPassword= sPassword == null ? null : sPassword.trim();
    }

    public String getSNumber () {   
    	 return sNumber;
    }

    public void setSNumber (String sNumber) {
    	 this.sNumber= sNumber == null ? null : sNumber.trim();
    }

    public String getSSex () {   
    	 return sSex;
    }

    public void setSSex (String sSex) {
    	 this.sSex= sSex == null ? null : sSex.trim();
    }

    public String getSTelephone () {   
    	 return sTelephone;
    }

    public void setSTelephone (String sTelephone) {
    	 this.sTelephone= sTelephone == null ? null : sTelephone.trim();
    }

    public String getSIsTutor () {   
    	 return sIsTutor;
    }

    public void setSIsTutor (String sIsTutor) {
    	 this.sIsTutor= sIsTutor == null ? null : sIsTutor.trim();
    }

    public String getSIsHeadman () {   
    	 return sIsHeadman;
    }

    public void setSIsHeadman (String sIsHeadman) {
    	 this.sIsHeadman= sIsHeadman == null ? null : sIsHeadman.trim();
    }

}