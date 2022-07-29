static int MagicNumber(int N){
    //Enter your code here
if (N >= 79)
{
    int a = 0;
    while (true) 
    {
        int first = N-a;
        int second = N+a;
        
        if (isDigitPresent(first))
            return first;
        
        if(isDigitPresent(second))
            return second;
        
        a++;
    }
}

else 
{       
    return 79;
}

        
}

static boolean isDigitPresent(int x)
{ 
while (x > 0)
{
    if (x % 10 == 7)
    {
        while ( x > 0)
        {
            if ( x % 10 == 9)
            {
                break;
            }
             x = x / 10;
        }
        break;
    }
                    
    else if (x % 10 == 9)
    {
        while ( x > 0)
        {
            if ( x % 10 == 7)
            {
                break;
            }
            
            x = x / 10;
        }
            break;
    }
        x = x / 10;
}
return (x > 0);
         
}