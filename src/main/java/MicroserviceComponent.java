import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

public class MicroserviceComponent {

//    @Inject
//    @RestClient
//    TestRestClient testRestClient;

    void onStart(@Observes StartupEvent event) {
//        testRestClient.runFunc("auth", "test/asdf");
    }

}
