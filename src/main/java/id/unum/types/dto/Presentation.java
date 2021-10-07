package id.unum.types.dto;

import id.unum.types.CredentialStatus;
import id.unum.types.CredentialSubject;
import id.unum.types.Proof;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class Presentation {
    List<String> context;
    List<String> type;
    String presentationRequestId;
    String verifierDid;
    List<CredentialDto> verifiableCredential;
    Proof proof;
}

@Data
@NoArgsConstructor
/**
 * A class to match the Credential proto, with the credentialSubject attribute as a string.
 * Thanks to spring boot serialization need a class that is explicitly that.
 */
class CredentialDto {
    List<String> context;
    String credentialSubject;
    CredentialStatus credentialStatus;
    String issuer;
    List<String> type;
    String id;
    Date issuanceDate;
    Proof proof;
    Date expirationDate;
}