package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by IntelliJ IDEA.
 * Author: 于锦江
 * Date: 2019/6/26
 * Time: 11:54
 */
public class TransactionValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Transaction.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Transaction trans=(Transaction)o;
        double dis=trans.getAmount()-(trans.getPrice())*trans.getQuantity();
        if(Math.abs(dis)>0.1){
            errors.rejectValue("amount",null,"交易金额共和购买数量与价格不匹配");
        }
    }
}
