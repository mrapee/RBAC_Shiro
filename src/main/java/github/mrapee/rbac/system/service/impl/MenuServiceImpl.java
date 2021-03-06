package github.mrapee.rbac.system.service.impl;

import github.mrapee.rbac.system.domain.Menu;
import github.mrapee.rbac.system.dao.MenuMapper;
import github.mrapee.rbac.system.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
*@author:MrApee
*/
@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuMapper,Menu> implements IMenuService{

}
