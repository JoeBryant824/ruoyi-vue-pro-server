package cn.iocoder.dashboard.modules.system.dal.mysql.dataobject.permission;

import cn.iocoder.dashboard.framework.mybatis.core.BaseDO;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * 菜单权限表
 *
 * @author ruoyi
 */
@TableName("sys_menu")
@Data
@EqualsAndHashCode(callSuper = true)
public class SysMenuDO extends BaseDO {

    /**
     * 菜单ID
     */
    @TableId
    private Long menuId;

    /**
     * 菜单名称
     */
    @NotBlank(message = "菜单名称不能为空")
    @Size(max = 50, message = "菜单名称长度不能超过50个字符")
    private String menuName;

    /**
     * 父菜单ID
     */
    private Long parentId;

    /**
     * 显示顺序
     */
    @NotBlank(message = "显示顺序不能为空")
    private String orderNum;

    /**
     * 路由地址
     */
    @Size(max = 200, message = "路由地址不能超过200个字符")
    private String path;

    /**
     * 组件路径
     */
    @Size(max = 200, message = "组件路径不能超过255个字符")
    private String component;

    /**
     * 是否为外链（0是 1否）
     */
    private String isFrame;

    /**
     * 是否缓存（0缓存 1不缓存）
     */
    private String isCache;

    /**
     * 类型（M目录 C菜单 F按钮）
     */
    @NotBlank(message = "菜单类型不能为空")
    private String menuType;

    /**
     * 显示状态（0显示 1隐藏）
     */
    private String visible;

    /**
     * 菜单状态（0显示 1隐藏）
     */
    private String status;

    /**
     * 权限字符串
     */
    @Size(max = 100, message = "权限标识长度不能超过100个字符")
    private String perms;

    /**
     * 菜单图标
     */
    private String icon;

    // TODO 芋艿：非存储字段，需要提出

    /**
     * 父菜单名称
     */
    @TableField(exist = false)
    private String parentName;

    /**
     * 子菜单
     */
    @TableField(exist = false)
    private List<SysMenuDO> children = new ArrayList<SysMenuDO>();

}