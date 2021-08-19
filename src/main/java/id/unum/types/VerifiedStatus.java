package id.unum.types;

import lombok.Builder;
import lombok.Data;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import io.swagger.annotations.ApiModelProperty;


@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class VerifiedStatus {
    boolean isVerified;
//    @ApiModelProperty(required = false)
    String message;
}
