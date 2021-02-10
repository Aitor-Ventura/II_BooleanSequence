public class Excercise {
    public static boolean matchInPos(int[] a1, int[] a2, int ini) {
        boolean isThere = true;
        //Miramos si a2 "cabe" dentro de a1
        if ((a1.length - ini) >= a2.length){
            for (int i = 0; i < a2.length; i++){
                if ( a1[ini + i] != a2[i] ){ 
                    isThere = false;
                }
            }
        } else {
            isThere = false;
        }
        return isThere;
    }
}