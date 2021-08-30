package id.unum.types.dto;

import com.google.gson.JsonObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.util.List;

@Data
@NoArgsConstructor
public class PresentationRequestOptions {
    List<CredentialRequest> credentialRequests;
    @Nullable
    String createdAt;
    @Nullable
    String updatedAt;
    @Nullable
    String expiresAt;
    String holderAppUuid;
    JsonObject metadata;
    String verifier; // did
    String version;
}
