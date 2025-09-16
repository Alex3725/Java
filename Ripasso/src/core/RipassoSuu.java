package core;

public class RipassoSuu {


    public class Main {

        public static void main(String[] args) {

            //iterazioni

            //array
            int[] numeri = new int[5];
            int[] voti = {4, 6, 2};

            //int i = voti.length;
            int count = 0;

            //WHILE

            while (count < voti.length){
                System.out.println(voti[count]);
                count ++;
            }

            //DO WHILE
            count = 0;
            do {
                System.out.println(voti[count]);
                count ++;
            }while (count < voti.length);


            //FOR

            for (int i = 0; i < voti.length; i++){
                System.out.println(voti[i]);
            }


            //FOR EACH

            for (int voto : voti){
                System.out.println(voto);
            }

        }
    }
}
