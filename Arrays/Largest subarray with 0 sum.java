class Result
{
  static void largSubArray(int arr[], int n)
  {
	int len=-1,sum=0;
    for(int i=0;i<n;i++)
    {
      sum=0;
      for(int j=i;j<n;j++)
      {
        sum+=arr[j];
      if(sum==0)
      {
        len=Math.max(len,j-i+1);
      }
      }
    }
    System.out.println(len);
  }
}
