package id.unum.types;

import com.google.gson.JsonObject;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@NoArgsConstructor
public class CredentialSubject extends HashMap<String, String> {
    public CredentialSubject(String id) {
        super();
        super.put("id", id);
    }

    public String getId() {
        return super.get("id");
    }
}
