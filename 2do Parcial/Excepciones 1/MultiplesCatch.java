class MultiplesCatch
        {
            public static void main(String[] args) {
                {
                    int a;
                    int b[];
                    int c= args.length;
                    //el numero de argumentos
try
{
    a=10/c; //error si no. de argumentos
    System.out.println("valor de a= " + a);
    b= new int[5];
    for (int i=0; i<a; i++){
        b[i]= i;
        System.out.print("\t"+i);        
    }
}
    catch(ArithmeticException e){
        System.out.println("Primera excepcion. division por cero: :"+e);

    }
catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Segunda excepcion. indice fuera de limites =>" +e);
}
            }
                }
    }