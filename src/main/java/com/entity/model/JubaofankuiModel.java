package com.entity.model;

import com.entity.JubaofankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 举报反馈
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JubaofankuiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 举报标题
     */
    private String jubaofankuiName;


    /**
     * 举报用户
     */
    private String yonghuName;


    /**
     * 举报内容
     */
    private String jubaofankuiText;


    /**
     * 举报时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：举报标题
	 */
    public String getJubaofankuiName() {
        return jubaofankuiName;
    }


    /**
	 * 设置：举报标题
	 */
    public void setJubaofankuiName(String jubaofankuiName) {
        this.jubaofankuiName = jubaofankuiName;
    }
    /**
	 * 获取：举报用户
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 设置：举报用户
	 */
    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 获取：举报内容
	 */
    public String getJubaofankuiText() {
        return jubaofankuiText;
    }


    /**
	 * 设置：举报内容
	 */
    public void setJubaofankuiText(String jubaofankuiText) {
        this.jubaofankuiText = jubaofankuiText;
    }
    /**
	 * 获取：举报时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：举报时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
