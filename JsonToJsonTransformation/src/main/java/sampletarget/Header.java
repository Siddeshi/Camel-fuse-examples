
package sampletarget;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "hdrk1",
    "hdrk2"
})
public class Header {

    @JsonProperty("hdrk1")
    private String hdrk1;
    @JsonProperty("hdrk2")
    private String hdrk2;

    /**
     * 
     * @return
     *     The hdrk1
     */
    @JsonProperty("hdrk1")
    public String getHdrk1() {
        return hdrk1;
    }

    /**
     * 
     * @param hdrk1
     *     The hdrk1
     */
    @JsonProperty("hdrk1")
    public void setHdrk1(String hdrk1) {
        this.hdrk1 = hdrk1;
    }

    /**
     * 
     * @return
     *     The hdrk2
     */
    @JsonProperty("hdrk2")
    public String getHdrk2() {
        return hdrk2;
    }

    /**
     * 
     * @param hdrk2
     *     The hdrk2
     */
    @JsonProperty("hdrk2")
    public void setHdrk2(String hdrk2) {
        this.hdrk2 = hdrk2;
    }

}
