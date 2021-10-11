package id.unum.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Note: this class is simply to facilitate attracting the id field from the json blob, aka Jackson ObjectNode
 */
public class CredentialSubject {
    String id;

    public String getId() {
        return id;
    }
}

