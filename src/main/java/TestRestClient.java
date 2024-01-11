import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(configKey = "test-restclient")
@Consumes(MediaType.APPLICATION_JSON)
public interface TestRestClient {

    @POST
    @Path("/{test}")
    String runFunc(@HeaderParam("Authorization") String authorization, @PathParam("test") String test);

}