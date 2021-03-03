/* isFull(), isEmpty(), push(int item), pop();
Above functions are available to you for use on stack, So just complete the below function as per specifications. */

static String reverseString(CQStack s, String st)
{
  int len=st.length();  
  s=new CQStack(len);
  char[] arr=new char[len];
  for(int i=0;i<len;i++)
  {
    char ch=st.charAt(i);
    int j=ch;
    s.push(j);
  }
  for(int i=0;i<len;i++)
  {
    int j=s.pop();
    char ch=(char)j;
    arr[i]=ch;
  }
  st=new String(arr);
  return st;
}
