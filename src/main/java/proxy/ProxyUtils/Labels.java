package proxy.ProxyUtils;

/**
 * Created by Norg on 27.08.2016.
 */
public interface Labels {
    @Key({
            @Language(language = "ru", value = "Логин"),
            @Language(language = "en", value = "Login")})
    String userName();

    @Key({
            @Language(language = "ru", value = "Где мои деньги, %s?"),
            @Language(language = "en", value = "Where is my money, %s?")})
    String whereIsMyMoneyBro(String bro);
}
