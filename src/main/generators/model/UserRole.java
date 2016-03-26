package model;

public class UserRole {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user_role.user_id 用户ID
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_user_role.role_id 角色ID
     *
     * @mbggenerated
     */
    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}