package validator;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Author: 于锦江
 * Date: 2019/6/25
 * Time: 20:08
 */
@Data
@ToString
public class Transaction {
    @NotNull
    private Long productId;

    @Future
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private Date date;

    @NotNull
    @DecimalMax(value = "0.1")
    private Double price;

    @Min(1)
    @Max(100)
    @NotNull
    private Integer quantity;


    @NotNull
    @DecimalMax("50000.00")
    @DecimalMin("1.00")
    private Double amount;

    @Pattern(regexp = "^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@", message = "不符合邮箱格式")
    private String email;

    @Size(min = 0, max = 256)
    private String note;

}
