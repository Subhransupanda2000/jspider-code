package com.example.jspiderjava;
class ChangeStringCharactersCaseExample {
    public static void main(String args[]) {
        String inputString = "WELCOME";
        System.out.println("input String : "+inputString);
        System.out.println("output    : "+changecase(inputString));

    }
    static String changecase(String inputString) {
        char ar[]=inputString.toCharArray();

        for (int i = 0; i < ar.length; i++) {

            if (ar[i]>=65 && ar[i] <=90) {
                ar[i] += 32;
            } else if(ar[i]>=97 && ar[i] <=122){
                ar[i] -= 32;
            }

        }
        return new String(ar);
    }


}
