package id.unum.types;

import com.google.gson.JsonObject;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
//public class CredentialSubject extends HashMap<String, JsonObject> {
public class CredentialSubject<T> {
    private Map<String, T> map = new HashMap<>();

    public T getObject(final String key) {
        return map.get(key);
    }

    public CredentialSubject(String id) {
        map.put("id", (T) id);
    }

    public String getId() {
        return (String) map.get("id");
    }
}

//@Data
//@NoArgsConstructor
//public class CredentialSubject extends HashMap<String, JsonObject> {
//    String id;
//
//    public CredentialSubject(String id) {
//        super();
////        super.put("id", id);
//        this.id = id;
//    }
//
//    public String getId() {
////        return super.get("id").getAsString();
//        return id;
//    }
//}
