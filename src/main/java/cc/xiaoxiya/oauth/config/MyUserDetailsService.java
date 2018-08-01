package cc.xiaoxiya.oauth.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangxibin on 2018/7/26.
 */
@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user where username = ?",new Object[]{s});
        if(null != list && list.size() ==1 ){
            Map<String, Object> user = list.get(0);
            UserDetails userDetails =  User.withUsername(user.get("username")+"").password(user.get("password")+"").authorities("USER","GURP").build();
            return userDetails;
        }
        throw new UsernameNotFoundException("用户不存在");
    }
}
