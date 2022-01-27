package my.study.Realm;

import my.study.entity.User;
import my.study.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class WJRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 拿数据库的信息 完成用户名校验
        String username = token.getPrincipal().toString();
        User user = userService.getByName(username);
        if(user!=null){
            String passwordInDB = user.getPassword();
            String salt = user.getSalt();
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(username, passwordInDB, ByteSource.Util.bytes(salt), getName());
            return simpleAuthenticationInfo;
        } else {
            // 没找到对应用户
            return null;
        }
    }
}
