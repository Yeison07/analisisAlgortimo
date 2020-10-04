/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Yeison
 */
public class BigInteger_UFPS {

    /**
     * Numero="23456" miNUmero={2,3,4,5,6};
     */
    private int miNumero[];

    public BigInteger_UFPS() {
    }

    public BigInteger_UFPS(String miNumero) {

        String[] parts = miNumero.split(""); //1+k
        this.miNumero = new int[parts.length]; //3
        //1+2(2+k+4)n = 3+6n+kn
        for (int i = 0; i < parts.length; i++) {
            
            this.miNumero[i] = Integer.valueOf(parts[i]);//2+k
        }

    }

    public int[] getMiNumero() {
        return miNumero;
    }
    
    /**
     * Mutiplica dos enteros BigInteger
     *
     * @param dos
     * @return
     */
    public BigInteger_UFPS multiply(BigInteger_UFPS dos) {
        String x = this.toString(); //9+8n
        String y = dos.toString(); // 9+8n
        String aux = mult_string(x, y); //34+22n2"+19
        BigInteger_UFPS resul = new BigInteger_UFPS(aux); //6+6n+kn
        return resul; //1
        
        //Total = 18+16n+34+22n2"+19+6+6n+kn
        //Total = 22n2"+22n+77+kn
    }

    /**
     * Retorna la representación entera del BigInteger_UFPS
     *
     * @return un entero
     */
    public int intValue() {

        String res = "";

        for (int i = 0; i < miNumero.length; i++) {
            res += Integer.toString(miNumero[i]);
            if (res.length() > 9) {
                break;
            }

        }
        int resul = Integer.valueOf(res);

        return resul;
    }

    public static String mult_string(String x, String y) {
        int res[] = new int[x.length() + y.length()]; //6

        int i_d1 = 0; //2
        int i_d2 = 0; //2

                   //4                 //1     2
        for (int i = x.length() - 1; i >= 0; i--) // 4+1()n
        {
            int carry = 0; // 2
            int d1 = x.charAt(i) - '0'; //4
            i_d2 = 0; // 2
            //          4                  1      2          
            for (int j = y.length() - 1; j >= 0; j--) //4+1+(19+3)n = 5+22n
            {
                
                int d2 = y.charAt(j) - '0'; //4
                //2          1    1      2            1   = 7  
                int sum = d1 * d2 + res[i_d1 + i_d2] + carry;  
                carry = sum / 10; // 2

                res[i_d1 + i_d2] = sum % 10; //4
                i_d2++; //2
            }
 //                 1
            if (carry > 0) {
                res[i_d1 + i_d2] += carry;  // 6  ----> res [i_d1 +i_d2]= res [i_d1 +i_d2]+carry
            }
            
            i_d1++; //2
            
            
        }

        int i = res.length - 1;  //4
        //       1           2
        while (i >= 0 && res[i] == 0) {
            i--;  //2
        }
        String s = "";  //2
//                1
        while (i >= 0) {
            s += (res[i--]); //  5     s=s+(res[i--])
        }
        return s;  //1
        
        
        //Total
    }

    @Override
    public String toString() {
        String nro = ""; // 2
        
                //2         //2               //2
        for (int i = 0; i < miNumero.length; i++) 
        {
            //  1     1                2
            nro = nro + Integer.toString(miNumero[i]); 
        }

        return nro; // 1
        
        //Total 13
        
    }
}
