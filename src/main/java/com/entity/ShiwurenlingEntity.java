package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 失物认领
 *
 * @author 
 * @email
 */
@TableName("shiwurenling")
public class ShiwurenlingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiwurenlingEntity() {

	}

	public ShiwurenlingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 失物id
     */
    @TableField(value = "shiwuzhaoling_id")

    private Integer shiwuzhaolingId;


    /**
     * 认领用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 认领凭证
     */
    @TableField(value = "shiwurenling_text")

    private String shiwurenlingText;


    /**
     * 审核
     */
    @TableField(value = "shiwurenling_yesno_types")

    private Integer shiwurenlingYesnoTypes;


    /**
     * 详情
     */
    @TableField(value = "shiwurenling_yesno_text")

    private String shiwurenlingYesnoText;


    /**
     * 认领时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：失物id
	 */
    public Integer getShiwuzhaolingId() {
        return shiwuzhaolingId;
    }
    /**
	 * 获取：失物id
	 */

    public void setShiwuzhaolingId(Integer shiwuzhaolingId) {
        this.shiwuzhaolingId = shiwuzhaolingId;
    }
    /**
	 * 设置：认领用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：认领用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：认领凭证
	 */
    public String getShiwurenlingText() {
        return shiwurenlingText;
    }
    /**
	 * 获取：认领凭证
	 */

    public void setShiwurenlingText(String shiwurenlingText) {
        this.shiwurenlingText = shiwurenlingText;
    }
    /**
	 * 设置：审核
	 */
    public Integer getShiwurenlingYesnoTypes() {
        return shiwurenlingYesnoTypes;
    }
    /**
	 * 获取：审核
	 */

    public void setShiwurenlingYesnoTypes(Integer shiwurenlingYesnoTypes) {
        this.shiwurenlingYesnoTypes = shiwurenlingYesnoTypes;
    }
    /**
	 * 设置：详情
	 */
    public String getShiwurenlingYesnoText() {
        return shiwurenlingYesnoText;
    }
    /**
	 * 获取：详情
	 */

    public void setShiwurenlingYesnoText(String shiwurenlingYesnoText) {
        this.shiwurenlingYesnoText = shiwurenlingYesnoText;
    }
    /**
	 * 设置：认领时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：认领时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shiwurenling{" +
            "id=" + id +
            ", shiwuzhaolingId=" + shiwuzhaolingId +
            ", yonghuId=" + yonghuId +
            ", shiwurenlingText=" + shiwurenlingText +
            ", shiwurenlingYesnoTypes=" + shiwurenlingYesnoTypes +
            ", shiwurenlingYesnoText=" + shiwurenlingYesnoText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
