import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework////

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	public static void solve(Node arr[],ArrayList<Integer> ans)
	{
		Queue<Node> q=new LinkedList<>();
		q.add(arr[0]);
		while(!q.isEmpty())
		{
			int x=q.size();
			ans.add(x);
			for(int i=0;i<x;i++)
			{
				Node temp=q.poll();
				if(temp.left!=null)
				q.add(temp.left);
				if(temp.right!=null)
				q.add(temp.right);
			}
		}


	}
	public static void main (String[] args) {
                      // Your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Node arr[]=new Node[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new Node(i+1);
		}
		for(int i=0;i<n;i++)
		{
			int left=sc.nextInt();
			int right=sc.nextInt();
			if(left!=-1)
			arr[i].left=arr[left-1];
			if(right!=-1)
			arr[i].right=arr[right-1];
		}
      ArrayList<Integer> arr1=new ArrayList<>();
	  solve(arr,arr1);
	  int t=arr1.size();
	  for(int i=0;i<t;i++)
	  {
		  System.out.print(arr1.get(i)+" ");
	  }
	  for(int i=t;i<n;i++)
	  {
		  System.out.print(0+" ");
	  }
	  System.out.println();

	}
}