package utest.fernandogalvez.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import utest.fernandogalvez.userinterface.UTestPage;
import net.serenitybdd.screenplay.actions.Open;
public class OpenUP implements Task {

    private UTestPage UTestPage;
    public static OpenUP thePage(){
        return Tasks.instrumented(OpenUP.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(UTestPage));


    }
}
