package pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Metting {
	private String theme;
	private List<Boss> boosList;
}
