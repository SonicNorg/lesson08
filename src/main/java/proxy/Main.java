package proxy;

import ProxyUtils.LabelsInvocationHandler;
import proxy.ProxyUtils.Labels;

import java.lang.reflect.Proxy;

/**
 * Created by Norg on 27.08.2016.
 */
public class Main {
    public static void main (String[] args) {
        Labels ruLabels = getLabels("ru");
        Labels enLabels = getLabels("en");
        System.out.println(ruLabels.userName());
        System.out.println(ruLabels.whereIsMyMoneyBro("чувак"));
        System.out.println(enLabels.userName());
        System.out.println(enLabels.whereIsMyMoneyBro("dude"));
    }

    private static Labels getLabels(String language) {
        return (Labels) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class<?>[] {Labels.class}, new LabelsInvocationHandler(language));
    }
}
