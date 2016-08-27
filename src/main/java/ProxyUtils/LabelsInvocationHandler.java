package ProxyUtils;

import proxy.ProxyUtils.Key;
import proxy.ProxyUtils.Labels;
import proxy.ProxyUtils.Language;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Norg on 27.08.2016.
 */
public class LabelsInvocationHandler implements InvocationHandler {
    private String language;

    public LabelsInvocationHandler(String language) {
        this.language = language;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String result = "${" + method.getName() + "}";
            Key keyAnnotation = method.getAnnotation(Key.class);
            for(Language languageAnnotation : keyAnnotation.value()) {
                if(languageAnnotation.language().equals(language)) {
                    if (args != null && args.length > 0) {
                        result = String.format(languageAnnotation.value(), args);
                    } else {
                        result = languageAnnotation.value();
                    }
                    break;
                }
            }

        return result;
    }
}
