public class Main{

    static void Print(int[] table)
    {
        for(int x: table)
            System.out.println(x);
    }

    static int[] Sortuj(int[] table){
        for(int j=0; j<table.length; j++)
        {
            for(int i=0; i<table.length-j-1; i++)
            {
                if(table[i]>table[i+1])
                {
                    int temp;
                    temp=table[i];
                    table[i]=table[i+1];
                    table[i+1]=temp;
                }
            }
        }
        return table;
    }
    public static void main(String[] args){
        int[] table = {1,5,4,2,-4,23,245,12,-213,-12,-43,-543};
        Print(table);
        table = Sortuj(table);
        System.out.println("Po sortowaniu:");
        Print(table);
    }
}