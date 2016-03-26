package model;

public class RoleModule {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_role_module.role_id 角色ID
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column p_role_module.module_id 模块ID
     *
     * @mbggenerated
     */
    private Integer moduleId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }
}