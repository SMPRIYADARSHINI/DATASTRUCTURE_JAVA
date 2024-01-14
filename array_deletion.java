class Array_Deletion
{
    public static void main(String args[])
    {
        int AD[]=new int[5];
        int n=AD.length;
        for(int i=0;i<5;i++)
        {
            AD[i]=i+2;
            System.out.println(AD[i]);
        }
        for(int i=0;i<=n-1;i++)
        {
           if(AD[i]==3)
           {
            for(int j = i; j<n-1; j++) 
             {
               AD[j] = AD[j+1];
             }
            n = n - 1;
            break;
          }
        }
      System.out.println("Array After Deletion:");
      for(int i = 0; i < n; i++) 
      {
         System.out.println("AD[" + i + "] = " + AD[i]);
      }
    }
    
}