package proxy.ProxyUtils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Norg on 27.08.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Key {
    Language[] value();
}
