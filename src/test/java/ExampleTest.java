import com.github.tomakehurst.wiremock.client.WireMock;
import io.quarkiverse.wiremock.devservice.ConnectWireMock;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

@QuarkusTest
@ConnectWireMock
public class ExampleTest {

    WireMock wiremock;

    @Inject
    @RestClient
    TestRestClient restClient;

    @Test
    void test() {
        wiremock.register(WireMock.post("/test/asdf").willReturn(aResponse().withStatus(200)));
        wiremock.register(WireMock.post("/test%2Fasdf").willReturn(aResponse().withStatus(500)));

        restClient.runFunc("asdf", "test/asdf");
    }

}
