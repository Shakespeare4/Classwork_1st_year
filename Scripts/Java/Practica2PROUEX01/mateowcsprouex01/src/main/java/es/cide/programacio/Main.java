//nom: Mateo William Carter Shakespeare
//data: 25/09/2025
//nie: Y1723089-N

package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        int registro1; //es correcte

        //int 1registro; incorrecte, no pot començar per numero

        int archivo_3; //es correcte

        //int while; incorrecte, while es una paraula reservada

        int $impuesto; //es correcte

        //int año; es correcte, pero nomes perque el visual interve en la compilacio

        //int primer apellido; incorrecte, no pot tenir espais

        int primer_apellido; //es correcte

        //int primer-apellido; incorrecte, no pot tenir guio

        int primerApellido; //es correcte

        //int Tom's; incorrecte, no pot tenir apostrofes

        int C3P0; //es correcte

        //int 123#; incorrecte, no pot tenir coixinets 

        int _nombre; //es correcte

        //int PesoMáximo; es correcte, pero nomes perque el visual interve en la compilacio

        //int %descuento; incorrecte, no pot tenir percentatges

        int Weight; // es correcte

        //int $$precioMínimo;es correcte, pero nomes perque el visual interve en la compilacio

        //int _$Único; es correcte, pero nomes perque el visual interve en la compilacio

        //int tamaño_màximo; es correcte, pero nomes perque el visual interve en la compilacio

        //int peso.maximo; incorrecte, no pot tenir punts

        int Precio__; //es correcte

        //int matrícula?; incorrecte, no pot tenir interrogants

        //int cuántoVale; es correcte, pero nomes perque el visual interve en la compilacio

        int high; //es correcte

        int barça; //es correcte, pero nomes perque el visual interve en la compilacio

        int piragüista; //es correcte, pero nomes perque el visual interve en la compilacio

        int B_011; //es correcte

        int X012AB; //es correcte

        //int 70libro; incorrecte, no pot començar per numero

        //int nombre&apellido; incorrecte, no pot tenir ampersand

        //int 0X1A; incorrecte, no pot començar per numero

        //int else; incorrecte, else es una paraula reservada

        double primera = 0.5; //es correcte
        System.out.println(primera); //comprobacio

        double segunda = .5; //es correcte
        System.out.println(segunda); //comprobacio

        double tercera = 9.3e12; //es correcte
        System.out.println(tercera); //comprobacio

        double cuarta = 9.3e-12; //es correcte
        System.out.println(cuarta); //comprobacio

        int quinta = 12345678; //es correcte
        System.out.println(quinta); //comprobacio

        // int sexta = 12345678_L; incorrecte, no pot tenir guions baixos si no es entre numeros

        //ouble septima = 0.8E3+0.8;  incorrecte, el numero e ha de anar seguit d'un numero

        //double octava = 0.8E 8; incorrecte, no pot tenir espais

        int novena = 05_15; //es correcte
        System.out.println(novena); //comprobacio

        //int decima = 018CDF; incorrecte, java llegeix 018 com un numero octal i 8 no es un numero valid en octal

        int undecima = 0XBC5DA;
        System.out.println(undecima); //comprobacio

        int duodecima = 0x87e3a; //es correcte
        System.out.println(duodecima); //comprobacio

        long decimatercera = 234567L; //es correcte
        System.out.println(decimatercera); //comprobacio

        //int decimacuarta =  0_B11; incorrecte, no pot tenir guions baixos si no es entre numeros

        int decimaquinta = 010101; //es correcte
        System.out.println(decimaquinta); //comprobacio

        int decimasexta = 0_557;
        System.out.println(decimasexta); //comprobacio

        //double decimasetima =  .00.8E2; incorrecte,no pot tenir mes d'un decimal

        double decimaoctava = .3e3f;
        System.out.println(decimaoctava); //comprobacio

        int decimanovena =  0b111; //es correcte
        System.out.println(decimanovena); //comprobacio

        long vigesima = 12_234L; //es correcte
        System.out.println(vigesima); //comprobacio

        int vigesimoprimera = 0Xabcd; //es correcte
        System.out.println(vigesimoprimera); //comprobacio

        int vigesimasegunda = 0xabcE; //es correcte
        System.out.println(vigesimasegunda); //comprobacio

        //int vigesimatercera =  _234; incorrecte, no pot començar per guion baix

        //int vigesimacuarta = 1010B; incorrecte, un binari no pot contenir lletres

        int vigesimaquinta = 0x1010B; //es correcte
        System.out.println(vigesimaquinta); //comprobacio

        double vigesimasexta =  1_234.2E-2; //es correcte
        System.out.println(vigesimasexta); //comprobacio

        //double vigesimasetima = 1234.2EF; incorrecte, la e no pot anar seguida d'altra lletra

        double vigesimaoctava = 1234.2E3F; //es correcte
        System.out.println(vigesimaoctava); //comprobacio

        //double vigesimanovena = 1_1.2e_2; incorrecte, no pot tenir guions baixos en els decimals

        //double trigésima = 0bABCDL; incorrecte, un binari no pot contenir lletres

        int trigésimoprimera = 0X1A; //es correcte
        System.out.println(trigésimoprimera); //comprobacio

        long trigésimasegunda = 0X12AL; //es correcte
        System.out.println(trigésimasegunda); //comprobacio

        long trigésimatercera = 0X12AL; //es correcte
        System.out.println(trigésimatercera); //comprobacio

        //int trigésimacuarta = abcd; incorrecte, no pot començar per lletra 

        double trigésimaquinta = .01011; //es correcte
        System.out.println(trigésimaquinta); //comprobacio

        double trigésimasexta = 3e12; //es correcte
        System.out.println(trigésimasexta); //comprobacio

        //int trigésimasetima = 3_e12; incorrecte, no pot tenir quions baixos si no es entre numeros

        double trigésimaoctava = -3E-1_2; //es correcte
        System.out.println(trigésimaoctava); //comprobacio

        //double trigésimanovena = 0.8E; incorrecte, el numero e ha de anar seguit d'un numero

        //int cuadragésima = 0B1212; incorrecte, un binari no pot contenir numeros diferents de 0 i 1

        int cuadragesimoprimera = 1_2_3; //es correcte
        System.out.println(cuadragesimoprimera); //comprobacio

        int cuadragesimasegunda = 0xedad; //es correcte
        System.out.println(cuadragesimasegunda); //comprobacio

        int cuadragesimatercera = 0XBE2; //es correcte
        System.out.println(cuadragesimatercera); //comprobacio

        double cuadragesimacuarta = 101e2; //es correcte
        System.out.println(cuadragesimacuarta); //comprobacio

        //int cuadragesimaquinta = B1101; incorrecte, un binari no pot començar per lletra

        //double cuadragesisexta = 1.34.5; incorrecte, no pot tenir mes d'un decimal

        double cuadragesimasetima = 12.3E4F; //es correcte
        System.out.println(cuadragesimasetima); //comprobacio
        
        //int cuadragesimaoctava =  0X12AG; incorrecte, un hexadecimal no pot contenir lletres diferents de A-F
        
        char alfa = 'a'; //es correcte

        char beta = '$'; //es correcte

        char gamma = '\n';  //es correcte
        
        //char delta = '/n'; incorrecte, no pot contenir la barra invertida

        char epsilon = '\\'; //es correcte

        //char zeta = '\ñ'; incorrecte, no existeix aquest caracter d'escape nomes son valids  \b  \t  \n  \f  \r  \"  \'  \\ )

        //char eta = "T"; incorrecte, ha de ser comilla simple

        //char theta = 'ñ';  es correcte, pero nomes perque el visual interve en la compilacio

        //char iota = 'xyz'; incorrecte, nomes pot tenir un caracter

        char kappa = '\u0066'; //es correcte

        //char lambda = "XYZ"; incorrecte, ha de ser comilla simple i nomes un caracter

        char mu = '4'; //es correcte

        char nu = '\t'; //es correcte
        
        //char '\b'; incorrecte \b es un declaracio d'escape i no pot ser un nom de variable

        //char xi = k; incorrecte, sense comilles no es un caracter i es llegeix com una variable no declarada

        //char omicron = +; incorrecte, + es una expresio i no un caracter

        char pi = '+'; //es correcte

        char rho = '?'; //es correcte

        char sigma = 'â'; //es correcte

        char tau = ':'; //es correcte
        
        //String unus = '8:15'; incorrecte, ha de ser comilla doble i no simple

        String duo = "Rojo, Blanco y Azul";

        //String tres = "Nombre:; incorrecte, falta la comilla final

        String quattuor = "Capítulo \'3\'"; //es correcte

        String quinque = "1.3e-1-2"; //es correcte

        String sextus = ""; //es correcte

        String septem = " "; //es correcte

        String octo = "A"; //es correcte

        //String novem = "FP'; incorrecte, comilla inicial i final diferents

        String decem = " programación "; //es correcte

        //String undecim = "programación "Java""; incorrecte, les comilles internes han d'estar escapades

        //String duodecim = programación; incorrecte, sense comilles es llegeix com una variable no declarada

        //String tredecim = 'W'; incorrecte, ha de ser comilla doble i no simple

        String quattuordecim = "\n"; //es correcte

        String quindecim = "4 +5 * 2"; //es correcte

        int p = 5; //declaracio de variable
        System.out.println(p); //comprobacio

        int q = 10; //declaracio de variable
        System.out.println(q); //comprobacio

        float x = 0.1f;  //declaracio de variable
        System.out.println(x); //comprobacio

        float y = 0.2f; //declaracio de variable
        System.out.println(y); //comprobacio

        float z = 0.3f;//declaracio de variable
        System.out.println(z); //comprobacio

        char a = 'a';//declaracio de variable
        System.out.println(a); //comprobacio

        char b = 'b'; //declaracio de variable  
        System.out.println(b); //comprobacio

        char c = 'c'; //declaracio de variable
        System.out.println(c); //comprobacio

        double raiz1 = 2.5; //declaracio de variable
        System.out.println(raiz1); //comprobacio

        double raiz2 = 3.5; //declaracio de variable
        System.out.println(raiz2); //comprobacio

        long contador = 123456789; //declaracio de variable
        System.out.println(contador); //comprobacio

        short indicador = 5; //declaracio de variable
        System.out.println(indicador); //comprobacio

        
        


































































































































































    }
}