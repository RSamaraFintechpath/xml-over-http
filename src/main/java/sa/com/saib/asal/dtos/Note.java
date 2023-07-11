package sa.com.saib.asal.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class Note {

    @NotBlank(message = "recipient cant be null")
    private String to;
    @NotBlank(message = "sender cant be null")
    private String from;
    @Size(max = 10)
    private String heading;
    @Size(min=2,max=200, message = "size must be between 2 and 200")
    private String body;
}
