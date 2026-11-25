class ExceptionCapturada
        {
            public static void main(String args[]){
                int a, b;
                try 
        {//contola el metodo peligroso
            a=0;
            b= 10/a;
            System.out.println("Esto ya no se imprime");
        }

        catch(ArithmeticException objetoExcep)
        {
            System.out.println("Division por cero"+ objetoExcep);

        }

        System.out.println("continua el programa.......");
    }
}
