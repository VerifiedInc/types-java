package id.unum.types.dto;

import com.google.gson.JsonObject;
import id.unum.types.Proof;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.util.List;

@Data
@NoArgsConstructor
public class PresentationRequest extends PresentationRequestOptions {
    String uuid;
    String id;
    Proof proof;
}
