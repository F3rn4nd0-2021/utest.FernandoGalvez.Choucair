package utest.fernandogalvez.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import utest.fernandogalvez.userinterface.UTestPage;

public class Button implements Task {

    public static Button joinToday(){
        return Tasks.instrumented (Button.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestPage.JOIN_TODAY_BUTTON));
    }
}
