package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target EMAIL_INPUT=Target.the("Input for write email")
            .located(By.id("org.wordpress.android:id/input"));
    public static final Target EMAIL_BUTTON=Target.the("Button next email")
            .located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target PASSWORD_LINK=Target.the("Link for enter your password")
            .located(By.id("org.wordpress.android:id/login_enter_password"));
    public static final Target PASSWORD_INPUT=Target.the("Input for write password")
            .located(By.id("org.wordpress.android:id/input"));
    public static final Target PASSWORD_BUTTON=Target.the("Button next password")
            .located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target TEXT_LABEL=Target.the("Text label for validations")
            .located(By.id("org.wordpress.android:id/logged_in_as_heading"));
}
