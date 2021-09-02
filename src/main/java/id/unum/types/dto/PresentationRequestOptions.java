package id.unum.types.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.json.JSONObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PresentationRequestOptions {
    List<CredentialRequest> credentialRequests;
    @Nullable
    String createdAt;
    @Nullable
    String updatedAt;
    @Nullable
    String expiresAt;
    String holderAppUuid;
    JSONObject metadata;
    String verifier; // did
    String version;
}
