package model;

import java.util.Date;

public class Module {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_module.id 自增主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_module.name 系统模块名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_module.flag 系统模块标记
     *
     * @mbggenerated
     */
    private String flag;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_module.url 系统访问URL
     *
     * @mbggenerated
     */
    private String url;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_module.sort_no 排序号
     *
     * @mbggenerated
     */
    private Integer sortNo;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_module.create_person 记录生成人
     *
     * @mbggenerated
     */
    private String createPerson;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_module.create_date 记录生成时间
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_module.update_person 最后更新人
     *
     * @mbggenerated
     */
    private String updatePerson;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_module.update_date 最后更新时间
     *
     * @mbggenerated
     */
    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}