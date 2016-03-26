package model;

import java.util.Date;

public class Resource {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_resource.id 自增主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_resource.name 菜单资源名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_resource.url 菜单资源URL
     *
     * @mbggenerated
     */
    private String url;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_resource.remark 菜单资源简要描述
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_resource.parent_id 父级id
     *
     * @mbggenerated
     */
    private Integer parentId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_resource.structure 菜单的层级结构
     *
     * @mbggenerated
     */
    private String structure;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_resource.sort_no 排序号
     *
     * @mbggenerated
     */
    private Integer sortNo;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_resource.module_flag 所属系统模块的标记
     *
     * @mbggenerated
     */
    private String moduleFlag;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_resource.create_person 记录生成人
     *
     * @mbggenerated
     */
    private String createPerson;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_resource.create_date 记录生成时间
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_resource.update_person 最后更新人
     *
     * @mbggenerated
     */
    private String updatePerson;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_resource.update_date 最后更新时间
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getModuleFlag() {
        return moduleFlag;
    }

    public void setModuleFlag(String moduleFlag) {
        this.moduleFlag = moduleFlag;
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