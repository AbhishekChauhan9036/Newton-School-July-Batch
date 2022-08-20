static class  secondelement implements Comparator<Pair> 
{
    public int compare(Pair a, Pair b)
    {
        if(a.x==b.x)
        {
            return b.y-a.y;
        }
        return b.x - a.x;
    }
}
static Pair[] SortPair(Pair arr[], int n)  { 
 //enter your code here
Arrays.sort(arr, new secondelement());
return arr;
 }