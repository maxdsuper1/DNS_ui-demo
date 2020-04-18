import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import pages.Home;

import java.lang.annotation.Annotation;

public class SmokeTest extends Config{
    Home home = new Home();

  /*  @Test
      void registration(){
        //Configuration.startMaximized = true;
        //Home home = new Home();
        home.url();
        home.clickregistration();
    }*/

    @Test
     void positiveSearch(){
        home.url();
        home.search("мониторы");
    }
}
