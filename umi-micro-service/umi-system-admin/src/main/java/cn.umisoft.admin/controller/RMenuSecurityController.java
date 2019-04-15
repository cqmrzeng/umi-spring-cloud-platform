package cn.umisoft.admin.controller;

import cn.umisoft.admin.entity.RMenuSecurity;
import cn.umisoft.admin.service.IRMenuSecurityService;

import cn.umisoft.web.controller.UmiRController;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 菜单-安全资源中间表 前端控制器
 * </p>
 *
 * @author hujie@umisoft.cn
 * @since 2019-01-14
 */
@RestController
@RequestMapping(value = "/admin/menu-security", name = "菜单-服务API级别安全资源中间表控制器")
public class RMenuSecurityController extends UmiRController<IRMenuSecurityService, RMenuSecurity> {
    public RMenuSecurityController() {
        this.mappingFields.add("menuId");
        this.mappingFields.add("securityId");
    }
}
