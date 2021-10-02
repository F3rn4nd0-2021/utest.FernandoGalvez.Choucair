package utest.fernandogalvez.questions;

import com.beust.jcommander.Strings;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import utest.fernandogalvez.userinterface.UTestSignUp;

public class Answer implements Question<Boolean> {
   private String strSuccessSignUpMessages;

   public Answer(String strSuccessSignUpMessages){this.strSuccessSignUpMessages=strSuccessSignUpMessages;}

    public static Answer toThe(String strSuccessSignUpMessages) {
      return new  Answer  (strSuccessSignUpMessages);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String messages= Text.of(UTestSignUp.COMPLETED_REGISTER).viewedBy(actor).asString();
         if (strSuccessSignUpMessages.equals(messages)){
             result=true;
         }
         else {
             result =false;
         }
         return result;
    }
}
