package proxy;

/**
 * Created by wdy on 2019/2/26.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("**********************CGLibProxy**********************");
        CGLibProxy cgLibProxy = new CGLibProxy();
        IUserManager userManager = (IUserManager) cgLibProxy.createProxyObject(new IUserManagerImpl());
        userManager.addUser("wdy", "123456");

        System.out.println("**********************JDKProxy**********************");
        JDKProxy jdkPrpxy = new JDKProxy();
        IUserManager userManagerJDK = (IUserManager) jdkPrpxy.newProxy(new IUserManagerImpl());
        userManagerJDK.addUser("wdy" , "123456");
    }
}
