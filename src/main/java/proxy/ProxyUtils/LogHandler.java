package proxy.ProxyUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Norg on 27.08.2016.
 */
public class LogHandler implements InvocationHandler {
    private final Object delegate;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method " + method.getName() + " started at " + System.currentTimeMillis());
        Object result = method.invoke(delegate, args);
        System.out.println("Method " + method.getName() + " finished at " + System.currentTimeMillis());
        return result;
    }

    public LogHandler(Object delegate) {
        this.delegate = delegate;
    }
}
