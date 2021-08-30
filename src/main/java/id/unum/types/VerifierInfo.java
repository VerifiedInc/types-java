package id.unum.types;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;

@Data
@NoArgsConstructor
public class VerifierInfo {
    String did;
    String name;
    @Nullable
    String url;
}
