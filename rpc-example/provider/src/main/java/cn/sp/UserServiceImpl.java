package cn.sp;

import cn.sp.rpc.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@Service(value = "userService")
public class UserServiceImpl implements UserService{


    @Value("${sp.rpc.server-port}")
    String serverPort;
    private static  Logger logger = LoggerFactory.getLogger(UserService.class);


    @Override
    public ApiResult<User> getUser(Long id) {
//        logger.info("现在是【3】号提供服务");
        User user = new User(1L,"service_"+serverPort,2,"www.aa.com");
        return ApiResult.success(user);
    }


}
