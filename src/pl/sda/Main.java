package pl.sda;

public class Main {
    public static void main(String[] args) {
        int[] tab = {};
        int max = findMaximum(tab);
        int min = findMinimum(tab);
        System.out.println("Max: "+max+" Min: "+min);
    }

    private static int findMaximum(int[] tab) {
        if(tab.length<1)
        {
            return 0;
        }
        int potenatialMax = tab[0];
        for(int i=1; i<tab.length; i++)
        {
            if(tab[i]>potenatialMax){
                potenatialMax = tab[i];
            }
        }
        return potenatialMax;
    }

    private static int findMinimum(int[] tab) {
        if(tab.length<1)
        {
            return 0;
        }
        int potenatialMin = tab[0];
        for(int i=1; i<tab.length; i++)
        {
            if(tab[i]<potenatialMin){
                potenatialMin = tab[i];
            }
        }
        return potenatialMin;
    }

}
