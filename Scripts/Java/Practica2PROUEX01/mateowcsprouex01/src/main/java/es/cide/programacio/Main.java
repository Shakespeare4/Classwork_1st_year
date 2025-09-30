//nom: Mateo William Carter Shakespeare
//data: 25/09/2025
//nie: Y1723089-N
//Disculpa lo feo que ha quedado el codigo
package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
                    //Indica els identificadors correctes


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
        
                    //Identifica els literals correctes
        System.out.println("Indica els literals correctes");
        System.out.println("");

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
        

                    //excercicis de literals tipus "char"

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
        
                //Excercicis sobre strings


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

                //Declara les següents variables
        System.out.println("");
        System.out.println("Declara les següents variables");
        System.out.println("");

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

        int indice = 7; //declaracio de variable
        System.out.println(indice); //comprobacio

        double precio = 19.95; //declaracio de variable
        System.out.println(precio); //comprobacio

        double precioFinal = precio * 2; //declaracio de variable
        System.out.println(precioFinal); //comprobacio
        
        char char1 = '1'; //declaracio de variable
        System.out.println(char1); //comprobacio

        char char2 = '2'; //declaracio de variable
        System.out.println(char2); //comprobacio

        byte byte1 = 10; //declaracio de variable
        System.out.println(byte1); //comprobacio

        Boolean primero = true; //declaracio de variable
        System.out.println(primero); //comprobacio

        Boolean ultimo = false; //declaracio de variable
        System.out.println(ultimo); //comprobacio

        String nombre = "Mateo"; //declaracio de variable
        System.out.println(nombre); //comprobacio 

                //Declara aquestes variables
        System.out.println("");
        System.out.println("Declara aquestes variables");
        System.out.println("");

        int edad = 18; //declaracio de variable
        System.out.println(edad); //comprobacio

        int codigoPostal = 10001; //declaracio de variable
        System.out.println(codigoPostal); //comprobacio

        float altura = 1.75f; //declaracio de variable
        System.out.println(altura); //comprobacio

        String genero= "H: Hombre, M: Mujer"; //declaracio de variable
        System.out.println(genero); //comprobacio

        String nom = "John"; //declaracio de variable
        System.out.println(nom); //comprobacio

        int numeroDeHijos = 3; //declaracio de variable
        System.out.println(numeroDeHijos); //comprobacio

        float iva = 0.21f; //declaracio de variable
        System.out.println(iva); //comprobacio

        int tallaCamisa = 42; //declaracio de variable
        System.out.println(tallaCamisa); //comprobacio

        float peso = 70.5f; //declaracio de variable
        System.out.println(peso); //comprobacio

        float precio2 = 15.99f; //declaracio de variable
        System.out.println(precio2); //comprobacio

        boolean alumnoRepetidor = false; //declaracio de variable
        System.out.println(alumnoRepetidor); //comprobacio

        String mensaje = "Bonjour"; //declaracio de variable
        System.out.println(mensaje); //comprobacio

        char letra = 'A'; //declaracio de variable
        System.out.println(letra); //comprobacio

        int MayorEdad = 18; //declaracio de variable
        System.out.println(MayorEdad); //comprobacio
        
        int minutos = 30; //declaracio de variable
        System.out.println(minutos); //comprobacio

        int dias = 3; //declaracio de variable
        System.out.println(dias); //comprobacio

        String matriculaCoche = "1234-ABC"; //declaracio de variable
        System.out.println(matriculaCoche); //comprobacio

        int contador2 = 0; //declaracio de variable
        System.out.println(contador2); //comprobacio

        boolean mayorDeEdad = true; //declaracio de variable
        System.out.println(mayorDeEdad); //comprobacio

        String tallaCamiseta = "S, L, XL ..."; //declaracio de variable
        System.out.println(tallaCamiseta); //comprobacio

        //Convertir les expressions algebraiques a algoritmiques
        System.out.println("");
        System.out.println("Convertir les expresions algebraiques a algoritmiques");
        System.out.println("");

        double a1 = 2, b1 = 4, c1 = 6, d1 = 8, x1 = 10, y1 = 12, z1 = 14; //declaracio de variable
        System.out.println(b1/2 - 4*a1*c1); //primera formula
        System.out.println(3 * x1 * y1 - 5* x1 + 12* x1 -17); //segona formula
        System.out.println((b1 + d1)/(c1 + 4)); //tercera formula
        System.out.println((x1 *y1 ) / y1 + 2); //quarta formula
        System.out.println((1/y1)+ (3*x1/z1)+1); //quinta formula
        System.out.println((1/y1 + 3)*(x1/y1)); //sexta formula
        System.out.println((1/y1)+ (3+x1)/(y1+1)); //setena formula

                //Convertir les expresions algebraiques a algoritmiques (2)
        System.out.println("");
        System.out.println("Convertir les expresions algebraiques a algoritmiques(2)");
        System.out.println("");
        double a2 = 5, b2 = 10, c2 = 15, d2 = 20, x2 = 25, y2 = 30, e2 = 35, f2 = 40, g2 = 45, h2=50, j2=55, m2 = 60, n2 = 65, p2 = 70, q2 = 75, r2 = 80, s2 = 85; //declaracio de variable
        System.out.println(3/2 + 04/3); //primera formula
        System.out.println((1/x2-5)- (3*x2*y2/4)); //segona formula
        System.out.println(1/2+7); //tercera formula
        System.out.println(7+1/2);//quarta formula  
        System.out.println(Math.pow(a2, 2/b2-c2)+((d2-e2)/f2-(g2*h2/j2))); //quinta formula
        System.out.println((m2/n2)+p2); //sexta formula
        System.out.println(m2+ (n2/p2-q2)); //setena formula
        System.out.println(((Math.pow(a2, 2)/Math.pow(b2, 2))+(Math.pow(c2, 2)/Math.pow(d2, 2)))); //octava formula
        System.out.println((m2+(n2/p2))/(q2-(r2/s2))); //novena formula
        System.out.println(((3*a2)+b2)/(c2-(d2+5*e2)/(f2+(g2/2*h2)))); //desena formula
        System.out.println((Math.pow(a2, 2)+(2*a2*b2)+(Math.pow(b2, 2)))/(1/(Math.pow(x2, 2))+2)); //onzena formula

                //Si a, b y c son variables senceres amb valors a=8, b=3, c=-5, determina el valor de les següents expressions aritmètiques:
        System.out.println("");
        System.out.println("Si a, b y c son variables senceres amb valors a=8, b=3, c=-5, determina el valor de les següents expressions aritmètiques:");
        System.out.println("");

        double a3 = 8, b3 = 2, c3 = -5; //declaracio de variable
        System.out.println(a3+b3+c3); //primera formula
        System.out.println(2*b3+3*(a3-c3)); //segona formula
        System.out.println(a3/b3); //tercera formula
        System.out.println(a3%b3); //quarta formula
        System.out.println(a3/c3); //quinta formula
        System.out.println(a3%c3); //sexta formula
        System.out.println(a3*b3/c3); //setena formula
        System.out.println(a*(b3/c3)); //octava formula
        System.out.println((a3*c3)%b3); //novena formula
        System.out.println(a3*(c3%b3)); //desena formula
        System.out.println((3*a3-2*b3)%(2*a3-c3)); //onzena formula
        System.out.println(2*(a3/5+(4-b3*3))%(a3+c3-2)); //dotzena formula
        System.out.println((a3-3*b3)%(c3+2*a3)/(a3-c3)); //tretzena formula
        System.out.println(a3-b3-c3*2); //catorzena formula

                //Si x, y, z son variables de tipus double amb valors x= 88, y = 3.5, z = -5.2, determina el valor de les següents expressions aritmètiques. Obtén el resultat de cada expressió amb un màxim de quatre decimals.
        System.out.println("");
        System.out.println("Si x, y, z son variables de tipus double amb valors x= 88, y = 3.5, z = -5.2, determina el valor de les següents expressions aritmètiques. Obtén el resultat de cada expressió amb un màxim de quatre decimals.");
        System.out.println("");

        float x3= 88, y3= 3.5f, z3= -5.2f; //declaracio de variable
        System.out.println(x3+y3+z3); //primera formula
        System.out.println(2*y3+3*(x3-z3)); //segona formula
        System.out.println(x3/y3); //tercera formula
        System.out.println(x3%y3); //quarta formula
        System.out.println(x3/(y3+z3)); //quinta formula
        System.out.println((x3/y3)+z3); //sexta formula
        System.out.println(2*x3-z3-2*x3); //setena formula
        System.out.println(2*x3/(3*y3)); //octava formula
        System.out.println(x3*y3%z3); //novena formula
        System.out.println(x3*(y3%z3)); //desena formula
        System.out.println(3*x3-z3-2*x3); //onzena formula 
        System.out.println(2*x3/5%y3); //dotzena formula
        System.out.println(x3-100%y3%z3); //tretzena formula
        System.out.println(x3-y3-z3*2); //catorzena formula

                //Determina quin és el tipus de data del resultat de les següents expressions aritmètiques:
        System.out.println("");
        System.out.println("Determina quin és el tipus de data del resultat de les següents expressions aritmètiques:");
        System.out.println("");

        byte b4 = 2; //declaracio de variable
        short s = 3; //declaracio de variable
        long ln = 4L; //declaracio de variable
        int i = 5, j = 6; //declaracio de variable
        float f = 7.0f; //declaracio de variable
        double d = 8.0; //declaracio de variable
        char c4 = 'A'; //declaracio de variable
        int operacionA =b4 + c4; //byte + char = int
        System.out.println(operacionA); //comprobacio 
        float opercaionB = f - c4; //float - char = float
        System.out.println(opercaionB); //comprobacio
        double operacionC = d + i; //double + int = double
        System.out.println(operacionC); //comprobacio
        double operacionD = d +i; //double + int = double
        System.out.println(operacionD); //comprobacio
        float operacionE = i /f; //int / float = float
        System.out.println(operacionE); //comprobacio
        int operacionF = s + j; //short + int = int
        System.out.println(operacionF); //comprobacio
        double operacionG = d+j ; //double + int = double
        System.out.println(operacionG); //comprobacio
        int operacionH = s * c4; //short * char = int
        System.out.println(operacionH); //comprobacio
        double operacionI = d + c4; //double + char = double
        System.out.println(operacionI); //comprobacio
        int operacionJ = b+c4; //byte + char = int
        System.out.println(operacionJ); //comprobacio
        int operacionK = b/c4+s; //byte / char + short = int
        System.out.println(operacionK); //comprobacio
        int operacionL = c4 + c4; //char + char = int
        System.out.println(operacionL); //comprobacio
        double operacionM = i+ln+d;//int + long + double = double
        System.out.println(operacionM); //comprobacio
        long operacionN = ln + c4; //long + char = long
        System.out.println(operacionN); //comprobacio
        int operacionO = 5/j; //int / int = int
        System.out.println(operacionO); //comprobacio
        double operacionP = 5.2/j; //double / int = double
        System.out.println(operacionP); //comprobacio
        double operacionQ = i*f*2.5; //int * float * double = double
        System.out.println(operacionQ); //comprobacio
        float operacionR = ln*f*2.5f;//long * float * float = float
        System.out.println(operacionR); //comprobacio
        long operacionS = j-4L; //int - long = long
        System.out.println(operacionS); //comprobacio
        float operacionT = j-4L *2.5f; //int - long * float = float
        System.out.println(operacionT); //comprobacio
        double operacionU = b+2.5*i+35f;//byte + double * int + float = double
        System.out.println(operacionU); //comprobacio
        int operacionV = 'a'+ b4; //char + byte = int
        System.out.println(operacionV); //comprobacio
        int operacionW = 'a'+ c4; //char + char = int
        System.out.println(operacionW); //comprobacio
        int operacionX = c4+2; //char + int = int
        System.out.println(operacionX); //comprobacio
        long operacionY = c4-ln/2;
        System.out.println(operacionY); //comprobacio
        double operacionZ = 2/i+2.0/j; //int + double / int = double
        System.out.println(operacionZ); //comprobacio

                //Si X, Y y Z son variables de tipus boolean amb valors X = true, Y = false, Z = true, determina el valor de les següents expressions lògiques:
        System.out.println("");
        System.out.println("Si X, Y y Z son variables de tipus boolean amb valors X = true, Y = false, Z = true, determina el valor de les següents expressions lògiques:");
        System.out.println("");

        boolean X = true; //declaracio de variable
        boolean Y = false; //declaracio de variable
        boolean Z = true; //declaracio de variable
        System.out.println((X&&Y)||(X&&Z));//primera expresio
        System.out.println((X||!Y)&&(!X||Z));//segona expresio
        System.out.println(X||Y&&Z);//tercera expresio 
        System.out.println(!(X||Y)&&Z);//quarta expresio
        System.out.println(X||Y||X&&!Z&&!Y);//quinta expresio
        System.out.println(!X||!Y||Z&&X&&!Y);//sexta expresio

                //Si W, X i Y son variables de tipus boolean amb valors W = false, X = true, Y = true, Z = false,  determina el valor de les següents expressions lògiques:
        System.out.println("");
        System.out.println("Si W, X i Y son variables de tipus boolean amb valors W = false, X = true, Y = true, Z = false,  determina el valor de les següents expressions lògiques:");
        System.out.println("");

        boolean W = false; //declaracio de variable
        boolean X2 = true; //declaracio de variable
        boolean Y2 = true; //declaracio de variable
        boolean Z2 = false; //declaracio de variable
        System.out.println(W||Y2&&X2&&W||Z2);//primera expresio
        System.out.println(X2&&!Y2&&!X2||!W&&Y2);//segona expresio
        System.out.println(!(W||Y2)&&X2||Z2);//tercera expresio
        System.out.println(X2&&Y2&&W||Z2||X2);//quarta expresio
        System.out.println(Y2||!(Y2||Z2&&W));//quinta expresio
        System.out.println(!X2&&Y2&&(!Z2||!X2));//sexta expresio


                //Determina el valor de les següents expressions:
        System.out.println("");
        System.out.println("Determina el valor de les següents expressions:");
        System.out.println("");
        
        int i2 = 8, j3 = 5;//declaracio de variable
        float x5 = 0.005f, y5 = -0.01f;
        char c5 = 'c', d3 = 'd';
        System.out.println(i2<=j3);//primera expresio
        System.out.println(c5>d3);//segona expresio
        System.out.println(x5<=0);//tercera expresio
        System.out.println(x5<y5--);//quarta expresio
        System.out.println(j3!=6);//quinta expresio
        System.out.println(c5==99);//sexta expresio
        System.out.println(!(i2<=j3));//setena expresio
        System.out.println(!(c5==99));//octava expresio
        System.out.println(!(x5>0));//novena expresio
        System.out.println(-j3==i2-13);//desena expresio
        System.out.println(++x5>0);//onzena expresio
        System.out.println(y5--<1);//dotzena expresio
        System.out.println(c5>d3||c5>0);//tretzena expres
        System.out.println(5*(i2+j3)>'c');//catorzena expresio
        System.out.println(2*x5+y5==0);//quinzena expresio
        //System.out.println(2*x5+(y5==0));setzena expresio no es pot resoldre, el operador + que s'aplica a un float i un boolean no es pot realitzar
        System.out.println(x5+y5>=0);//divuitena expresio
        System.out.println(x5<++y);//denovena expresio
        System.out.println(-(i2+j3)!=-i2+j3);//vigesima expresio
        System.out.println(i2<=j3&&i>=c5);//vigesimoprimera expresio
        System.out.println(i2>0&&j3<5);//vigesimasegunda expresio
        System.out.println(i2>0||j3<5);//vigesimatercera expresio
        System.out.println(x5>y5&&i2>0||j3<5);//vigesimacuarta expresio
        System.out.println((3*i2-2*j3)%(2*d3-c5)>3*d3);//vigesimaquinta expresio
        System.out.println(2*((i2/5)+(4*(j3-3))%(i2+j3-2))>=10);//vigesimasexta expresio
        System.out.println((i2-3*j3)%(c5+2*d3)/(x5-y5)>=0);//vigesimasetena expresio
    }
}