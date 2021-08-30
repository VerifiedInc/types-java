package id.unum.types.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CredentialRequest {
    String type; // The string matching the desire credential type.
    List<String> issuers; // List of acceptable issuer DIDs that have issued the credential.
    boolean required; // To denote wether this particular credential is required in response to the PresentationRequest. Defaults behavior resolves this to true.
}
