package model;

public class RoleResource {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_role_resource.role_id 角色ID
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_role_resource.resource_id 资源ID
     *
     * @mbggenerated
     */
    private Integer resourceId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
}