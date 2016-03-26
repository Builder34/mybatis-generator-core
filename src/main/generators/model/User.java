package model;

import java.util.Date;

public class User {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.id UUID主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.username 登录用户名
     *
     * @mbggenerated
     */
    private String username;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.password 登录密码
     *
     * @mbggenerated
     */
    private String password;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.fullname 姓名
     *
     * @mbggenerated
     */
    private String fullname;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.gender 性别：1男0女
     *
     * @mbggenerated
     */
    private Boolean gender;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.is_admin 是否管理员：1是0否
     *
     * @mbggenerated
     */
    private Boolean isAdmin;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.department_id 外键，所属部门Id
     *
     * @mbggenerated
     */
    private Integer departmentId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.is_lock 是否锁定：1是0否
     *
     * @mbggenerated
     */
    private Boolean isLock;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.is_delete 是否删除：1是0否
     *
     * @mbggenerated
     */
    private Boolean isDelete;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.create_person 记录生成人
     *
     * @mbggenerated
     */
    private String createPerson;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.create_date 记录生成时间
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.update_person 最后更新人
     *
     * @mbggenerated
     */
    private String updatePerson;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user.update_date 最后更新时间
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
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