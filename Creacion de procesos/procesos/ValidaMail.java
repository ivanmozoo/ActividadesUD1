public class ValidaMail {

    public static boolean Validacion(String email) {

        if (!email.contains("@")) {
            System.out.println("\nEl email no contiene una @");
            return false;
        }

        String[] campo_email = email.split("@");
        if (campo_email.length != 2) {
            System.out.println("\nError");
            return false;
        }

        String primer_identificador = campo_email[0];
        String segundo_identificador = campo_email[1];

        if (primer_identificador.length() < 3) {
            System.out.println("\nEl primer identificador debe tener minimo de 3 caracteres.");
            return false;
        }

        if (!segundo_identificador.contains(".")) {
            System.out.println("\nEl dominio debe contener un punto (.)");
            return false;
        }

        String[] partesDominio = segundo_identificador.split("\\.");
        if (partesDominio.length < 2 || partesDominio[0].isEmpty()) {
            System.out.println("\nError: El dominio debe tener una extension despues del punto.");
            return false;
        }

        String dominio = partesDominio[partesDominio.length - 1];
        if (!(dominio.equals("com") || dominio.equals("es") || dominio.equals("org"))) {
            System.out.println("\nError: El dominio no es ni .com, .es ni .org");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            String email = args[0];
            boolean es_valido = Validacion(email);

            if (es_valido) {
                System.out.println("\nEl correo " + email + " es valido.");
            } else {
                System.out.println("\nEl correo " + email + " es invalido.");
            }
        }
    }
}



















/*  public static boolean Validacion(String email) {



        boolean esValido = true;

        StringBuilder errores = new StringBuilder();



        if (!email.contains("@")) {

            errores.append("\nEl email no contiene una @");

            esValido = false;

        } else {



            String[] campo_email = email.split("@");

            if (campo_email.length != 2) {

                errores.append("\nError: El correo contiene más de una @ o ninguna.");

                esValido = false;

            } else {



                String primer_identificador = campo_email[0];

                String segundo_identificador = campo_email[1];

                if (primer_identificador.length() < 3) {

                    errores.append("\nEl primer identificador debe tener un mínimo de 3 caracteres.");

                    esValido = false;

                }



                if (!segundo_identificador.contains(".")) {

                    errores.append("\nEl dominio debe contener un punto (.)");

                    esValido = false;

                } else {



                    String[] partesDominio = segundo_identificador.split("\\.");

                    if (partesDominio.length < 2 || partesDominio[0].isEmpty()) {

                        errores.append("\nError: El dominio debe tener una extensión después del punto.");

                        esValido = false;

                    } else {



                        String dominio = partesDominio[partesDominio.length - 1];

                        if (!(dominio.equals("com") || dominio.equals("es") || dominio.equals("org"))) {

                            errores.append("\nError: El dominio no es ni .com, .es ni .org");

                            esValido = false;

                        }

                    }

                }

            }

        }

        if (!esValido) {

            System.out.println(errores.toString());

        }

        return esValido;

    }  */

