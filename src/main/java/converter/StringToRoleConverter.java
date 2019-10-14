package converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;
import pojo.Role;

/**
 * Created by IntelliJ IDEA.
 * Author: 于锦江
 * Date: 2019/6/28
 * Time: 20:03
 */
public class StringToRoleConverter implements Converter<String, Role> {


    public StringToRoleConverter() {
        System.out.println("转换器出生啦");
    }

    @Override
    public Role convert(String s) {
        if (StringUtils.isEmpty(s)) {
            return null;
        }

        if (s.contains("-")) {
            return null;
        }
        String[] arr =s.split("-");
        if (arr.length != 3) {
            return null;
        }
        Role role = new Role();
        role.setId(Integer.parseInt(arr[0]));
        role.setRoleName(arr[1]);
        role.setNote(arr[2]);

        return role;
    }
}
