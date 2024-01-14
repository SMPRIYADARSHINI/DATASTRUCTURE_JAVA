class Array_search
{
    public static void main(String args[])
    {
        int AD[]=new int[5];
        int n=AD.length;
        for(int i=0;i<n;i++)
        {
            AD[i]=i+2;
            System.out.println("AD["+i+"]="+AD[i]);
        }
        for(int i=0;i<=n-1;i++)
        {
           if(AD[i]==4)
           {
            
            System.out.println("the Number "+AD[i]+" in the " +(i+1)+ " position");
          }
                  }
      
    }
    
}