package pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Role implements Serializable {
    private Integer id;

    private String roleName;

    private String note;
}