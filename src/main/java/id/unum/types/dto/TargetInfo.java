package id.unum.types.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;

@Data
@NoArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
public class TargetInfo {
    @Nullable
    String version; // Api version reachable via the version HTTP header.
    @Nullable
    String url; // Versions denoted via a different url.
}
