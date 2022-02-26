package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.userinterfaces.ApplicationHomepage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenThe implements Task {

    public static OpenThe wordpressApp() {
        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ApplicationHomepage.LOGIN_BUTTON));

    }
}
