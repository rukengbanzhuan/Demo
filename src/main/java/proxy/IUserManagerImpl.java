package proxy;

/**
 * Created by wdy on 2019/2/26.
 */
public class IUserManagerImpl implements IUserManager {
    @Override
    public void addUser(String id, String password) {
        System.out.println("======调用了IUserManagerImpl.addUser()方法======");

    }
}
