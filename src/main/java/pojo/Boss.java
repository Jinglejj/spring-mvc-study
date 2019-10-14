package pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Boss {
	private String name;
	private String company;
	private String interest;
	private Car car;
}
