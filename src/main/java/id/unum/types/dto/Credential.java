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
public class Credential {
    List<String> context;
    CredentialSubject credentialSubject;
    CredentialStatus credentialStatus;
    String issuer;
    List<String> type;
    String id;
    Date issuanceDate;
    Proof proof;
    Date expirationDate;
}
