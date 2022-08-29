import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class MyComparator implements Comparator

{

    public int compare(Object obj1,Object obj2)

    {

        Integer i1=(Integer)obj1;

        Integer i2=(Integer)obj2;

        return i2.compareTo(i1);

    }

}

class Main {
    public static void main(String[] args)

    {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int max=n;

        Queue<Integer> queue=new PriorityQueue<Integer>(new MyComparator());

        int disks[]=new int[n];

        for(int i=0;i<n;i++)

        {

            disks[i]=sc.nextInt();

            queue.add(disks[i]);

            while(!queue.isEmpty() && queue.peek()==max)

            {



                System.out.print(queue.poll() + " ");

                max--;

            }



            System.out.println();

        }

    }
}