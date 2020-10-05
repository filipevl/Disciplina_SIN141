import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarEmail{

    public static void main(String[] args) {
        System.out.println( validarEmail("garbosoftware@gmail.com") );
        System.out.println( validarEmail("aaabbb@gmail.com") );
        System.out.println( validarEmail("invalido@com.br") );
        System.out.println( validarEmail("inv@lido@com.br") );
    }

    public static boolean validarEmail(String email) {
        boolean Resultado = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                Resultado = true;
            }
        }
        return Resultado;
    }
}