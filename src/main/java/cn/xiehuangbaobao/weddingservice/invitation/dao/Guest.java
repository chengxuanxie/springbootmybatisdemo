package cn.xiehuangbaobao.weddingservice.invitation.dao;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Guest implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest.wechat_name
     *
     * @mbggenerated
     */
    private String wechatName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest.wechat_id
     *
     * @mbggenerated
     */
    private String wechatId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest.ATTEND
     *
     * @mbggenerated
     */
    private String attend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guest.extend_param
     *
     * @mbggenerated
     */
    private String extendParam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table guest
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest.id
     *
     * @return the value of guest.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest.id
     *
     * @param id the value for guest.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest.name
     *
     * @return the value of guest.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest.name
     *
     * @param name the value for guest.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest.wechat_name
     *
     * @return the value of guest.wechat_name
     *
     * @mbggenerated
     */
    public String getWechatName() {
        return wechatName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest.wechat_name
     *
     * @param wechatName the value for guest.wechat_name
     *
     * @mbggenerated
     */
    public void setWechatName(String wechatName) {
        this.wechatName = wechatName == null ? null : wechatName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest.wechat_id
     *
     * @return the value of guest.wechat_id
     *
     * @mbggenerated
     */
    public String getWechatId() {
        return wechatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest.wechat_id
     *
     * @param wechatId the value for guest.wechat_id
     *
     * @mbggenerated
     */
    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest.ATTEND
     *
     * @return the value of guest.ATTEND
     *
     * @mbggenerated
     */
    public String getAttend() {
        return attend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest.ATTEND
     *
     * @param attend the value for guest.ATTEND
     *
     * @mbggenerated
     */
    public void setAttend(String attend) {
        this.attend = attend == null ? null : attend.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest.create_time
     *
     * @return the value of guest.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest.create_time
     *
     * @param createTime the value for guest.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest.update_time
     *
     * @return the value of guest.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest.update_time
     *
     * @param updateTime the value for guest.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guest.extend_param
     *
     * @return the value of guest.extend_param
     *
     * @mbggenerated
     */
    public String getExtendParam() {
        return extendParam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guest.extend_param
     *
     * @param extendParam the value for guest.extend_param
     *
     * @mbggenerated
     */
    public void setExtendParam(String extendParam) {
        this.extendParam = extendParam == null ? null : extendParam.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", wechatName=").append(wechatName);
        sb.append(", wechatId=").append(wechatId);
        sb.append(", attend=").append(attend);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", extendParam=").append(extendParam);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}