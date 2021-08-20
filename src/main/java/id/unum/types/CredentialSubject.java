package id.unum.types;

import com.google.gson.JsonObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CredentialSubject {
    String id;
    JsonObject data;
}
